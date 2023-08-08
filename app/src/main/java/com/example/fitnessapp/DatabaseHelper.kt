package com.example.fitnessapp

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context


import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Range

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    override fun onCreate(db: SQLiteDatabase) {
        val createTable = "CREATE TABLE $TABLE_NAME ($COLUMN_ID INTEGER PRIMARY KEY, $COLUMN_INPUT TEXT)"
        db.execSQL(createTable)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }

    fun insertInput(input: String) {
        val db = writableDatabase
        val contentValues = ContentValues()
        contentValues.put(COLUMN_INPUT, input)
        db.insert(TABLE_NAME, null, contentValues)
        db.close()
    }


    fun getSavedInput(): String {
        val db = readableDatabase
        val query = "SELECT * FROM $TABLE_NAME ORDER BY $COLUMN_ID DESC LIMIT 1"
        val cursor = db.rawQuery(query, null)

        var savedText = ""
        if (cursor.moveToFirst()) {
            @SuppressLint("Range")
            savedText = cursor.getString(cursor.getColumnIndex(COLUMN_INPUT))
        }

        cursor.close()
        return savedText
    }

    fun updateInput(id: Int, newInput: String) {
        val db = writableDatabase
        val contentValues = ContentValues()
        contentValues.put(COLUMN_INPUT, newInput)
        db.update(TABLE_NAME, contentValues, "$COLUMN_ID = ?", arrayOf(id.toString()))
        db.close()
    }

    fun deleteInput(id: Int) {
        val db = writableDatabase
        db.delete(TABLE_NAME, "$COLUMN_ID = ?", arrayOf(id.toString()))
        db.close()
    }

    companion object {
        private const val DATABASE_VERSION = 1
        private const val DATABASE_NAME = "YourDatabaseName"
        private const val TABLE_NAME = "InputTable"
        private const val COLUMN_ID = "id"
        private const val COLUMN_INPUT = "input"
    }
}

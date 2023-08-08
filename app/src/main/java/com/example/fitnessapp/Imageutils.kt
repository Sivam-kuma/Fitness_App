package com.example.fitnessapp

import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable

import android.widget.ImageView
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory

fun setRoundedCorner(imageView: ImageView) {
    val drawable = imageView.drawable
    if (drawable is BitmapDrawable) {
        val bitmap = drawable.bitmap
        val roundedDrawable = RoundedBitmapDrawableFactory.create(imageView.resources, bitmap)
        roundedDrawable.cornerRadius = 20f // Adjust the radius value to control the roundness of the corners
        imageView.setImageDrawable(roundedDrawable)
    }
}

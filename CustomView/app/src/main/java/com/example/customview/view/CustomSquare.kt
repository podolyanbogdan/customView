package com.example.customview.view

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import android.widget.Toast

import android.animation.ObjectAnimator
import android.graphics.Rect


import android.graphics.Color
import android.view.animation.LinearInterpolator
import com.example.customview.R

class CustomSquare @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    var squareView = findViewById<View>(R.id.squareView)

    val rect = Rect()
    val paint = Paint()
    var LEFT = 10
    var TOP = 10
    var SQUARE_SIZE = 300


    @SuppressLint("DrawAllocation")
    override fun onDraw(canvas: Canvas?) {

        rect.left = LEFT
        rect.top = TOP
        rect.right = rect.left + SQUARE_SIZE
        rect.bottom = rect.top + SQUARE_SIZE

        paint.color = Color.BLUE
        canvas?.drawRect(rect, paint)
    }

    @SuppressLint("Recycle")
    fun moveTop()
    {
        Toast.makeText(context, "Top Click", Toast.LENGTH_LONG).show()

        val tY = ObjectAnimator.ofFloat(squareView,
                                        TRANSLATION_Y,
                                        squareView.translationY,
                                        squareView.translationY - 100f)
        tY.duration = 100
        tY.interpolator = LinearInterpolator()
        tY.start()
    }
    fun moveBot()
    {
        Toast.makeText(context, "Bot Click", Toast.LENGTH_LONG).show()

        val tY = ObjectAnimator.ofFloat(squareView,
            TRANSLATION_Y,
            squareView.translationY,
            squareView.translationY + 100f)

        tY.duration = 100
        tY.interpolator = LinearInterpolator()
        tY.start()
    }
    fun moveLeft()
    {
        Toast.makeText(context, "Left Click", Toast.LENGTH_LONG).show()

        val tX = ObjectAnimator.ofFloat(squareView,
            TRANSLATION_X,
            squareView.translationX,
            squareView.translationX - 100f)
        tX.duration = 100
        tX.interpolator = LinearInterpolator()
        tX.start()
    }
    fun moveRight()
    {
        Toast.makeText(context, "Right Click", Toast.LENGTH_LONG).show()

        val tX = ObjectAnimator.ofFloat(squareView,
            TRANSLATION_X,
            squareView.translationX,
            squareView.translationX + 100f)
        tX.duration = 100
        tX.interpolator = LinearInterpolator()
        tX.start()
    }

}




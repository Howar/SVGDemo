package com.howar.svgdemo

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.LayoutInflaterCompat
import com.mikepenz.iconics.IconicsDrawable
import com.mikepenz.iconics.context.IconicsLayoutInflater
import com.mikepenz.iconics.typeface.library.ionicons.Ionicons
import com.mikepenz.iconics.utils.colorInt
import com.mikepenz.iconics.utils.sizeDp
import kotlinx.android.synthetic.main.activity_icon.*

class IconActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        LayoutInflaterCompat.setFactory(layoutInflater, IconicsLayoutInflater(delegate))
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_icon)

        val drawable = IconicsDrawable(this, Ionicons.Icon.ion_ios_home).apply {
            colorInt = Color.RED
            sizeDp = 24
        }
        img.setImageDrawable(drawable)
    }
}
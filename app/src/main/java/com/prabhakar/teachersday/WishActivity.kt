package com.prabhakar.teachersday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_wish.*

class WishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wish)
        wish_teacher_image.setImageResource(intent.getIntExtra("image",0))
        wish_teacher_name.text="${intent.getStringExtra("name")} Sir"
    }
}
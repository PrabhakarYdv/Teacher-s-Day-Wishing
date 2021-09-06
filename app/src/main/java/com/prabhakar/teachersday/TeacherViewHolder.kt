package com.prabhakar.teachersday

import android.content.Intent
import android.icu.text.PluralRules
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.teacher_layout.view.*

class TeacherViewHolder(private val view: View , private val onClickListener: OnClickListener) : RecyclerView.ViewHolder(view) {
    fun setTeachersData(model: TeacherModel) {
        view.apply {
            teacher_name.text = model.teacherName
//            Glide.with(teacher_image).load(model.teacherImage).into(teacher_image)
            teacher_image.setImageResource(model.teacherImage)

            btn_wish?.setOnClickListener {
                onClickListener.onClick(model,adapterPosition)

            }
        }
    }
}
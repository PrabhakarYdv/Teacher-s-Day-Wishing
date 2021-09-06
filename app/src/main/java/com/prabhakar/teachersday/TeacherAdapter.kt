package com.prabhakar.teachersday

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TeacherAdapter(
    private val teacherList: List<TeacherModel>,
    private val onClickListener: OnClickListener
) :
    RecyclerView.Adapter<TeacherViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeacherViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.teacher_layout, parent, false)
        return TeacherViewHolder(view, onClickListener)
    }

    override fun onBindViewHolder(holder: TeacherViewHolder, position: Int) {
        val model = teacherList[position]
        holder.setTeachersData(model)
    }

    override fun getItemCount(): Int {
        return teacherList.size
    }
}
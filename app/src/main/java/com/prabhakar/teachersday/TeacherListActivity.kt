package com.prabhakar.teachersday

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_teacher_list.*

class TeacherListActivity : AppCompatActivity(), OnClickListener {
    private val teacherList = arrayListOf<TeacherModel>()
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teacher_list)
        buildList()
        setRecyclerView()
    }

    private fun buildList() {
        teacherList.add(TeacherModel(R.drawable.llyod, "Lloyd Dcosta"))
        teacherList.add(TeacherModel(R.drawable.sai, "Sai Krishna"))
        teacherList.add(TeacherModel(R.drawable.prateek, "Prateek Shukla"))
        teacherList.add(TeacherModel(R.drawable.yogesh, "Yogesh Bhatt"))
        teacherList.add(TeacherModel(R.drawable.nrupul, "Nrupul Dev"))
        teacherList.add(TeacherModel(R.drawable.venu, "Venu Gopal"))
        teacherList.add(TeacherModel(R.drawable.sid, "Siddharth"))
        teacherList.add(TeacherModel(R.drawable.abhinav, "Abhinav"))
        teacherList.add(TeacherModel(R.drawable.sivraj, "Shivraj"))
        teacherList.add(TeacherModel(R.drawable.aman, "Aman vats"))
        teacherList.add(TeacherModel(R.drawable.isha, "Isha"))
        teacherList.add(TeacherModel(R.drawable.shruti, "Shruti"))
        teacherList.add(TeacherModel(R.drawable.mythri, "Mythri"))
        teacherList.add(TeacherModel(R.drawable.anksuh, "Ankush"))
        teacherList.add(TeacherModel(R.drawable.varun, "Varun"))
        teacherList.add(TeacherModel(R.drawable.naman, "Naman Vats"))

    }

    private fun setRecyclerView() {
        val teacherAdapter = TeacherAdapter(teacherList, this)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = teacherAdapter

    }

    override fun onClick(teacherModel: TeacherModel, position: Int) {
        val intent = Intent(this@TeacherListActivity, WishActivity::class.java)
        intent.putExtra("name", teacherList[position].teacherName)
        intent.putExtra("image", teacherList[position].teacherImage)
        startActivity(intent)
    }
}
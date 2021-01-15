package com.sagun.softuserreplica.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sagun.softuserreplica.R
import com.sagun.softuserreplica.StudentListData
import com.sagun.softuserreplica.adapter.StudentAdapter
import com.sagun.softuserreplica.model.Student


class HomeFragment : Fragment() {
    private val lstStudents = ArrayList<Student>()
    private lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)
//

        if (StudentListData.get().list().size == 0){
            loadStudents()
        }

        val adapter = StudentAdapter(StudentListData.get().list(),context!!)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = adapter


        return view

    }

    private fun loadStudents() {
        StudentListData.get().list().add(Student(1,"Ram","Bhaktapur",22,"Male"))
        StudentListData.get().list().add(Student(2,"Shyam","Chitwan",25,"Female"))
        StudentListData.get().list().add(Student(3,"Krishna","Kalanki",30,"Male"))
        StudentListData.get().list().add(Student(4,"Hari","Pokhara",29,"Male"))
    }

}
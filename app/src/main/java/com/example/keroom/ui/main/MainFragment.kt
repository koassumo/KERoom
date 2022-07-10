package com.example.keroom.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.keroom.R
import com.example.keroom.database.EmployeeDb
import com.example.keroom.entity.Employee

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        //val db: EmployeeDb = EmployeeDb.get(requireContext())
        val employee1 = Employee(0, "Employee1", 1000)
        EmployeeDb.get(requireContext()).employeeDao().insert(employee1)
        val employee2 = Employee(0, "Employee2", 2000)
        EmployeeDb.get(requireContext()).employeeDao().insert(employee2)
        val listEmployee: List<Employee> = EmployeeDb.get(requireContext()).employeeDao().getAll()

//        listEmployee.forEach {
//            println(it)
//        }

    }


}
package com.example.zadanie04

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment

class ToDoListFragment : Fragment(R.layout.fragment_to_do_list)
{
    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)

        //Stworzenie listy taskow
        var taskList = arrayListOf<String>("1 task", "2 taks", "Przyjsc na wyklad z androida w środę")

        //Wyciągnięcie listView
        var toDoListView = view.findViewById<ListView>(R.id.toDoListView)

        var adapterFromArrayListToListView = ArrayAdapter<String>(view.context,
            android.R.layout.simple_list_item_multiple_choice, taskList)

        toDoListView.adapter = adapterFromArrayListToListView


    }
}
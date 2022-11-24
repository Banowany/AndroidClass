package com.example.zadanie04.placeholder

import java.util.ArrayList

object PlaceholderTasks
{
    val TASKS: MutableList<Task> = ArrayList()

    private val COUNT = 25

    init
    {
        for (i in 1..COUNT)
        {
            addTask(createPlaceholderTask(i))
        }
    }

    private fun addTask(item: Task)
    {
        TASKS.add(item)
    }

    private fun createPlaceholderTask(position: Int): Task
    {
        return Task("Task " + position)
    }

    data class Task(val content: String)
    {
        override fun toString(): String = content
    }
}
package com.example.launchmodes_demo.launchModeDemo

object StackRegistry {

    val activityStack = mutableListOf<String>()

    fun addActivity(activityName: String) {
        activityStack.add(activityName)
    }

    fun removeActivity(activityName: String) {
        activityStack.remove(activityName)
    }

    fun getStackAsString(): String {
        return activityStack.joinToString(" -> ")
    }

    fun createNewStack(activityName: String) : MutableList<String>{
        val newActivityStack = mutableListOf<String>()
        newActivityStack.add(activityName)
        return newActivityStack
    }

    fun getNewStackAsString(newStack : MutableList<String>): String {
        return newStack.joinToString(" -> ")
    }

}
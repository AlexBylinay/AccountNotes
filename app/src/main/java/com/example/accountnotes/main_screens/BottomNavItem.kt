package com.example.accountnotes.main_screens

import com.example.accountnotes.R
import com.example.accountnotes.utils.Routs

sealed class BottomNavItem(val title: String, val iconId: Int, val route: String) {
    object createNew : BottomNavItem("Create", R.drawable.create_new_folder, Routs.CREATE)
    object information : BottomNavItem("Look Date", R.drawable.information_icon, Routs.INFORMATION)
    object list : BottomNavItem("List", R.drawable.list_icon, Routs.LIST)
    object note : BottomNavItem("Note", 0, Routs.NOTE)


    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}

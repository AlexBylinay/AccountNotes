package com.example.accountnotes.main_screens

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.example.accountnotes.ui.theme.Blue
import com.example.accountnotes.ui.theme.GrayLight

@Composable
fun BottomNav(navController: NavHostController) {

    val listItems = listOf(
        BottomNavItem.createNew,
        BottomNavItem.list,
        BottomNavItem.information


    )

    BottomNavigation(backgroundColor = Color.White) {
        listItems.forEach { item ->

            BottomNavigationItem(
                selected = false,
                onClick =
                {
                    navController.navigate(item.route)
                }, icon = {
                    Icon(
                        painter = painterResource(id = item.iconId),
                        contentDescription = "icon"
                    )
                },
                label = {
                    Text(text = item.title)

                }, selectedContentColor = Blue,
                unselectedContentColor = GrayLight,
                alwaysShowLabel = true

            )
        }

    }
}
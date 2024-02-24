package com.example.accountnotes.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.accountnotes.create_screen.CreateScreen
import com.example.accountnotes.information_screen.InformationScreen
import com.example.accountnotes.list_screen.ListScreen
import com.example.accountnotes.notesScreen.NotesScreen
import com.example.accountnotes.utils.Routs

@Composable
fun NavigationGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Routs.LIST
    ) {

        composable(Routs.CREATE) {
            CreateScreen()
        }
        composable(Routs.INFORMATION) {
            InformationScreen()
        }
        composable(Routs.LIST) {
            ListScreen(navController)

        }
        composable( route = Routs.NOTE + "/{name}",
            arguments = listOf(
                navArgument("name") {
                    type = NavType.StringType
                    defaultValue = "Some Default"
                    nullable = true
                } )
        ) { entry ->
            entry.arguments?.getString("name")?.let { NotesScreen(name = it) }
        }

        }
    }

package com.example.accountnotes.main_screens

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.accountnotes.navigation.NavigationGraph

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    val navController = rememberNavController()

    androidx.compose.material.Scaffold(
        bottomBar = {
            BottomNav(navController)
        },

    ) {
        NavigationGraph(navController)

    }

}
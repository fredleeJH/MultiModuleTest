package com.mju.mypage.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.mju.mypage.MypageScreen
import com.mju.navigation.MainTabRoute
import kotlinx.serialization.Serializable

fun NavController.navigateToMypage(navOptions: NavOptions? = null) {
    navigate(Mypage, navOptions)
}

fun NavGraphBuilder.mypageGraph() {
    composable<Mypage> {
        MypageScreen()
    }
}

@Serializable
data object Mypage : MainTabRoute
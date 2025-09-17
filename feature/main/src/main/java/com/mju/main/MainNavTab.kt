package com.mju.main

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import com.mju.designsystem.R.drawable.ic_user
import com.mju.designsystem.R.drawable.ic_home
import com.mju.main.R.string.ic_home_desc
import com.mju.main.R.string.ic_mypage_desc
import com.mju.home.navigation.Home
import com.mju.mypage.navigation.Mypage
import com.mju.navigation.MainTabRoute
import com.mju.navigation.Route

enum class MainNavTab(
    @DrawableRes val icon: Int,
    @StringRes val contentDescription: Int,
    val route: MainTabRoute
) {
    HOME(
        icon = ic_home,
        contentDescription = ic_home_desc,
        route = Home
    ),
    MYPAGE(
        icon = ic_user,
        contentDescription = ic_mypage_desc,
        route = Mypage
    );

    companion object {
        @Composable
        fun find(predicate: @Composable (MainTabRoute) -> Boolean): MainNavTab? {
            return entries.find { predicate(it.route) }
        }

        @Composable
        fun contains(predicate: @Composable (Route) -> Boolean): Boolean {
            return entries.map { it.route }.any { predicate(it) }
        }
    }
}
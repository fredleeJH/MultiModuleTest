package com.mju.main.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mju.designsystem.theme.MjuTheme
import com.mju.designsystem.theme.gray400
import com.mju.designsystem.theme.primary300
import com.mju.main.MainNavTab
import com.mju.ui.extension.noRippleClickable
import com.mju.ui.extension.screenHeightDp
import kotlinx.collections.immutable.ImmutableList

@Composable
fun MainBottomBar(
    visible: Boolean,
    tabs: ImmutableList<MainNavTab>,
    currentTab: MainNavTab?,
    onTabSelected: (MainNavTab) -> Unit
) {
    AnimatedVisibility(
        visible = visible,
        enter = EnterTransition.None,
        exit = ExitTransition.None
    ) {
        Column(
            modifier = Modifier.background(MjuTheme.colors.gray900)
        ) {
            HorizontalDivider(
                thickness = 1.dp,
                color = MjuTheme.colors.gray800
            )
            Row(
                modifier = Modifier
                    .navigationBarsPadding()
                    .fillMaxWidth()
                    .padding(vertical = screenHeightDp(10.dp)),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                tabs.forEach { tab ->
                    key(tab.route) {
                        val selected = currentTab == tab
                        MainBottomBarItem(
                            tab = tab,
                            selected = selected,
                            onClick = { onTabSelected(tab) }
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun RowScope.MainBottomBarItem(
    modifier: Modifier = Modifier,
    tab: MainNavTab,
    selected: Boolean,
    onClick: () -> Unit
) {
    val bottomItemColor = if (selected) primary300 else gray400
    val bottomTextStyle = if (selected) MjuTheme.typography.body4 else MjuTheme.typography.body6

    Column(
        modifier = modifier
            .noRippleClickable(onClick = onClick)
            .weight(1f),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(1.dp)
    ) {
        Icon(
            imageVector = ImageVector.vectorResource(tab.icon),
            contentDescription = stringResource(tab.contentDescription),
            tint = bottomItemColor
        )
        Text(
            text = stringResource(tab.contentDescription),
            fontSize = 14.sp,
            style = bottomTextStyle,
            color = bottomItemColor
        )
    }
}

package com.mju.designsystem.theme


import android.app.Activity
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val LocalByeBooColors =
    staticCompositionLocalOf<MjuColors> { error("No colors provided") }
private val LocalByeBooTypography =
    staticCompositionLocalOf<MjuTypography> { error("No typography provided") }

object MjuTheme {
    val colors: MjuColors
        @Composable
        @ReadOnlyComposable
        get() = LocalByeBooColors.current

    val typography: MjuTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalByeBooTypography.current
}

@Composable
fun ProvideByeBooColorsAndTypography(
    colors: MjuColors,
    typography: MjuTypography,
    content: @Composable () -> Unit
) {
    val provideColors = remember { colors.copy() }
    provideColors.update(colors)
    val provideTypography = remember { typography.copy() }
    provideTypography.update(typography)

    CompositionLocalProvider(
        LocalByeBooColors provides provideColors,
        LocalByeBooTypography provides provideTypography,
        content = content
    )
}

@Composable
fun MjuTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colors = MjuDarkColors()
    val typography = MjuTypography()

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = true
            WindowCompat.getInsetsController(window, view).isAppearanceLightNavigationBars = true
        }
    }
    ProvideByeBooColorsAndTypography(colors, typography) {
        MaterialTheme(
            content = content
        )
    }
}

package com.mju.home

import com.mju.home.model.DummyResult
import com.mju.ui.state.UiState

data class HomeState(
    var user: UiState<DummyResult> = UiState.Loading
)
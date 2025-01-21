package com.sd.demo.kmp.compose_input

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.sd.lib.kmp.compose_input.FTextField

@Composable
fun SampleOverlay(
  onClickBack: () -> Unit,
) {
  RouteScaffold(
    title = "SampleOverlay",
    onClickBack = onClickBack,
  ) {
    FTextField(
      modifier = Modifier.fillMaxWidth(),
      state = rememberTextFieldState(),
      overlay = {
        Box(
          modifier = Modifier
            .matchParentSize()
            .background(Color.Red.copy(0.3f))
        )
      },
    )
  }
}
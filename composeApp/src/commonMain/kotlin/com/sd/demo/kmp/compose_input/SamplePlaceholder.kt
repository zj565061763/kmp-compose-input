package com.sd.demo.kmp.compose_input

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.sd.lib.kmp.compose_input.FTextField

@Composable
fun SamplePlaceholder(
  onClickBack: () -> Unit,
) {
  RouteScaffold(
    title = "SamplePlaceholder",
    onClickBack = onClickBack,
  ) {
    FTextField(
      modifier = Modifier.fillMaxWidth(),
      state = rememberTextFieldState(),
      placeholder = {
        Text(
          text = "placeholder",
          modifier = Modifier.background(Color.Red.copy(0.2f))
        )
      },
    )
    FTextField(
      modifier = Modifier.fillMaxWidth(),
      state = rememberTextFieldState(),
      placeholder = {
        Text(
          text = "placeholder",
          modifier = Modifier.background(Color.Red.copy(0.2f))
        )
      },
    )
  }
}
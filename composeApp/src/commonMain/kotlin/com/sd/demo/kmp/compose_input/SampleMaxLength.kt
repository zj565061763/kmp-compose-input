package com.sd.demo.kmp.compose_input

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import com.sd.lib.kmp.compose_input.FTextField
import com.sd.lib.kmp.compose_input.fSetMaxLength

@Composable
fun SampleMaxLength(
  onClickBack: () -> Unit,
) {
  val state = rememberTextFieldState()
  val maxLength = 5

  LaunchedEffect(state, maxLength) {
    state.fSetMaxLength(maxLength)
  }

  RouteScaffold(
    title = "SampleMaxLength",
    onClickBack = onClickBack,
  ) {
    FTextField(
      modifier = Modifier.fillMaxWidth(),
      state = state,
      placeholder = {
        Text(text = "max input length $maxLength")
      }
    )
  }
}
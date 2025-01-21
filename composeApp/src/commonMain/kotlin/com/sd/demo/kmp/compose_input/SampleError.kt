package com.sd.demo.kmp.compose_input

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sd.lib.kmp.compose_input.FTextField

@Composable
fun SampleError(
  onClickBack: () -> Unit,
) {
  RouteScaffold(
    title = "SamplePlaceholder",
    onClickBack = onClickBack,
  ) {
    FTextField(
      modifier = Modifier.fillMaxWidth(),
      state = rememberTextFieldState(),
      isError = true,
      placeholder = {
        Text(text = "placeholder")
      },
    )
    FTextField(
      modifier = Modifier.fillMaxWidth(),
      state = rememberTextFieldState(),
      isError = true,
      placeholder = {
        Text(text = "placeholder")
      },
    )
  }
}
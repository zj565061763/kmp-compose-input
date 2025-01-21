package com.sd.demo.kmp.compose_input

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sd.lib.kmp.compose_input.FTextField
import com.sd.lib.kmp.compose_input.FTextFieldIconClear

@Composable
fun SampleClear(
  onClickBack: () -> Unit,
) {
  RouteScaffold(
    title = "SampleClear",
    onClickBack = onClickBack,
  ) {
    FTextField(
      modifier = Modifier.fillMaxWidth(),
      state = rememberTextFieldState(),
      placeholder = {
        Text(text = "placeholder")
      },
      trailingIcon = {
        FTextFieldIconClear(modifier = Modifier.padding(end = 8.dp))
      },
    )
    FTextField(
      modifier = Modifier.fillMaxWidth(),
      state = rememberTextFieldState(),
      placeholder = {
        Text(text = "placeholder")
      },
      trailingIcon = {
        FTextFieldIconClear(modifier = Modifier.padding(end = 8.dp))
      },
    )
  }
}
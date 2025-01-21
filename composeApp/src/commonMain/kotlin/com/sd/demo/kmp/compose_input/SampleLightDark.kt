package com.sd.demo.kmp.compose_input

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.sd.lib.kmp.compose_input.FTextField

@Composable
fun SampleLightDark(
  onClickBack: () -> Unit,
) {
  var isLight by remember { mutableStateOf(true) }
  RouteScaffold(
    title = "SampleLightDark",
    onClickBack = onClickBack,
    isLight = isLight,
  ) {
    Button(onClick = { isLight = !isLight }) {
      Text(text = "Change Mode")
    }
    FTextField(
      modifier = Modifier.fillMaxWidth(),
      state = rememberTextFieldState(),
      placeholder = {
        Text(text = "placeholder")
      }
    )
    FTextField(
      modifier = Modifier.fillMaxWidth(),
      state = rememberTextFieldState(),
      placeholder = {
        Text(text = "placeholder")
      }
    )
  }
}
package com.sd.demo.kmp.compose_input

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.TextObfuscationMode
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.sd.lib.kmp.compose_input.FSecureTextField

@Composable
fun SamplePassword(
  onClickBack: () -> Unit,
) {
  RouteScaffold(
    title = "SamplePassword",
    onClickBack = onClickBack,
  ) {
    InputPasswordView(state = rememberTextFieldState())
    InputPasswordView(state = rememberTextFieldState())
  }
}

@Composable
private fun InputPasswordView(
  modifier: Modifier = Modifier,
  state: TextFieldState,
) {
  var passwordVisible by remember { mutableStateOf(false) }

  FSecureTextField(
    modifier = modifier.fillMaxWidth(),
    state = state,
    textObfuscationMode = if (passwordVisible) TextObfuscationMode.Visible else TextObfuscationMode.RevealLastTyped,
    placeholder = {
      Text(text = "password")
    },
    trailingIcon = {
      if (state.text.isNotEmpty()) {
        TextButton(
          onClick = { passwordVisible = !passwordVisible },
        ) {
          Text(text = if (passwordVisible) "hide" else "show")
        }
      }
    },
  )
}
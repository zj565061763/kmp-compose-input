package com.sd.demo.kmp.compose_input

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun RouteHome(
  onClickSamplePlaceholder: () -> Unit,
  onClickSamplePassword: () -> Unit,
  onClickSampleClear: () -> Unit,
  onClickSampleIndicator: () -> Unit,
  onClickSampleLeadingIcon: () -> Unit,
  onClickSampleOverlay: () -> Unit,
  onClickSampleError: () -> Unit,
  onClickSampleMaxLength: () -> Unit,
  onClickSampleLightDark: () -> Unit,
) {
  Scaffold { padding ->
    Column(
      modifier = Modifier.fillMaxSize().padding(padding),
      horizontalAlignment = Alignment.CenterHorizontally,
    ) {
      Button(onClick = onClickSamplePlaceholder) { Text(text = "SamplePlaceholder") }
      Button(onClick = onClickSamplePassword) { Text(text = "SamplePassword") }
      Button(onClick = onClickSampleClear) { Text(text = "SampleClear") }
      Button(onClick = onClickSampleIndicator) { Text(text = "SampleIndicator") }
      Button(onClick = onClickSampleLeadingIcon) { Text(text = "SampleLeadingIcon") }
      Button(onClick = onClickSampleOverlay) { Text(text = "SampleOverlay") }
      Button(onClick = onClickSampleError) { Text(text = "SampleError") }
      Button(onClick = onClickSampleMaxLength) { Text(text = "SampleMaxLength") }
      Button(onClick = onClickSampleLightDark) { Text(text = "SampleLightDark") }
    }
  }
}
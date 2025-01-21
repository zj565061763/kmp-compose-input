package com.sd.demo.kmp.compose_input

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sd.lib.kmp.compose_input.FTextField
import com.sd.lib.kmp.compose_input.FTextFieldIconContainer

@Composable
fun SampleLeadingIcon(
  onClickBack: () -> Unit,
) {
  RouteScaffold(
    title = "SampleLeadingIcon",
    onClickBack = onClickBack,
  ) {
    FTextField(
      modifier = Modifier.fillMaxWidth(),
      state = rememberTextFieldState(),
      contentPadding = PaddingValues(0.dp),
      leadingIcon = {
        FTextFieldIconContainer(
          modifier = Modifier.width(48.dp),
          containerColor = Color.Red.copy(0.5f),
        ) {
          Icon(
            imageVector = Icons.Default.Search,
            contentDescription = "Search",
          )
        }
      },
    )
  }
}
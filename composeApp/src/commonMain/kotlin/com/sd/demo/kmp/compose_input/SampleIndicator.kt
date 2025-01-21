package com.sd.demo.kmp.compose_input

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sd.lib.kmp.compose_input.FTextField
import com.sd.lib.kmp.compose_input.FTextFieldIndicatorContainer
import com.sd.lib.kmp.compose_input.FTextFieldIndicatorOutline

@Composable
fun SampleIndicator(
  onClickBack: () -> Unit,
) {
  RouteScaffold(
    title = "SampleIndicator",
    onClickBack = onClickBack,
  ) {
    FTextField(
      modifier = Modifier.fillMaxWidth(),
      state = rememberTextFieldState(),
      placeholder = {
        Text(text = "indicator")
      },
      indicator = {
        FTextFieldIndicatorOutline(
          shape = CircleShape,
          unfocusedThickness = 1.dp,
          focusedThickness = 3.dp,
        )
      },
    )
    FTextField(
      modifier = Modifier.fillMaxWidth(),
      state = rememberTextFieldState(),
      placeholder = {
        Text(text = "indicator")
      },
      indicator = {
        FTextFieldIndicatorContainer(
          unfocusedThickness = 1.dp,
          focusedThickness = 3.dp,
        ) { color, thickness ->
          HorizontalDivider(
            modifier = Modifier.align(Alignment.BottomCenter),
            thickness = thickness,
            color = color,
          )
        }
      }
    )
  }
}
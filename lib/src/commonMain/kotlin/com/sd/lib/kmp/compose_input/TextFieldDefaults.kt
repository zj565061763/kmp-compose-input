package com.sd.lib.kmp.compose_input

import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

object FTextFieldDefaults {
  @Suppress("NAME_SHADOWING")
  @Composable
  fun colors(
    // Text
    focusedTextColor: Color? = null,
    unfocusedTextColor: Color? = null,
    disabledTextColor: Color? = null,
    errorTextColor: Color? = null,

    // Container
    focusedContainerColor: Color? = null,
    unfocusedContainerColor: Color? = null,
    disabledContainerColor: Color? = null,
    errorContainerColor: Color? = null,

    // Indicator
    focusedIndicatorColor: Color? = null,
    unfocusedIndicatorColor: Color? = null,
    disabledIndicatorColor: Color? = null,
    errorIndicatorColor: Color? = null,

    // Placeholder
    focusedPlaceholderColor: Color? = null,
    unfocusedPlaceholderColor: Color? = null,
    disabledPlaceholderColor: Color? = null,
    errorPlaceholderColor: Color? = null,

    // Leading
    focusedLeadingIconColor: Color? = null,
    unfocusedLeadingIconColor: Color? = null,
    disabledLeadingIconColor: Color? = null,
    errorLeadingIconColor: Color? = null,

    // Trailing
    focusedTrailingIconColor: Color? = null,
    unfocusedTrailingIconColor: Color? = null,
    disabledTrailingIconColor: Color? = null,
    errorTrailingIconColor: Color? = null,

    // Cursor
    cursorColor: Color? = null,
    errorCursorColor: Color? = null,
  ): FTextFieldColors {
    val focusedTextColor = focusedTextColor ?: MaterialTheme.colorScheme.onSurface
    val unfocusedTextColor = unfocusedTextColor ?: focusedTextColor
    val disabledTextColor = disabledTextColor ?: focusedTextColor.copy(alpha = 0.3f)
    val errorTextColor = errorTextColor ?: MaterialTheme.colorScheme.error

    val focusedPlaceholderColor = focusedPlaceholderColor ?: MaterialTheme.colorScheme.onSurface.copy(alpha = 0.4f)

    val focusedIndicatorColor = focusedIndicatorColor ?: MaterialTheme.colorScheme.primary
    val unfocusedIndicatorColor = unfocusedIndicatorColor ?: MaterialTheme.colorScheme.onSurface.copy(alpha = 0.4f)
    val disabledIndicatorColor = disabledIndicatorColor ?: disabledTextColor
    val errorIndicatorColor = errorIndicatorColor ?: errorTextColor

    val cursorColor = cursorColor ?: focusedIndicatorColor
    return FTextFieldColors(
      // Text
      focusedTextColor = focusedTextColor,
      unfocusedTextColor = unfocusedTextColor,
      disabledTextColor = disabledTextColor,
      errorTextColor = errorTextColor,

      // Container
      focusedContainerColor = focusedContainerColor ?: Color.Transparent,
      unfocusedContainerColor = unfocusedContainerColor ?: Color.Transparent,
      disabledContainerColor = disabledContainerColor ?: Color.Transparent,
      errorContainerColor = errorContainerColor ?: Color.Transparent,

      // Indicator
      focusedIndicatorColor = focusedIndicatorColor,
      unfocusedIndicatorColor = unfocusedIndicatorColor,
      disabledIndicatorColor = disabledIndicatorColor,
      errorIndicatorColor = errorIndicatorColor,

      // Placeholder
      focusedPlaceholderColor = focusedPlaceholderColor,
      unfocusedPlaceholderColor = unfocusedPlaceholderColor ?: focusedPlaceholderColor,
      disabledPlaceholderColor = disabledPlaceholderColor ?: focusedPlaceholderColor,
      errorPlaceholderColor = errorPlaceholderColor ?: focusedPlaceholderColor,

      // Leading
      focusedLeadingIconColor = focusedLeadingIconColor ?: focusedTextColor,
      unfocusedLeadingIconColor = unfocusedLeadingIconColor ?: unfocusedTextColor,
      disabledLeadingIconColor = disabledLeadingIconColor ?: disabledTextColor,
      errorLeadingIconColor = errorLeadingIconColor ?: errorTextColor,

      // Trailing
      focusedTrailingIconColor = focusedTrailingIconColor ?: focusedTextColor,
      unfocusedTrailingIconColor = unfocusedTrailingIconColor ?: unfocusedTextColor,
      disabledTrailingIconColor = disabledTrailingIconColor ?: disabledTextColor,
      errorTrailingIconColor = errorTrailingIconColor ?: errorTextColor,

      // Cursor
      cursorColor = cursorColor,
      errorCursorColor = errorCursorColor ?: errorTextColor,

      textSelectionColors = TextSelectionColors(
        handleColor = cursorColor,
        backgroundColor = cursorColor.copy(alpha = 0.4f)
      )
    )
  }
}
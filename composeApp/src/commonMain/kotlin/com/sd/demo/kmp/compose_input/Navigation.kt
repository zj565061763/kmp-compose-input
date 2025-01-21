package com.sd.demo.kmp.compose_input

import kotlinx.serialization.Serializable

sealed interface AppRoute {
  @Serializable
  data object Home : AppRoute

  @Serializable
  data object SamplePlaceholder : AppRoute

  @Serializable
  data object SamplePassword : AppRoute

  @Serializable
  data object SampleClear : AppRoute

  @Serializable
  data object SampleIndicator : AppRoute

  @Serializable
  data object SampleLeadingIcon : AppRoute

  @Serializable
  data object SampleOverlay : AppRoute

  @Serializable
  data object SampleError : AppRoute

  @Serializable
  data object SampleMaxLength : AppRoute

  @Serializable
  data object SampleLightDark : AppRoute
}
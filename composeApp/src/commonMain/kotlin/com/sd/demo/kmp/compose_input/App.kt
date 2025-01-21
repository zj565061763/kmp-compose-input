package com.sd.demo.kmp.compose_input

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun App() {
  MaterialTheme {
    val navController = rememberNavController()
    NavHost(
      navController = navController,
      startDestination = AppRoute.Home,
    ) {
      composable<AppRoute.Home> {
        RouteHome(
          onClickSamplePlaceholder = { navController.navigate(AppRoute.SamplePlaceholder) },
          onClickSamplePassword = { navController.navigate(AppRoute.SamplePassword) },
          onClickSampleClear = { navController.navigate(AppRoute.SampleClear) },
          onClickSampleIndicator = { navController.navigate(AppRoute.SampleIndicator) },
          onClickSampleLeadingIcon = { navController.navigate(AppRoute.SampleLeadingIcon) },
          onClickSampleOverlay = { navController.navigate(AppRoute.SampleOverlay) },
          onClickSampleError = { navController.navigate(AppRoute.SampleError) },
          onClickSampleMaxLength = { navController.navigate(AppRoute.SampleMaxLength) },
          onClickSampleLightDark = { navController.navigate(AppRoute.SampleLightDark) },
        )
      }
      composable<AppRoute.SamplePlaceholder> {
        SamplePlaceholder(onClickBack = { navController.popBackStack() })
      }
      composable<AppRoute.SamplePassword> {
        SamplePassword(onClickBack = { navController.popBackStack() })
      }
      composable<AppRoute.SampleClear> {
        SampleClear(onClickBack = { navController.popBackStack() })
      }
      composable<AppRoute.SampleIndicator> {
        SampleIndicator(onClickBack = { navController.popBackStack() })
      }
      composable<AppRoute.SampleLeadingIcon> {
        SampleLeadingIcon(onClickBack = { navController.popBackStack() })
      }
      composable<AppRoute.SampleOverlay> {
        SampleOverlay(onClickBack = { navController.popBackStack() })
      }
      composable<AppRoute.SampleError> {
        SampleError(onClickBack = { navController.popBackStack() })
      }
      composable<AppRoute.SampleMaxLength> {
        SampleMaxLength(onClickBack = { navController.popBackStack() })
      }
      composable<AppRoute.SampleLightDark> {
        SampleLightDark(onClickBack = { navController.popBackStack() })
      }
    }
  }
}

expect fun logMsg(tag: String = "kmp-compose-input", block: () -> String)
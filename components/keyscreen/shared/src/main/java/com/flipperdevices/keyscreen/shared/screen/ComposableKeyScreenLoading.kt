package com.flipperdevices.keyscreen.shared.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.flipperdevices.core.ui.ktx.SetUpStatusBarColor
import com.flipperdevices.core.ui.theme.LocalPallet

@Composable
fun ComposableKeyScreenLoading(modifier: Modifier = Modifier) {
    SetUpStatusBarColor(LocalPallet.current.background, darkIcon = true)
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator(
            modifier = Modifier.size(48.dp),
            color = LocalPallet.current.accentSecond
        )
    }
}

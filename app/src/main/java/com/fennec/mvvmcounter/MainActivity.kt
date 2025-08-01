package com.fennec.mvvmcounter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
/*
hedhi aham 7aja lel rotation, lazem tzid f gradlebuild.kts el dependecy hedhi:

   implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.2")

   ** ataw tal9ani 7at commentaire fou9ha
*/

import androidx.lifecycle.viewmodel.compose.viewModel
import com.fennec.mvvmcounter.ui.theme.MVVMCounterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val viewModel : CounterViewModel = viewModel()
            MVVMCounterTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Spacer(modifier = Modifier.height(60.dp))
                    TheCounterApp(viewModel)
                }
            }
        }
    }
}





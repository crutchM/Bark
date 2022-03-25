package com.example.compose_exmp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.compose_exmp.ui.theme.Compose_exmpTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_exmpTheme() {
                Box(modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black)){
                    MyApp{
                        startActivity(Intent(this@MainActivity, ProfileActivity::class.java))
                    }
                }
            }
        }
    }
}

@Composable
fun MyApp(navigateToProfile: (Puppy) -> Unit){
    Scaffold(
        content = {
            BarkHomeContent(navigateToProfile)
        }
    )
}



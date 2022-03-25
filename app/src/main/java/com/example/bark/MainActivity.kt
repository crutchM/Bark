package com.example.bark

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.bark.ui.theme.BarkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BarkTheme {
                MyApp{
                    startActivity(Intent(this@MainActivity, ProfileActivity::class.java))
                }
            }
        }
    }
}

@Composable
fun MyApp(navigateToProfile: (Puppy) -> Unit){
    Scaffold (content = {BarkHomeContent(navigateToProfile)})

}


package com.example.compose_exmp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import com.example.compose_exmp.ui.theme.Compose_exmpTheme

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Compose_exmpTheme {
                Text(text = "new act")
            }
        }
    }
}
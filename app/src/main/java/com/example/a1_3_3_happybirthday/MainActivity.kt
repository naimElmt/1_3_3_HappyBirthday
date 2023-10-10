package com.example.a1_3_3_happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a1_3_3_happybirthday.ui.theme._1_3_3_HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _1_3_3_HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    FelicidadesDe("Happy Birthday Jean Paul!", "from Naim")
                }
            }
        }
    }
}
@Composable
fun FelicidadesDe(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center, modifier = modifier) {
        Text(text = message, lineHeight = 100.sp, textAlign = TextAlign.Center, fontSize = 90.sp)
        Text(text = from, fontSize = 30.sp, modifier = Modifier.padding(19.dp).align(alignment = Alignment.End))
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    _1_3_3_HappyBirthdayTheme {
        FelicidadesDe("Happy Birthday Jean Paul!", "from Naim")
    }
}
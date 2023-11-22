package com.example.object_detection

import android.os.Bundle
import android.widget.Toast
import android.widget.Button

import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.object_detection.ui.theme.Object_detectionTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_event = findViewById<Button>(R.id.button)

        btn_event.setOnClickListener{
            Toast.makeText(applicationContext, "버튼 1 클릭", Toast.LENGTH_LONG).show()
        }


    }



}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Object_detectionTheme {
        Greeting("Android")
    }
}
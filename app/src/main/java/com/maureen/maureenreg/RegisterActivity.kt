package com.maureen.maureenreg

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.maureen.maureenreg.ui.theme.MaureenregTheme

class RegisterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaureenregTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting2("Android")
                    Registration()
                }
            }
        }
    }
}

@Composable
fun Registration() {
    var Name by remember { mutableStateOf("") }
    var Email by remember { mutableStateOf("") }
    var Password by remember { mutableStateOf("") }
    var Confirmpassword by remember { mutableStateOf("") }
    var contex= LocalContext.current
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()

            .padding(20.dp)
            .background(Color.White)
    ) {
        Text(
            text = " Login",
            color = Color.Red,
            fontFamily = FontFamily.Cursive,
            fontSize = 30.sp,
        )
        OutlinedTextField(
            value = Name,
            onValueChange = { Name = it },
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "pass") },
            label = {
                Text(
                    text = "Enter name",
                    color = Color.Black,
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 30.dp),


            )
        OutlinedTextField(
            value = Email,
            onValueChange = { Email = it },
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "pass") },
            label = {
                Text(
                    text = "Enter email",
                    color = Color.Black,
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 30.dp),
        )
        OutlinedTextField(
            value = Password,
            onValueChange = { Password = it },
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "pass") },
            label = {
                Text(
                    text = "Enter password",
                    color = Color.Black,
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 30.dp),
        )
        OutlinedTextField(
            value = Confirmpassword,
            onValueChange = { Confirmpassword = it },
            label = {
                Text(
                    text = "Confirm password",
                    color = Color.Black,
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 30.dp),
        )

        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = {
                val intent= Intent(contex,RegisterActivity::class.java)
                contex.startActivity(intent)
            },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "Register",
                fontSize = 25.sp
            )


        }
        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = {
                val intent= Intent(contex,RegisterActivity::class.java)
                contex.startActivity(intent)
            },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "click to login",
                fontSize = 25.sp
            )

        }


    }


}

@Preview
@Composable
private fun Registrationprev() {
    Registration()

}

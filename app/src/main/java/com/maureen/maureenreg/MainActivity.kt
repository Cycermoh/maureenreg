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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaureenregTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
                    Login()
                }
            }
        }
    }
}


@Composable
fun Login() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var contex= LocalContext.current


    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .background(Color.Cyan)) {
        Text(
            text = " eMobilis",
            color = Color.Red,
            fontFamily = FontFamily.Cursive,
            fontSize = 15.sp,
        )
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "pass") },
            label = {
                Text(
                    text = "Enter email",
                    color = Color.Black,
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),
        )
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "pass") },
            label = {
                Text(
                    text = "Enter password",
                    color = Color.Black,
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),
        )

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "Login",
                fontSize = 15.sp
            )

        }
        Button(
            onClick = {
                val intent = Intent(contex, RegisterActivity::class.java)
                contex.startActivity(intent)
            },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "click to register",
                fontSize = 15.sp
            )

        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
                val intent = Intent(contex, IntentActivity::class.java)
                contex.startActivity(intent)
            },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "intent",
                fontSize = 15.sp
            )

        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
                val intent = Intent(contex, calculatorActivity::class.java)
                contex.startActivity(intent)
            },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "Calc",
                fontSize = 15.sp
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
                val intent = Intent(contex, cardActivity::class.java)
                contex.startActivity(intent)
            },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "Card",
                fontSize = 15.sp
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
                val intent = Intent(contex, CustomActivity::class.java)
                contex.startActivity(intent)
            },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "Custom",
                fontSize = 15.sp
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
                val intent = Intent(contex, RecyclerviewActivity::class.java)
                contex.startActivity(intent)
            },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "Recycler",
                fontSize = 15.sp
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
                val intent = Intent(contex, Simplelistview::class.java)
                contex.startActivity(intent)
            },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "simplelist",
                fontSize = 15.sp
            )
        }
    }
}

@Preview
@Composable
private fun loginprev() {
    Login()
}


package com.maureen.maureenreg

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class Simplelistview : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleListview()
        }
    }
}
private val namelist= mutableListOf(
    "Maureen","Vivian","Kelvin","James","John","Patience")

private val listModifier= Modifier
    .fillMaxSize()
    .background(Color.Magenta)
    .padding(30.dp)



@Composable
fun SimpleListview() {
    LazyColumn(modifier = listModifier){
        items(namelist){

                jina ->
            Text(jina)
        }
    }

}

@Preview(showBackground = true)
@Composable
fun MyList() {
    SimpleListview()
}
package com.devspacecinenow

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.SemanticsProperties.Text
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MovieDetailScreen(){
    MovieDetailContent()

}

@Composable
private fun MovieDetailContent(){
    Column (
        modifier = Modifier.fillMaxSize()
    ){
        Text(text = "VOCÊ VAI VENCER, NAO É UMA PROMESSA É UM AVISO!")

    }


}
@Preview(showBackground = true)
@Composable
private fun MovieDetailPreview(){
    MovieDetailContent()
}
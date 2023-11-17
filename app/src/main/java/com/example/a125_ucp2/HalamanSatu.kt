package com.example.a125_ucp2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanSatu(
    onSubmitButtonClick: (MutableList<String>) -> Unit,
    onCancelButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
){
    var namaTxt by rememberSaveable {
        mutableStateOf("")
    }
    var nimTxt by rememberSaveable {
        mutableStateOf("")
    }
    var konsentrasiTxt by rememberSaveable {
        mutableStateOf("")
    }
    var jdulskripsiTxt by rememberSaveable {
        mutableStateOf("")
    }
    var listDataTxt: MutableList<String> = mutableListOf(namaTxt, nimTxt, konsentrasiTxt, jdulskripsiTxt)

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
    ){
        Text(
            text = "Formulir Pengajuan Skripsi",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp))
        OutlinedTextField(value = namaTxt, onValueChange = {
            namaTxt = it
        }, label = {
            Text(text = "Nama Mahasiswa")
        })
        Spacer(modifier = Modifier.padding(16.dp))
        OutlinedTextField(value = nimTxt, onValueChange = {
            nimTxt = it
        }, label = {
            Text(text = "NIM")
        })
        Spacer(modifier = Modifier.padding(16.dp))
        OutlinedTextField(value = konsentrasiTxt, onValueChange = {
            konsentrasiTxt = it
        }, label = {
            Text(text = "Konsentrasi")
        })
        Spacer(modifier = Modifier.padding(16.dp))
        OutlinedTextField(value = jdulskripsiTxt, onValueChange = {
            jdulskripsiTxt = it
        }, label = {
            Text(text = "Judul Skripsi")
        })
        Spacer(modifier = Modifier.padding(16.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(R.dimen.padding_medium))
                .weight(1f, false),
            horizontalArrangement =
            Arrangement.spacedBy(dimensionResource(R.dimen.padding_medium)),
           verticalAlignment = Alignment.Bottom
        ){
            Button(
                modifier = Modifier.weight(1f),
                enabled = namaTxt.isNotEmpty() && nimTxt.isNotEmpty() && konsentrasiTxt.isNotEmpty(),
                onClick = { onSubmitButtonClick(listDataTxt) }
            ) {
                Text(stringResource(R.string.btn_next))
            }
        }

    }
}
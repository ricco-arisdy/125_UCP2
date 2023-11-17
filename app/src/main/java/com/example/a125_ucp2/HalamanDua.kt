package com.example.a125_ucp2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.example.a125_ucp2.Data.ui_state

@Composable
fun HalamanDua(
    orderUIState: ui_state,
    onCancelButtonClicked: () -> Unit,
    //onCancelButtonClicked: (String, String) -> Unit,
    modifier: Modifier = Modifier
){
    val items = listOf(
        Pair(stringResource(R.string.nama), orderUIState.namamhsw),
        Pair(stringResource(R.string.nim), orderUIState.nim),
        Pair(stringResource(R.string.konsen), orderUIState.konsentrasi),
        Pair(stringResource(R.string.jdl_skripsi), orderUIState.judulskripsi),
        Pair(stringResource(R.string.flavor), orderUIState.dosen)
    )
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Column(
            modifier =
            Modifier.padding(dimensionResource(R.dimen.padding_medium)),
            verticalArrangement =
            Arrangement.spacedBy(dimensionResource(R.dimen.padding_small))
        ) {
            items.forEach { item ->
                Column {
                    Text(item.first.uppercase())
                    Text(
                        text = item.second.toString(), fontWeight =
                        FontWeight.Bold
                    )
                }
                Divider(
                    thickness =
                    dimensionResource(R.dimen.thickness_divider)
                )
            }
            Spacer(
                modifier =
                Modifier.height(dimensionResource(R.dimen.padding_small))
            )

        }

        Row(
            modifier = Modifier
                .weight(1f, false)
                .padding(dimensionResource(R.dimen.padding_small))
        ) {

            }
        }
    }


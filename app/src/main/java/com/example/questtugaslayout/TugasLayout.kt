package com.example.questtugaslayout

import androidx.annotation.ColorRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TampilanUtama(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
            .padding(top = 20.dp, bottom = 20.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.TopCenter),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id = R.string.title_prodi),
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.black)
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = stringResource(id = R.string.title_univ),
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.black)
            )
            Spacer(modifier = Modifier.height(20.dp))
            CustomProfileCard(
                namaRes = R.string.nama_bambang,
                alamatRes = R.string.alamat_turi,
                cardBgColorRes = R.color.card_grey,
                alamatColorRes = R.color.text_yellow,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Normal
            )
        }
    }
}

@Composable
fun CustomProfileCard(
    @StringRes namaRes: Int,
    @StringRes alamatRes: Int,
    @ColorRes cardBgColorRes: Int,
    @ColorRes alamatColorRes: Int,
    modifier: Modifier = Modifier,
    @StringRes phoneRes: Int? = null,
    fontFamily: FontFamily = FontFamily.Default,
    fontWeight: FontWeight = FontWeight.Bold
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 6.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = cardBgColorRes)
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = stringResource(id = R.string.desc_logo_umy),
                modifier = Modifier.size(62.dp)
            )
            Spacer(modifier = Modifier.width(14.dp))
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = stringResource(id = namaRes),
                    fontSize = if (fontFamily == FontFamily.Cursive) 22.sp else 18.sp,
                    fontFamily = fontFamily,
                    fontWeight = fontWeight,
                    color = colorResource(id = R.color.white)
                )
                if (phoneRes != null) {
                    Text(
                        text = stringResource(id = phoneRes),
                        fontSize = 13.sp,
                        color = colorResource(id = R.color.text_cyan)
                    )
                }
                Text(
                    text = stringResource(id = alamatRes),
                    fontSize = 13.sp,
                    color = colorResource(id = alamatColorRes)
                )
            }
            Spacer(modifier = Modifier.width(14.dp))
            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = stringResource(id = R.string.desc_logo_umy),
                modifier = Modifier.size(62.dp)
            )
        }
    }
}
package com.codebaron.podcast.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import com.codebaron.podcast.R
import com.codebaron.podcast.ui.theme.PodcastTheme

@Composable
fun PodXHomeScreen() {
    Scaffold {
        BoxWithConstraints(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
        ) {
            Image(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .blur(20.dp),
                painter = rememberAsyncImagePainter(
                    ImageRequest.Builder(LocalContext.current)
                        .data(data = "")
                        .apply(block = fun ImageRequest.Builder.() {
                            placeholder(R.drawable.podi)
                            error(R.drawable.podi)
                        }).build()
                ),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxWidth()
            ) {
                Text(
                    text = buildAnnotatedString {
                        withStyle(style = SpanStyle(color = Color.Red)) {
                            append("Pod")
                        }
                        withStyle(style = SpanStyle(color = Color.White)) {
                            append("X")
                        }
                    }, style = MaterialTheme.typography.h2
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PodXHomeScreenUI() {
    PodcastTheme {
        PodXHomeScreen()
    }
}
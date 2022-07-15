package com.codebaron.podcast.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import com.codebaron.podcast.R
import com.codebaron.podcast.models.dummyGenres
import com.codebaron.podcast.models.podx.dummyResult
import com.codebaron.podcast.ui.theme.PodcastTheme
import com.codebaron.podcast.utils.getDateFromMilliseconds

@Composable
fun PodXHomeScreen() {
    val randomPodX = dummyResult.random()

    Scaffold {
        /*Image(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .blur(10.dp),
            painter = rememberAsyncImagePainter(
                ImageRequest.Builder(LocalContext.current)
                    .data(data = "")
                    .apply(block = fun ImageRequest.Builder.() {
                        placeholder(R.drawable.poddy)
                        error(R.drawable.poddy)
                    }).build()
            ),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )*/
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxWidth()
            ) {
                Spacer(modifier = Modifier.size(30.dp))
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
                Spacer(modifier = Modifier.size(5.dp))
                BoxWithConstraints(
                    modifier = Modifier
                        .height(200.dp)
                        .fillMaxWidth()
                        .padding(15.dp)
                ) {
                    Box {
                        Image(
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(10.dp))
                                .alpha(0.5f)
                                .blur(10.dp)
                                .drawWithCache {
                                    val gradient = Brush.verticalGradient(
                                        colors = listOf(Color.Transparent, Color.Gray),
                                        startY = size.height / 30,
                                        endY = size.height
                                    )
                                    onDrawWithContent {
                                        drawContent()
                                        drawRect(gradient, blendMode = BlendMode.Multiply)
                                    }
                                },
                            painter = rememberAsyncImagePainter(
                                ImageRequest.Builder(LocalContext.current)
                                    .data(data = randomPodX.image)
                                    .apply(block = fun ImageRequest.Builder.() {
                                        placeholder(R.drawable.podcasting)
                                        error(R.drawable.podcasting)
                                    }).build()
                            ),
                            contentDescription = null,
                            contentScale = ContentScale.Crop
                        )
                    }
                    Column(
                        modifier = Modifier
                            .align(Alignment.Center)
                            .padding(15.dp)
                    ) {
                        Text(
                            text = randomPodX.podcast_title_highlighted.toString(),
                            style = MaterialTheme.typography.h2,
                            color = Color.White,
                            maxLines = 2
                        )
                        Spacer(modifier = Modifier.size(30.dp))
                        Row {
                            Icon(
                                imageVector = Icons.Filled.PlayCircle,
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier
                                    .size(50.dp)
                                    .clickable { }
                            )
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Column {
                                    Text(
                                        text = getDateFromMilliseconds(randomPodX.pub_date_ms),
                                        style = MaterialTheme.typography.caption,
                                        color = Color.White
                                    )
                                    Text(
                                        text = "Listen Live",
                                        style = MaterialTheme.typography.body1,
                                        color = Color.White
                                    )
                                }
                                Column {
                                    Text(
                                        text = "Publisher",
                                        style = MaterialTheme.typography.caption,
                                        color = Color.White
                                    )
                                    Text(
                                        text = randomPodX.publisher_original.toString(),
                                        style = MaterialTheme.typography.body1,
                                        color = Color.White,
                                        maxLines = 1
                                    )
                                }
                            }
                        }
                    }
                }
            }
            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Explore Topics",
                    style = MaterialTheme.typography.h2,
                )
                Spacer(modifier = Modifier.size(20.dp))
                LazyRow {
                    items(dummyGenres) { genres ->
                        BoxWithConstraints {
                            Image(
                                modifier = Modifier
                                    .height(50.dp)
                                    .width(120.dp)
                                    .padding(2.dp)
                                    .clip(RoundedCornerShape(10.dp))
                                    .drawWithCache {
                                        val gradient = Brush.verticalGradient(
                                            colors = listOf(Color.Transparent, Color.Gray),
                                            startY = size.height / 30,
                                            endY = size.height
                                        )
                                        onDrawWithContent {
                                            drawContent()
                                            drawRect(gradient, blendMode = BlendMode.Multiply)
                                        }
                                    },
                                painter = painterResource(id = R.drawable.poddy),
                                contentDescription = null,
                                contentScale = ContentScale.Crop
                            )
                            Column(
                                modifier = Modifier
                                    .align(Alignment.Center)
                            ) {
                                Text(
                                    text = genres.name.toString(),
                                    style = MaterialTheme.typography.body1,
                                    color = Color.White
                                )
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.size(20.dp))
                Text(
                    text = dummyGenres[0].name.toString(),
                    style = MaterialTheme.typography.h2,
                )
                Spacer(modifier = Modifier.size(20.dp))
                LazyColumn {
                    items(dummyResult) { podx ->
                        Box(
                            modifier = Modifier
                                .height(120.dp)
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(10.dp))
                        ) {
                            Row(modifier = Modifier.fillMaxWidth()) {
                                Image(
                                    modifier = Modifier
                                        .height(120.dp)
                                        .width(120.dp)
                                        .padding(2.dp)
                                        .clip(RoundedCornerShape(10.dp)),
                                    painter = rememberAsyncImagePainter(
                                        ImageRequest.Builder(LocalContext.current)
                                            .data(data = podx.thumbnail)
                                            .apply(block = fun ImageRequest.Builder.() {
                                                placeholder(R.drawable.poddy)
                                                error(R.drawable.poddy)
                                            }).build()
                                    ),
                                    contentDescription = null,
                                    contentScale = ContentScale.Crop
                                )
                                Column(
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .fillMaxWidth()
                                ) {
                                    Text(
                                        text = podx.podcast_title_highlighted.toString(),
                                        style = MaterialTheme.typography.h3,
                                        maxLines = 2
                                    )
                                    Spacer(modifier = Modifier.size(1.dp))
                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceBetween,
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Column {
                                            Text(
                                                text = getDateFromMilliseconds(podx.pub_date_ms),
                                                style = MaterialTheme.typography.body2
                                            )
                                            Text(
                                                text = "Listen Live",
                                                style = MaterialTheme.typography.caption
                                            )
                                        }
                                        Spacer(modifier = Modifier.size(10.dp))
                                        Column {
                                            Text(
                                                text = "Publisher",
                                                style = MaterialTheme.typography.body2
                                            )
                                            Text(
                                                text = podx.publisher_original.toString(),
                                                style = MaterialTheme.typography.caption
                                            )
                                        }
                                        Box(
                                            modifier = Modifier.fillMaxWidth(),
                                            contentAlignment = Alignment.CenterEnd
                                        ) {
                                            Icon(
                                                imageVector = Icons.Filled.PlayCircle,
                                                contentDescription = null,
                                                modifier = Modifier
                                                    .size(50.dp)
                                                    .clickable { }
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
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
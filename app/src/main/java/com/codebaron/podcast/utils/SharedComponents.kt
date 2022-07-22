package com.codebaron.podcast.utils

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.PauseCircle
import androidx.compose.material.icons.filled.PlayCircle
import androidx.compose.material.icons.outlined.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import com.codebaron.podcast.R
import com.codebaron.podcast.models.podx.Result
import com.codebaron.podcast.models.podx.dummyResult
import com.codebaron.podcast.ui.theme.PodcastTheme

@Composable
fun PodXMediumView(
    isPlaying: Boolean,
    podcastObject: Result
) {
    Surface {
        Row(modifier = Modifier.fillMaxWidth()) {
            Image(
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp)
                    .padding(2.dp)
                    .clip(RoundedCornerShape(10.dp)),
                painter = rememberAsyncImagePainter(
                    ImageRequest.Builder(LocalContext.current)
                        .data(data = podcastObject.thumbnail)
                        .apply(block = fun ImageRequest.Builder.() {
                            placeholder(R.drawable.poddy)
                            error(R.drawable.poddy)
                        }).build()
                ),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
            Text(
                modifier = Modifier
                    .padding(10.dp)
                    .width(200.dp),
                text = podcastObject.podcast_title_highlighted.toString(),
                style = MaterialTheme.typography.body1,
                maxLines = 1,
            )
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.CenterEnd
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = if (isPlaying) Icons.Outlined.Favorite else Icons.Filled.Favorite,
                        contentDescription = null,
                        modifier = Modifier
                            .size(30.dp)
                            .clickable { }
                    )
                    Spacer(modifier = Modifier.size(10.dp))
                    Icon(
                        imageVector = if (isPlaying) Icons.Filled.PlayCircle else Icons.Filled.PauseCircle,
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

@Composable
fun PodXLargeView(
    isPlaying: Boolean,
    podcasts: List<Result>
) {
    val podcastObject = podcasts.random()

    Scaffold {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(color = Color.Black)
        ) {
            BoxWithConstraints(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(650.dp)
            ) {
                Box {
                    Image(
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth()
                            .alpha(0.5f)
                            .drawWithCache {
                                val gradient = Brush.verticalGradient(
                                    colors = listOf(Color.Transparent, Color.Black),
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
                                .data(data = podcastObject.thumbnail)
                                .apply(block = fun ImageRequest.Builder.() {
                                    placeholder(R.drawable.podcasting)
                                    error(R.drawable.podcasting)
                                }).build()
                        ),
                        contentDescription = null,
                        contentScale = ContentScale.Crop
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(140.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.KeyboardArrowLeft,
                            contentDescription = null,
                            modifier = Modifier
                                .clickable { }
                        )
                        Icon(
                            imageVector = Icons.Outlined.Favorite,
                            contentDescription = null,
                            modifier = Modifier
                                .clickable { }
                        )
                    }
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(15.dp)
                        .align(Alignment.BottomCenter)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column {
                            Text(
                                text = podcastObject.audio_length.toString(),
                                style = MaterialTheme.typography.caption,
                                color = Color.White
                            )
                            Text(
                                text = podcastObject.publisher_original.toString(),
                                style = MaterialTheme.typography.caption,
                                color = Color.White
                            )
                            Text(
                                text = podcastObject.podcast_title_original.toString(),
                                style = MaterialTheme.typography.h2,
                                color = Color.White,
                                maxLines = 4,
                                modifier = Modifier.width(250.dp)
                            )
                        }
                        Column {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    imageVector = Icons.Outlined.FastForward,
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(40.dp)
                                        .clickable { }
                                )
                            }
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    imageVector = if (isPlaying) Icons.Filled.PlayCircle else Icons.Filled.PauseCircle,
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clickable { }
                                )
                            }
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    imageVector = Icons.Outlined.FastRewind,
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(40.dp)
                                        .clickable { }
                                )
                            }
                        }
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(80.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Button(
                            onClick = { /* ... */ },
                            // Uses ButtonDefaults.ContentPadding by default
                            contentPadding = PaddingValues(
                                start = 20.dp,
                                top = 12.dp,
                                end = 20.dp,
                                bottom = 12.dp
                            ),
                            colors = ButtonDefaults.buttonColors(
                                backgroundColor = Color.Black,
                                contentColor = Color.White
                            )
                        ) {
                            Icon(
                                imageVector = Icons.Outlined.FollowTheSigns,
                                contentDescription = null,
                                modifier = Modifier
                                    .clickable { }
                            )
                            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
                            Text(
                                text = "Follow",
                                style = MaterialTheme.typography.body1,
                                maxLines = 1
                            )
                        }
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight(),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "100K Followers",
                                color = Color.White,
                                style = MaterialTheme.typography.caption
                            )
                        }
                    }
                    Spacer(modifier = Modifier.size(10.dp))
                    Text(
                        text = "${podcastObject.description_highlighted}...",
                        style = MaterialTheme.typography.caption,
                        color = Color.White,
                        maxLines = 3
                    )
                }
            }
            LazyColumn {
                items(podcasts) { podx ->
                    Box(
                        modifier = Modifier
                            .height(100.dp)
                            .fillMaxWidth()
                            .padding(5.dp)
                            .clip(RoundedCornerShape(10.dp))
                    ) {
                        Row(modifier = Modifier.fillMaxWidth()) {
                            Image(
                                modifier = Modifier
                                    .height(90.dp)
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
                                    .padding(5.dp)
                            ) {
                                Text(
                                    text = podx.podcast_title_original.toString(),
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
                                            style = MaterialTheme.typography.caption,
                                            maxLines = 1,
                                            modifier = Modifier.width(100.dp)
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
                                                .size(30.dp)
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

@Composable
fun PodXHome(randomPodX: Result) {
    val isPlaying = remember { false }

    Scaffold {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(color = Color.Black)
        ) {
            BoxWithConstraints(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
            ) {
                Box {
                    Image(
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth()
                            .alpha(0.5f)
                            .drawWithCache {
                                val gradient = Brush.verticalGradient(
                                    colors = listOf(Color.Transparent, Color.Black),
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
                                .data(data = randomPodX.thumbnail)
                                .apply(block = fun ImageRequest.Builder.() {
                                    placeholder(R.drawable.podcasting)
                                    error(R.drawable.podcasting)
                                }).build()
                        ),
                        contentDescription = null,
                        contentScale = ContentScale.Crop
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(15.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Outlined.KeyboardArrowLeft,
                        contentDescription = null,
                        modifier = Modifier
                            .clickable { }
                    )
                    Icon(
                        imageVector = Icons.Outlined.Search,
                        contentDescription = null,
                        modifier = Modifier
                            .clickable { }
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(15.dp)
                        .align(Alignment.BottomCenter)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = randomPodX.publisher_original.toString(),
                            style = MaterialTheme.typography.h1,
                            color = Color.White,
                            maxLines = 3,
                            modifier = Modifier.width(290.dp)
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(80.dp)
                    ) {
                        Card(
                            modifier = Modifier
                                .width(170.dp)
                                .height(80.dp)
                                .padding(15.dp)
                                .clip(RoundedCornerShape(60.dp))
                                .clickable { },
                            contentColor = Color.White
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceEvenly,
                            ) {
                                Icon(
                                    imageVector = Icons.Outlined.FollowTheSigns,
                                    contentDescription = null,
                                    modifier = Modifier
                                        .clickable { }
                                )
                                Text(
                                    text = "Follow",
                                    fontFamily = FontFamily.Monospace,
                                    fontWeight = FontWeight.Bold,
                                    textAlign = TextAlign.Justify,
                                    maxLines = 1
                                )
                            }
                        }
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight(),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "100K Followers",
                                color = Color.White,
                                style = MaterialTheme.typography.caption
                            )
                        }
                    }
                    Spacer(modifier = Modifier.size(30.dp))
                    PublisherEpisodes()
                }
            }
        }
    }
}

@Composable
fun PublisherEpisodes() {
    LazyRow {
        items(dummyResult) { podX ->
            Column(
                modifier = Modifier
                    .width(120.dp)
                    .height(120.dp)
                    .background(color = Color.Black)
                    .padding(3.dp)
                    .clip(RoundedCornerShape(10.dp))
            ) {
                BoxWithConstraints(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                ) {
                    Box {
                        Image(
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .alpha(0.5f)
                                .drawWithCache {
                                    val gradient = Brush.verticalGradient(
                                        colors = listOf(Color.Transparent, Color.LightGray),
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
                                    .data(data = podX.thumbnail)
                                    .apply(block = fun ImageRequest.Builder.() {
                                        placeholder(R.drawable.podcasting)
                                        error(R.drawable.podcasting)
                                    }).build()
                            ),
                            contentDescription = null,
                            contentScale = ContentScale.Crop
                        )
                    }
                    Text(
                        text = podX.publisher_original.toString(),
                        style = MaterialTheme.typography.h4,
                        color = Color.White,
                        maxLines = 3,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(5.dp)
                            .align(Alignment.BottomCenter)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PublisherEpisodesUI() {
    PodcastTheme {
        PublisherEpisodes()
    }
}

@Preview(showBackground = true)
@Composable
fun PodcastXhHomeScreenUI() {
    PodcastTheme {
        PodXHome(randomPodX = dummyResult.random())
    }
}

@Preview(showBackground = true)
@Composable
fun PodcastXPlayerLargeUI() {
    PodcastTheme {
        PodXLargeView(
            isPlaying = true,
            podcasts = dummyResult
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PodcastXPlayerMediumUI() {
    PodcastTheme {
        PodXMediumView(
            isPlaying = true,
            podcastObject = dummyResult[0]
        )
    }
}
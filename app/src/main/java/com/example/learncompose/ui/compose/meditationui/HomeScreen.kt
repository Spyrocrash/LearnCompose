package com.example.learncompose.ui.compose.meditationui


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.learncompose.Feature
import com.example.learncompose.R
import com.example.learncompose.ui.BottomMenuContent
import com.example.learncompose.ui.theme.*

@Composable
fun HomeScreen(
    navController:
    NavController
) {
    Box(
        modifier = Modifier
            .background(DeepBlue)
            .fillMaxSize()

    ) {
        Column {
            GreetingSection(userName = "Alexinio")
            ChipSection(listOf("Good", "Normal", "Insomnia", "Depression"))
            CurrentMeditation(
                navController
            )

                FeatureSection(

                    listOf(
                        Feature(
                            title = "Sleep meditation",
                            iconId = R.drawable.ic_headphone,
                            color = BlueViolet1
                        ),
                        Feature(
                            title = "Tips for sleeping",
                            iconId = R.drawable.ic_videocam,
                            color = Beige1
                        ),
                        Feature(
                            title = "Night island",
                            iconId = R.drawable.ic_music,
                            color = LightGreen1
                        ),
                        Feature(
                            title = "Calming sounds",
                            iconId = R.drawable.ic_moon,
                            color = OrangeYellow1
                        ),
                    )
                )

        }

        BottomMenu(
            items = listOf(
                BottomMenuContent(title = "Home", iconId = R.drawable.ic_home),
                BottomMenuContent(title = "Meditate", iconId = R.drawable.ic_bubble),
                BottomMenuContent(title = "Sleep", iconId = R.drawable.ic_moon),
                BottomMenuContent(title = "Music", iconId = R.drawable.ic_music),
                BottomMenuContent(title = "Profile", iconId = R.drawable.ic_profile),
            ),
            modifier = Modifier
                .align(Alignment.BottomCenter)
        )



    }

    }


@Composable
fun CurrentMeditation(
    navController: NavController
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
            .clip(RoundedCornerShape(15.dp))
            .background(LightRed)
            .padding(15.dp)
            .clickable {
                navController.navigate(Screen.MeditationScreen.route)
            }

    ) {
        Column {
            Text(
                text = "Daily Thoughts",
                style = MaterialTheme.typography.h2,
                modifier = Modifier
                    .padding(bottom = 5.dp)
            )
            Text(
                text = "Meditation 3-10 min",
                style = MaterialTheme.typography.body2,
                color = TextWhite
            )
        }

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(ButtonBlue)
                .padding(10.dp)

        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_play),
                contentDescription = "Play",
                tint = Color.White,
                modifier = Modifier
                    .size(15.dp)
                //.padding(2.dp)


            )
        }

    }
}

    @Composable
    fun GreetingSection(
        userName: String,
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)


        ) {
            Column() {
                Text(
                    text = "Good morning $userName",
                    style = MaterialTheme.typography.h2

                )

                Text(
                    text = "We wish you have a good day",
                    style = MaterialTheme.typography.body1

                )
            }

            Icon(
                painter = painterResource(id = R.drawable.ic_search),
                contentDescription = "Search",
                modifier = Modifier.size(20.dp),
                tint = Color.White
            )
        }
    }


    @Composable
    fun ChipSection(
        chips: List<String>
    ) {
        var selectedChipIndex by remember {
            mutableStateOf(0)
        }

        LazyRow() {
            items(chips.size) {
                Box(modifier = Modifier
                    .padding(top = 15.dp, start = 15.dp, bottom = 15.dp, end = 15.dp)
                    .clip(RoundedCornerShape(15.dp))
                    .clickable {
                        selectedChipIndex = it
                    }
                    .background(
                        if (selectedChipIndex == it) ButtonBlue
                        else DarkerButtonBlue
                    )
                    .padding(15.dp)

                ) {
                    Text(
                        text = chips[it],
                        style = MaterialTheme.typography.h2
                    )
                }
            }
        }

    }

    @Composable
    fun FeatureSection(
        features: List<Feature>
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                modifier = Modifier
                    .padding(15.dp),
                text = "Featured",
                style = MaterialTheme.typography.h1
            )
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                contentPadding = PaddingValues(start = 7.5.dp, end = 7.5.dp, bottom = 10.dp),
            ) {
                items(features.size) {
                    FeatureItem(features[it])
                }

            }
        }
    }

    @Composable
    fun FeatureItem(feature: Feature) {
        Column(
            modifier = Modifier
                .padding(10.dp)
                .clip(RoundedCornerShape(15.dp))
                .background(feature.color)
                .padding(10.dp)

        ) {
            Text(
                text = feature.title,
                style = MaterialTheme.typography.h2,
                modifier = Modifier
            )
            Spacer(modifier = Modifier.height(50.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Icon(
                    painter = painterResource(id = feature.iconId),
                    contentDescription = feature.title,
                    tint = Color.White,
                    modifier = Modifier
                )
                Text(
                    text = "Start",
                    style = MaterialTheme.typography.h2,
                    modifier = Modifier
                        //.align()
                        .clip(RoundedCornerShape(15.dp))
                        .background(ButtonBlue)
                        .padding(8.dp),
                    fontSize = 14.sp

                )
            }

        }
    }




@Composable
fun BottomMenu(
    items: List<BottomMenuContent>,
    modifier: Modifier,
){
    var selectedItemIndex by remember {
        mutableStateOf(0)
    }

    Row(verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        items.forEachIndexed { index, item ->
            BottomMenuItem(
                item = item,
                isSelected = selectedItemIndex == index,
            ) {
                selectedItemIndex = index
            }
        }
        }
    }


@Composable
fun BottomMenuItem(
    item: BottomMenuContent,
    isSelected: Boolean = false,
    activeTextAndIconColor:Color = TextWhite,
    inactiveTextAndIconColor: Color = AquaBlue,
    activeBackground: Color = ButtonBlue,
    onItemClick: () -> Unit
){
    Column (modifier = Modifier
        .clickable {
            onItemClick()
        })
    {
        Box(modifier = Modifier
            .clip(RoundedCornerShape(10.dp))
            .background(if (isSelected) activeBackground else Color.Transparent)
            .padding(10.dp)
            .align(CenterHorizontally)
        ) {
            Icon(
                painter = painterResource(item.iconId),
                contentDescription = item.title,
                tint = if (isSelected) activeTextAndIconColor else inactiveTextAndIconColor,
                modifier = Modifier
                    .size(20.dp)
            )
        }
        Text(
            text = item.title,
            fontSize = 15.sp,
            style = MaterialTheme.typography.body2,
           color = if (isSelected) activeTextAndIconColor else inactiveTextAndIconColor
        )
    }
}

//@Composable
//fun BottomMenu(
//    items: List<BottomMenuContent>,
//    modifier: Modifier = Modifier
//){
//    val selectedItemIndex by remember {
//        mutableStateOf(0)
//    }
//    Row(
//        horizontalArrangement = Arrangement.SpaceAround,
//        verticalAlignment = Alignment.Bottom,
//        modifier = modifier
//            .fillMaxWidth()
//            .padding(10.dp)
//    ){
//        items.forEachIndexed { index, bottomMenuContent ->
//           BottomMenuItem(
//              // bottomMenuContent()
//        }
//
//    }
//}





//    @Composable
//    fun BottomMenu(
//        items: List<BottomMenuContent>,
//        modifier: Modifier = Modifier
//    ) {
//        var selectedItemIndex by remember {
//            mutableStateOf(0)
//        }
//
//        LazyRow(
//            verticalAlignment = Alignment.CenterVertically,
//            horizontalArrangement = Arrangement.SpaceAround,
//            modifier = modifier
//                .fillMaxWidth()
//                .padding(15.dp)
//
//        ) {
//            items(items.size) {
//                Column(modifier = Modifier
//                    .clickable { selectedItemIndex = it }
//                ) {
//                    Box(
//                        modifier = Modifier
//                            .clip(RoundedCornerShape(10.dp))
//                            .background(
//                                if (selectedItemIndex == it) ButtonBlue
//                                else Color.Transparent
//                            )
//                            .padding(15.dp)
//
//                    ) {
//                        Icon(
//                            modifier = Modifier
//                                .size(20.dp),
//                            painter = painterResource(items[it].iconId),
//                            contentDescription = items[it].title,
//                            tint = if (selectedItemIndex == it) Color.White
//                            else Color.Gray
//                        )
//                    }
//                    Text(
//                        text = items[it].title,
//                        color = if (selectedItemIndex == it) TextWhite
//                        else ButtonBlue,
//                        style = MaterialTheme.typography.body1
//                    )
//                }
//            }
//
//        }
//    }


   /* @Composable
    fun BottomMenuItem(
        item: BottomMenuContent,
        isSelected: Boolean = false,
        activeHighlightColor: Color = ButtonBlue,
        activeTextColor: Color = Color.White,
        inactiveTextColor: Color = AquaBlue,
        onItemClick: () -> Unit

    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.clickable {
                onItemClick()
            }
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .background(if (isSelected) activeHighlightColor else Color.Transparent)
                    .padding(10.dp)

            ) {
                Icon(
                    painter = painterResource(item.iconId),
                    contentDescription = item.title,
                    tint = if (isSelected) activeTextColor else inactiveTextColor,
                    modifier = Modifier.size(20.dp)
                )
            }

            Text(
                text = item.title,
                color = if (isSelected) activeTextColor else inactiveTextColor
            )
        }


    }*/


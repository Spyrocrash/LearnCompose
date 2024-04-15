package com.example.learncompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.learncompose.ui.compose.meditationui.HomeScreen
import com.example.learncompose.ui.compose.meditationui.MeditationScreen
import com.example.learncompose.ui.compose.meditationui.Screen
import com.example.learncompose.ui.theme.MeditationUITheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


            MeditationUITheme {
                val navController = rememberNavController()
                NavHost(navController =navController, startDestination = Screen.HomeScreen.route) {
                    composable(Screen.HomeScreen.route) {
                        HomeScreen(navController = navController)
                    }
                    composable(route = Screen.MeditationScreen.route) {
                        MeditationScreen()
                    }
                }
            }



//            ConstraintLayout {
//                val box1 = createRef()
//                Box(Modifier.size(200.dp).background(Color.DarkGray).constrainAs(box1) {
//                    linkTo(start=parent.start,top=parent.top, end = parent.end, bottom=parent.bottom, 16.dp, 16.dp, 16.dp, 16.dp)
//                })
//            }

/*
            var color by remember {mutableStateOf(Color.Yellow)}

            Column(modifier = Modifier
                .fillMaxSize()
            ) {
                LearnState().ColorBoxAnotherBox(
                    modifier = Modifier.weight(1f).fillMaxSize()
                ) {
                    color = it
                }
                Box(modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(color))
            }
*/


//            LearnState().ColorBox(
//                modifier = Modifier.fillMaxSize()
//            )

            //TestTextStyling().testSimpleText("Beautiful image")
            //TestTextStyling().testAnnotatedString()

                /*MyImage().ImageCard(
                    painter = painterResource(id = R.drawable.image1),
                    contentDescription = "Some desc",
                    title = "Beautiful image")
*/
            /*LearnComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }*/
        }
    }
}



/*@Composable
fun ImageCard(
    painter: Painter,
    contentDescription: String,
    title: String,
    //modifier: Modifier = Modifier,
) {
    Card(
        Modifier.padding(8.dp).height(200.dp).fillMaxWidth(0.5f),
        shape = RoundedCornerShape(10.dp),
        elevation = 5.dp
    ) {
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            listOf(Color.Transparent, Color.Black),
                            startY = 300f
                        )
                    )
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                contentAlignment = Alignment.BottomCenter
            ) {
                Text(
                    text = title,
                    fontSize = 16.sp,
                    color = Color.White
                )
            }

        }
    }

}

@Preview
@Composable
fun TestImageCard(
    painter: Painter = painterResource(R.drawable.image1),
    contentDescription: String = "Some beautiful image",
    title: String = "Beautiful image",
){
        Card(
            Modifier.height(200.dp),
            shape = RoundedCornerShape(10.dp),
            elevation = 5.dp
        ) {
            Box(
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = painter,
                    contentDescription = contentDescription,
                    contentScale = ContentScale.Crop
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Brush.verticalGradient(
                                listOf(Color.Transparent, Color.Black),
                                startY = 300f
                            )
                        )
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    contentAlignment = Alignment.BottomCenter
                ) {
                    Text(
                        text = title,
                        fontSize = 16.sp,
                        color = Color.White
                    )
                }

            }
        }*/


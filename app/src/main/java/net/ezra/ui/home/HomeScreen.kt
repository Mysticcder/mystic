package net.ezra.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_EVENING
import net.ezra.navigation.ROUTE_PRODUCTS
import net.ezra.navigation.ROUTE_SHOP

import net.ezra.R
import net.ezra.navigation.ROUTE_ADD_STUDENTS

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {
    Box {
        Image(painter = painterResource(id = R.drawable.img_4),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
        )
    }


        var presses by remember { mutableIntStateOf(0) }

        Scaffold(
            topBar = {
                TopAppBar(
                    colors = topAppBarColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer,
                        titleContentColor = MaterialTheme.colorScheme.primary,
                    ),
                    title = {
                        Text("HomeScreen")
                    }
                )
            },
            bottomBar = {
                BottomAppBar(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    contentColor = MaterialTheme.colorScheme.primary,
                ) {

                    Icon(imageVector = Icons.Default.Home, contentDescription = "",)

                    Spacer(modifier = Modifier.width(90.dp))

                    Icon(imageVector = Icons.Default.Favorite, contentDescription = "")
                    
                    Spacer(modifier = Modifier.width(90.dp))
                    
                    Icon(imageVector = Icons.Default.Person, contentDescription = "")

                    Spacer(modifier = Modifier.width(90.dp))


//                    Text(
//                        modifier = Modifier
//                            .fillMaxWidth(),
//                        textAlign = TextAlign.Center,
//                        text = "Bottom app bar",
//                    )
                }
            },
            floatingActionButton = {
                FloatingActionButton(onClick = { presses++ }) {
                    Icon(Icons.Default.Add, contentDescription = "Add")
                }
            }
        ) { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding),
                verticalArrangement = Arrangement.spacedBy(16.dp),
            ) {
//                Text(
//                    modifier = Modifier.padding(8.dp),
//                    text =
//                    """
//                    This is an example of a scaffold. It uses the Scaffold composable's parameters to create a screen with a simple top app bar, bottom app bar, and floating action button.
//
//                    It also contains some basic inner content, such as this text.
//
//                    You have pressed the floating action button $presses times.
//                """.trimIndent(),
//                )
            }
        }


    Column(
        modifier = Modifier
            .fillMaxSize()
//            .wrapContentHeight()
//            .padding(10.dp)
//            .padding(top = 10.dp)
//            .background(Color.Blue)

    ){
        Text(text = stringResource(id = R.string.mit))
        Text(text = "this is the homepage",color = Color.Red)

        Text(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_ABOUT) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                },
            text = "about",color = Color.Red
        )

        Button(onClick = {
            navController.navigate(ROUTE_ABOUT) {
                popUpTo(ROUTE_HOME) { inclusive = true }
            }
        }) {

            Text(text = "sketchy about")

        }

        Text(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_CONTACT) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                },
            text = "Contact",color = Color.Red
        )

        Card(
            colors = CardDefaults.cardColors(Color(0xffE52C04)),
            elevation = CardDefaults.cardElevation(5.dp)

        ) {



        }


        Text(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_PRODUCTS) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                },
            text = "go to products screen",color = Color.Red

        )

        Button(onClick = {
            navController.navigate(ROUTE_MIT) {
                popUpTo(ROUTE_HOME) { inclusive = true }
            }}) {

            Text(text = "mysterious")

        }

        Text(
            modifier = Modifier

                .clickable {
                    navController.navigate(ROUTE_MIT) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                },
            text = "go to mit",
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurface
        )

        Text(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_SHOP) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                },
            text = "go to shop screen",
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurface
        )
        
        Spacer(modifier = Modifier.height(10.dp))


        
        OutlinedButton(onClick = {

            navController.navigate(ROUTE_ADD_STUDENTS) {
                popUpTo(ROUTE_HOME) { inclusive = true }
            }

        }) {

            Text(text = "Add Students",color = Color.Red)

        }







    }

}


@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())

}


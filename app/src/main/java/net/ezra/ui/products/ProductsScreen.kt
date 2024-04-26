package net.ezra.ui.products

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.R
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_PRODUCTS
import net.ezra.navigation.ROUTE_SHOP
import net.ezra.ui.students.uploadImageToFirebaseStorage

@Composable
fun ProductsScreen(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
//            .wrapContentHeight()
//            .padding(10.dp)
//            .padding(top = 10.dp)

    ){
        Text(text = "this is the product screen")

        Text(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_HOME) {
                        popUpTo(ROUTE_PRODUCTS) { inclusive = true }
                    }
                },
            text = "Go home", color = Color(0xff23D342)
        )


        Row {
            Image(
                painter = painterResource(id = R.drawable.img_2),
                contentDescription =null)
                
                Text(text = "sh 100")
//                colorFilter = ColorFilter.tint(Color.Green)
            

            Spacer(modifier = Modifier.width(15.dp))

            Image(painter = painterResource(id = R.drawable.img_3),
                contentDescription = "")
            Spacer(modifier = Modifier.height(10.dp))
        }

        Row {
            Image(painter = painterResource(id = R.drawable.img_6),
                contentDescription ="" )
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "sh 3000")
            
            Spacer(modifier = Modifier.width(15.dp))

            Image(painter = painterResource(id = R.drawable.img_5),
                contentDescription ="" )
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "sh 3000")

        }

        Row {
            Image(painter = painterResource(id = R.drawable.img_7),
                contentDescription ="" )
            Spacer(modifier = Modifier.height(10.dp))
        }













        }

}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    ProductsScreen(rememberNavController())
}


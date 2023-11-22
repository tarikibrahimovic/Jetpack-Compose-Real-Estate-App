package com.example.myapplication

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Divider
import androidx.compose.material.OutlinedTextField
import androidx.compose.material3.TextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.layout.ContentScale
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.Text
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.*
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.RadioButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Switch
import androidx.compose.material.Text
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Email
//import androidx.compose.material.icons.filled.InsertDriveFile
//import androidx.compose.material.icons.filled.Note
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        setContent {
            MyApplicationTheme {
//                LoginPage()
//                HomePage()
                OptionsPage()
            }
        }
    }
}

@Composable
fun OptionsPage(){
    val activeButton = remember { mutableStateOf("Real Estate") }

    Box(modifier = Modifier.fillMaxSize()) {
        Column (
            modifier = Modifier
                .background(Color.White)
                .padding(top = 48.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){
                CircleButton(2)
                Spacer(modifier = Modifier.width(76.dp))
                Text(text = "Filter Property", style = MaterialTheme.typography.bodyMedium, color = Color.LightGray)
                Spacer(modifier = Modifier.width(76.dp))
                CircleButton(3)
            }
            Spacer(modifier = Modifier.height(32.dp))
            Row(modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically) {
                CustomSwitch()
            }
            Spacer(modifier = Modifier.height(32.dp))
            Row(modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically) {
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp)) {
                    Text(text = "Price Range", style = MaterialTheme.typography.bodyLarge, color = Color.Black)
                    Spacer(modifier = Modifier.height(16.dp))
                    Image(
                        painter = painterResource(id = R.drawable.graph_1),
                        contentDescription = "Background Image",
                        modifier = Modifier.fillMaxWidth(),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier
                        .height(1.dp)
                        .background(Color.LightGray)
                        .fillMaxWidth())
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row(modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically) {
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp)) {
                    Text(text = "House Type", style = MaterialTheme.typography.bodyLarge, color = Color.Black)
                    Spacer(modifier = Modifier.height(16.dp))
                    Row(horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically) {
                        CustomOptionButton(activeButton, "Real Estate")
                        CustomOptionButton(activeButton, "Apartment")
                        CustomOptionButton(activeButton, "House")
                        CustomOptionButton(activeButton, "Motels")
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Spacer(modifier = Modifier
                        .height(1.dp)
                        .background(Color.LightGray)
                        .fillMaxWidth())
                    Spacer(modifier = Modifier.height(16.dp))
                    Spacer(modifier = Modifier
                        .height(1.dp)
                        .background(Color.LightGray)
                        .fillMaxWidth())
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically) {
                Column(modifier = Modifier
                    .width(180.dp)
                    .padding(start = 16.dp, end = 16.dp)) {
                    PreferenceSection(text = "Rooms")
                }
                Column(modifier = Modifier
                    .width(180.dp)
                    .padding(start = 16.dp, end = 16.dp)) {
                    PreferenceSection(text = "Bathrooms")
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Spacer(modifier = Modifier
                .height(1.dp)
                .background(Color.LightGray)
                .fillMaxWidth())
            Spacer(modifier = Modifier.height(16.dp))
            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically) {
                Column(modifier = Modifier
                    .fillMaxWidth()) {
                    Row(modifier = Modifier.fillMaxWidth()){
                Text(text = "Amenities", style = MaterialTheme.typography.bodyLarge, color = Color.Black, modifier = Modifier.padding(start = 16.dp, end = 16.dp))
                Spacer(modifier = Modifier.weight(1f))
                Text(text = "Show All", style = MaterialTheme.typography.bodyMedium, color = Color.LightGray, modifier = Modifier.padding(start = 16.dp, end = 16.dp))
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    RadioSection(text = "Garage")
                    RadioSection(text = "Wifi")
                    RadioSection(text = "Pool")
                }
            }
            Row(modifier = Modifier.fillMaxWidth(0.95f).height(300.dp),
                verticalAlignment = Alignment.CenterVertically) {
                FixedPositionButton()
            }
        }
    }
}

@Composable
fun FixedPositionButton() {
    Box(modifier = Modifier.fillMaxWidth()) {
        Button(
            onClick = { /* Do something when clicked */ },
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = (-50).dp),
            shape = RoundedCornerShape(30.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black)
        ) {
            Text("Save Filter", color = Color.White)
        }
    }
}

@Composable
fun RadioSection(text: String){
    var selectedOption by remember { mutableStateOf("") }

    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 16.dp, end = 16.dp),
        verticalAlignment = Alignment.CenterVertically,){
        Text(text = text, style = MaterialTheme.typography.bodyLarge, color = Color.Black)
        Spacer(modifier = Modifier.weight(1f))
        RadioButton(selected = (text == selectedOption), onClick = { selectedOption = text })
    }
}


@Composable
fun PreferenceSection(text: String){
    val activeButton = remember { mutableStateOf("") }

    Text(text = text, style = MaterialTheme.typography.bodyLarge, color = Color.Black)
    Spacer(modifier = Modifier.height(16.dp))
    Row(modifier = Modifier
        .fillMaxWidth()) {
        CustomCircleButton(activeButton, "1")
        Spacer(modifier = Modifier.width(3.dp))
        CustomCircleButton(activeButton, "2")
        Spacer(modifier = Modifier.width(3.dp))
        CustomCircleButton(activeButton, "3")
        Spacer(modifier = Modifier.width(3.dp))
        CustomCircleButton(activeButton, "4+")
    }
}

@Composable
fun CustomCircleButton(activeButton: MutableState<String>, text: String){
    val isActive = activeButton.value == text
    val backgroundColor = if (isActive) Color.Black else Color.White
    val textColor = if (isActive) Color.White else Color.Black

    Button(
        onClick = { activeButton.value = text },
        shape = CircleShape,
        modifier = Modifier
            .width(35.dp)
            .height(35.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor, contentColor = textColor),
        contentPadding = PaddingValues(0.dp)
    ) {
        Text(text = text, color = textColor, fontSize = 10.sp)
    }
}

@Composable
fun CustomOptionButton(activeButton: MutableState<String>, text: String){
    val isActive = activeButton.value == text
    val backgroundColor = if (isActive) Color.Black else Color.White
    val textColor = if (isActive) Color.White else Color.Black

    Button(
        onClick = { activeButton.value = text },
        modifier = Modifier
            .width(100.dp)
            .size(35.dp)
            .padding(start = 2.dp, end = 2.dp),
        shape = RoundedCornerShape(30.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor, contentColor = textColor)) {
        Text(text = text, color = textColor, fontSize = 10.sp ) // Adjust fontSize here
    }
}


@Composable
fun CustomSwitch() {
    var isForRentActive by remember { mutableStateOf(true) }

    Row(modifier = Modifier
        .width(350.dp)
        .height(50.dp)
        .clip(RoundedCornerShape(50.dp))
        .background(Color.LightGray),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically) {

        if (isForRentActive) {
            Spacer(modifier = Modifier.width(60.dp))
            Text(text = "For Rent")
        } else {
            Button(
                onClick = { isForRentActive = true },
                modifier = Modifier
                    .width(165.dp)
                    .height(50.dp)
                    .border(width = 1.dp, color = Color.LightGray, shape = RoundedCornerShape(50.dp))
                    .clip(RoundedCornerShape(50.dp)),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)
            ) {
                Text("For Rent")
            }
        }

        Spacer(modifier = Modifier.width(60.dp))

        if (isForRentActive) {
            Button(
                onClick = { isForRentActive = false },
                modifier = Modifier
                    .width(165.dp)
                    .height(50.dp)
                    .border(width = 1.dp, color = Color.LightGray, shape = RoundedCornerShape(50.dp))
                    .clip(RoundedCornerShape(50.dp)),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)
            ) {
                Text("For Sale")
            }
        } else {
            Text(text = "For Sale")
            Spacer(modifier = Modifier.width(60.dp))
        }
    }
}




@Composable
fun HomePage(){
    val activeButton = remember { mutableStateOf("Real Estate") }
    Box(modifier = Modifier.fillMaxSize()){
        Column(
            modifier = Modifier
                .background(Color.White)
                .padding(top = 48.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Row(
                modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){
                SearchBar()
                Spacer(modifier = Modifier.width(16.dp))
                CircleButton()
            }
            Spacer(modifier = Modifier.height(16.dp))
            LazyRow(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(0.dp), // Add space between items
                verticalAlignment = Alignment.CenterVertically
            ) {
                item { CustomHomeButton(activeButton, "Real Estate", width = 180, fontSize = 12, size = 40) }
                item { CustomHomeButton(activeButton, "Apartment", width = 180, fontSize = 12, size = 40) }
                item { CustomHomeButton(activeButton, "House", width = 180, fontSize = 12, size = 40) }
                item { CustomHomeButton(activeButton, "Motels", width = 180, fontSize = 12, size = 40) }
            }
            Spacer(modifier = Modifier.height(16.dp))
            LazyRow(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(0.dp), // Add space between items
                verticalAlignment = Alignment.CenterVertically
            ){
                item { CardHouse(image = 1, price = 440000, address = "123 Main St, Tulsa, OK 74136") }
                item { CardHouse(image = 2, price = 420000, address = "101 Main St, Willow, OK 74136") }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row(modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically){
                CardProject(image = 1, text = "New Listening")
                CardProject(image = 2, text = "New Projects")
            }
            Row(modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically){
                CardProject(image = 3, text = "Open House")
                CardProject(image = 4, text = "Price Reduced")
            }
            BottomTabNavigation()

        }
    }
}

@Composable
fun CustomHomeButton(activeButton: MutableState<String>, text: String, width: Int = 180, fontSize: Int = 14, size: Int = 50){
    val isActive = activeButton.value == text
    val backgroundColor = if (isActive) Color.Black else Color.White
    val textColor = if (isActive) Color.White else Color.Black

    Button(
        onClick = { activeButton.value = text },
        modifier = Modifier
            .width(width.dp)
            .size(size.dp)
            .padding(start = 16.dp, end = 16.dp),
        shape = RoundedCornerShape(30.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor, contentColor = textColor)) {
        Text(text = text, modifier = Modifier.padding(0.dp), color = textColor, fontSize = fontSize.sp ) // Adjust fontSize here
    }
}


@Composable
fun BottomTabNavigation()
{
    val items = listOf(
        "Home",
        "Inbox",
        "Activity",
        "Profile"
    )

    var selectedItem by remember { mutableStateOf("Home") }

    Scaffold(
        bottomBar = {
            BottomNavigation(
                elevation = 16.dp,
                backgroundColor = Color.White,
                contentColor = Color.Black
            ) {
                val items = listOf(
                    "Home" to Icons.Filled.Home,
                    "Inbox" to Icons.Filled.Email,
                    "Activity" to Icons.Filled.DateRange,
                    "Profile" to Icons.Filled.AccountCircle
                )

                items.forEach { (item, icon) ->
                    BottomNavigationItem(
                        icon = { Icon(icon, contentDescription = null) },
                        label = { Text(item) },
                        selected = selectedItem == item,
                        onClick = { selectedItem = item }
                    )
                }
            }
        }
    ) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            when (selectedItem) {
                "Home" -> Text("", Modifier.fillMaxSize(), textAlign = TextAlign.Center)
                "Inbox" -> Text("", Modifier.fillMaxSize(), textAlign = TextAlign.Center)
                "Activity" -> Text("", Modifier.fillMaxSize(), textAlign = TextAlign.Center)
                "Profile" -> Text("", Modifier.fillMaxSize(), textAlign = TextAlign.Center)
            }
        }
    }
}




@Composable
fun CardProject(image: Int, text: String){
    print(image)
    var imageFor = Any()
    if (image == 1){
        imageFor = R.drawable.proj_image_1
    }
    else if (image == 2){
        imageFor = R.drawable.proj_image_2
    }
    else if (image == 3){
        imageFor = R.drawable.proj_image_3
    }
    else{
        imageFor = R.drawable.proj_image_4
    }

    Box(modifier = Modifier
        .width(200.dp)
        .padding(8.dp),
        contentAlignment = Alignment.Center) { // This will center the contents
        Image(
            painter = painterResource(id = imageFor),
            contentDescription = "Background Image",
            modifier = Modifier.height(120.dp),
            contentScale = ContentScale.Crop
        )
        Text(text = text, style = MaterialTheme.typography.headlineSmall, color = Color.White)
    }

}


@Composable
fun CardHouse(image: Int, price: Int, address: String)
    {
        var imageFor = Any()
        if (image == 1){
            imageFor = R.drawable.house_image_1
        }
        else{
            imageFor = R.drawable.house_image_3
        }
        Column(modifier = Modifier
            .width(300.dp)
            .padding(16.dp)) {
            Box(modifier = Modifier
                .height(250.dp)
                .fillMaxWidth()) {
                Image(
                    painter = painterResource(id = imageFor),
                    contentDescription = "Background Image",
                    modifier = Modifier.height(250.dp),
                    contentScale = ContentScale.Crop
                )
            }
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)) {
                Text(text = "$$price", style = MaterialTheme.typography.headlineLarge, color = Color.Black)
                Text(text = address, style = MaterialTheme.typography.bodyMedium, color = Color.LightGray)
            }
        }
    }




@Composable
fun CircleButton(icon: Int = 1) {
    var iconForDisplay = Any()
    val buttonHeight = 50.dp

    Button(
        onClick = { /* Do something when clicked */ },
        shape = CircleShape,
        modifier = Modifier
            .size(buttonHeight)
            .border(width = 1.dp, color = Color.LightGray, shape = CircleShape),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.White
        )
    ) {
        if(icon == 1)
            Icon(Icons.Filled.Settings, contentDescription = null)
        else if(icon == 2)
            Icon(Icons.Filled.KeyboardArrowLeft, contentDescription = null)
        else
            Icon(Icons.Filled.Refresh, contentDescription = null)
    }
}

@Composable
fun SearchBar() {
    var text by remember { mutableStateOf("") }

    TextField(
        value = text,
        onValueChange = { text = it },
        leadingIcon = { Icon(Icons.Filled.Search, contentDescription = null, Modifier.size(30.dp)) },
        placeholder = { Text(text = "Search") },
        singleLine = true,
        shape = RoundedCornerShape(25.dp),
        modifier = Modifier
            .width(300.dp)
            .height(50.dp)
            .border(width = 1.dp, color = Color.LightGray, shape = RoundedCornerShape(25.dp)),
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color.White,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        )
    )
}


@Composable
fun CustomButton(color: Color, text: String, backgroundColor: Color, width: Int = 180, fontSize: Int = 14, size: Int = 50){
    Button(
        onClick = {
        },
        modifier = Modifier
            .width(width.dp)
            .size(size.dp)
            .padding(start = 16.dp, end = 16.dp),
        shape = RoundedCornerShape(30.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor, contentColor = color)) {
        Text(text = text, modifier = Modifier.padding(0.dp), color = color, fontSize = fontSize.sp ) // Adjust fontSize here
    }
}



@Composable
fun LoginPage() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(520.dp)
                    .background(Color.LightGray),
                contentAlignment = Alignment.BottomCenter
            ) {
                Image(
                    painter = painterResource(id = R.drawable.background_image),
                    contentDescription = "Background Image",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
                Text(text = "Discover Your Dream Home", style = MaterialTheme.typography.headlineLarge, color = Color.White, modifier = Modifier.padding(16.dp))
            }
            Spacer(modifier = Modifier.height(10.dp))
            Divider(color = Color.LightGray, thickness = 2.dp, modifier = Modifier.width(40.dp))
            Spacer(modifier = Modifier.height(8.dp))
                //ROW Login Sign Up
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    CustomButton(color = Color.White, text = "Log In", backgroundColor = Color.Black)
                    CustomButton(color = Color.Black, text = "Sign Up", backgroundColor = Color.White)
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Divider(color = Color.LightGray, thickness = 1.dp, modifier = Modifier.width(110.dp))
                    Text(text = "  or Login With  ")
                    Divider(color = Color.LightGray, thickness = 1.dp, modifier = Modifier.width(110.dp))
                }
                //LOGIN BUTTONS
                Spacer(modifier = Modifier.height(16.dp))
                Button(
                    onClick = {

                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, end = 16.dp),
                    shape = RoundedCornerShape(30.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_logo_google),
                            contentDescription = "",
                            modifier = Modifier
                                .size(38.dp)
                                .padding(end = 8.dp)
                        )
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(text = "Continue with Google", modifier = Modifier.padding(6.dp))
                        }
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))
                Button(
                    onClick = {

                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, end = 16.dp),
                    shape = RoundedCornerShape(30.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_logo_apple),
                            contentDescription = "",
                            modifier = Modifier
                                .size(38.dp)
                                .padding(end = 8.dp)
                        )
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(text = "Continue with Apple", modifier = Modifier.padding(6.dp))
                        }
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))
                Button(
                    onClick = {

                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, end = 16.dp),
                    shape = RoundedCornerShape(30.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_logo_facebook),
                            contentDescription = "",
                            modifier = Modifier
                                .size(38.dp)
                                .padding(end = 8.dp)
                        )
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(text = "Continue with Facebook", modifier = Modifier.padding(6.dp))
                        }
                    }
                }
        }
    }
}
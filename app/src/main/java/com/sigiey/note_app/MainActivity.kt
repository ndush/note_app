package com.sigiey.note_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.sigiey.note_app.ui.theme.Note_AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Note_AppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //AppNavigation()
                    LoginScreen()

                }
            }
        }
    }
}

@Composable
fun LoginScreen(){
    var username by remember{ mutableStateOf("") }
    var  password by remember{mutableStateOf(value = "")}

    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(12.dp)) {
        Text(
            text="simple page login",
            fontSize = 20.sp,
            textAlign = TextAlign.Center
        )
        TextField(
            value =username,
            onValueChange = {userInput-> username=userInput},
            label = {Text("Username")},
            modifier =Modifier.fillMaxWidth().padding(bottom=10.dp)
        )
        TextField(
            value = password,
            onValueChange = {pwdInput->password=pwdInput},
            label = {Text("Password")},
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp)
        )
        Button(onClick = {}) {
            Text(text = "Login")
        }
    }
}
//fun AppNavigation(){
//    val navController = rememberNavController()
//
//    NavHost(
//        navController = navController,
//        startDestination = "note-list"
//    ){
//        composable("note-list"){
//            NoteListScreen(navController)
//        }
//        composable("add-note"){
//            AddNoteScreen()
//        }
//    }
//}
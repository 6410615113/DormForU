package com.example.myapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.myapp.ViewModel.HelloViewModel
import com.example.myapp.ViewModel.PageViewModel
import com.example.myapp.ui.materials.Dropdown
import com.example.myapp.ui.materials.bottomBar
import com.example.myapp.ui.materials.dormCard
import com.example.myapp.ui.materials.topBar
import com.example.myapp.ui.theme.MyAppTheme
import com.example.myapp.ui.ui.theme.BackGroundColorTheme

class DormActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = BackGroundColorTheme
                ) {
                    Page1()
                }
            }
        }
    }
}
@Composable
fun HelloScreen(helloViewModel: HelloViewModel = viewModel()) {
    val name: String by helloViewModel.name.observeAsState("")
    HelloContent(name = name, onNameChange = { helloViewModel.onNameChange(it) } )
}
@Composable
fun HelloContent(name: String, onNameChange: (String) -> Unit) {
    Column(modifier = Modifier.padding(16.dp)) {
        if(name.isNotEmpty()) {
            Text(
                text = "Hello, $name",
                modifier = Modifier.padding(bottom = 8.dp),
            )
        }
        OutlinedTextField(value = name, onValueChange = onNameChange, label = { Text(text = "Name")})

    }
}
@Composable
fun Page1(pageViewModel: PageViewModel = viewModel()) {
    val filter: String by pageViewModel.filter.observeAsState("Area")
    val list = listOf("DormA", "DormB","DormC","DormD",
        "DormE", "DormF","DormG","DormH")
    Column( modifier = Modifier.fillMaxSize()) {
        topBar()

        Box(modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp), contentAlignment = Alignment.CenterEnd) {
            Dropdown(filter = filter, onFilterChange = { pageViewModel.onFilterChange(it) })
        }
        Column(modifier = Modifier
            .verticalScroll(rememberScrollState())
            .weight(1f, fill = false)) {
            list.forEach{value ->
                dormCard(headline = value)
            }

        }
        bottomBar()

    }
}
@Composable
fun Page(pageViewModel: PageViewModel = viewModel()) {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier
            ,
            contentAlignment = Alignment.TopCenter) {
            topBar()
        }
        Box(
            modifier = Modifier,
        ) {
            Column() {
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp), contentAlignment = Alignment.CenterEnd) {
                    Dropdown(filter = "One", onFilterChange = { pageViewModel.onFilterChange(it) })
                }
                dormCard()
                dormCard()
                dormCard()

            }

        }
        Box(
            modifier = Modifier.fillMaxHeight(),
            contentAlignment = Alignment.BottomStart
        ) {
            bottomBar()
        }
    }




}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    MyAppTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = BackGroundColorTheme
        ) {
            Page1()
        }
    }
}
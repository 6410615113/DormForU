package com.example.myapp

import android.app.Application
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.myapp.ViewModel.PageViewFactory
import com.example.myapp.ViewModel.PageViewModel
import com.example.myapp.data.database.DormDatabaseModel
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
                    val pageViewModel: PageViewModel = viewModel(
                        factory = PageViewFactory(LocalContext.current.applicationContext as Application)
                    )
                    Page1(pageViewModel)
                }
            }
        }
    }
}
@Composable
fun Page1(pageViewModel: PageViewModel) {
    val filter: String by pageViewModel.filter.observeAsState("Area")
    var v = DormDatabaseModel.DEFAULT_DORM

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
            if(filter == "Area") {
                v = v.sortedBy{ it.location }

            }
            else {
                v = v.sortedBy { it.maxPrice }
            }
            v.forEach{value ->
                dormCard(
                    dormObj = value,
                    headline = value.dormName,
                    location = value.location,
                    minPrice = value.minPrice,
                    maxPrice = value.maxPrice,
                    tel = value.tel,
                    imageUrl = value.imageUrl
                )
            }

        }
        bottomBar()

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
            val pageViewModel: PageViewModel = viewModel(
                factory = PageViewFactory(LocalContext.current.applicationContext as Application)
            )
            Page1(pageViewModel)
        }
    }
}
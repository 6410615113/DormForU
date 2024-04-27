package com.example.myapp.ui.materials

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.myapp.ViewModel.PageViewModel
import com.example.myapp.ui.ui.theme.MyAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Dropdown(filter: String = "Area", onFilterChange: (String) -> Unit) {
    val list = listOf("Area", "Price")
    var selectedText by remember { mutableStateOf(list[0]) }
    var isExpanded by remember {
        mutableStateOf(false)
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            , horizontalAlignment = Alignment.End

    ) {
        ExposedDropdownMenuBox(expanded = isExpanded, onExpandedChange = {isExpanded = !isExpanded}) {
            TextField(modifier = Modifier.menuAnchor(), value = filter, onValueChange = {}, readOnly = true, trailingIcon = {ExposedDropdownMenuDefaults.TrailingIcon(
                expanded = isExpanded
            )
        })
                    ExposedDropdownMenu(expanded = isExpanded, onDismissRequest = { isExpanded = false }) {
            list.forEachIndexed {index, text ->
                DropdownMenuItem(
                    text = { Text(text = text) },
                    onClick = {
                        onFilterChange(list[index])
                        isExpanded = false
                    },
                    contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding
                )
            }
        }
        }

    }
}


@Preview(showBackground = true)
@Composable
fun DropdownPreview(pageViewModel: PageViewModel = viewModel()) {
    MyAppTheme {
        Dropdown(filter = "One", onFilterChange = { pageViewModel.onFilterChange(it) })
    }
}
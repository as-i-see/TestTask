package com.asisee.testtask.presentation.common

import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.FocusInteraction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.asisee.testtask.presentation.theme.Black48
import com.asisee.testtask.presentation.theme.Black60
import com.asisee.testtask.presentation.theme.Blue
import com.asisee.testtask.presentation.theme.Error
import com.asisee.testtask.presentation.theme.Grey
import com.asisee.testtask.presentation.theme.Primary

@Composable
fun TextField(value: String, onValueChange: (String) -> Unit, label: String, supportingText: String, errorText: String, isError: Boolean, isDigitsOnly: Boolean) {
    val interactionSource = remember { MutableInteractionSource() }
    var isFocused by remember {
        mutableStateOf(false)
    }
    LaunchedEffect(interactionSource) {
        interactionSource.interactions.collect { interaction ->
            when (interaction) {
                is FocusInteraction.Focus -> isFocused = true
                is FocusInteraction.Unfocus -> isFocused = false
            }
        }
    }
    BasicTextField(
        keyboardOptions = if (isDigitsOnly) KeyboardOptions(keyboardType = KeyboardType.Number) else KeyboardOptions.Default,
        value = value,
        onValueChange = onValueChange,
        interactionSource = interactionSource,
        singleLine = true,
        decorationBox = { innerTextField ->
            Column {
                Column (
                    modifier = Modifier.fillMaxWidth().height(56.dp).border(
                        width = 1.dp,
                        color = if (isError) Error else if (isFocused) Blue else Grey,
                        shape = RoundedCornerShape(4.dp)
                    )
                ) {
                    if (isFocused) {
                        Text(
                            text = label,
                            modifier = Modifier.padding(start = 16.dp, top = 8.dp),
                            style = MaterialTheme.typography.bodySmall,
                            color = if (isError) Error else if (value.isEmpty()) Blue else Primary
                        )
                        Box(
                            Modifier.padding(start = 16.dp, bottom = 8.dp)
                        ) {
                            innerTextField()
                        }
                    } else if (value.isEmpty()) {
                        Text(
                            text = label,
                            modifier = Modifier.padding(start = 16.dp, top = 16.dp, bottom = 16.dp),
                            style = MaterialTheme.typography.bodyMedium,
                            color = if (isError) Error else Black48
                        )
                    } else {
                        Text(
                            text = label,
                            modifier = Modifier.padding(start = 16.dp, top = 8.dp),
                            style = MaterialTheme.typography.bodySmall,
                            color = if (isError) Error else Black60
                        )
                        Box(
                            Modifier.padding(start = 16.dp, bottom = 8.dp)
                        ) {
                            innerTextField()
                        }
                    }

                }
                Spacer(Modifier.height(4.dp))
                Text(
                    text = if (isError) errorText else supportingText,
                    modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                    style = MaterialTheme.typography.bodySmall,
                    color = if (isError) Error else Black60,
                )
            }
        }
    )
}
package com.asisee.testtask.presentation.common

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import com.asisee.testtask.data.remote.positions.Position
import com.asisee.testtask.presentation.theme.Black87
import com.asisee.testtask.presentation.theme.Blue

@Composable
fun RadioButton(
    position: Position,
    selectedOption: Position,
    onOptionSelected: (Position) -> Unit,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .selectable(
                selected = (position.name == selectedOption.name),
                onClick = { onOptionSelected(position) },
                role = Role.RadioButton
            ),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        androidx.compose.material3.RadioButton(
            selected = (position.name == selectedOption.name),
            onClick = null,
            modifier = Modifier.size(48.dp),
            colors = RadioButtonDefaults.colors(
                selectedColor = Blue,
                unselectedColor = Blue,
            )
        )
        Spacer(Modifier.width(8.dp))
        Text(
            text = position.name,
            style = MaterialTheme.typography.bodyMedium,
            color = Black87
        )
    }
}
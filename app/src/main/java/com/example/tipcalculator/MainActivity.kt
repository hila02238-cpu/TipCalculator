import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TipCalculatorScreen() {
    var orderSum by remember { mutableStateOf("") }
    var dishCount by remember { mutableStateOf("") }
    var tipPercent by remember { mutableStateOf(0f) }

    var resultText by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {
    }
}
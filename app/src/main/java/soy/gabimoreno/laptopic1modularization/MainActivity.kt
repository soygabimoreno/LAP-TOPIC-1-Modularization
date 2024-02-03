package soy.gabimoreno.laptopic1modularization

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import soy.gabimoreno.feature1.getFeature1Info
import soy.gabimoreno.feature2.getFeature2Info
import soy.gabimoreno.laptopic1modularization.ui.theme.LAPTOPIC1ModularizationTheme
import soy.gabimoreno.modulecall.getModuleInfo
import soy.gabimoreno.moduleimplementation1.ModuleImplementation1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LAPTOPIC1ModularizationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val info = getFeature1Info() + "\n" +
                        getFeature2Info() + "\n" +
                        getModuleInfo(ModuleImplementation1())
                    ShowInfo(
                        info = info,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ShowInfo(info: String, modifier: Modifier = Modifier) {
    Text(
        text = info,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LAPTOPIC1ModularizationTheme {
        ShowInfo("Android")
    }
}

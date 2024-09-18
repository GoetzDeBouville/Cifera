import androidx.compose.ui.window.ComposeUIViewController
import org.zinchenko.dev.app.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }

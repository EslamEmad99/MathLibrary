 package eslam.emad.mathlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import eslam.emad.library.MathOperations.divide
import eslam.emad.library.MathOperations.minus
import eslam.emad.library.MathOperations.multiply
import eslam.emad.library.MathOperations.plus
import eslam.emad.library.MathOperations.square

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView: TextView = findViewById(R.id.tv)

        val firstNum = 20
        val secondNum = 10
        val plus = plus(firstNum, secondNum)
        val minus = minus(firstNum, secondNum)
        val multiply = multiply(firstNum, secondNum)
        val divide = divide(firstNum, secondNum)
        val square = square(10)

        textView.text = "$plus \n $minus \n $multiply \n $divide \n $square"
    }
}
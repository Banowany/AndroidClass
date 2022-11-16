package com.example.zadanie03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import net.objecthunter.exp4j.ExpressionBuilder
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.Locale

class MainActivity : AppCompatActivity()
{
    lateinit var expressionViewer : TextView

    var isNumericNow : Boolean = false

    var canAddDot : Boolean = true

    var isErrorNow : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        expressionViewer = findViewById(R.id.textView)
        Locale.setDefault(Locale.US)
    }

    fun onDigit(view: View)
    {
        var digitButton = view as Button
        var digitText = digitButton.text

        if (isErrorNow)
        {
            expressionViewer.text = digitText
            isErrorNow = false
        }
        else
        {
            expressionViewer.append(digitText)
        }
        isNumericNow = true
    }

    fun onClear(view: View)
    {
        expressionViewer.text = ""
        isNumericNow = false
        canAddDot = true
        isErrorNow = false
    }

    fun onDot(view: View)
    {
        if(isNumericNow && !isErrorNow && canAddDot)
        {
            expressionViewer.append(".")
            isNumericNow = false
            canAddDot = false
        }
    }

    private fun removeTrailingZeros(valueAsString : String) : String
    {
        return valueAsString.trimEnd('0').trimEnd('.')
    }

    fun onResult(view: View)
    {
        if(isNumericNow && !isErrorNow)
        {
            var expressionAsString = expressionViewer.text.toString()
            var expression = ExpressionBuilder(expressionAsString).build()
            try
            {
                var expressionResult = expression.evaluate()
                var resultAsString = removeTrailingZeros(expressionResult.toString())
                expressionViewer.text = resultAsString
                canAddDot = !resultAsString.contains('.')
            }
            catch (ex: ArithmeticException)
            {
                expressionViewer.text = "Error"
                isErrorNow = true
                isNumericNow = false
            }
        }
    }

    fun onOperator(view: View)
    {
        if(isNumericNow && !isErrorNow)
        {
            var operatorButton = view as Button
            var operatorSign = operatorButton.text
            expressionViewer.append(operatorSign)
            isNumericNow = false
            canAddDot = true
        }
    }
}
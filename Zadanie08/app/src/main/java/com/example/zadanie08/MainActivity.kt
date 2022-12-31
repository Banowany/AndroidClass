package com.example.zadanie08

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.zadanie08.models.LoginRequest
import com.example.zadanie08.models.LoginResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity()
{
    lateinit var bLogin: Button
    lateinit var etName: EditText
    lateinit var etPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bLogin = findViewById(R.id.bLogin)
        etName = findViewById(R.id.etName)
        etPassword = findViewById(R.id.etPassword)

        bLogin.setOnClickListener{
            if (etName.text.toString().isEmpty() && etPassword.text.toString().isEmpty())
            {
                Toast.makeText(this, "Nie wszystkie pola są uzupełnione", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            performLogin(etName.text.toString(), etPassword.text.toString())
        }
    }

    private fun performLogin(name: String, password: String)
    {
        val loginRequest = LoginRequest(name, password)
        val call = RetrofitInstance.api.postLogin(loginRequest)

        call.enqueue(object: Callback<LoginResponse>
        {
            override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>)
            {
                val loginResponse = response.body()
                if (loginResponse!!.result)
                {
                    Toast.makeText(this@MainActivity, "Logowanie się powiodło", Toast.LENGTH_SHORT).show()
                }
                else
                {
                    Toast.makeText(this@MainActivity, "Podanych danych logowania nie ma w bazie", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<LoginResponse>, t: Throwable)
            {
                Toast.makeText(this@MainActivity, "Blad laczenia z baza danych", Toast.LENGTH_SHORT).show()
            }
        })
    }
}
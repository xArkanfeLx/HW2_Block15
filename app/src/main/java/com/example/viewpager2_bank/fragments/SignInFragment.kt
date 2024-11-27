package com.example.viewpager2_bank.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.viewpager2_bank.R

class SignInFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sing_in, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val loginET: EditText = view.findViewById(R.id.loginET)
        val passwordET: EditText = view.findViewById(R.id.passwordET)
        val loginBTN: Button = view.findViewById(R.id.loginBTN)

        val name = arguments?.getString("name")
        val password = arguments?.getString("pass")

        loginBTN.setOnClickListener{
            val login = loginET.text.toString()
            val pass = passwordET.text.toString()
            if(login == name && pass == password){
                fragmentManager?.beginTransaction()?.replace(R.id.containerID,MainFragment())?.commit()
            } else {
                loginET.text.clear()
                passwordET.text.clear()
            }
        }
    }
}
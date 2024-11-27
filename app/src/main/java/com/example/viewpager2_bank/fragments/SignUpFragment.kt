package com.example.viewpager2_bank.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.viewpager2_bank.R


class SignUpFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val loginET:EditText = view.findViewById(R.id.loginET)
        val passwordET:EditText = view.findViewById(R.id.passwordET)
        val registrBTN:Button = view.findViewById(R.id.registrBTN)

        registrBTN.setOnClickListener{
            if(loginET.text.isNotEmpty() && passwordET.text.isNotEmpty()){
                val userName = loginET.text.toString()
                val userPassword = passwordET.text.toString()

                val bundle = Bundle()
                val signInFragment = SignInFragment()
                bundle.putString("name",userName)
                bundle.putString("pass",userPassword)
                signInFragment.arguments = bundle
                fragmentManager?.beginTransaction()?.replace(R.id.containerID,signInFragment)?.commit()
            } else {
                loginET.text.clear()
                passwordET.text.clear()
            }
        }
    }
}
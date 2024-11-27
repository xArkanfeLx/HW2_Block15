package com.example.viewpager2_bank.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.viewpager2_bank.MainActivity
import com.example.viewpager2_bank.OnBoardingFragmetViewPagerModel
import com.example.viewpager2_bank.R
import com.example.viewpager2_bank.StartActivity

class StartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nameTV:TextView = view.findViewById(R.id.nameTV)
        val infoTV:TextView = view.findViewById(R.id.infoTV)
        val imgIV:ImageView = view.findViewById(R.id.imgIV)
        val registrBTN:Button = view.findViewById(R.id.registrBTN)
        val viewPagerItem = arguments?.getSerializable("vp") as OnBoardingFragmetViewPagerModel

        nameTV.text = viewPagerItem.name
        infoTV.text = viewPagerItem.info
        imgIV.setImageResource(viewPagerItem.img)
        if(viewPagerItem.needBtn) {
            registrBTN.visibility = View.VISIBLE
            registrBTN.setOnClickListener{
                startActivity(Intent(activity,StartActivity::class.java))
            }
        }
    }
}
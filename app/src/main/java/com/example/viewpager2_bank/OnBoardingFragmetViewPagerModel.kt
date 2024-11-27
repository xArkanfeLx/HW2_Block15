package com.example.viewpager2_bank

import java.io.Serializable

class OnBoardingFragmetViewPagerModel(val name:String,val info:String,val img:Int,val needBtn:Boolean) :Serializable {
    companion object{
        val listVP = mutableListOf(
            OnBoardingFragmetViewPagerModel(
                "Приветствуем!",
                "Добро пожаловать в приложение нашего банка!",
                R.drawable.img1,
                false),
            OnBoardingFragmetViewPagerModel(
                "О нашем банке",
                "Наш банк, топ!",
                R.drawable.img2,
                false),
            OnBoardingFragmetViewPagerModel(
                "Присоединяйтесь",
                "Пройдите регистрацию и давайте работать вместе!",
                R.drawable.img3,
                true)
        )
    }
}
package com.example.listviewicon

object datalis {

    private val tittles = listOf("Ruby", "Rails", "Python", "JavaScript", "PHP")

    val subtittles = listOf(
        "Ruby is an open source and fully object oriented programming language",
        "Rails, Ruby on Rails is a server side web application development framework eritten and ruby language",
        "Python is interprented scriptting and object oriented programming language",
        "Javascript is an object based scripping language",
        "PHP is an interpreted language, there is no need for compilation"
    )
    private val iconis = intArrayOf(
        R.drawable.ruby,
        R.drawable.rails,
        R.drawable.python,
        R.drawable.javascript,
        R.drawable.php
    )

    val listData: ArrayList<getset>
    get() {
        val list= arrayListOf<getset>()
        for (position in tittles.indices){
            val listDat = getset()
            listDat.tittles= tittles[position]
            listDat.subtittles= subtittles[position]
            listDat.iconis= iconis[position]
        }
        return list
    }
}
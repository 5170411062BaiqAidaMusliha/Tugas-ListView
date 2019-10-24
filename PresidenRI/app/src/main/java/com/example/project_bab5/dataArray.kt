package com.example.presidenri

import getset

object dataArray {

    private val languages = listOf("Suharno","Soekarno", "Habibie", "Gusdur", "Megawati","Susilo Bambang Yudhoyono", "Jokowi Dodo")

    val desk = listOf(
        "Suharto adalah presiden pertama indonesia",
        "Soekarto adalah presiden ke dua indonesia",
        "Habibie adalah presiden ke tiga indonesia",
        "Gusdur adalah presiden ke empat indonesia",
        "Megawati adalah presiden ke lima putri indonesia",
        "Susilo Bambang Yudhoyono adalah presiden dengan 2 periode di indonesia",
        "JokoWI Dodo adalah presiden dengan 2 periode di indonesia"
    )

    private val pictDat = intArrayOf(
        R.drawable.soeharto,
        R.drawable.soekarno,
        R.drawable.habibie,
        R.drawable.gusdur,
        R.drawable.megawati,
        R.drawable.sby,
        R.drawable.jokowi
    )

    val listData: ArrayList<getset> //mengoper data pada class GetSetArray
        get() {
            val list = arrayListOf<getset>()  //mendeklarasikan data array sebagai list
            for (position in languages.indices) { //perulangan untuk mengisi data ke GetSetArray
                val listDat = getset()
                listDat.name = languages[position]
                listDat.detail = desk[position]
                listDat.pict = pictDat[position]
                list.add(listDat)
            }
            return list //mengembalikan data untuk mengirim ke GetSetArray
        }
}
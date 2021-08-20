package com.febrian.indonesiantravelguide

import android.view.Display

class ListDataStatic {
    fun getData(): ArrayList<Model> {
//        Contoh 1 Start
        val tag1 = ArrayList<String>()
        tag1.add("Lamongan")
        tag1.add("Jawa Timur")
        val img1 = ArrayList<Int>()
        img1.add(R.drawable.wbl1)
        img1.add(R.drawable.wbl2)
        img1.add(R.drawable.wbl3)
        img1.add(R.drawable.wbl4)
        val list: ArrayList<Model> = ArrayList<Model>()
        list.add(
            Model(
                "Wisata Bahari Lamongan",
                "Wisata Bahari Lamongan atau disingkat WBL adalah tempat wisata bahari yang terletak di Kecamatan Paciran, Kabupaten Lamongan, Jawa Timur. Tempat wisata ini dibuka sejak 14 November 2004. Wisata Bahari Lamongan dikelola oleh PT Bumi Lamongan Sejati, sebuah perusahaan patungan Pemkab Lamongan dengan PT Bunga Wangsa Sejati.\n" +
                        "\n" +
                        "Beberapa wahana unggulan tempat wisata ini antara lain Istana Bawah Laut, Gua Insectarium, Space Shuttle, Anjungan Wali Songo, Texas City, Paus Dangdut, Tembak Ikan, Rumah Kaca, serta Istana Bajak Laut.",
                "49M5+CVR, Paciran, Kec. Paciran, Kabupaten Lamongan, Jawa Timur 62264",
                "https://wisatabaharilamongan.com/",
                tag1,
                img1
            ))
//        Contoh 1 End

//        Tulis lanjutannya dibawah

        return list
    }
}
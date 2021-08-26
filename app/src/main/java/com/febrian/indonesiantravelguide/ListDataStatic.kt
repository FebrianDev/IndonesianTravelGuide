package com.febrian.indonesiantravelguide

class ListDataStatic {
    fun getData(): ArrayList<Model> {
//        Contoh 1 Start
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
                "Lamongan, Jawa Timur",
                img1
            ))

        val img2 = ArrayList<Int>()
        img2.add(R.drawable.mks1)
        img2.add(R.drawable.mks2)
        list.add(
            Model(
                "Monumen Kapal Selam",
                "Monumen Kapal Selam adalah museum yang terdapat di Surabaya. Monumen ini sebenarnya merupakan kapal selam KRI Pasopati 410, salah satu armada Angkatan Laut Republik Indonesia buata Uni Soviet tahun 1952.\n" +
                        "\n" +
                        "Monumen Kapal Selam ini dibagi menjadi tujuh ruangan yaitu ruang I, II, III, IV, V, VI dan VII. para pengunjung bisa memasuki ruangan-ruangan tersebut yang mana nantinya akan ada Tour Guide yang siap menjelaskan tentang apa saja yang ada di dalam Monumen tersebut",
                "PQM2+R4, Jl. Pemuda No. 39, Embong Kaliasin, Kec. Genteng, Kota SBY, Jawa Timur 60271",
                "https://monkasel.id/",
                "Surabaya, Jawa Timur",
                img2
            ))

        val img3 = ArrayList<Int>()
        img3.add(R.drawable.tps1)
        img3.add(R.drawable.tps2)
        img3.add(R.drawable.tps3)

        list.add(
            Model(
                "Taman Pelangi Surabaya",
                "Taman Pelangi Surabaya merupakan taman di tengah kota yang dibangun sebagai kawasan Ruang Terbuka HIjau yang memiliki fungsi untuk kelestarian alam. \n" +
                        "\n" +
                        "Taman ini berisikan hamparan bunga. Lebih baik dilihat pada malam hari karena terdapat air mancur warna-warni.",
                "MPCJ+XF Jl. Ahmad Yani No. 138, Gayungan, Kec. Gayungan, Kota SBY, Jawa Timur 60235",
                "",
                "Surabaya, Jawa Timur",
                img3
            ))

        val img4 = ArrayList<Int>()
        img4.add(R.drawable.kbs1)
        img4.add(R.drawable.kbs2)
        img4.add(R.drawable.kbs3)

        list.add(
            Model(
                "Kebun Binatang Surabaya",
                "Kebun Binatang Surabaya (KBS) adalah salah satu kebun binatang yang populer di Indonesia dan terletak di Surabaya. KBS merupakan kebun binatang yang pernah terlengkap se-Asia Tenggara, di dalamnya terdapat lebih dari 211 spesies satwa yang berbeda yang terdiri lebih dari 2.236 binatang. \n" +
                        "\n" +
                        "Kebun Binatang ini memiliki fungsi dan peranan sebagai konservasi, edukasi, riset & penelitian serta rekreasi.",
                "PP3P+JJ Jl. Setail No. 1, Darmo, Kec. Wonokromo, Kota SBY, Jawa Timur 60241",
                "https://www.surabayazoo.co.id/",
                "Surabaya, Jawa Timur",
                img4
            ))

        val img5 = ArrayList<Int>()
        img5.add(R.drawable.mch1)

        list.add(
            Model(
                "Masjid Cheng Ho Surabaya",
                "Masjid Cheng Ho Surabaya merupakan masjid pertama di Indonesia yang menggunakan nama Mulsim Tionghoa dan menjadi simbol perdamaian umat beragama. \n" +
                        "\n" +
                        "Bangunan Masjid Cheng Ho faktanya banyak tersebar di perkotaan Indonesia seperti Palembang, Kutai Kartanegara, Purbalingga, Jambi, Batam, Banyuwangi dan Samarinda. Namun yang paling awal berdiri berada di Surabaya pada tahun 2002.",
                "PPXW+3Q Jl. Gading No. 2, Ketabang, Kec. Genteng, Kota SBY, Jawa Timur 60272",
                "",
                "Surabaya, Jawa Timur",
                img5
            ))

        val img6 = ArrayList<Int>()
        img6.add(R.drawable.mas1)

        list.add(
            Model(
                "Masjid Nasional Al-Akbar",
                "Masjid Nasional Al Akbar atau biasa disebut Masjid Agung Surabaya adalah masjid terbesar kedua di Indonesia yang berlokasi di Kota Surabaya, Jawa Timur setelah masjid Istiqlal di Jakarta. \n" +
                        "\n" +
                        "Masjid ini dibangun pada tahun 1995 dan sekarang telah menjadi salah satu tujuan wisata relogo kondang selain Sunan Ampel. Keunikan ini bisa dilihat dari bentuk kubahnya dan dengan tambahan corak serta ukiran kaligrafi membuat masjid ini makin indah untuk dipandang.",
                "MP78+93 Jl. Mesjid Agung Tim. No. 1, Pagesangan, Kec. Jambangan, Kota SBY, Jawa Timur 60274",
                "https://www.masjidalakbar.or.id/",
                "Surabaya, Jawa Timur",
                img6
            ))

        val img7 = ArrayList<Int>()
        img7.add(R.drawable.js1)
        img7.add(R.drawable.js2)

        list.add(
            Model(
                "Jembatan Suramadu",
                "Jembatan Suramadu merupakan jembatan yang melintasi Selat Madura menghubungkan Pulau Jawa (di Surabaya) dan Pulau Madura (di Bangkalan, tepatnya timur Kamal), Indonesia. Dengan panjang 5.438 m, jembatan ini merupakan jembatan terpanjang di Indonesia saat ini. \n" +
                        "\n" +
                        "",
                "RQ8J+J4 Jl. Tol Suramadu, Tambak Wedi, Kec. Kenjeran, Kota SBY, Jawa Timur 60126",
                "",
                "Surabaya, Jawa Timur",
                img7
            ))

        val img8 = ArrayList<Int>()
        img8.add(R.drawable.cp1)
        img8.add(R.drawable.cp2)

        list.add(
            Model(
                "Candi Pari",
                "Candi Pari merupakan peninggalan masa klasik Indonesia yang terletak di Desa Candipari, Kecamatan Porong, Kabupaten Sidoarjo, Provinsi Jawa Timur. \n" +
                        "\n" +
                        "",
                "FMMM+G9 Jl. Purbakala, Porong, Candipari, Candipari Kulon, Candipari, Kec. Porong, Kabupaten Sidoarjo, Jawa Timur 61274",
                "",
                "Sidoarjo, Jawa Timur",
                img8
            ))

        val img9 = ArrayList<Int>()
        img9.add(R.drawable.pk1)

        list.add(
            Model(
                "Pantai Kenjeran",
                "Pantai Ria Kenjeran merupakan wisata bahari yang terletak di daerah Surabaya. Pantai ini dibagi menjadi Pantai Kenjeran Lama dan Pantai Kenjeran Baru.  \n" +
                        "\n" +
                        "Di pantai ini terdapat beberapa hiburan keluarga. Untuk Pantai Kenjeran Lama, kegiatannya lebih mengarah ke kegiatan wisata konvensional. Sedangkan Pantai Kenjeran Baru memiliki konsep yang modern, lebih banyak hiburan yang pastinya diminati oleh pengunjung.",
                "QQ6W+Q6 Jl. Pantai Kenjeran No. 1-6, Kenjeran, Kec. Bulak, Kota SBY, Jawa Timur 60123",
                "",
                "Surabaya, Jawa Timur",
                img9
            ))

        val img10 = ArrayList<Int>()
        img10.add(R.drawable.kwj1)
        img10.add(R.drawable.kwj2)

        list.add(
            Model(
                "Kampung Wisata Jodipan",
                "Kampung Wisata Jodipan adalah kampung wisata pertama di Kota Malang yang berupa sederetan rumah warga di tepi Sungai Brantas yang menampilkan dinding dengan aneka warna yang menarik. \n" +
                        "\n" +
                        "Kampung Wisata Jodipan ini biasanya dijuluki Kampung Warna Warni. Kampung ini terdapat dua wilayah, yaitu Kampung Jodipan dan Kampung Tridi. ",
                "2J8Q+M2 Jodipan, Kec. Blimbing, Kota Malang, Jawa Timur",
                "",
                "Malang, Jawa Timur",
                img10
            ))

        val img11 = ArrayList<Int>()
        img11.add(R.drawable.cb1)
        img11.add(R.drawable.cb2)
        img11.add(R.drawable.cb3)

        list.add(
            Model(
                "Candi Borobudur",
                "Candi Borobudur merupakan candi Buddha terbesar di Indonesia. UNESCO menetapkannya sebagai salah satu situs warisan dunia apda tahun 1991. \n" +
                        "\n" +
                        "Candi Borobudur disebut sebagai salah satu mahakarya terbesar manusia sepanjang sejajrah. Beberapa pahatan reliefnya merupakan sebuah karya yang tak tertandingi nilainya.",
                "96R3+VG Jl. Badrawati, Kw. Candi Borobudur, Borobudur, Kec. Borobudur, Magelang, Jawa Tengah",
                "http://borobudurpark.com/temple/borobudur/",
                "Magelang, Jawa Timur",
                img11
            ))

        val img12 = ArrayList<Int>()
        img12.add(R.drawable.wsa1)
        img12.add(R.drawable.wsa2)
        img12.add(R.drawable.wsa3)

        list.add(
            Model(
                "Wisata Religi Sunan Ampel",
                "Makam Sunan Ampel terletak di Surabaya. Tempat ini sering dikunjungi oleh orang muslim di Indonesia. \n" +
                        "\n" +
                        "Orang penting yang dimakamkan disini ialah salah satu dari Walisongo yakni Sunan Ampel. Makam Sunan Ampel ini adalah saksi biksu perjuangan Islam di wilayah Jawa Timur. ",
                "QP9V+JR Jl. Nyamplungan, Ampel, Kec. Semampir, Kota SBY, Jawa Timur 60151",
                "",
                "Surabaya, Jawa Timur",
                img12
            ))

        val img13 = ArrayList<Int>()
        img13.add(R.drawable.ems1)
        img13.add(R.drawable.ems2)

        list.add(
            Model(
                "Ekowisata Mangrove Surabaya",
                "Hutan Wisata Mangrove Surabaya merupakan wisata yang menggabungkan wisata rekreasi dan edukasi. Di area dengan luas kurang lebih 200 hektar ini ditanami berbagai tanaman bakau. Lokasi wisata ini dikelola dengan baik oleh pemerintah Kota Surabaya. \n" +
                        "\n" +
                        " ",
                "MRRC+XQ Jl. Raya Wonorejo No.1, Wonorejo, Kec. Rungkut, Kota SBY, Jawa Timur 60296",
                "",
                "Surabaya, Jawa Timur",
                img13
            ))

        val img14 = ArrayList<Int>()
        img14.add(R.drawable.gg1)
        img14.add(R.drawable.gg2)

        list.add(
            Model(
                "Goa Gong",
                "Goa Gong merupakan tempat wisata yang berada di Pacitan, Jawa Timur. Ada yang menyebutkan bahwa Goa Gong adalah Goa terindah di Asia Tenggara.\n" +
                        "\n" +
                        "Goa ini dihiasi stalaktit dan stalakmit yang begitu indah. Mereka memiliki aneka bentuk dan ukuran yang menghiasi seluruh penjuru ruangan.",
                "RXPJ+22 Jl. Salam, Salam, Bomo, Punung, Kabupaten Pacitan, Jawa Timur 63553",
                "",
                "Pacitan, Jawa Timur",
                img14
            ))

        val img15 = ArrayList<Int>()
        img15.add(R.drawable.tp1)
        img15.add(R.drawable.tp2)

        list.add(
            Model(
                "Taman Prestasi",
                "Taman Prestasi adalah tempat wisata yang terletak di Surabaya, Jawa Timur. Taman ini sudah ada sejak tahun 1992 dan diresmikan di tahun 1995.\n" +
                        "\n" +
                        "Taman ini cocok dijadikan untuk melepas penat para pengunjung. Di dalamnya sudah tersedia berbagai fasilitas umum seperti arena bermain, panggung teater,akses gratis WiFi hingga fasilitas bagi penyandang difabel.",
                "PPQV+C4 Jl. Ketabang Kali No.6, Ketabang, Kec. Genteng, Kota SBY, Jawa Timur 60272",
                "",
                "Surabaya, Jawa Timur",
                img15
            ))
        return list
    }
}
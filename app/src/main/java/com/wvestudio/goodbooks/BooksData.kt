package com.wvestudio.goodbooks

object BooksData {
    private val bookTitles = arrayOf(
        "Quantum Ikhlas",
        "7 Habits of Highly Effective People",
        "The Life - Changing Magic of Tidyng Up",
        "IKIGAI : Rahasia Hidup Bahagia Dan Panjang Umur Orang Jepang",
        "Calm : Rileks, Fokus dan Ubahlah Duniamu",
        "OCD : Obsessive Corbuzier's Diet",
        "Life Revolution",
        "Seni Hidup Minimalis",
        "Berani Tidak Disukai",
        "Awaken The Giant Within",
        "Factfulness"
    )

    private val bookAuthors = arrayOf(
        "Erbe Sentanu",
        "Stephen R. Covey",
        "Marie Kondō",
        "Hector Garcia & Francesc Miralles",
        "Michael Acton Smith",
        "Deddy Corbuzier",
        "Tung Desem Waringin",
        "Francine Jay",
        "Ichiro Kishimi, Fumitake Koga, Agnes Cynthia",
        "Tony Robbins, Anthony Robbins",
        "Hans Rosling, Ola Rosling, Anna Rosling Rönnlund "
    )

    private val bookISBN = longArrayOf(
        9786020267050,
        9789795836032,
        9786022912446,
        9786021201800,
        9786020332697,
        9786022499695,
        9786020614175,
        9786020398440,
        9786020633213,
        9780671791544,
        9786020620138
    )

    private val bookDetails = arrayOf(
        "Buku spiritual science motivation karya Erbe Sentanu (member of Global Spiritual Computing Research Group) ini menukik jauh melampaui kekuatan berpikir positif, untuk mengakses daya terbesar manusia yaitu kekuatan Perasaan Positif dari dasar hati yang Ikhlas.\n" +
                "\n" +
                "Aplikasi Spiritual Technology yang memanfaatkan ilmu Fisika Kuantum, The Law of Attraction, dan nilai-nilai luhur Ketuhanan untuk meraih sukses lahir-batin di era milenium.\n" +
                "\n" +
                "- Meng-upgrade Otak secara cepat dan Progresif.\n" +
                "- Mengakses Alam Bawah Sadar dengan otomatis!\n" +
                "- Menanam Kode Sukses di DNA dengan Software-Doa\n" +
                "\n" +
                "Buku revolusioner yang sarat dengan teknologi transformasi diri mutakhir yang siap melontarkan Anda ke puncak keagungan manusia paripurna. Bacalah buku ini dan hidup Anda akan berubah.",
        "When Stephen Covey first released The Seven Habits of Highly Effective People, the book became an instant rage because people suddenly got up and took notice that their lives were headed off in the wrong direction; and more than that, they realized that there were so many simple things they could do in order to navigate their life correctly. This book was wonderful education for people, education in how to live life effectively and get closer to the ideal of being a ‘success’ in life.\n" +
                "\n" +
                "But not everyone understands Stephen Covey’s model fully well, or maybe there are some people who haven’t read it yet. This is definitely true because we still see so much failure all around us. Now, I am not saying that by using Covey’s model, or anyone else’s model for that matter, you can become a sure-shot success, but at least we should have seen many more successes around us already judging by the number of copies the book has sold! So, where is the shortcoming?\n" +
                "\n" +
                "There are two main problems here, and we are talking only about the people who have read the book already. The first problem is that most people are too lazy to implement the ideals of Stephen Covey in their lives. They consider his masterpiece of a book as a mere coffee-table book or a book that you use for light reading when you are traveling and then forget all about it. They do not realize that this book contains life-changing information. Or, they take the information and do not make the effort to actually utilize it so that it becomes knowledge for them.\n" +
                "\n" +
                "The second problem is that a lot of people have a myopic view of Covey’s ideals. These are people who are impressed by the book already. If you ask them what the seven habits are, they can rattle them off end to end, but then they miss the larger picture. They do not understand that Covey was trying to tell more than he wrote in words. There are hidden implications in this book, yes, and a lot of people have just failed to see through them.\n" +
                "\n" +
                "That is what we are trying to do. We are trying to show you how Covey’s book, or rather, his model, was a complete model in itself. There was nothing amiss about it. If you implement it, there should be no aspect of your life that should go untouched. The only thing is that you have to understand these ideals and try to implement them in your life.\n" +
                "\n" +
                "But, before we barge into that area, it is extremely important to understand what these ideals are. What was the model that was propounded by Stephen Covey in his mega-famous book? We shall begin by trying to understand his model first, and then interpret it in such a way that it pertains to every aspect of our life.",
        "Despite constant efforts to declutter your home, do papers still accumulate like snowdrifts and clothes pile up like a tangled mess of noodles?\n" +
                "Japanese cleaning consultant Marie Kondo takes tidying to a whole new level, promising that if you properly simplify and organize your home once, you'll never have to do it again. Most methods advocate a room-by-room or little-by-little approach, which doom you to pick away at your piles of stuff forever. The KonMari Method, with its revolutionary category-by-category system, leads to lasting results. In fact, none of Kondo's clients have lapsed (and she still has a three-month waiting list).\n" +
                "\n" +
                "With detailed guidance for determining which items in your house \"spark joy\" (and which don't), this international best seller featuring Tokyo's newest lifestyle phenomenon will help you clear your clutter and enjoy the unique magic of a tidy home - and the calm, motivated mindset it can inspire.",
        "“Only staying active will make you want to live a hundred years.” —Japanese proverb \n" +
                "\n" +
                "According to the Japanese, everyone has an ikigai—a reason for living. And according to the residents of the Japanese village with the world’s longest-living people, finding it is the key to a happier and longer life. Having a strong sense of ikigai—the place where passion, mission, vocation, and profession intersect—means that each day is infused with meaning. It’s the reason we get up in the morning. It’s also the reason many Japanese never really retire (in fact there’s no word in Japanese that means retire in the sense it does in English): They remain active and work at what they enjoy, because they’ve found a real purpose in life—the happiness of always being busy. \n" +
                "\n" +
                "In researching this book, the authors interviewed the residents of the Japanese village with the highest percentage of 100-year-olds—one of the world’s Blue Zones. Ikigai reveals the secrets to their longevity and happiness: how they eat, how they move, how they work, how they foster collaboration and community, and—their best-kept secret—how they find the ikigai that brings satisfaction to their lives. And it provides practical tools to help you discover your own ikigai. Because who doesn’t want to find happiness in every day?",
        "Kehidupan modern itu sangat melelahkan. Mari mencoba revolusi Calm. Kereta datang terlambat, notifikasi e-mail tanpa henti, daftar pekerjaan yang tidak berujung-- tidak ada yang lebih penting daripada berhenti, mengisi ulang daya, dan menemukan kembali momen tenang.\n" +
                "\n" +
                "Tentu saja semua orang dapat mencapai ketenangan--termasuk Anda--dan di dalam buku ini Anda akan belajar bagaimana mengambil waktu untuk merasakan ketenangan, jarak, dan semua hal yang penting untuk dirimu sendiri.\n" +
                "\n" +
                "Dengan kombinasi kreativitas yang menggugah, aktivitas, instruksi, dan inspirasi, Calm akan membuka mata kita untuk menemukan kesenangan dan kekayaan dalam hidup sehari-hari.\n" +
                "- Berjalanlah tanpa sebuah tujuan yang pasti\n" +
                "- Rasakanlah sepotong cokelat yang ada di ujung lidahmu\n" +
                "- Tersesat di labirin\n" +
                "- Ambillah sehelai daun, awetkan sekuntum bunga\n" +
                "- Matikan ponsel selama lima menit\n" +
                "\n" +
                "Calm adalah buku yang penuh inspirasi, penuh praktik, dan tidak ada aturan tertentu--Anda sendiri yang membuatnya seperti yang Anda mau. Ambillah buku Calm ini kapan pun Anda mau, Tenggelamlah ke dalamnya, dan pilih sendiri bagaimana Anda ingin menggunakannya. Tenanglah. Rasakan kebebasan. Jadilah dirimu sendiri.",
        "Why? Because I believe you still have so many questions about this. Imagine, by now more than 10 millions E-books downloaded. More than 40 thousands hard copy books sold. THE OCD! Mengapa? Karena OCD bekerja! It works... It really does! It helps hundreds even thousands people to get their body back. Yet, some of them still fail. Mengapa? Karena mereka melakukannya tanpa tahu apa itu OCD yang benar. Hanya ikut-ikutan saja... Tidak membaca... Tidak mencari tahu dengan benar... Hanya mendengar, lalu ikut-ikutan. OCD bikin sakit? OCD gagal dan berat naik lagi? OCD itu puasa saja, kan? Boleh makan permen? (Dude!!!) Mereka SALAH menerapkan OCD!!! Inilah yang akan kita bahas di OCD 2.0 Dan, bukan hanya itu... Perhatikan perubahan badan saya sejak dua tahun yang lalu; kering berotot, dari berat 70 kg kini 84 kg, dan tetap berotot. And still six-pack! That’s OCD Project Wolverine! And I will teach u how... So you can get BIG and SIX PACK... Remember... Skinny men sixth six-pack is like fat women with BIG Boobs... It doesn’t count :) And for you girls... I’m answering most of your questions here too... Let’s the journey begins... For one more time...",
        "Life Revolution adalah buku ke-3 dari Tung Desem Waringin setelah Financial Revolution (tahun 2006) dan buku Marketing Revolution (tahun 2008). Kini ditahun 2018 kembali meluncur buku yang isinya tentang 12 ilmu dalam penting dalam hidup (yang belum ada dalam kurikulum pendidikan saat ini), yaitu Life Revolution. Isi dari buku ini adalah 12 ilmu yang paling penting dalam hidup, yaitu :\n" +
                "\n" +
                "1. Apa Ilmu Terpenting dalam Kehidupan?\n" +
                "2. Bagaimana Menemukan dan Memperkerjakan Orang-orang Sukses?\n" +
                "3. Bagaimana Mengelola Emosi, Bahagia, dan Meaningful?\n" +
                "4. Bagaimana Ilmu Berpikir?\n" +
                "5. Bagaimana Ilmu Mengambil Keputusan?\n" +
                "6. Apa Saja 7 Resep Sukses Anti Gagal?\n" +
                "7. Bagaimana Membuat Kebiasaan Baik dan Membuang Kebiasaan Buruk?\n" +
                "8. Bagaimana Tambah Sehat?\n" +
                "9. Bagaimana Menjadi Kaya?\n" +
                "10. Bagaimana Jago Marketing?\n" +
                "11. Bagaimana Mendesain Hidup?\n" +
                "12. Bagaimana Membangun Keluarga Harmonis?",
        "Pernahkah Anda menatap semua barang yang Anda beli, warisi, atau terima di rumah, dan merasa pengap, bukannya senang? \n" +
                "\n" +
                "Apakah Anda mengalami kesulitan mengatasi utang kartu kredit, bahkan tidak ingat lagi apa saja yang telah Anda beli? \n" +
                "\n" +
                "Pernahkah Anda berharap ada angin kencang yang meniup semua kekacauan di rumah agar Anda bisa memulai lembaran baru? \n" +
                "\n" +
                "Buku ini bisa menjadi penyelamat Anda!\n" +
                "\n" +
                "Bagian pertama buku ini akan menumbuhkan pola pikir minimalis. Bagian kedua berisi metode STREAMLINE—satu dari sepuluh teknik paling efektif untuk menjaga rumah tetap rapi. Bagian ketiga mengajak Anda menggunakan langkah-langkah khusus untuk menangani setiap ruangan di rumah. Di bagian keempat, Anda akan melihat bagaimana konsep minimalis membuat kita lebih ramah lingkungan sehingga mampu melestarikan Bumi untuk generasi berikutnya.\n",
        "Membaca buku ini bisa mengubah hidup anda. jutaan orang sudah menarik manfaat darinya. sekarang giliran anda.\n" +
                "\n" +
                "Berani Tidak Disukai, yang sudah terjual lebih dari 3,5 juta eksemplar, mengungkap rahasia mengeluarkan kekuatan terpendam yang memungkinkan Anda meraih kebahagiaan yang hakiki dan menjadi sosok yang Anda idam-idamkan.\n" +
                "\n" +
                "Apakah kebahagiaan adalah sesuatu yang Anda pilih? Berani Tidak Disukai menyajikan jawabannya secara sederhana dan langsung. Berdasarkan teori Alfred Adler, satu dari tiga psikolog terkemuka abad kesembilan belas selain Freud dan Jung, buku ini mengikuti percakapan yang menggugah antara seorang filsuf dan seorang pemuda. Dalam lima percakapan yang terjalin, sang filsuf membantu muridnya memahami bagaimana masing-masing dari kita mampu menentukan arah hidup kita, bebas dari belenggu trauma masa lalu dan beban ekspektasi orang lain.\n" +
                "\n" +
                "Buku yang kaya kebijaksanaan ini akan memandu Anda memahami konsep memaafkan diri sendiri, mencintai diri, dan menyingkirkan hal-hal yang tidak penting dari pikiran. Cara pikir yang membebaskan ini memungkinkan Anda membangun keberanian untuk mengubah dan mengabaikan batasan yang mungkin Anda berlakukan bagi diri Anda.",
        "Wake up and take control of your life! From the bestselling author of Inner Strength, Unlimited Power, and MONEY Master the Game, Anthony Robbins, the nation's leader in the science of peak performance, shows you his most effective strategies and techniques for mastering your emotions, your body, your relationships, your finances, and your life.\n" +
                "\n" +
                "The acknowledged expert in the psychology of change, Anthony Robbins provides a step-by-step program teaching the fundamental lessons of self-mastery that will enable you to discover your true purpose, take control of your life, and harness the forces that shape your destiny.",
        "“Salah satu buku paling penting yang pernah saya baca. Panduan yang diperlukan untuk berpikir secara jernih tentang dunia.” —Bill Gates\n" +
                "\n" +
                "Ketika diberi pertanyaan sederhana tentang kecenderungan global, seperti berapa persen populasi dunia yang tinggal dalam kemiskinan dan kenapa populasi dunia bertambah, kita kerap memberikan jawaban yang salah. Bahkan simpanse yang menjawab secara acak memberikan lebih banyak jawaban benar dibandingkan guru, jurnalis, bankir investasi, dan pemenang Nobel.\n" +
                "\n" +
                "Factfulness menawarkan penjelasan mengapa hal itu terjadi. Ada sepuluh naluri yang mengalihkan perspektif kita—dari kecenderungan untuk membagi dunia menjadi dua kelompok (semacam versi kita dan mereka) sampai cara kita mengonsumsi media dan melihat kemajuan. Factfulness akan mengubah cara kita melihat dunia, memampukan kita merespons krisis dan peluang yang dibawa oleh masa depan. \n" +
                "\n" +
                "Dari Pendahuluan:\n" +
                "Factfulness adalah buku tentang dunia dan bagaimana dunia sesungguhnya. Factfulness juga buku tentang Anda, dan mengapa Anda (serta hampir setiap orang yang pernah saya jumpai) tidak memandang dunia sebagaimana sesungguhnya. Factfulness bercerita tentang apa yang dapat Anda perbuat dalam hal ini, dan bagaimana buku ini akan menjadikan Anda merasa lebih positif, tidak begitu stres, dan lebih mempunyai harapan sewaktu melangkah keluar dari tenda sirkus untuk kembali ke dunia.\n" +
                "\n" +
                "Jadi, bila Anda lebih berminat untuk menjadi benar alih-alih melanjutkan hidup dalam gelembung Anda; bila Anda bersedia mengubah wawasan Anda tentang dunia; bila Anda siap untuk berpikir kritis menggantikan kebiasaan bereaksi secara naluriah; dan bila Anda merasa rendah hati, ingin tahu, dan siap untuk dibuat takjub—silakan melanjutkan membaca buku ini.\n" +
                "\n" +
                "“Di tangan Hans Rosling, data bernyanyi.” —TED\n" +
                "\n" +
                "“Tiga menit bersama Hans Rosling akan mengubah pikiran Anda tentang dunia.” —Nature"
    )

    private val bookImages = intArrayOf(
        R.drawable.quantum_ikhlas,
        R.drawable.tujuh_kebiasaan,
        R.drawable.the_life,
        R.drawable.ikigai,
        R.drawable.calm,
        R.drawable.ocd,
        R.drawable.life_revolution,
        R.drawable.seni_hidup_minimalis,
        R.drawable.berani_tidak_disukai,
        R.drawable.awaken_the_giant_within,
        R.drawable.fact_ful_ness
    )

    val listData: ArrayList<Book>
    get() {
        val list = arrayListOf<Book>()
        for (position in bookTitles.indices) {
            val book = Book()
            book.title = bookTitles[position]
            book.author = bookAuthors[position]
            book.isbn = bookISBN[position]
            book.detail = bookDetails[position]
            book.photo = bookImages[position]
            list.add(book)
        }
        return list
    }

}
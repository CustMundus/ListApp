package com.example.listapp

class CelebrityDatabase {

    var celebritiesList: ArrayList<Celebrity>? = null

    constructor() {

        celebritiesList= ArrayList()

        celebritiesList?.add(Celebrity("Brad Pitt","DescriptionWilliam Bradley Pitt is an American actor and film producer. He has received multiple awards, including two Golden Globe Awards and an Academy Award for his acting, in addition to another Academy Award and a Primetime Emmy Award as producer under his production company, Plan B Entertainment"
            ,R.drawable.bread,true))
        celebritiesList?.add(Celebrity("Marilyn Monroe","DescriptionMarilyn Monroe was an American actress, model, and singer. Famous for playing comedic \"blonde bombshell\" characters, she became one of the most popular sex symbols of the 1950s and early 1960s and was emblematic of the era's changing attitudes towards sexuality"
            ,R.drawable.monroe,false))
        celebritiesList?.add(Celebrity("Leonardo DiCaprio","DescriptionLeonardo Wilhelm DiCaprio is an American actor, producer, and environmentalist. He has often played unconventional parts, particularly in biopics and period films. As of 2019, his films have earned US $7.2 billion worldwide, and he has placed eight times in annual rankings of the world's highest-paid actors."
            ,R.drawable.dicaprio,true))
        celebritiesList?.add(Celebrity("George W. Bush","DescriptionGeorge Walker Bush is an American politician and businessman who served as the 43rd president of the United States from 2001 to 2009. A member of the Republican Party, he had previously served as the 46th governor of Texas from 1995 to 2000"
            ,R.drawable.bush,true))
        celebritiesList?.add(Celebrity("Jared Leto","DescriptionJared Joseph Leto is an American actor and singer-songwriter. After starting his career with television appearances in the early 1990s, Leto achieved recognition for his role as Jordan Catalano on the television series My So-Called Life."
            ,R.drawable.summer,true))
    }
}
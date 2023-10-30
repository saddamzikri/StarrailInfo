package com.saddam.starrailinfo.db

import com.saddam.starrailinfo.R
import com.saddam.starrailinfo.model.StarrailChar

object CharData {
    private val database = arrayOf(
        arrayOf(
            "Imbibitor Lunae",
            "Element: Imaginary",
            "Affiliation: The Xianzhou Luofu",
            "High Elder of the Luofu, bearer of the Azure Dragon's legacy, bringing forth clouds and rain, and entrusted with the duty of guarding the Ambrosial Arbor. Revered with the title of \"Imbibitor Lunae.\"High Elder of the Luofu, bearer of the Azure Dragon's legacy, bringing forth clouds and rain, and entrusted with the duty of guarding the Ambrosial Arbor. Revered with the title of \"Imbibitor Lunae.\"",
            "Destruction",
            R.drawable.imbibitorlunae,
            R.drawable.imbibitorlunaebgfit,
            R.drawable.element_imaginary,
            "https://hsr.hoyoverse.com/en-us/character?charIndex=7&worldIndex=4"
        ),
        arrayOf(
            "Bronya",
            "Element: Wind",
            "Affiliation: Belobog",
            "She is the commander of the Silvermane Guards and the current (nineteenth) Supreme Guardian of Belobog. Originally from the Underworld and from the same orphanage as Seele, she was picked from a handful of children to become the next Supreme Guardian, and was then adopted by Cocolia.",
            "Harmony",
            R.drawable.bronya,
            R.drawable.bronyabgfit,
            R.drawable.element_wind,
            "https://hsr.hoyoverse.com/en-us/character?charIndex=2&worldIndex=4"
        ),
        arrayOf(
            "Clara",
            "Element: Physical",
            "Affiliation: Belobog",
            "She is a shy young girl orphaned at an early age, accompanied by an ancient mech named Svarog. Her greatest wish is \"to have a family.\" ",
            "Destruction",
            R.drawable.clara,
            R.drawable.clarabgfit,
            R.drawable.element_physical,
            "https://hsr.hoyoverse.com/en-us/character?charIndex=4&worldIndex=4"
        ),
        arrayOf(
            "Gepard",
            "Element: Ice",
            "Affiliation: Belobog",
            "He is the captain of the Silvermane Guards and belongs to the noble Landau family in Belobog, responsible for the city's defenses and maintaining peace.",
            "Preservation",
            R.drawable.gepard,
            R.drawable.gepardbgfit,
            R.drawable.element_ice,
            "https://hsr.hoyoverse.com/en-us/character?charIndex=1&worldIndex=4"
        ),
        arrayOf(
            "Himeko",
            "Element: Fire",
            "Affiliation: Astral Express",
            "An adventurous scientist who encountered and repaired a stranded train as a child, she now ventures across the universe with the Astral Express as its navigator. ",
            "Erudition",
            R.drawable.himeko,
            R.drawable.himekobgfit,
            R.drawable.element_fire,
            "https://hsr.hoyoverse.com/en-us/character?charIndex=1&worldIndex=1"
        ),
        arrayOf(
            "Jing Yuan",
            "Element: Lightning",
            "Affiliation: The Xianzhou Luofu",
            "He is one of the seven Arbiter-Generals of the Xianzhou Alliance's Cloud Knights, and one of the Six Charioteers of the Xianzhou Luofu. ",
            "Sword",
            R.drawable.jingyuan,
            R.drawable.jingyuanbgfit,
            R.drawable.element_lightning,
            "https://hsr.hoyoverse.com/en-us/character?charIndex=1&worldIndex=1"
        ),
        arrayOf(
            "Kafka",
            "Element: Lightning",
            "Affiliation: Stellaron Hunters",
            "A member of the Stellaron Hunters who is calm, collected, and beautiful. Her record on the wanted list of the Interastral Peace Corporation only lists her name and her hobby. ",
            "Nihility",
            R.drawable.kafka,
            R.drawable.kafkabgfit,
            R.drawable.element_fire,
            "https://hsr.hoyoverse.com/en-us/character?charIndex=1&worldIndex=2"
        ),
        arrayOf(
            "Seele",
            "Element: Quantum",
            "Affiliation: Belobog",
            "A spirited and valiant key member of Wildfire who grew up in the perilous Underworld of Belobog. She is accustomed to being on her own.",
            "The Hunt",
            R.drawable.seele,
            R.drawable.seelebgfit,
            R.drawable.element_quantum,
            "https://hsr.hoyoverse.com/en-us/character?charIndex=3&worldIndex=4"
        ),
        arrayOf(
            "Silver Wolf",
            "Element: Quantum",
            "Affiliation: Stellaron Hunter",
            "A member of the Stellaron Hunters and a genius hacker. Silver Wolf has mastered the skill known as \"aether editing,\" which can be used to tamper with the data of reality.",
            "Nihility",
            R.drawable.silverwolf,
            R.drawable.silverwolfbgfit,
            R.drawable.element_quantum,
            "https://hsr.hoyoverse.com/en-us/character?charIndex=2&worldIndex=2"
        ),
        arrayOf(
            "Welt",
            "Element: Imaginary",
            "Affiliation: Astral Express",
            "An animator by trade, Welt is a seasoned member of the Astral Express Crew and the former sovereign of Anti-Entropy who has saved Earth from annihilation time and time again. He inherited the name of the world, \"Welt.\"",
            "Nihility",
            R.drawable.welt,
            R.drawable.weltbgfit,
            R.drawable.element_imaginary,
            "https://hsr.hoyoverse.com/en-us/character?charIndex=2&worldIndex=1"
        )
    )

    val listData: ArrayList<StarrailChar>
        get(){
            val list = ArrayList<StarrailChar>()
            for (data in database) {
                val starrailChar = StarrailChar()
                starrailChar.name = data[0] as String
                starrailChar.elementinfo = data[1] as String
                starrailChar.affiliation = data[2] as String
                starrailChar.bio = data[3] as String
                starrailChar.path = data[4] as String
                starrailChar.pic = data[5] as Int
                starrailChar.background = data[6] as Int
                starrailChar.element = data[7] as Int
                starrailChar.charlink = data[8] as String

                list.add(starrailChar)
            }
            return list
        }
}
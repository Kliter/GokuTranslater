package com.kusumi.katsumi.gokutranslator.Util

class StringUtil {
    companion object StringUtil{
        private val convertMap: Map<String, String> = mapOf<String, String>(
                "あい" to "えぇ",
                "かい" to "けぇ",
                "かえ" to "けぇ",
                "がい" to "げぇ",
                "がえ" to "げぇ",
                "さい" to "せぇ",
                "さえ" to "せぇ",
                "ざい" to "ぜぇ",
                "ざえ" to "ぜぇ",
                "たい" to "てぇ",
                "たえ" to "てぇ",
                "だい" to "でぇ",
                "だえ" to "でぇ",
                "ない" to "ねぇ",
                "なえ" to "ねぇ",
                "はい" to "へぇ",
                "はえ" to "へぇ",
                "ばい" to "べぇ",
                "ばえ" to "べぇ",
                "ぱい" to "ぺぇ",
                "ぱえ" to "ぺぇ",
                "まい" to "めぇ",
                "まえ" to "めぇ",
                "やい" to "えぇ",
                "やえ" to "えぇ",
                "らい" to "れぇ",
                "らえ" to "れぇ",
                "わい" to "えぇ",
                "わえ" to "えぇ",
                "アイ" to "エェ",
                "アエ" to "エェ",
                "カイ" to "ケェ",
                "カエ" to "ケェ",
                "ガイ" to "ゲェ",
                "ガエ" to "ゲェ",
                "サイ" to "セェ",
                "サエ" to "セェ",
                "ザイ" to "ゼェ",
                "ザエ" to "ゼェ",
                "タイ" to "テェ",
                "タエ" to "テェ",
                "ダイ" to "デェ",
                "ダエ" to "デェ",
                "ナイ" to "ネェ",
                "ナエ" to "ネェ",
                "ハイ" to "ヘェ",
                "ハエ" to "ヘェ",
                "バイ" to "ベェ",
                "バエ" to "ベェ",
                "パイ" to "ペェ",
                "パエ" to "ペェ",
                "マイ" to "メェ",
                "マエ" to "メェ",
                "ヤイ" to "エェ",
                "ヤエ" to "エェ",
                "ライ" to "レェ",
                "ラエ" to "レェ",
                "ワイ" to "エェ",
                "ワエ" to "エェ",
                "僕" to "オラ",
                "ぼく" to "オラ",
                "ボク" to "オラ",
                "私" to "オラ",
                "わたし" to "オラ",
                "ワタシ" to "オラ",
                "俺" to "オラ",
                "おれ" to "オラ",
                "オレ" to "オラ"
        )

        fun translate(string: String): String {
            var obtainedText: String = string

            var key: String
            val keySetIterator: Iterator<String> = convertMap.keys.iterator()
            while (keySetIterator.hasNext()) {
                key = keySetIterator.next()
                obtainedText = obtainedText.replace(key, convertMap[key] as String)
            }

            return obtainedText
        }
    }
}
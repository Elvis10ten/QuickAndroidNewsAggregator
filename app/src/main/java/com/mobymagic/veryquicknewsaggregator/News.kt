package com.mobymagic.veryquicknewsaggregator

data class News(val title: String, val link: String, val description: String, val pubDate: String,
                val thumbnail: String) {

    constructor(): this("", "", "", "", "")

}
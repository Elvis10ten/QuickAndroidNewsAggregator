package com.mobymagic.veryquicknewsaggregator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showNewsFragment()
    }

    private fun showNewsFragment() {
        val tag = "NewsListFragment"
        val existingFragmentWithTag = supportFragmentManager.findFragmentByTag(tag)

        if(existingFragmentWithTag == null) {
            supportFragmentManager.beginTransaction()
                    .add(R.id.newsListFragmentContainer, NewsListFragment(), tag)
                    .commit()
        }
    }

}

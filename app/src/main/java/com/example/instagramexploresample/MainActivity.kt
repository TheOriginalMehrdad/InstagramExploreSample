package com.example.instagramexploresample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.instagramexploresample.databinding.ActivityMainBinding
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import jp.wasabeef.glide.transformations.BlurTransformation
import jp.wasabeef.glide.transformations.RoundedCornersTransformation
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val url = listOf(
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img1.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img2.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img3.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img4.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img5.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img6.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img7.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img8.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img9.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img10.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img11.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img12.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img13.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img14.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img15.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img16.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img17.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img3.png"
        )

        if (NetworkChecker(this).isInternetConnected) {

            Glide.with(this).load(url[0]).placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error).into(binding.img1)
            Glide.with(this).load(url[1]).placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error).into(binding.img2)
            Glide.with(this).load(url[2]).placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error).into(binding.img3)
            Glide.with(this).load(url[3]).placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error).into(binding.img4)
            Glide.with(this).load(url[4]).placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error).into(binding.img5)
            Glide.with(this).load(url[15]).placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error).into(binding.img6)
            Glide.with(this).load(url[6]).placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error).into(binding.img7)
            Glide.with(this).load(url[7]).placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error).into(binding.img8)
            Glide.with(this).load(url[8]).placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error).into(binding.img9)
            Glide.with(this).load(url[9]).placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error).into(binding.img10)
            Glide.with(this).load(url[10]).placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error).into(binding.img11)
            Glide.with(this).load(url[11]).placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error).into(binding.img12)
            Glide.with(this).load(url[12]).placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error).into(binding.img13)
            Glide.with(this).load(url[13]).placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error).into(binding.img14)
            Glide.with(this).load(url[14]).placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error).into(binding.img15)
            Glide.with(this).load(url[14]).placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error).into(binding.img16)
            Glide.with(this).load(url[17]).placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error).into(binding.img17)
            Glide.with(this).load(url[9]).placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error).into(binding.img18)

        } else {

            Toast.makeText(this, "Please check the network connection first", Toast.LENGTH_SHORT)
                .show()
        }
    }

}
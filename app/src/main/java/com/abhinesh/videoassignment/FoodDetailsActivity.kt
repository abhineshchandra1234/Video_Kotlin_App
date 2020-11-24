package com.abhinesh.videoassignment

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import androidx.annotation.NonNull
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import kotlinx.android.synthetic.main.activity_food_details.*

class FoodDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_details)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)

        var bundle = intent.extras
        //imageView2.setImageResource(bundle!!.getInt("image"))
        //textView2.text = bundle.getString("name")



        //val onlineUri = Uri.parse(bundle?.getString("des")+"")

        val offlineUri = Uri.parse("android.resource://$packageName/${R.raw.animal}")

        videoView.setMediaController(mediaController)
        videoView.setVideoURI(offlineUri)
        videoView.requestFocus()
        videoView.start()


//        third_party_player_view.getPlayerUiController().showFullscreenButton(true)
//        third_party_player_view.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
//            override fun onReady(@NonNull youTubePlayer: YouTubePlayer) {
//                val videoId = bundle?.getString("des")+""    //"YE7VzlLtp-4"
//                youTubePlayer.cueVideo(videoId, 0f)
//            }
//        })
//
//        third_party_player_view.getPlayerUiController().setFullScreenButtonClickListener(View.OnClickListener {
//            if (third_party_player_view.isFullScreen()) {
//                third_party_player_view.exitFullScreen()
//                window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_VISIBLE
//                // Show ActionBar
//                if (supportActionBar != null) {
//                    supportActionBar!!.show()
//                }
//            } else {
//                third_party_player_view.enterFullScreen()
//                window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
//                // Hide ActionBar
//                if (supportActionBar != null) {
//                    supportActionBar!!.hide()
//                }
//            }
//        })
    }
    }

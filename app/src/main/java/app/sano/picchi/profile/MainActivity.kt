package app.sano.picchi.profile

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myNameButton.setOnClickListener{
            //名前
            myNameButton.setBackgroundColor(Color.parseColor("#29abe2"))
            likeFoodButton.setBackgroundColor(Color.parseColor("#929292"))
            likeHobbyButton.setBackgroundColor(Color.parseColor("#929292"))
            likeSportsButton.setBackgroundColor(Color.parseColor("#929292"))
            myImageView.setImageResource(R.drawable.tobisuke)
            myText.text = "とびすけ"

        }

        likeSportsButton.setOnClickListener{
            myNameButton.setBackgroundColor(Color.parseColor("#929292"))
            likeFoodButton.setBackgroundColor(Color.parseColor("#929292"))
            likeHobbyButton.setBackgroundColor(Color.parseColor("#929292"))
            likeSportsButton.setBackgroundColor(Color.parseColor("#29abe2"))
            myImageView.setImageResource(R.drawable.soccer)
            myText.text = "サッカー"

        }

        likeFoodButton.setOnClickListener{
            myNameButton.setBackgroundColor(Color.parseColor("#929292"))
            likeFoodButton.setBackgroundColor(Color.parseColor("#29abe2"))
            likeHobbyButton.setBackgroundColor(Color.parseColor("#929292"))
            likeSportsButton.setBackgroundColor(Color.parseColor("#929292"))
            myImageView.setImageResource(R.drawable.sushi)
            myText.text = "すし"

        }

        likeHobbyButton.setOnClickListener{
            myNameButton.setBackgroundColor(Color.parseColor("#929292"))
            likeFoodButton.setBackgroundColor(Color.parseColor("#929292"))
            likeHobbyButton.setBackgroundColor(Color.parseColor("#29abe2"))
            likeSportsButton.setBackgroundColor(Color.parseColor("#929292"))
            myImageView.setImageResource(R.drawable.dance)
            myText.text = "ダンス"

        }



//        //画像と名前を隠す
//        myImageView.visibility = View.INVISIBLE
//        myText.visibility = View.INVISIBLE
//
//        myNameButton.setOnClickListener{
//            //ボタンが押された時の処理(画像とボタンを表示)
//            myImageView.visibility = View.VISIBLE
//            myText.visibility = View.VISIBLE
//
//
//        }





    }
}

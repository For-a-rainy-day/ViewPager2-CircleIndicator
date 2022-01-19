package com.example.homework193

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*
import me.relex.circleindicator.CircleIndicator3

class MainActivity : AppCompatActivity() {

    private var titeList= mutableListOf<String>()
    private var descList= mutableListOf<String>()
    private var imageList= mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        posttolist()

        btn_skip.setBackgroundColor(Color.TRANSPARENT);
        btn_next.setBackgroundColor(Color.TRANSPARENT);
        //  indicator.setBackgroundColor(Color.TRANSPARENT);

        btn_next.setOnClickListener {
            view_pager2.apply {
                beginFakeDrag()
                fakeDragBy(-10f)
                endFakeDrag()
            }
        }

        btn_skip.setOnClickListener {
            view_pager2.apply {
                beginFakeDrag()
                fakeDragBy(-10f)
                endFakeDrag()
            }
            
        }

        view_pager2.adapter=ViewPagerAdapter(titeList,descList, imageList )
        view_pager2.orientation= ViewPager2.ORIENTATION_HORIZONTAL


        val indicator= findViewById<CircleIndicator3>(R.id.indicator)
        indicator.setViewPager(view_pager2)


    }
    private fun addtolist(title:String, description: String, image:Int){
        titeList.add(title)
        descList.add(description)
        imageList.add(image)
    }
    private fun posttolist(){
        var tarif="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum."

        addtolist("Click va Paymega o’tish xizmati",tarif, R.drawable.homework19_3)
        addtolist("Barcha operatorlar bo’yicha statistika",tarif, R.drawable.rasm1_193)
        addtolist("Tariflarni filtrlash",tarif, R.drawable.rasm2_193)
        addtolist("Yangi imkoniyatlar",tarif, R.drawable.tasm3_193)

    }
}
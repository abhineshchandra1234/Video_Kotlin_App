package com.abhinesh.videoassignment

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.mylayout.view.*

class MainActivity : AppCompatActivity() {

    var adapter: FoodAdapter? = null
    var foodlist = ArrayList<Food>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        foodlist.add(Food("Coffee","OXVcMogNVRE",R.drawable.one))
        foodlist.add(Food("Tea","psPj_hqxp0I",R.drawable.eight))
        foodlist.add(Food("Cake","dZ6F1KTnAVg",R.drawable.eleven))
        foodlist.add(Food("Fries","XNTMfax5Q5w",R.drawable.five))
        foodlist.add(Food("Cherry","lwLnObYwfCA",R.drawable.four))
        foodlist.add(Food("Cookie","B3OjfK0t1XM",R.drawable.nine))
        foodlist.add(Food("Pastry","DkvLCjFiODw",R.drawable.seven))

        adapter = FoodAdapter(this,foodlist)
        gridview.adapter = adapter

    }

    class FoodAdapter : BaseAdapter{
        var foodlist = ArrayList<Food>()
        var context: Context? = null

        constructor(context: Context?,foodlist: ArrayList<Food>) : super() {
            this.foodlist = foodlist
            this.context = context
        }


        override fun getCount(): Int {
            return  foodlist.size
        }

        override fun getItem(position: Int): Any {
            return  position
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var food = this.foodlist[position]
            var inflater = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var foodview = inflater.inflate(R.layout.mylayout,null)
            foodview.imageView.setImageResource(food.image!!)
            foodview.textView.text = food.name!!
            foodview.imageView.setOnClickListener {
                var intent = Intent(context, FoodDetailsActivity::class.java)
                intent.putExtra("name",food.name!!)
                intent.putExtra("des",food.des!!)
                intent.putExtra("image",food.image!!)
                context!!.startActivity(intent)
            }
            return foodview
        }

    }
}
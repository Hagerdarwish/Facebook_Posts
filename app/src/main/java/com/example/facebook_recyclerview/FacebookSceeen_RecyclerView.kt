package com.example.facebook_recyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FacebookSceeen_RecyclerView : AppCompatActivity() {
    lateinit var contentRecyclerView:RecyclerView
    lateinit var adabter: Adabter
    lateinit var item:ArrayList<Post>

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facebook_sceeen_recycler_view)
        item = ArrayList()
        for (i:Int in 0..20){
            item.add(
                Post("buckle ","buckle up because change is coming at word press"),
            )}

        contentRecyclerView=findViewById(R.id.RVitem)

        adabter= Adabter(item)
        contentRecyclerView.adapter=adabter
        contentRecyclerView.layoutManager = LinearLayoutManager(this)

    }
    fun list(){

for (i:Int in 0..20){
    item.add(
        Post("buckle ","buckle up because change is coming at word press"),
    )

}


    }



    }

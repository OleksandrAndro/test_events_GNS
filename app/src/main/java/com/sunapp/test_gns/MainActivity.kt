package com.sunapp.test_gns

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private var retroApi : RetroAPI? = null
    private var retrofit: Retrofit? = null
    var recyclerView : RecyclerView? = null
    var eventArrayList : ArrayList<GitEvent>? = null
    var mAdapter : Adapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerview)
        recyclerView?.layoutManager = LinearLayoutManager(this)

        eventArrayList = ArrayList()
        mAdapter  = Adapter(eventArrayList!!, this)
        recyclerView?.adapter = mAdapter

        retrofit = Retrofit.Builder()
                    .baseUrl("https://api.github.com")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
        retroApi = retrofit!!.create(RetroAPI::class.java)

        retroApi!!.getEvents().enqueue(object : Callback<List<GitEvent>>{

            override fun onResponse(
                call: Call<List<GitEvent>>,
                response: Response<List<GitEvent>>
            )
            {
                var temp = response.body()
                notifyData(temp)
            }

            override fun onFailure(call: Call<List<GitEvent>>, t: Throwable)
            {

            }
        })
    }

    fun notifyData(eventList : List<GitEvent>?){

        eventArrayList?.clear()
        if (eventList != null) {
            eventArrayList?.addAll(eventList)
            mAdapter?.notifyDataSetChanged()
        }
    }

    val localBroadcastReceiver : BroadcastReceiver = object : BroadcastReceiver(){
        override fun onReceive(p0: Context?, p1: Intent?) {
            if(p1?.action.equals("openRepo")){
                val url = p1?.getStringExtra("url")
                val intent = Intent(this@MainActivity, WebViewActivity :: class.java)
                intent.putExtra("url", url)
                startActivityForResult(intent, 1611)
            }
        }
    }

    override fun onResume() {
        super.onResume()
        val filterOpenPepo = IntentFilter("openRepo")
        LocalBroadcastManager.getInstance(this).registerReceiver(localBroadcastReceiver, filterOpenPepo)
    }

    override fun onPause() {
        super.onPause()
        LocalBroadcastManager.getInstance(this).unregisterReceiver(localBroadcastReceiver)
    }

}

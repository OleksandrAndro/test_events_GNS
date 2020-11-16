package com.sunapp.test_gns

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class Adapter(val data : List<GitEvent>, val mContext : Context) : RecyclerView.Adapter<Adapter.MyViewHolder>() {

    var picasso : Picasso = Picasso.Builder(mContext).build()

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val mItemEvent : GitEvent = data.get(position)

        val textForFirstRow = mItemEvent.actor.displayLogin + " - " + mItemEvent.repo.name
        val textForSecondRow = mItemEvent.type + " " + mItemEvent.createdAt

        holder.textLoginRepo!!.text = textForFirstRow
        holder.textTypeCreated!!.text = textForSecondRow
        picasso.load(mItemEvent.actor.avatarUrl)
               .into(holder.imageAvatar)

        holder.itemView.setOnClickListener(object : View.OnClickListener {

            override fun onClick(p0: View?) {
                val intent = Intent("openRepo")
                intent.putExtra("url", mItemEvent.repo.url)

                mContext?.let { LocalBroadcastManager.getInstance(it).sendBroadcast(intent) }
            }

        })
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
       return MyViewHolder(itemView)
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

       var imageAvatar: ImageView? = null
       var textLoginRepo : TextView? = null
       var textTypeCreated : TextView? = null

        init {
            imageAvatar = itemView.findViewById(R.id.image_avatar)
            textLoginRepo = itemView.findViewById(R.id.text_login_repo)
            textTypeCreated = itemView.findViewById(R.id.text_type_created)
        }
    }

}
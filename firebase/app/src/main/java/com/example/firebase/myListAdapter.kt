package com.example.firebase

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView



class MyAdapterList(var mCtx: Context, var resorce:Int, var item: MutableList<Users1>)
    : ArrayAdapter<Users1>(mCtx,resorce,item){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflater: LayoutInflater = LayoutInflater.from(mCtx)
        val view: View = layoutInflater.inflate(resorce,null)
        val textView1: TextView = view.findViewById(R.id.textView1)
        val textView2: TextView = view.findViewById(R.id.textView2)
        val user: Users1 = item[position]

        textView1.text = user.email
        textView2.text = user.name





        return view
    }
}
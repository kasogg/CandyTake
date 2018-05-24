package com.candytake.candycity.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.candytake.candycity.R
import com.candytake.candycity.adapter.MainAdapter
import com.candytake.candycity.bean.PostBean
import com.candytake.candycity.network.ServiceFactory
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private val mWpService = ServiceFactory.getWpService()
    private lateinit var mAdapter: MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        bindData()
    }

    private fun initViews() {
        rv_candy_list.layoutManager = LinearLayoutManager(this)
        mAdapter = MainAdapter(ArrayList())
        rv_candy_list.adapter = mAdapter
    }

    private fun bindData() {
        mWpService.listPosts().enqueue(object : Callback<List<PostBean>> {
            override fun onResponse(call: Call<List<PostBean>>?, response: Response<List<PostBean>>?) {
                mAdapter.getObjects().clear()
                response?.body()?.let { mAdapter.getObjects().addAll(it) }
                mAdapter.notifyDataSetChanged()
            }

            override fun onFailure(call: Call<List<PostBean>>?, t: Throwable?) {

            }
        })
    }

}

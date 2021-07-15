# httprequest

package com.example.httprequest

import android.util.Log
import okhttp3.*
import org.json.JSONArray
import org.json.JSONObject
import java.io.IOException
import kotlin.math.log

val TAG = "HTTP-Test"

data class User(
    val houseNumber : String,
    val master : String,
    val floor  : String,
    val symbol : String,
    val houseSerialNumber : String,
    val gasNumber : String,
    val points : Int,
    val member : JSONArray
)

class Post() {
    var client: OkHttpClient? = null
    var request: Request? = null
    val builder = FormBody.Builder()
    private val baseUrl = "https://asia-east2-ductech-cms.cloudfunctions.net/"

    init {
        builder.add("ProjectName","DUCCMS")
        builder.add("HouseSerialNumber","123456789")
        val formBody = builder.build()
        client = OkHttpClient()
        request = Request.Builder()
            .method("POST",formBody)
            .url(baseUrl + "GetUserResident")
            .build()
    }

    fun postAPI() {
        client?.newCall(request)?.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.d(TAG, "onFailure: " + e)
            }

            override fun onResponse(call: Call, response: Response) {
                val responseStr = response.body()?.string()
                val itemList = JSONObject(responseStr)
                Log.d(TAG, "onResponse: master -> " + itemList.getString("master"))
                val item = itemList.getJSONArray("member")

                Log.d(TAG, "onResponse: item list: " + item.getJSONObject(0).getString("residentSerialNumber"))
                Log.d(TAG, "onResponse: item list: " + item.getJSONObject(1).getString("residentSerialNumber"))
//
//                val reposDataList = arrayListOf<String>()
//
//                for (i in 0..itemList.length() - 1) {
//                    reposDataList.add(itemList[i].toString())
//                }
//                reposDataList.forEach {
//                    Log.d(TAG, "onResponse: " + it)
//                }
                Log.d(TAG, "onResponse: postAPI => " + responseStr)

            }
        })
    }

    fun getSerialNumber() : User? {
        var myUser: User? = null
        client?.newCall(request)?.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.d(TAG, "onFailure: " + e)
//                myUser = User("","","","","","",0,JSONArray("[0,0]"))
            }

            override fun onResponse(call: Call, response: Response) {
                val responseStr = response.body()?.string()
                val itemList = JSONObject(responseStr)

                myUser = User(
                    houseNumber = itemList.getString("houseNumber"),
                    master = itemList.getString("master"),
                    floor = itemList.getString("floor"),
                    symbol = itemList.getString("symbol"),
                    houseSerialNumber = itemList.getString("houseSerialNumber"),
                    gasNumber = itemList.getString("gasNumber"),
                    points = itemList.getInt("points"),
                    member = itemList.getJSONArray("member"),
                )
                Log.d(TAG, "onResponse: getSerialNumber => " + responseStr)
            }
        })
        return myUser
    }

    fun getUserResident() {
        builder.add("ProjectName","DUCCMS")
        builder.add("HouseSerialNumber","123456789")
        val formBody = builder.build()
        request = Request.Builder()
            .method("POST",formBody)
            .url(baseUrl + "GetUserResident")
            .build()
    }
}


============================================================================================
2021-07-15 23:50:01.295 14309-14309/com.example.httprequest D/HTTP-Test: onCreate: null
2021-07-15 23:50:02.106 14309-14333/com.example.httprequest D/HTTP-Test: onResponse: getSerialNumber => {"houseNumber":"202號","master":"許宅邸","floor":"6樓","symbol":"之1","houseSerialNumber":"123456789","gasNumber":"020216021","points":9219,"member":[{"name":"","residentSerialNumber":"1111"},{"name":"","residentSerialNumber":"2222"}]}
2021-07-15 23:50:02.183 14309-14332/com.example.httprequest D/HTTP-Test: onResponse: master -> 許宅邸
2021-07-15 23:50:02.183 14309-14332/com.example.httprequest D/HTTP-Test: onResponse: item list: 1111
2021-07-15 23:50:02.183 14309-14332/com.example.httprequest D/HTTP-Test: onResponse: item list: 2222
2021-07-15 23:50:02.184 14309-14332/com.example.httprequest D/HTTP-Test: onResponse: postAPI => {"houseNumber":"202號","master":"許宅邸","floor":"6樓","symbol":"之1","houseSerialNumber":"123456789","gasNumber":"020216021","points":9219,"member":[{"name":"","residentSerialNumber":"1111"},{"name":"","residentSerialNumber":"2222"}]}

https://web.postman.co/workspace/My-Workspace~ba467167-d4a1-470a-82f8-5abcd825ea8f/request/16686081-3f7cf8f2-edfd-412b-9035-a2e13ad82e5d    //PostMan
================================================================================================
MainActivity.kt
**
package com.example.httprequest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

val post = Post()

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //所有社區
//        post.GetAllProjectName( object: Post.OnRequestListener {
//            override fun onError() {
//                Log.d(TAG, "onError: ")
//            }
//
//            override fun onSuccess(result: Any) {
//                Log.d(TAG, "onSuccess: result" + result)
//            }
//        })

        //用戶資訊
        post.BindUserData( "DUCCMS", "2345", "123456789", object: Post.OnRequestListener {
            override fun onError() {
                Log.d(TAG, "onError: ")
            }

            override fun onSuccess(result: Any) {
                Log.d(TAG, "onSuccess: result" + result)
            }
        })

        //包裹資訊
        post.GetUserMail("DUCCMS","123456789",object :Post.OnRequestListener{
            override fun onError() {
                Log.d(TAG, "onError: ")
            }

            override fun onSuccess(result: Any) {
                Log.d(TAG, "onSuccess: result" + result)
            }
        })

        //行事曆資訊
        post.GetYearCalendar( "DUCCMS", "123456789", object: Post.OnRequestListener {
            override fun onError() {
                Log.d(TAG, "onError: ")
            }

            override fun onSuccess(result: Any) {
                Log.d(TAG, "onSuccess: result" + result)
            }
        })

        //公告資訊
        post.GetUserAllAnnouncement( "DUCCMS", object: Post.OnRequestListener {
            override fun onError() {
                Log.d(TAG, "onError: ")
            }

            override fun onSuccess(result: Any) {
                Log.d(TAG, "onSuccess: result" + result)
            }
        })

        //公設資訊
        post.UserGetAllAmenities( "DUCCMS", object: Post.OnRequestListener {
            override fun onError() {
                Log.d(TAG, "onError: ")
            }

            override fun onSuccess(result: Any) {
                Log.d(TAG, "onSuccess: result" + result)
            }
        })

        //已預約時間人數
        post.UserGetDateReservation( "DUCCMS","123456789", object: Post.OnRequestListener {
            override fun onError() {
                Log.d(TAG, "onError: ")
            }

            override fun onSuccess(result: Any) {
                Log.d(TAG, "onSuccess: result" + result)
            }
        })

        //用戶公設預約
//        post.UserAddNewReservation( "DUCCMS","123456789", object: Post.OnRequestListener {
//            override fun onError() {
//                Log.d(TAG, "onError: ")
//            }
//
//            override fun onSuccess(result: Any) {
//                Log.d(TAG, "onSuccess: result" + result)
//            }
//        })

        //公設預約紀錄
        post.GetUserALLRese( "DUCCMS","123456789", object: Post.OnRequestListener {
            override fun onError() {
                Log.d(TAG, "onError: ")
            }

            override fun onSuccess(result: Any) {
                Log.d(TAG, "onSuccess: result" + result)
            }
        })

        //用戶取消公設預約
//        post.UserDeleteReservaion( "DUCCMS","123456789", object: Post.OnRequestListener {
//            override fun onError() {
//                Log.d(TAG, "onError: ")
//            }
//
//            override fun onSuccess(result: Any) {
//                Log.d(TAG, "onSuccess: result" + result)
//            }
//        })

        //點數紀錄
//        post.GetUserPointLog( "DUCCMS","123456789", object: Post.OnRequestListener {
//            override fun onError() {
//                Log.d(TAG, "onError: ")
//            }
//
//            override fun onSuccess(result: Any) {
//                Log.d(TAG, "onSuccess: result" + result)
//            }
//        })

        //意見留言資訊
        post.UserGetMessage( "DUCCMS","123456789", object: Post.OnRequestListener {
            override fun onError() {
                Log.d(TAG, "onError: ")
            }

            override fun onSuccess(result: Any) {
                Log.d(TAG, "onSuccess: result" + result)
            }
        })

        //新增留言
//        post.UserCreateMess( "DUCCMS","123456789", object: Post.OnRequestListener {
//            override fun onError() {
//                Log.d(TAG, "onError: ")
//            }
//
//            override fun onSuccess(result: Any) {
//                Log.d(TAG, "onSuccess: result" + result)
//            }
//        })

        //留言內容
        post.UserGetMessChat( "DUCCMS","123456789", object: Post.OnRequestListener {
            override fun onError() {
                Log.d(TAG, "onError: ")
            }

            override fun onSuccess(result: Any) {
                Log.d(TAG, "onSuccess: result" + result)
            }
        })

        //新增留言內容
//        post.SendMessage( "DUCCMS","123456789", object: Post.OnRequestListener {
//            override fun onError() {
//                Log.d(TAG, "onError: ")
//            }
//
//            override fun onSuccess(result: Any) {
//                Log.d(TAG, "onSuccess: result" + result)
//            }
//        })

        //當期瓦斯抄錶
        post.UserGetGas( "DUCCMS","123456789", object: Post.OnRequestListener {
            override fun onError() {
                Log.d(TAG, "onError: ")
            }

            override fun onSuccess(result: Any) {
                Log.d(TAG, "onSuccess: result" + result)
            }
        })

        //上傳瓦斯度數
//        post.RegisterGas( "DUCCMS","123456789", object: Post.OnRequestListener {
//            override fun onError() {
//                Log.d(TAG, "onError: ")
//            }
//
//            override fun onSuccess(result: Any) {
//                Log.d(TAG, "onSuccess: result" + result)
//            }
//        })

        //瓦斯抄錶紀錄
        post.UserGetGasLog( "DUCCMS","123456789", object: Post.OnRequestListener {
            override fun onError() {
                Log.d(TAG, "onError: ")
            }

            override fun onSuccess(result: Any) {
                Log.d(TAG, "onSuccess: result" + result)
            }
        })

        //當期管理費
        post.UserGetMagFee(object: Post.OnRequestListener {
            override fun onError() {
                Log.d(TAG, "onError: ")
            }

            override fun onSuccess(result: Any) {
                Log.d(TAG, "onSuccess: result" + result)
            }
        })

        //變更用戶名稱
//        post.UpdateUserName( "DUCCMS","123456789", object: Post.OnRequestListener {
//            override fun onError() {
//                Log.d(TAG, "onError: ")
//            }
//
//            override fun onSuccess(result: Any) {
//                Log.d(TAG, "onSuccess: result" + result)
//            }
//        })
    }
}
================================================================================================
Post.kt
**
package com.example.httprequest

import android.util.Log
import okhttp3.*
import org.json.JSONArray
import org.json.JSONObject
import java.io.IOException

val TAG = "HTTP-Test"

data class BindUserDat(
    val houseNumber : String,
    val address : String,
    val floor : String,
    val symbol : String,
    val residentSerialNumber : String,
    val name : String,
    val gasNumber : String,
    val points : String
)

data class GetUserMail(
    val settingTime : String,
    val receiveTime : String,
    val floor : String,
    val receiveManger : String,
    val name : String,
    val status : String,
    val placement : String,
    val sort : String,
    val symbol : String,
    val type : String,
    val projectName : String,
    val returnForm : String,
    val houseName : String,
    val remarks : String,
    val mailNumber : String
)


data class GetYearCalendar(
    val calendarDate : String,
    val settingTime : String,
    val title : String,
    val place : String
)

data class GetUserAllAnnouncement(
    val postTime : String,
    val type : String,
    val title : String,
    val announcer : String,
    val isTop : Boolean,
    val content : String,
//    val fileName : [String],
//    val fileUrl : [String]
)
data class UserGetAllAmenities(
    val amenitiesName : String,
    val point : String,
//    val normalDays : [String],
//    val weekDays : [String],
//    val closeDays : [Int],
    val costMode : Int,
    val reservationMode : Int,
    val costUnit : Int,
    val timeLimit : Int,
    val accommodate : Int,
    val content : String,
    val isOpen : Boolean,
    val imageUrl : String,
    val identify : String

)

data class UserGetDateReservation(
    val date : String,
    val time : String,
    val people : Int
)

data class GetUserALLRese(
    val reservationDate : String,
    val enterTime : String,
    val leaveTime : String,
    val amenitiesName : String,
    val reservationTime : String,
    val name : String,
    val residentSerialNumber : String,
    val reservationNumber : Int,
    val point : Int,
    val sort : String,
    val identify : String,
    val amenitiesID : String,
    val amenitiesURL : String
)

//data class GetUserPointLog(
////    val resPointLog : [ResPointLog],
////    val depositPointLog : [DepositPointLog],
//
////    [ResPointLog]
//    val amenitiesName : String,
//    val time : String,
//    val reservationTime : String,
//    val point : Int,
//    val reservationNumber : Int,
//    val isBook : Boolean,
//    val sort : String,
//    val amenitiesID : String,
//    val logID : String
//
////    [DepositPointLog]
//    val manage : String,
//    val point : Int,
//    val sort : String,
//    val title : String,
//    val time : String,
//    val logID : String
//)

data class UserGetMessage(
    val title : String,
    val time : String,
    val messageID : Int,
    val sort : String,
    val isUserRead : Boolean
)

data class UserGetMessChat(
    val content : String,
    val messageTime : String,
    val isManager : Boolean
)

data class UserGetGas(
    val openTime : String,
    val closeTime : String,
    val identity : String,
    val degree : String,
    val isOpen : Boolean
)

data class UserGetGasLog(
    val degree : String,
    val openTime : String,
    val closeTime : String
)

data class UserGetMagFee(
    val title : String,
    val closeTime : String,
    val identify : String,
    val isOpen : Boolean,
    val magFee : String,
    val oneBarCode : String,
    val twoBarCode : String,
    val threeBarCode : String,
    val isPay : Boolean
)

class Post() {
    var client: OkHttpClient? = null
    private var onRequestListener : OnRequestListener? = null
    private val baseUrl = "https://asia-east2-ductech-cms.cloudfunctions.net/"

    init {
        client = OkHttpClient()
    }

        //所有社區
    fun GetAllProjectName(listener: OnRequestListener) {
        onRequestListener = listener
        var request: Request? = null
        val builder = FormBody.Builder()
        val formBody = builder.build()
        request = Request.Builder()
            .method("POST",formBody)
            .url(baseUrl + "GetAllProjectName")
            .build()
        client?.newCall(request)?.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.d(TAG, "onFailure: " + e)
                onRequestListener?.onError()
            }

            override fun onResponse(call: Call, response: Response) {
                val responseStr = response.body()?.string()
                val itemList = JSONObject(responseStr)
                // TODO("response to json object")
                onRequestListener?.onSuccess(itemList)
                Log.d(TAG, "" + itemList)
            }
        })
    }

    //用戶資訊
    fun BindUserData(projectName: String, residentSerialNumber: String, phoneID: String, listener: OnRequestListener) {
        onRequestListener = listener
        var request: Request? = null
        val builder = FormBody.Builder()
        builder.add("ProjectName", projectName)
        builder.add("ResidentSerialNumber", residentSerialNumber)
        builder.add("PhoneID", phoneID)
        val formBody = builder.build()
        request = Request.Builder()
            .method("POST",formBody)
            .url(baseUrl + "BindUserData")
            .build()
        client?.newCall(request)?.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.d(TAG, "onFailure: " + e)
                onRequestListener?.onError()
            }

            lateinit var bindUserDat: BindUserDat
            override fun onResponse(call: Call, response: Response) {
                val responseStr = response.body()?.string()
                val itemList = JSONObject(responseStr)

                bindUserDat = BindUserDat(
                        houseNumber = itemList.getString("houseNumber"),
                        address = itemList.getString("address"),
                        floor = itemList.getString("floor"),
                        symbol = itemList.getString("symbol"),
                        residentSerialNumber = itemList.getString("residentSerialNumber"),
                        name = itemList.getString("name"),
                        gasNumber = itemList.getString("gasNumber"),
                        points = itemList.getString("points")
                    )

                    // TODO("response to json object")
                onRequestListener?.onSuccess(itemList)
                    Log.d(TAG, "" + itemList)
            }
        })
    }

    //包裹資訊
    fun GetUserMail(projectName: String, houseSerialNumber: String, listener: OnRequestListener) {
        onRequestListener = listener
        var request: Request? = null
        val builder = FormBody.Builder()
        builder.add("ProjectName", projectName)
        builder.add("HouseSerialNumber", houseSerialNumber)
        val formBody = builder.build()
        request = Request.Builder()
            .method("POST",formBody)
            .url(baseUrl + "GetUserMail")
            .build()
        client?.newCall(request)?.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.d(TAG, "onFailure: " + e)
                onRequestListener?.onError()
            }

            lateinit var getUserMail: GetUserMail
            override fun onResponse(call: Call, response: Response) {
                val responseStr = response.body()?.string()

                if (responseStr == "null" || responseStr == "Error"){
                    onRequestListener?.onError()
                }else{
                    val itemList = JSONArray(responseStr)
                    Log.d(TAG, "itemList: " + itemList )
//                    getUserMail = GetUserMail(
//                        settingTime = itemList.getString("settingTime"),
//                        receiveTime = itemList.getString("receiveTime"),
//                        floor = itemList.getString("floor"),
//                        receiveManger = itemList.getString("receiveManger"),
//                        name = itemList.getString("name"),
//                        status = itemList.getString("status"),
//                        placement = itemList.getString("placement"),
//                        sort = itemList.getString("sort"),
//                        symbol = itemList.getString("symbol"),
//                        type = itemList.getString("type"),
//                        projectName = itemList.getString("projectName"),
//                        returnForm = itemList.getString("returnForm"),
//                        houseName = itemList.getString("houseName"),
//                        remarks = itemList.getString("remarks"),
//                        mailNumber= itemList.getString("mailNumber")
//                    )
                    // TODO("response to json object")
                    onRequestListener?.onSuccess(itemList)
                    Log.d(TAG, "" + itemList)
                }
            }
        })
    }

    //行事曆資訊
    fun GetYearCalendar(projectName: String, Year: String,listener: OnRequestListener) {
        onRequestListener = listener
        var request: Request? = null
        val builder = FormBody.Builder()
        builder.add("ProjectName", projectName)
        builder.add("Year", Year)
        val formBody = builder.build()
        request = Request.Builder()
            .method("POST",formBody)
            .url(baseUrl + "GetYearCalendar")
            .build()
        client?.newCall(request)?.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.d(TAG, "onFailure: " + e)
                onRequestListener?.onError()
            }

            lateinit var getYearCalendar: GetYearCalendar
            override fun onResponse(call: Call, response: Response) {
                val responseStr = response.body()?.string()

                if (responseStr == "null" || responseStr == "Error"){
                    onRequestListener?.onError()
                }else{
                    val itemList = JSONObject(responseStr)
                    getYearCalendar = GetYearCalendar(
                        calendarDate = itemList.getString("calendarDate"),
                        settingTime = itemList.getString("settingTime"),
                        title = itemList.getString("title"),
                        place = itemList.getString("place"),
                    )
                    // TODO("response to json object")
                    onRequestListener?.onSuccess(itemList)
                    Log.d(TAG, "" + itemList)
                }
            }
        })
    }

    //公告資訊
    fun GetUserAllAnnouncement(projectName: String ,listener: OnRequestListener) {
        onRequestListener = listener
        var request: Request? = null
        val builder = FormBody.Builder()
        builder.add("ProjectName", projectName)
        val formBody = builder.build()
        request = Request.Builder()
            .method("POST",formBody)
            .url(baseUrl + "GetUserAllAnnouncement")
            .build()
        client?.newCall(request)?.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.d(TAG, "onFailure: " + e)
                onRequestListener?.onError()
            }

            lateinit var getUserAllAnnouncement: GetUserAllAnnouncement
            override fun onResponse(call: Call, response: Response) {
                val responseStr = response.body()?.string()

                if (responseStr == "null" || responseStr == "Error"){
                    onRequestListener?.onError()
                }else{
                    val itemList = JSONObject(responseStr)
                    getUserAllAnnouncement = GetUserAllAnnouncement(
                        postTime = itemList.getString("postTime"),
                        type = itemList.getString("type"),
                        title = itemList.getString("title"),
                        announcer = itemList.getString("announcer"),
                        isTop = itemList.getBoolean("isTop"),
                        content = itemList.getString("content"),
                    )
                    // TODO("response to json object")
                    onRequestListener?.onSuccess(itemList)
                    Log.d(TAG, "" + itemList)
                }
            }
        })
    }

    //公設資訊
    fun UserGetAllAmenities(projectName: String,listener: OnRequestListener) {
        onRequestListener = listener
        var request: Request? = null
        val builder = FormBody.Builder()
        builder.add("ProjectName", projectName)
        val formBody = builder.build()
        request = Request.Builder()
            .method("POST",formBody)
            .url(baseUrl + "UserGetAllAmenities")
            .build()
        client?.newCall(request)?.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.d(TAG, "onFailure: " + e)
                onRequestListener?.onError()
            }

            lateinit var userGetAllAmenities: UserGetAllAmenities
            override fun onResponse(call: Call, response: Response) {
                val responseStr = response.body()?.string()


                if (responseStr == "null" || responseStr == "Error"){
                    onRequestListener?.onError()
                }else{
                    val itemList = JSONObject(responseStr)
                    userGetAllAmenities = UserGetAllAmenities(
                        amenitiesName = itemList.getString("amenitiesName"),
                        point = itemList.getString("point"),
                        costMode = itemList.getInt("costMode"),
                        reservationMode = itemList.getInt("reservationMode"),
                        costUnit = itemList.getInt("costUnit"),
                        timeLimit = itemList.getInt("timeLimit"),
                        accommodate = itemList.getInt("accommodate"),
                        content = itemList.getString("content"),
                        isOpen = itemList.getBoolean("isOpen"),
                        imageUrl = itemList.getString("imageUrl"),
                        identify = itemList.getString("identify")
                    )
                    // TODO("response to json object")
                    onRequestListener?.onSuccess(itemList)
                    Log.d(TAG, "" + itemList)
                }
            }
        })
    }

    //已預約時間人數
    fun UserGetDateReservation(projectName: String,AmenititesID: String,listener: OnRequestListener) {
        onRequestListener = listener
        var request: Request? = null
        val builder = FormBody.Builder()
        builder.add("ProjectName", projectName)
        builder.add("AmenititesID",AmenititesID)
        val formBody = builder.build()
        request = Request.Builder()
            .method("POST",formBody)
            .url(baseUrl + "UserGetDateReservation")
            .build()
        client?.newCall(request)?.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.d(TAG, "onFailure: " + e)
                onRequestListener?.onError()
            }

            lateinit var userGetDateReservation: UserGetDateReservation
            override fun onResponse(call: Call, response: Response) {
                val responseStr = response.body()?.string()

                if (responseStr == "null" || responseStr == "Error"){
                    onRequestListener?.onError()
                }else{
                    val itemList = JSONObject(responseStr)
                    userGetDateReservation = UserGetDateReservation(
                        date = itemList.getString("date"),
                        time = itemList.getString("time"),
                        people = itemList.getInt("people"),
                    )
                    // TODO("response to json object")
                    onRequestListener?.onSuccess(itemList)
                    Log.d(TAG, "" + itemList)
                }
            }
        })
    }

    //用戶公設預約
    fun UserAddNewReservation(projectName: String, AmenitiesName: String, AmenitiesIdentify:String,
                             ReservationDate:String, ReservationTime:String, Name:String, HouseName:String,
                             Floor:String, Symbol:String, ResidentSerialNumber:String, ReservationNumber:Int,
                             Point:Int, Identify:String, Time:String,listener: OnRequestListener) {
        onRequestListener = listener
        var request: Request? = null
        val builder = FormBody.Builder()
        builder.add("ProjectName", projectName)
        builder.add("AmenititesID",AmenitiesName)
        builder.add("AmenitiesIdentify",AmenitiesIdentify)
        builder.add("ReservationDate",ReservationDate)
        builder.add("ReservationTime",ReservationTime)
        builder.add("Name",Name)
        builder.add("HouseName",HouseName)
        builder.add("Floor",Floor)
        builder.add("Symbol",Symbol)
        builder.add("ResidentSerialNumber",ResidentSerialNumber)
        builder.add("ReservationNumber","")
        builder.add("Point","")
        builder.add("Identify",Identify)
        builder.add("Time",Time)
        val formBody = builder.build()
        request = Request.Builder()
            .method("POST",formBody)
            .url(baseUrl + "UserGetDateReservation")
            .build()
        client?.newCall(request)?.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.d(TAG, "onFailure: " + e)
                onRequestListener?.onError()
            }

//            lateinit var userAddNewReservation: UserAddNewReservation
            override fun onResponse(call: Call, response: Response) {
                val responseStr = response.body()?.string()


                if (responseStr == "null" || responseStr == "Error"){
                    onRequestListener?.onError()
                }else{
                    val itemList = JSONObject(responseStr)
                    //return: String (點數或"Error")
//                    )
                    // TODO("response to json object")
                    onRequestListener?.onSuccess(itemList)
                    Log.d(TAG, "" + itemList)
                }
            }
        })
    }

    //公設預約記錄
    fun GetUserALLRese(projectName: String, houseSerialNumber: String, listener: OnRequestListener) {
        onRequestListener = listener
        var request: Request? = null
        val builder = FormBody.Builder()
        builder.add("ProjectName", projectName)
        builder.add("HouseSerialNumber", houseSerialNumber)
        val formBody = builder.build()
        request = Request.Builder()
            .method("POST",formBody)
            .url(baseUrl + "GetUserALLRese")
            .build()
        client?.newCall(request)?.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.d(TAG, "onFailure: " + e)
                onRequestListener?.onError()
            }

            lateinit var getUserALLRese: GetUserALLRese
            override fun onResponse(call: Call, response: Response) {
                val responseStr = response.body()?.string()

                if (responseStr == "null" || responseStr == "Error"){
                    onRequestListener?.onError()
                }else{
                    val itemList = JSONObject(responseStr)
                    Log.d(TAG, "itemList: " + itemList )
                    getUserALLRese = GetUserALLRese(
                        reservationDate = itemList.getString("reservationDate"),
                        enterTime = itemList.getString("enterTime"),
                        leaveTime = itemList.getString("leaveTime"),
                        amenitiesName = itemList.getString("amenitiesName"),
                        reservationTime = itemList.getString("reservationTime"),
                        name = itemList.getString("name"),
                        residentSerialNumber = itemList.getString("residentSerialNumber"),
                        reservationNumber = itemList.getInt("reservationNumber"),
                        point = itemList.getInt("point"),
                        sort = itemList.getString("sort"),
                        identify = itemList.getString("identify"),
                        amenitiesID = itemList.getString("amenitiesID"),
                        amenitiesURL = itemList.getString("amenitiesURL"),
                    )
                    // TODO("response to json object")
                    onRequestListener?.onSuccess(itemList)
                    Log.d(TAG, "" + itemList)
                }
            }
        })
    }

    //用戶取消公設預約
    fun UserDeleteReservaion(projectName: String, ResSN: String, Point:Int, Time:String, Identify:String,listener: OnRequestListener) {
        onRequestListener = listener
        var request: Request? = null
        val builder = FormBody.Builder()
        builder.add("ProjectName", projectName)
        builder.add("ResSN",ResSN)
        builder.add("Point","")
        builder.add("Time",Time)
        builder.add("Identify",Identify)
        val formBody = builder.build()
        request = Request.Builder()
            .method("POST",formBody)
            .url(baseUrl + "UserDeleteReservaion")
            .build()
        client?.newCall(request)?.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.d(TAG, "onFailure: " + e)
                onRequestListener?.onError()
            }

            //lateinit var userDeleteReservaion: UserDeleteReservaion
            override fun onResponse(call: Call, response: Response) {
                val responseStr = response.body()?.string()

                if (responseStr == "null" || responseStr == "Error"){
                    onRequestListener?.onError()
                }else{
                    val itemList = JSONObject(responseStr)
                    //return: String (點數或"Error")
//                    )
                    // TODO("response to json object")
                    onRequestListener?.onSuccess(itemList)
                    Log.d(TAG, "" + itemList)
                }
            }
        })
    }

    //點數紀錄
    fun GetUserPointLog(projectName: String, houseSerialNumber: String,  listener: OnRequestListener) {
        onRequestListener = listener
        var request: Request? = null
        val builder = FormBody.Builder()
        builder.add("ProjectName", projectName)
        builder.add("HouseSerialNumber",houseSerialNumber)
        val formBody = builder.build()
        request = Request.Builder()
            .method("POST",formBody)
            .url(baseUrl + "GetUserPointLog")
            .build()
        client?.newCall(request)?.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.d(TAG, "onFailure: " + e)
                onRequestListener?.onError()
            }

            //lateinit var GetUserPointLog: GetUserPointLog
            override fun onResponse(call: Call, response: Response) {
                val responseStr = response.body()?.string()

                if (responseStr == "null" || responseStr == "Error"){
                    onRequestListener?.onError()
                }else{
                    val itemList = JSONObject(responseStr)
                    //TODO("response to json object")
//                    )
                    // TODO("response to json object")
                    onRequestListener?.onSuccess(itemList)
                    Log.d(TAG, "" + itemList)
                }
            }
        })
    }

    //意見留言資訊
    fun UserGetMessage(projectName: String, ResidentSN: String, listener: OnRequestListener) {
        onRequestListener = listener
        var request: Request? = null
        val builder = FormBody.Builder()
        builder.add("ProjectName", projectName)
        builder.add("ResidentSN", ResidentSN)
        val formBody = builder.build()
        request = Request.Builder()
            .method("POST",formBody)
            .url(baseUrl + "UserGetMessage")
            .build()
        client?.newCall(request)?.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.d(TAG, "onFailure: " + e)
                onRequestListener?.onError()
            }

            lateinit var userGetMessage: UserGetMessage
            override fun onResponse(call: Call, response: Response) {
                val responseStr = response.body()?.string()

                if (responseStr == "null" || responseStr == "Error"){
                    onRequestListener?.onError()
                }else{
                    val itemList = JSONObject(responseStr)
                    Log.d(TAG, "itemList: " + itemList )
                    userGetMessage = UserGetMessage(
                        title = itemList.getString("title"),
                        time = itemList.getString("time"),
                        messageID = itemList.getInt("messageID"),
                        sort = itemList.getString("sort"),
                        isUserRead = itemList.getBoolean("isUserRead")
                    )
                    // TODO("response to json object")
                    onRequestListener?.onSuccess(itemList)
                    Log.d(TAG, "" + itemList)
                }
            }
        })
    }

    //新增留言
    fun UserCreateMess(projectName: String, Time: String, Symbol:String,
                       Name:String, HouseName:String, HouseSerialNumber:String, Title:String,
                       Floor:String, MessageID:String, Content:String, listener: OnRequestListener) {
        onRequestListener = listener
        var request: Request? = null
        val builder = FormBody.Builder()
        builder.add("ProjectName", projectName)
        builder.add("Time",Time)
        builder.add("Symbol",Symbol)
        builder.add("Name",Name)
        builder.add("HouseName",HouseName)
        builder.add("HouseSerialNumber",HouseSerialNumber)
        builder.add("Title",Title)
        builder.add("Floor",Floor)
        builder.add("MessageID",MessageID)
        builder.add("Content",Content)
        val formBody = builder.build()
        request = Request.Builder()
            .method("POST",formBody)
            .url(baseUrl + "UserCreateMess")
            .build()
        client?.newCall(request)?.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.d(TAG, "onFailure: " + e)
                onRequestListener?.onError()
            }

            //lateinit var userCreateMess: UserCreateMess
            override fun onResponse(call: Call, response: Response) {
                val responseStr = response.body()?.string()

                if (responseStr == "null" || responseStr == "Error"){
                    onRequestListener?.onError()
                }else{
                    val itemList = JSONObject(responseStr)
                    //return: String("Successful"或"Error")
//                    )
                    // TODO("response to json object")
                    onRequestListener?.onSuccess(itemList)
                    Log.d(TAG, "" + itemList)
                }
            }
        })
    }

    //留言內容
    fun UserGetMessChat(projectName: String, MessageID: String, listener: OnRequestListener) {
        onRequestListener = listener
        var request: Request? = null
        val builder = FormBody.Builder()
        builder.add("ProjectName", projectName)
        builder.add("MessageID", MessageID)
        val formBody = builder.build()
        request = Request.Builder()
            .method("POST",formBody)
            .url(baseUrl + "UserGetMessChat")
            .build()
        client?.newCall(request)?.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.d(TAG, "onFailure: " + e)
                onRequestListener?.onError()
            }

            lateinit var userGetMessChat: UserGetMessChat
            override fun onResponse(call: Call, response: Response) {
                val responseStr = response.body()?.string()

                if (responseStr == "null" || responseStr == "Error"){
                    onRequestListener?.onError()
                }else{
                    val itemList = JSONObject(responseStr)
                    Log.d(TAG, "itemList: " + itemList )
                    userGetMessChat = UserGetMessChat(
                        content = itemList.getString("content"),
                        messageTime = itemList.getString("messageTime"),
                        isManager = itemList.getBoolean("isManager"),
                    )
                    // TODO("response to json object")
                    onRequestListener?.onSuccess(itemList)
                    Log.d(TAG, "" + itemList)
                }
            }
        })
    }

    //新增留言內容
    fun SendMessage(projectName: String, MessageTime: String, MessageID:String, Content:String, IsManager:Boolean, listener: OnRequestListener) {
        onRequestListener = listener
        var request: Request? = null
        val builder = FormBody.Builder()
        builder.add("ProjectName", projectName)
        builder.add("MessageTime",MessageTime)
        builder.add("MessageID",MessageID)
        builder.add("Content",Content)
        builder.add("IsManager","")
        val formBody = builder.build()
        request = Request.Builder()
            .method("POST",formBody)
            .url(baseUrl + "SendMessage")
            .build()
        client?.newCall(request)?.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.d(TAG, "onFailure: " + e)
                onRequestListener?.onError()
            }

            //lateinit var sendMessage: SendMessage
            override fun onResponse(call: Call, response: Response) {
                val responseStr = response.body()?.string()

                if (responseStr == "null" || responseStr == "Error"){
                    onRequestListener?.onError()
                }else{
                    val itemList = JSONObject(responseStr)
                    //return: String("Successful"或"Error")
//                    )
                    // TODO("response to json object")
                    onRequestListener?.onSuccess(itemList)
                    Log.d(TAG, "" + itemList)
                }
            }
        })
    }

    //當期瓦斯抄錶
    fun UserGetGas(projectName: String, HouseSN : String,listener: OnRequestListener) {
        onRequestListener = listener
        var request: Request? = null
        val builder = FormBody.Builder()
        builder.add("ProjectName", projectName)
        builder.add("HouseSN",HouseSN)
        val formBody = builder.build()
        request = Request.Builder()
            .method("POST",formBody)
            .url(baseUrl + "UserGetGas")
            .build()
        client?.newCall(request)?.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.d(TAG, "onFailure: " + e)
                onRequestListener?.onError()
            }

            lateinit var userGetGas: UserGetGas
            override fun onResponse(call: Call, response: Response) {
                val responseStr = response.body()?.string()

                if (responseStr == "null" || responseStr == "Error"){
                    onRequestListener?.onError()
                }else{
                    val itemList = JSONObject(responseStr)
                    userGetGas = UserGetGas(
                        openTime = itemList.getString("openTime"),
                        closeTime = itemList.getString("closeTime"),
                        identity = itemList.getString("identity"),
                        degree = itemList.getString("degree"),
                        isOpen = itemList.getBoolean("isOpen")
                    )
                    // TODO("response to json object")
                    onRequestListener?.onSuccess(itemList)
                    Log.d(TAG, "" + itemList)
                }
            }
        })
    }

    //上傳瓦斯度數
    fun RegisterGas(projectName: String, HouseSN: String, BookTime:String, Booker:String, Degree:String, GasID:String,  listener: OnRequestListener) {
        onRequestListener = listener
        var request: Request? = null
        val builder = FormBody.Builder()
        builder.add("ProjectName", projectName)
        builder.add("HouseSN",HouseSN)
        builder.add("BookTime",BookTime)
        builder.add("Booker",Booker)
        builder.add("Degree",Degree)
        builder.add("GasID",GasID)
        val formBody = builder.build()
        request = Request.Builder()
            .method("POST",formBody)
            .url(baseUrl + "RegisterGas")
            .build()
        client?.newCall(request)?.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.d(TAG, "onFailure: " + e)
                onRequestListener?.onError()
            }

            //lateinit var registerGas: RegisterGas
            override fun onResponse(call: Call, response: Response) {
                val responseStr = response.body()?.string()

                if (responseStr == "null" || responseStr == "Error"){
                    onRequestListener?.onError()
                }else{
                    val itemList = JSONObject(responseStr)
                    //return: String("Successful"或"Error")
//                    )
                    // TODO("response to json object")
                    onRequestListener?.onSuccess(itemList)
                    Log.d(TAG, "" + itemList)
                }
            }
        })
    }

    //瓦斯抄錶紀錄
    fun UserGetGasLog(projectName: String, HouseSN: String,listener: OnRequestListener) {
        onRequestListener = listener
        var request: Request? = null
        val builder = FormBody.Builder()
        builder.add("ProjectName", projectName)
        builder.add("HouseSN", HouseSN)
        val formBody = builder.build()
        request = Request.Builder()
            .method("POST",formBody)
            .url(baseUrl + "UserGetGasLog")
            .build()
        client?.newCall(request)?.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.d(TAG, "onFailure: " + e)
                onRequestListener?.onError()
            }

            lateinit var userGetGasLog: UserGetGasLog
            override fun onResponse(call: Call, response: Response) {
                val responseStr = response.body()?.string()

                if (responseStr == "null" || responseStr == "Error"){
                    onRequestListener?.onError()
                }else{
                    val itemList = JSONObject(responseStr)
                    userGetGasLog = UserGetGasLog(
                        degree = itemList.getString("degree"),
                        openTime = itemList.getString("openTime"),
                        closeTime = itemList.getString("closeTime")
                    )
                    // TODO("response to json object")
                    onRequestListener?.onSuccess(itemList)
                    Log.d(TAG, "" + itemList)
                }
            }
        })
    }

    //當期管理費
    fun UserGetMagFee(listener: OnRequestListener) {
        onRequestListener = listener
        var request: Request? = null
        val builder = FormBody.Builder()
        val formBody = builder.build()
        request = Request.Builder()
            .method("POST",formBody)
            .url(baseUrl + "UserGetMagFee")
            .build()
        client?.newCall(request)?.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.d(TAG, "onFailure: " + e)
                onRequestListener?.onError()
            }

            lateinit var userGetMagFee: UserGetMagFee
            override fun onResponse(call: Call, response: Response) {
                val responseStr = response.body()?.string()

                if (responseStr == "null" || responseStr == "Error"){
                    onRequestListener?.onError()
                }else{
                    val itemList = JSONObject(responseStr)
                    userGetMagFee = UserGetMagFee(
                        title = itemList.getString("title"),
                        closeTime = itemList.getString("closeTime"),
                        identify = itemList.getString("identify"),
                        isOpen = itemList.getBoolean("isOpen"),
                        magFee = itemList.getString("magFee"),
                        oneBarCode = itemList.getString("oneBarCode"),
                        twoBarCode = itemList.getString("twoBarCode"),
                        threeBarCode = itemList.getString("threeBarCode"),
                        isPay = itemList.getBoolean("isPay"),
                    )
                    // TODO("response to json object")
                    onRequestListener?.onSuccess(itemList)
                    Log.d(TAG, "" + itemList)
                }
            }
        })
    }

    //變更用戶名稱
    fun UpdateUserName(projectName: String, ResidentSerialNumber: String, Name:String, listener: OnRequestListener) {
        onRequestListener = listener
        var request: Request? = null
        val builder = FormBody.Builder()
        builder.add("ProjectName", projectName)
        builder.add("ResidentSerialNumber",ResidentSerialNumber)
        builder.add("Name",Name)
        val formBody = builder.build()
        request = Request.Builder()
            .method("POST",formBody)
            .url(baseUrl + "UpdateUserName")
            .build()
        client?.newCall(request)?.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.d(TAG, "onFailure: " + e)
                onRequestListener?.onError()
            }

            //lateinit var updateUserName: UpdateUserName
            override fun onResponse(call: Call, response: Response) {
                val responseStr = response.body()?.string()
                
                if (responseStr == "null" || responseStr == "Error"){
                    onRequestListener?.onError()
                }else{
                    val itemList = JSONObject(responseStr)
                    //return: String("Successful"或"Error")
//                    )
                    // TODO("response to json object")
                    onRequestListener?.onSuccess(itemList)
                    Log.d(TAG, "" + itemList)
                }
            }
        })
    }

    interface OnRequestListener {
        fun onSuccess(result: Any)
        fun onError()
    }
}

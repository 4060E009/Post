import android.util.Log
import okhttp3.*
import org.json.JSONObject
import java.io.IOException

val TAG = "HTTP Test"


class httpAPI() {

    interface OnRequestListener {
        fun onSuccess(result: Any)
        fun onError()
    }

    val baseUrl = "https://asia-east2-ductech-cms.cloudfunctions.net/"
    var client: OkHttpClient? = null
    var request: Request? = null
    val builder = FormBody.Builder()

    init {
        client = OkHttpClient()
    }

    public var onRequestListener : OnRequestListener? = null

    fun getUserMail(name: String, number: String, listener: OnRequestListener) {
        builder.add("ProjectName",  name)
        builder.add("HouseSerialNumber",  number)
        val formBody = builder.build()
        request = Request.Builder()
            .method("POST", formBody)
            .url( baseUrl + "GetAllProjectName")
            .build()

        this.onRequestListener = listener

        client?.newCall(request)?.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.d(TAG, "onFailure: " + e)
                onRequestListener?.onError()
            }

            override fun onResponse(call: Call, response: Response) {
                val responseStr = response.body()?.string()
                val itemList = JSONObject(responseStr)

                onRequestListener?.onSuccess(itemList)
            }
        })
    }


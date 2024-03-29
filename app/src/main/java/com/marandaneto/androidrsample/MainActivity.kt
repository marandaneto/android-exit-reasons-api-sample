package com.marandaneto.androidrsample

import android.app.ActivityManager
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import java.io.BufferedReader
import kotlin.text.Charsets.UTF_8

//import java.lang.RuntimeException

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val am = applicationContext.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager

//        pid should be 0, a value of 0 means to ignore this parameter and return all matching records
//        maxNum should be 1, The maximum number of results to be returned, as we need only the last one
        val exits = am.getHistoricalProcessExitReasons(applicationContext.packageName, 0, 1)

        val textView = findViewById<TextView>(R.id.textView)

//        it can be empty if no historical process exit reasons
        if (exits.isNotEmpty()) {
//            https://developer.android.com/reference/kotlin/android/app/ApplicationExitInfo
            val lastExitInfo = exits.first()

            textView.text = lastExitInfo.toString()

            Log.d(TAG, "reason: ${lastExitInfo.reason}")

//            in milliseconds since the epoch
            Log.d(TAG, "timestamp: ${lastExitInfo.timestamp}")

            lastExitInfo.description?.let {
                Log.d(TAG, "description: $it")
            }

            lastExitInfo.traceInputStream?.let { inputStream ->
                val content = inputStream.bufferedReader().use(BufferedReader::readText)
                Log.d(TAG, "traceInputStream: $content")
            }
            lastExitInfo.processStateSummary?.let {
                val content = it.toString(UTF_8)
                Log.d(TAG, "processStateSummary: $content")
            }
        }

        textView.setOnClickListener {
//            simulate crash
//            throw RuntimeException("error")

//            simulate system exit
//            System.exit(0)

//            simulate ANR
            Thread.sleep(15000)

//            simulate segfault
//            crash()
        }
    }

    companion object {
        init {
            System.loadLibrary("native-sample")
        }
        private const val TAG = "MainActivity"
    }

    private external fun crash()
}

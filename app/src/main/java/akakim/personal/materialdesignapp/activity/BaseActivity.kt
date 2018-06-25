package akakim.personal.materialdesignapp.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by RyoRyeong Kim on 2018-06-25.
 */


open class BaseActivity : AppCompatActivity(){

    override fun startActivity(intent: Intent?) {
        super.startActivity(intent)

        overridePendingTransition( android.R.anim.slide_in_left, android.R.anim.slide_out_right )
    }

    override fun startActivity(intent: Intent?, options: Bundle?) {
        super.startActivity(intent, options)

        overridePendingTransition( android.R.anim.slide_in_left, android.R.anim.slide_out_right )
    }
}
package akakim.personal.materialdesignapp.data

import akakim.personal.materialdesignapp.activity.BaseActivity
import android.app.Activity

/**
 * Created by RyoRyeong Kim on 2018-06-25.
 */

class MainData : BaseViewType{
    val activityClazz : Class< out BaseActivity>
    val content : String

    constructor(activityClazz: Class< out  BaseActivity>, content: String) {
        this.activityClazz = activityClazz
        this.content = content
    }
}
package akakim.personal.materialdesignapp.data

/**
 * Created by RyoRyeong Kim on 2018-06-25.
 *
 * TODO : enum class를 이용하여 컴파일 시간에 View Type을 제한하도록하자.ㅏ
 */

open interface SimpleViewType{


//    * TODO : enum class를 이용하여 컴파일 시간에 View Type을 제한하도록하자.ㅏ
    companion object {
       open val SIMPLE_TEXT_VIEW = 0
    }

    fun getViewType() : Int
}


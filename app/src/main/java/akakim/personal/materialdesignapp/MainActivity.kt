package akakim.personal.materialdesignapp

import akakim.personal.materialdesignapp.activity.BaseActivity
import akakim.personal.materialdesignapp.adapter.MainAdapter
import akakim.personal.materialdesignapp.data.MainData
import akakim.personal.materialdesignapp.sample.RallyThemeActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {


    val mainData : ArrayList<MainData>

    init {
        mainData = ArrayList<MainData>()
        mainData.add( MainData(RallyThemeActivity::class.java ,"Rally테마 클래스 "))
        mainData.add( MainData(RallyThemeActivity::class.java ,"Rally테마 클래스 "))
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvDesignList.layoutManager = LinearLayoutManager(this )

        rvDesignList.adapter = MainAdapter(this, mainData )

        val itemDeco = DividerItemDecoration(this,DividerItemDecoration.VERTICAL)

        rvDesignList.addItemDecoration( itemDeco )





    }
}

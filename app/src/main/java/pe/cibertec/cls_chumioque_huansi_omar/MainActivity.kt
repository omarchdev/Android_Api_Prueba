package pe.cibertec.cls_chumioque_huansi_omar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pe.cibertec.cls_chumioque_huansi_omar.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}
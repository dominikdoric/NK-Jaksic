package hr.aktivnosti

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hr.dominik.nkjaki.R

class MomcadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_momcad)
        setSupportActionBar(findViewById(R.id.toolbarMomcad))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        title = "Momcad"
    }
}
package hr.pokusMomcad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hr.dominik.nkjaki.R

class PokusMomcadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokus_momcad)
        setSupportActionBar(findViewById(R.id.toolbarPokusMomcad))
        title = "Pokus Momcad"
    }
}
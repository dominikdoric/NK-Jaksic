package hr.aktivnosti

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hr.dominik.nkjaki.R

class VijestiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vijesti)
        setSupportActionBar(findViewById(R.id.toolbarVijesti))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        title="Vijesti"
    }
}
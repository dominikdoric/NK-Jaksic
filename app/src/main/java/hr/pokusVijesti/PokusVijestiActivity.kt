package hr.pokusVijesti

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hr.dominik.nkjaki.R

class PokusVijestiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokus_vijesti)
        setSupportActionBar(findViewById(R.id.toolbarPokusVijesti))
        title = "Pokus Vijesti"
    }
}
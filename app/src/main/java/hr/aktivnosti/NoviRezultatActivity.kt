package hr.aktivnosti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import hr.NovaVijestActivity
import hr.dominik.nkjaki.R

class NoviRezultatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_novi_rezultat)
        setSupportActionBar(findViewById(R.id.toolbarNoviRezultat))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        title = "Dodaj novi rezultat"
    }
}
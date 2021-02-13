package hr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.room.Room
import hr.aktivnosti.*
import hr.database.Igraci
import hr.database.NKJaksicDatabase
import hr.dominik.nkjaki.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

       val datebase = Room.databaseBuilder(
               this,NKJaksicDatabase::class.java,"nk_jaksic_baza"
       )
               .allowMainThreadQueries()
               .build()

        datebase.igraciDao().insertIgrac(Igraci(0,"Domagoj","Kovačević",5))

        val drawerToggle = ActionBarDrawerToggle(this,drawer, R.string.open, R.string.close)
        drawer.addDrawerListener(drawerToggle)
        drawerToggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navigation_view.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.nav_rezultati ->{
                    val intent = Intent(this,RezultatiActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.nav_raspored ->{
                    val intent = Intent(this, RasporedActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.nav_tablica ->{
                    val intent = Intent(this, TablicaActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.nav_vijesti ->{
                    val intent = Intent(this, VijestiActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.nav_momcad ->{
                    val intent = Intent(this,MomcadActivity::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home ->{
                drawer.openDrawer(GravityCompat.START)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START)
        }else{
            super.onBackPressed()
        }
    }



}
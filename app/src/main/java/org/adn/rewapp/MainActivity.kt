package org.adn.rewapp

import android.app.admin.SystemUpdatePolicy
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import org.adn.rewapp.ui.*


class MainActivity : AppCompatActivity() {

   //lateinit var toolbar: ActionBar

    //Cambiar fragment al dar click
    //Cada itemId proviene del archivo navigation
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_gana -> {
                //toolbar.title = "Gana"
                val ganaFragment = Gana.newInstance()
                openFragment(ganaFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_comparte -> {
                //toolbar.title = "Comparte"
                val comparteFragment = Comparte.newInstance()
                openFragment(comparteFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_ranking -> {
                //toolbar.title = "Ranking"
                val rankingFragment = Ranking.newInstance()
                openFragment(rankingFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_canjea -> {
                //toolbar.title = "Canjea"
                val canjeaFragment = Canjea.newInstance()
                openFragment(canjeaFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_inicio -> {
                //toolbar.title = "Inicio"
                val inicioFragment = Inicio.newInstance()
                openFragment(inicioFragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    //Dar foco a fragment
    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //toolbar = supportActionBar!!
        //toolbar.title = "REWAPP"
        //toolbar.setIcon(R.drawable.ic_monetization_on_black_24dp)
        //toolbar.setDisplayShowHomeEnabled(true)
        val bottomNavigation: BottomNavigationView = findViewById(R.id.navigationView)

        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

    }
}
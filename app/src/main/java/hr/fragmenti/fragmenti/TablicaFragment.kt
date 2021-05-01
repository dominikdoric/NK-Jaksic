package hr.fragmenti.fragmenti

import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.tabs.TabLayout
import dagger.hilt.android.AndroidEntryPoint
import hr.dominik.nkjaki.R
import hr.dominik.nkjaki.databinding.FragmentTablicaBinding

@AndroidEntryPoint
class TablicaFragment : Fragment(R.layout.fragment_tablica) {

    private lateinit var binding: FragmentTablicaBinding
    private lateinit var tabLayout: TabLayout
    private lateinit var frameLayout: FrameLayout
    private lateinit var fragment: Fragment
    var fragmentManager: FragmentManager? = null
    private lateinit var fragmentTransaction: FragmentTransaction

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTablicaBinding.bind(view)

        fragment = TablicaTablicaFragment()
        fragmentManager = supp

    }
}
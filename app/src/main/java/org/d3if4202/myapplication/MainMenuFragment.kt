package org.d3if4202.myapplication


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import org.d3if4202.myapplication.databinding.FragmentMainMenuBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class MainMenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentMainMenuBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_main_menu, container, false)
        binding.apply {
            btnPeresegipanjang.setOnClickListener (
                Navigation.createNavigateOnClickListener(R.id.action_mainMenuFragment_to_persegiPanjangFragment)
            )

            btnSegitiga.setOnClickListener (
                Navigation.createNavigateOnClickListener(R.id.action_mainMenuFragment_to_segitigaFragment)
            )
        }

        setHasOptionsMenu(true)
        return binding.root
    }

}

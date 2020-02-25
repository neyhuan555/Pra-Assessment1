package org.d3if4202.myapplication


import android.content.ActivityNotFoundException
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.ShareCompat
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_persegi_panjang.*
import org.d3if4202.myapplication.databinding.FragmentPersegiPanjangBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class PersegiPanjangFragment : Fragment() {
    var panjang = 0
    var lebar = 0
    var luas = 0
    var keliling = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentPersegiPanjangBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_persegi_panjang, container, false)
        if (savedInstanceState != null) {
            panjang = savedInstanceState.getInt("panjang_key", 0)
            lebar = savedInstanceState.getInt("lebar_key", 0)
            luas = savedInstanceState.getInt("luas_key", 0)
            keliling = savedInstanceState.getInt("keliling_key", 0)
        }
        binding.apply {
            binding.etPanjangPersegipanjang.setText(panjang.toString())
            binding.etLebarPersegipanjang.setText(lebar.toString())
            binding.tvLuasPersegipanjang.setText(luas.toString())
            binding.tvKelilingPersegipanjang.setText(keliling.toString())
            btnHitungPersegipanjang.setOnClickListener {
                panjang = etPanjangPersegipanjang.text.toString().toInt()
                lebar = etLebarPersegipanjang.text.toString().toInt()
                luas = etPanjangPersegipanjang.text.toString().toInt() * etLebarPersegipanjang.text.toString().toInt()
                keliling = 2 * (etPanjangPersegipanjang.text.toString().toInt() + etLebarPersegipanjang.text.toString().toInt())

                tvLuasPersegipanjang.setText(luas.toString())
                tvKelilingPersegipanjang.setText(keliling.toString())
            }

            btnSharePersegipanjang.setOnClickListener {
//                val shareIntent = ShareCompat.IntentBuilder.from(this)
//                    .setText(getString(R.string.share_text, dessertsSold, revenue))
//                    .setType("text/plain")
//                    .intent
//                try {
//                    startActivity(shareIntent)
//                } catch (ex: ActivityNotFoundException) {
//                    Toast.makeText(this, "Sharing not available!",
//                        Toast.LENGTH_LONG).show()
//                }
            }
        }

        return binding.root
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt("panjang_key", panjang)
        outState.putInt("lebar_key", lebar)
        outState.putInt("luas_key", luas)
        outState.putInt("keliling_key", keliling)
        super.onSaveInstanceState(outState)
    }

}

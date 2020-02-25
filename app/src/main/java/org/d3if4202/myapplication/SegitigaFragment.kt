package org.d3if4202.myapplication


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import org.d3if4202.myapplication.databinding.FragmentSegitigaBinding
import kotlin.math.sqrt


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class SegitigaFragment : Fragment() {
    var alas = 0
    var tinggi = 0
    var luas = 0
    var keliling = 0.0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentSegitigaBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_persegi_panjang, container, false)
        if (savedInstanceState != null) {
            alas = savedInstanceState.getInt("alas_key", 0)
            tinggi = savedInstanceState.getInt("tinggi_key", 0)
            luas = savedInstanceState.getInt("luas_key", 0)
            keliling = savedInstanceState.getDouble("keliling_key", 0.0)
        }
        binding.apply {
            binding.etAlasSegitiga.setText(alas.toString())
            binding.etTinggiSegitiga.setText(tinggi.toString())
            binding.tvLuasSegitiga.setText(luas.toString())
            binding.tvKelilingSegitiga.setText(keliling.toString())
            btnHitungSegitiga.setOnClickListener {
                alas = etAlasSegitiga.text.toString().toInt()
                tinggi = etTinggiSegitiga.text.toString().toInt()
                val miring = sqrt(((alas * alas) + (tinggi * tinggi)).toDouble())
                luas = (etAlasSegitiga.text.toString().toInt() * etTinggiSegitiga.text.toString().toInt())/2
                keliling = etAlasSegitiga.text.toString().toInt() + etTinggiSegitiga.text.toString().toInt() + miring

                tvLuasSegitiga.setText(luas.toString())
                tvKelilingSegitiga.setText(keliling.toString())
            }

            btnShareSegitiga.setOnClickListener {
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
        outState.putInt("alas_key", alas)
        outState.putInt("tinggi_key", tinggi)
        outState.putInt("luas_key", luas)
        outState.putDouble("keliling_key", keliling)
        super.onSaveInstanceState(outState)
    }
}

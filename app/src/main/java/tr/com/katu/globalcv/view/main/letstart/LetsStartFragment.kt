package tr.com.katu.globalcv.view.main.letstart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import tr.com.katu.globalcv.R
import tr.com.katu.globalcv.databinding.FragmentCreateMyResumeBinding
import tr.com.katu.globalcv.databinding.FragmentLetsStartBinding


class LetsStartFragment : Fragment() {


    private var _binding : FragmentLetsStartBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentLetsStartBinding.inflate(inflater, container, false)

        binding.btnLetsStart.setOnClickListener {
            val navHostFragment =
                activity?.supportFragmentManager?.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
            val navController = navHostFragment.navController

            navController.navigate(R.id.action_letsStartFragment_to_personalFragment)

        }

        return binding.root
    }

}
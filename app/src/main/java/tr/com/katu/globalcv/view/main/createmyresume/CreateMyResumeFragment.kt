package tr.com.katu.globalcv.view.main.createmyresume

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import tr.com.katu.globalcv.R
import tr.com.katu.globalcv.databinding.FragmentCreateMyResumeBinding


class CreateMyResumeFragment : Fragment() {

    private var _binding : FragmentCreateMyResumeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentCreateMyResumeBinding.inflate(inflater, container, false)

        binding.btnCreateMyResume.setOnClickListener {
            val navHostFragment =
                activity?.supportFragmentManager?.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
            val navController = navHostFragment.navController

            navController.navigate(R.id.action_createMyResumeFragment_to_letsStartFragment)

        }



        return binding.root
    }


}
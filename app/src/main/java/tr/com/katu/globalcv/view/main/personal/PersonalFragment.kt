package tr.com.katu.globalcv.view.main.personal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import tr.com.katu.globalcv.R
import tr.com.katu.globalcv.databinding.FragmentLetsStartBinding
import tr.com.katu.globalcv.databinding.FragmentPersonalBinding


class PersonalFragment : Fragment() {

    private var _binding : FragmentPersonalBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentPersonalBinding.inflate(inflater, container, false)

        return binding.root
    }


}
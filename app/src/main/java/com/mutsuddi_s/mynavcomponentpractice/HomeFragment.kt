package com.mutsuddi_s.mynavcomponentpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.mutsuddi_s.mynavcomponentpractice.databinding.FragmentHomeBinding


class HomeFragment : Fragment(R.layout.fragment_home)
{
    // assign the _binding variable initially to null and
    // also when the view is destroyed again it has to be set to null
    private var _binding: FragmentHomeBinding? = null

    // with the backing property of the kotlin we extract
    // the non null value of the _binding
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController=findNavController()

        binding.btnViewBalance.setOnClickListener {
            navController.navigate(R.id.viewBalanceFragment)

        }
        binding.btnViewTransection.setOnClickListener {
            navController.navigate(R.id.viewTransectionFragment)

        }
        binding.btnSendMoney.setOnClickListener {
            navController.navigate(R.id.chooseReceiverFragment)

        }


    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
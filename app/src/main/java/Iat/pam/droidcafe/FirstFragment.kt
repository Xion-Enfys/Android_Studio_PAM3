package Iat.pam.droidcafe

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import Iat.pam.droidcafe.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Gunakan ID dari XML
        binding.donut.setOnClickListener {
            displayToast(getString(R.string.donut_order_message))
        }

        binding.iceCream.setOnClickListener {
            displayToast(getString(R.string.ice_cream_order_message))
        }

        binding.froyo.setOnClickListener {
            displayToast(getString(R.string.froyo_order_message))
        }

    }

    private fun displayToast(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

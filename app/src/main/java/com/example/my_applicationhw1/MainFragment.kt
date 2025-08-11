package com.example.my_applicationhw1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.my_applicationhw1.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private  lateinit var binding: FragmentMainBinding
    private  var adapter = AnimalAdapter()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater,container,false)
        return binding.root;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvAnimal.adapter =  adapter
    }

    companion object{

    }

}
package com.example.my_applicationhw1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.bumptech.glide.Glide
import com.example.my_applicationhw1.databinding.ItemAnimalBinding

class AnimalAdapter:Adapter<AnimalAdapter.ViewHolder>() {
    val animalList = arrayListOf<AnimalModel>(
        AnimalModel(title= "Ilgiz",desc= "0555253552", img = "https://static.vecteezy.com/system/resources/previews/057/068/323/non_2x/single-fresh-red-strawberry-on-table-green-background-food-fruit-sweet-macro-juicy-plant-image-photo.jpg"),
        AnimalModel(title= "Aktilek",desc= "0555253552", img = "https://static.vecteezy.com/system/resources/previews/057/068/323/non_2x/single-fresh-red-strawberry-on-table-green-background-food-fruit-sweet-macro-juicy-plant-image-photo.jpg"),
        AnimalModel(title= "Asel",desc= "0555253552", img = "https://static.vecteezy.com/system/resources/previews/057/068/323/non_2x/single-fresh-red-strawberry-on-table-green-background-food-fruit-sweet-macro-juicy-plant-image-photo.jpg"),
        AnimalModel(title= "Aida",desc= "0555253552", img = "https://static.vecteezy.com/system/resources/previews/057/068/323/non_2x/single-fresh-red-strawberry-on-table-green-background-food-fruit-sweet-macro-juicy-plant-image-photo.jpg"),
        AnimalModel(title= "Gulzhamal",desc= "0555253552", img = "https://static.vecteezy.com/system/resources/previews/057/068/323/non_2x/single-fresh-red-strawberry-on-table-green-background-food-fruit-sweet-macro-juicy-plant-image-photo.jpg"),
        AnimalModel(title= "Aibek",desc= "0555253552", img = "https://static.vecteezy.com/system/resources/previews/057/068/323/non_2x/single-fresh-red-strawberry-on-table-green-background-food-fruit-sweet-macro-juicy-plant-image-photo.jpg"),
        AnimalModel(title= "Nurzhaml",desc= "0555253552", img = "https://static.vecteezy.com/system/resources/previews/057/068/323/non_2x/single-fresh-red-strawberry-on-table-green-background-food-fruit-sweet-macro-juicy-plant-image-photo.jpg"),
        AnimalModel(title= "Gulnara",desc= "0555253552", img = "https://static.vecteezy.com/system/resources/previews/057/068/323/non_2x/single-fresh-red-strawberry-on-table-green-background-food-fruit-sweet-macro-juicy-plant-image-photo.jpg"),
        AnimalModel(title= "Aizhamal",desc= "0555253568", img = "https://static.vecteezy.com/system/resources/previews/057/068/323/non_2x/single-fresh-red-strawberry-on-table-green-background-food-fruit-sweet-macro-juicy-plant-image-photo.jpg"))


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        return ViewHolder(ItemAnimalBinding.inflate(LayoutInflater.from(parent.context),
            parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int){
        holder.onBind(animalList[position])
    }

    override fun getItemCount(): Int {
       return animalList.size;
    }

    class ViewHolder(private val binding: ItemAnimalBinding): RecyclerView.ViewHolder(binding.root){
        fun onBind(animalModel:AnimalModel){
            binding.tvTitle.text = animalModel.title
            binding.tvDesc.text = animalModel.desc
            Glide.with(binding.ivPhoto).load(animalModel.img).into(binding.ivPhoto);


        }
    }
}
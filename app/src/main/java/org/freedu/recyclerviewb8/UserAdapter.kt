package org.freedu.recyclerviewb8

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.freedu.recyclerviewb8.databinding.ItemFlagBinding

class UserAdapter(private val userList: List<User>) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    inner class UserViewHolder(val binding: ItemFlagBinding ): RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = ItemFlagBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {

        val currentUser = userList[position]

        holder.binding.userName.text = currentUser.name
        holder.binding.phoneNum.text = currentUser.phone
        holder.binding.profileImage.setImageResource(currentUser.image)



    }

    override fun getItemCount(): Int {
        return userList.size
    }


}
package io.trell.myapplicationapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.contains
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.NetworkPolicy
import com.squareup.picasso.Picasso
import io.trell.myapplicationapp.databinding.ContactListItemBinding

class ContactRvAdapter(var contactList:List<contact>):
    RecyclerView.Adapter<ContactsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
           var binding =ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
      var contactsViewHolder=ContactsViewHolder(binding)
        return contactsViewHolder
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
      var currentcontact=contactList.get(position)
        holder.binding.tvName.text=currentcontact.name
        holder.binding.tvPhoneNumber.text=currentcontact.phoneNumber
        holder.binding.tvEmail.text=currentcontact.email
        holder.binding.tvAddress.text=currentcontact.address
        Picasso.get().load(currentcontact.image)
            .networkPolicy(NetworkPolicy.OFFLINE)
            .error(R.drawable.ic_baseline_error_outline_24)
            .placeholder(R.drawable.ic_baseline_person_24)
            .resize(300,300)
            .centerCrop()
            .into(holder.binding.imgcontact)

        val context=holder.itemView.context
        holder.binding.imgcontact.setOnClickListener {
            Toast.makeText(context,"you have clicked on${currentcontact.name}'s the image",Toast.LENGTH_SHORT).show()
        }
        holder.binding.cvContact.setOnClickListener{
            val intent=Intent(context,ViewContactActivity::class.java)
            intent.putExtra("NAME",currentcontact.name)
            intent.putExtra("EMAIL",currentcontact.email)
            intent.putExtra("PHONENUMBER",currentcontact.phoneNumber)
            intent.putExtra("ADDRESS",currentcontact.email)
            intent.putExtra("IMAGE",currentcontact.image)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}
class ContactsViewHolder(var binding:ContactListItemBinding):RecyclerView.ViewHolder(binding.root)
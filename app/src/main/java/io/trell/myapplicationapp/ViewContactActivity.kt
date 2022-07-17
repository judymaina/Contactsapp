package io.trell.myapplicationapp

import android.location.Address
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.squareup.picasso.Picasso
import io.trell.myapplicationapp.databinding.ActivityViewContactBinding

class ViewContactActivity : AppCompatActivity() {
    lateinit var binding:ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     binding=ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }
    fun getExtras(){
        val extras=intent.extras
        val name=extras?.getString("NAME","")
        val email=extras?.getString("EMAIL","")
        val phonenumber=extras?.getString("PHONENUMBER","")
        val address=extras?.getString("ADDRESS","")
        val image=binding.ivperson

        Toast.makeText(this,"$name: $email: $phonenumber: $address",Toast.LENGTH_LONG).show()
        binding.tvname.text=name
        binding.tvnumber.text=phonenumber
        binding.tvemail.text=email




        Picasso.get().load(intent.getStringExtra("IMAGE")).into(image)
    }
}
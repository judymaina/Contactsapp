package io.trell.myapplicationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import io.trell.myapplicationapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }
    fun displayContacts(){
        var contact1=contact("Abby","0797239759","trellmaina","616 korongo","https://img.freepik.com/premium-photo/happy-loving-family-portrait-cheerful-african-american-man-woman-girl-sitting-couch-home-posing-photo-waving-hands-camera-smiling-young-black-people_568137-156.jpg?size=626&ext=jpg&ga=GA1.2.1177528936.1655476924")
        var contact2=contact("Judy","0772782437","wainainamaina","616 korongo","https://img.freepik.com/premium-photo/young-millennials-african-friends-walking-city-happy-black-people-having-fun-together-generation-z-friendship-concept_151355-8542.jpg?size=626&ext=jpg&ga=GA1.2.1177528936.1655476924")
        var contact3=contact("Judy","0772782437","wainainamaina","616 korongo","https://img.freepik.com/free-photo/surprised-playful-touched-good-looking-african-american-woman-glasses-stylish-brown-t-shirt-clasping-hands-smiling-from-joy-excitement-liking-great-show_176420-23322.jpg?size=626&ext=jpg&ga=GA1.2.1177528936.1655476924")
        var contact4=contact("Judy","0772782437","wainainamaina","616 korongo","https://img.freepik.com/free-photo/front-view-smiley-couple-posing-together-having-fun_23-2148850943.jpg?size=626&ext=jpg&ga=GA1.2.1177528936.1655476924")
        var contact5=contact("Judy","0772782437","wainainamaina","616 korongo","https://img.freepik.com/free-photo/cheerful-teenager-with-toothy-smile-afro-hairstyle-holds-modern-cell-phone-chats-online-with-boyfriend_273609-30470.jpg?size=626&ext=jpg&ga=GA1.2.1177528936.1655476924")
        var contact6=contact("Judy","0772782437","wainainamaina","616 korongo","https://img.freepik.com/free-photo/young-cheerful-stylish-african-american-woman-dances-with-hands-raised-enjoys-celebrating-party-wears-fashionable-blue-dress-moves_273609-43423.jpg?size=626&ext=jpg&ga=GA1.2.1177528936.1655476924")
        var contact7=contact("Judy","0772782437","wainainamaina","616 korongo","https://img.freepik.com/free-photo/side-view-couple-with-copy-space_23-2148850945.jpg?size=626&ext=jpg&ga=GA1.2.1177528936.1655476924")
        var contact8=contact("Judy","0772782437","wainainamaina","616 korongo","https://img.freepik.com/free-photo/young-delivery-girl-blue-uniform-cap-clenching-fists-hapy-excited-standing-orange-wall_141793-63706.jpg?size=626&ext=jpg&ga=GA1.2.1177528936.1655476924")

        var contactList=
        listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8)
        var contactAdapter=ContactRvAdapter(contactList)
        binding.rvcontact.layoutManager=LinearLayoutManager(this)
        binding.rvcontact.adapter=contactAdapter
    }

}
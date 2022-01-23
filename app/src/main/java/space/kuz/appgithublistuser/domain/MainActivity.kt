package space.kuz.appgithublistuser.domain

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import space.kuz.appgithublistuser.R
import space.kuz.appgithublistuser.data.repo.UserRepository
import space.kuz.appgithublistuser.databinding.ActivityMainBinding
import space.kuz.appgithublistuser.ui.fragment.UserListFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val fragment = UserListFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_main, fragment)
        transaction.disallowAddToBackStack()
        transaction.commit()
    }
}
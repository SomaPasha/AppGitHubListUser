package space.kuz.appgithublistuser.domain

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import space.kuz.appgithublistuser.data.repo.UserRepository
import space.kuz.appgithublistuser.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    private  val  theMovieRepo: UserRepository by lazy {app.userRepo}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        app.fillUserRepo()
        binding.userTextView.text = theMovieRepo.getUser().toString()
    }
}
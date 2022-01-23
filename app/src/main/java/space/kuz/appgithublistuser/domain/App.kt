package space.kuz.appgithublistuser.domain

import android.app.Application
import android.content.Context
import space.kuz.appgithublistuser.data.repo.*
import space.kuz.appgithublistuser.domain.entity.UserEntity

class App: Application() {

    var userRepo: UserRepository=UserRepositoryImplementation()

    fun fillUserRepo(){
        userRepo.createUser(
            UserEntity("Pasha","Love play basketball","https://st.depositphotos.com/1008939/1880/i/950/depositphotos_18807295-stock-photo-portrait-of-handsome-man.jpg")
        )
        userRepo.createUser(
            UserEntity("Sasha","Love play computer","https://n1s1.elle.ru/13/93/49/13934924bb5dfe4a3b346fa62e59b967/460x598_0xc0a839a4_281420171479222123.jpeg")
        )
    }


    val Context.app
        get() = applicationContext as App
}
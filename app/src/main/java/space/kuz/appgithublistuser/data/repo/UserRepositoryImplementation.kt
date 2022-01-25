package space.kuz.appgithublistuser.data.repo

import org.w3c.dom.Entity
import space.kuz.appgithublistuser.domain.entity.UserEntity

class UserRepositoryImplementation(): UserRepository {

    private var userArray:ArrayList<UserEntity> = ArrayList()
    private var counter:Long=0
    override fun getUser(): List<UserEntity> {
       return ArrayList<UserEntity>(userArray)
    }

    override fun createUser(user: UserEntity): Long {
        counter++
        userArray.add(user)
        return counter
    }

    override fun updateUser(id: Long, user: UserEntity): Boolean {
        deleteUser(id)
        user.id = id
        userArray.add(id.toInt()-1, user)
        return true
    }

    override fun deleteUser(id: Long): Boolean {
        for (i in 0..userArray.size){
            if(id == userArray.get(i).id ){
                userArray.removeAt(i)
                return true
            }
        }
        return false
    }

}
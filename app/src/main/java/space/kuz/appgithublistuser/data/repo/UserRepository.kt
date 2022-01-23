package space.kuz.appgithublistuser.data.repo

import space.kuz.appgithublistuser.domain.entity.UserEntity

interface UserRepository {
    fun  getUser():List<UserEntity >
    fun createUser(user: UserEntity):Long
    fun updateUser(id:Long, user: UserEntity):Boolean
    fun deleteUser(id:Long):Boolean
}
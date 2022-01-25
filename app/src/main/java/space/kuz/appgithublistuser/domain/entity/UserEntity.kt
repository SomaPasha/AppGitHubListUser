package space.kuz.appgithublistuser.domain.entity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UserEntity(
    val name:String,
    val description:String,
    val imageUrl: String
): Parcelable {
    var id:Long
        get() {
            TODO()
        }
        set(value) {}
}
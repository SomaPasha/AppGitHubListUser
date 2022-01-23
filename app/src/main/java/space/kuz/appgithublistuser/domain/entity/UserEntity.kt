package space.kuz.appgithublistuser.domain.entity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UserEntity(
    val id:Int,
    val name:Int,
    val description:String,
    val image: String
): Parcelable {}
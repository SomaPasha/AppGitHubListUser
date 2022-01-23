package space.kuz.appgithublistuser.ui.adapter

import android.view.*
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import space.kuz.appgithublistuser.R
import space.kuz.appgithublistuser.domain.entity.UserEntity

class UserAdapter : RecyclerView.Adapter<UserViewHolder>() {

    var data: List<UserEntity> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_user, parent, false) as ViewGroup
        return UserViewHolder(itemView!!)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    fun getItem(position: Int): UserEntity {
        return data.get(position)
    }

    override fun getItemCount(): Int {
        return data.size
    }

}

class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private  var image: ImageView =itemView.findViewById(R.id.user_image_view)
    private var nameTextView: TextView? =itemView.findViewById(R.id.name_text_view)
    private var descriptionTextView: TextView? =itemView.findViewById(R.id.description_text_view)
    private lateinit var user:UserEntity

    fun bind(item: UserEntity) {
        this.user = item
        if(item.imageUrl.isNotBlank()){
            Glide.with(image.context)
                .load(item.imageUrl)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
                .into(image)
        } else{
            image.setImageResource(R.drawable.ic_launcher_background)
        }

        nameTextView!!.text = item.name
        descriptionTextView!!.text = item.description


    }

}
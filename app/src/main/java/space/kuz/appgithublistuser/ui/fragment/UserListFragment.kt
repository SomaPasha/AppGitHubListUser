package space.kuz.appgithublistuser.ui.fragment

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import space.kuz.appgithublistuser.data.repo.UserRepository
import space.kuz.appgithublistuser.databinding.FragmentUserListBinding
import space.kuz.appgithublistuser.domain.app

class UserListFragment: Fragment() {

    private  val  theMovieRepo: UserRepository by lazy {requireActivity().app.userRepo}
    private lateinit var binding:FragmentUserListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUserListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity().app.fillUserRepo()
    }
}
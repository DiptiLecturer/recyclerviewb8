package org.freedu.recyclerviewb8

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import org.freedu.recyclerviewb8.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var adapter: UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val userList = listOf(

            User(R.drawable.profile, "Aminul Islam", "01711111111"),

            User(R.drawable.ic_launcher_foreground, "Rakib Hasan", "01822222222"),

            User(R.drawable.profile, "Nusrat Jahan", "01933333333"),

            User(R.drawable.ic_launcher_background, "Tanvir Ahmed", "01644444444"),

            User(R.drawable.profile, "Sadia Akter", "01555555555"),

            User(R.drawable.profile, "Mahadi Hasan", "01366666666"),

            User(R.drawable.profile, "Fahim Rahman", "01477777777"),

            User(R.drawable.profile, "Jannatul Ferdous", "01788888888"),

            User(R.drawable.profile, "Aminul Islam", "01711111111"),

            User(R.drawable.ic_launcher_foreground, "Rakib Hasan", "01822222222"),

            User(R.drawable.profile, "Nusrat Jahan", "01933333333"),

            User(R.drawable.ic_launcher_background, "Tanvir Ahmed", "01644444444"),

        )

        adapter = UserAdapter(userList)

        binding.recView.layoutManager = LinearLayoutManager(this)
        binding.recView.adapter = adapter
    }
}
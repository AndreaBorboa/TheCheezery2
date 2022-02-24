package borboa.andrea.thecheezery2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        var btnCold: Button = findViewById(R.id.button_cold_drinks) as Button

        btnCold.setOnClickListener{
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","coldDrinks")
            startActivity(intent)
        }

        var btnHot: Button = findViewById(R.id.button_hot_drinks) as Button

        btnHot.setOnClickListener{
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","hotDrinks")
            startActivity(intent)
        }

        var btnSweets: Button = findViewById(R.id.button_sweets) as Button

        btnSweets.setOnClickListener{
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","sweets")
            startActivity(intent)
        }

        var btnSalties: Button = findViewById(R.id.button_salties) as Button

        btnSalties.setOnClickListener{
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","salties")
            startActivity(intent)
        }
    }
}
package com.example.products

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProductDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.product_detail)

        val productId = intent.getIntExtra("id", -1) // Asegúrate de que coincida con el nombre que pasas desde MainActivity
        val product = ProductData.productList.find { it.id == productId }

        if (product != null) {
            findViewById<TextView>(R.id.tvNameDetail).text = product.name
            findViewById<TextView>(R.id.tvDescriptionDetail).text = product.description
            findViewById<TextView>(R.id.tvTypeDetail).text = product.type
            findViewById<ImageView>(R.id.imgFotoDetail).setImageResource(product.image)
            findViewById<TextView>(R.id.tvPriceDetail).text = "${product.price}€"

            val btnShop = findViewById<Button>(R.id.btnShop)
            btnShop.setOnClickListener {

                Toast.makeText(this, findViewById<TextView>(R.id.tvNameDetail).text.toString() + " añadido", Toast.LENGTH_SHORT).show()
            }
        }

        findViewById<ImageView>(R.id.imgMoreDetail).setImageResource(R.drawable.nike)
        findViewById<ImageView>(R.id.imgMoreDetail2).setImageResource(R.drawable.nike2)
        findViewById<ImageView>(R.id.imgMoreDetail3).setImageResource(R.drawable.nike3)
        findViewById<ImageView>(R.id.imgMoreDetail4).setImageResource(R.drawable.nike4)



    }
}

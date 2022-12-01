package com.example.zadanie05

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductForRVAdapter(val products: List<Product>) :
    RecyclerView.Adapter<ProductForRVAdapter.ProductForRVViewHolder>()
{
    inner class ProductForRVViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductForRVViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.product_for_rv,
            parent,
            false)
        return ProductForRVViewHolder(view)
    }

    private fun openProductSite(view: View, product: Product)
    {
        val intent = Intent(view.context, ProductSite::class.java).also {
            it.putExtra("product", product)
        }
        view.context.startActivity(intent)

    //        view.findViewById<TextView>(R.id.productForRVName).text = "nic"
    }

    override fun onBindViewHolder(holder: ProductForRVViewHolder, position: Int) {
        holder.itemView.findViewById<TextView>(R.id.productForRVName).text =
            products[position].name
        holder.itemView.setOnClickListener {
            openProductSite(it, products[position])
        }
    }

    override fun getItemCount(): Int {
        return products.size
    }
}
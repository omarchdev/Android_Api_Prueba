package pe.cibertec.cls_chumioque_huansi_omar.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import pe.cibertec.cls_chumioque_huansi_omar.R
import pe.cibertec.cls_chumioque_huansi_omar.model.Producto
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.*
import kotlin.collections.ArrayList


class RvAdapterProducto : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val list: ArrayList<Producto> = ArrayList()
    var df: DecimalFormat = DecimalFormat("0.00", DecimalFormatSymbols.getInstance(Locale.US))

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val v= LayoutInflater.from(parent.context).inflate(R.layout.item_producto,parent,false)
        return ProductoVH(v)
    }

    inner class ProductoVH(item: View): RecyclerView.ViewHolder(item){
        val lblCodigo: TextView = itemView.findViewById(R.id.txtCodigo)
        val lblNombre: TextView = itemView.findViewById(R.id.txtNombre)
        val lblPrecio: TextView = itemView.findViewById(R.id.txtPrecio)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val h=holder as ProductoVH
        h.lblCodigo.text = list[position].codigo
        h.lblNombre.text = list[position].nombre
        h.lblPrecio.text = "${df.format(list[position].valorConIgv!!.toBigDecimal())}"
     }

    fun cargarLista(list1: ArrayList<Producto>) {
        list.clear()
        list.addAll(list1)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
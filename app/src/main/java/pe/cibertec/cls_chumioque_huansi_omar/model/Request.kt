package pe.cibertec.cls_chumioque_huansi_omar.model

import com.google.gson.annotations.SerializedName

data class Request(@SerializedName("data") var productos:ArrayList<Producto>)

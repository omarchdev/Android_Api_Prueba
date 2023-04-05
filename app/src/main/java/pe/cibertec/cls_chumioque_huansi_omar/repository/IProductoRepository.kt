package pe.cibertec.cls_chumioque_huansi_omar.repository

import pe.cibertec.cls_chumioque_huansi_omar.model.Request
import retrofit2.Call
import retrofit2.http.GET
//Interfaz para los solicitud de información

interface IProductoRepository {
    @GET("/api_facturacion_electronica/listar_producto_prueba.php")
    fun GetProductos(): Call<Request>
}
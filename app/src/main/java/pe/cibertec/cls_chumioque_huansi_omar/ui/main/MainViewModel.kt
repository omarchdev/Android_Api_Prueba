package pe.cibertec.cls_chumioque_huansi_omar.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import pe.cibertec.cls_chumioque_huansi_omar.model.Producto
import pe.cibertec.cls_chumioque_huansi_omar.repository.IProductoRepository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainViewModel : ViewModel() {
    private val retro: Retrofit = Retrofit.Builder().baseUrl("https://facturaaltoque.pe")
        .addConverterFactory(GsonConverterFactory.create()).build()
    private val iProductoRepository=retro.create(IProductoRepository::class.java)
    val listaProducto: MutableLiveData<ArrayList<Producto>> by lazy {
        MutableLiveData<ArrayList<Producto>>().also {
            GetProductos()
        }
    }


    //Descarga de productos desde el api
    fun GetProductos(){
        CoroutineScope(Dispatchers.IO).launch {
            val result = iProductoRepository.GetProductos().execute().body()
            listaProducto.apply {
                if(result!=null)
                    postValue(result.productos)
            }
        }
    }
}
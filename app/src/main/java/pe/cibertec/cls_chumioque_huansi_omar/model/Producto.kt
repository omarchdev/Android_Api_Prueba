package pe.cibertec.cls_chumioque_huansi_omar.model
import com.google.gson.annotations.SerializedName


data class Producto(
    @SerializedName("idproducto") var idproducto: String? = null,
    @SerializedName("id_contribuyente") var idContribuyente: String? = null,
    @SerializedName("idsucursal") var idsucursal: String? = null,
    @SerializedName("codigo") var codigo: String? = null,
    @SerializedName("id_unidad_medida") var idUnidadMedida: String? = null,
    @SerializedName("id_tipoafectacionigv") var idTipoafectacionigv: String? = null,
    @SerializedName("id_categoria") var idCategoria: String? = null,
    @SerializedName("nombre") var nombre: String? = null,
    @SerializedName("id_cod_moneda") var idCodMoneda: String? = null,
    @SerializedName("precio_compra") var precioCompra: String? = null,
    @SerializedName("valor_sin_igv") var valorSinIgv: String? = null,
    @SerializedName("valor_con_igv") var valorConIgv: String? = null,
    @SerializedName("precio_venta_minimo") var precioVentaMinimo: String? = null,
    @SerializedName("stock") var stock: String? = null,
    @SerializedName("stock_minimo") var stockMinimo: String? = null,
    @SerializedName("estado") var estado: String? = null,
    @SerializedName("afecto_icbper") var afectoIcbper: String? = null,
    @SerializedName("nombrecategoria") var nombrecategoria: String? = null,
    @SerializedName("tipoafectacion") var tipoafectacion: String? = null,
    @SerializedName("nombreunidad") var nombreunidad: String? = null,
    @SerializedName("codigounidad") var codigounidad: String? = null,
    @SerializedName("simbolounidad") var simbolounidad: String? = null,
    @SerializedName("nombresucursal") var nombresucursal: String? = null,
    @SerializedName("simbolomoneda") var simbolomoneda: String? = null
)
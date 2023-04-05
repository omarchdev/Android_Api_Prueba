package pe.cibertec.cls_chumioque_huansi_omar.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import pe.cibertec.cls_chumioque_huansi_omar.R
import pe.cibertec.cls_chumioque_huansi_omar.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    val rvAdapterProducto=RvAdapterProducto()
    companion object {
        fun newInstance() = MainFragment()
    }

    private var _binding: FragmentMainBinding? = null
    val binding get() = _binding!!
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return _binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvProductos.layoutManager= LinearLayoutManager(context)
        binding.rvProductos.adapter=rvAdapterProducto
        activity?.setTitle(R.string.fragment_name);
        val dividerItemDecoration = DividerItemDecoration(
            binding.rvProductos.context,
            LinearLayoutManager(context).orientation
        )
        binding.rvProductos.addItemDecoration(dividerItemDecoration)
        //Recupera lista y lo manda al recycler view
        viewModel.listaProducto.observe(viewLifecycleOwner) {
            rvAdapterProducto.cargarLista(it)
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
package com.example.cuaderno.ui.registros;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cuaderno.R;
import com.example.cuaderno.adaptadores.adapterRegistros;
import com.example.cuaderno.entidades.Registro;

import java.util.ArrayList;

public class RegistrosFragment extends Fragment {

    adapterRegistros adapterRegistros;
    RecyclerView recyclerViewRegistros;
    ArrayList<Registro> listaRegistro;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_registros, container, false);
        recyclerViewRegistros = root.findViewById(R.id.rv_Lista);
        listaRegistro = new ArrayList<>();
        //Cargar la lista
        cargarLista();
        //Mostrar datos
        mostarLista();
        return root;
    }
    public void cargarLista(){
        listaRegistro.add(new Registro("Insecto1","Especie1",R.drawable.user));
        listaRegistro.add(new Registro("Insecto2","Especie2",R.drawable.user));
        listaRegistro.add(new Registro("Insecto3","Especie3",R.drawable.user));
        listaRegistro.add(new Registro("Insecto4","Especie4",R.drawable.user));
        listaRegistro.add(new Registro("Insecto5","Especie5",R.drawable.user));
        listaRegistro.add(new Registro("Insecto6","Especie6",R.drawable.user));
        listaRegistro.add(new Registro("Insecto7","Especie7",R.drawable.user));
    }
    public void mostarLista(){
        recyclerViewRegistros.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterRegistros = new adapterRegistros(getContext(),listaRegistro);
        recyclerViewRegistros.setAdapter(adapterRegistros);

        adapterRegistros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = listaRegistro.get(recyclerViewRegistros.getChildAdapterPosition(v)).getNombre();
                Toast.makeText(getContext(), "Seleccionó: " +nombre,Toast.LENGTH_LONG).show();
            }
        });
    }
}

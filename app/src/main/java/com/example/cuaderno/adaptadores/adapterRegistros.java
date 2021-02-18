package com.example.cuaderno.adaptadores;

import android.content.Context;
import android.graphics.ColorSpace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cuaderno.R;
import com.example.cuaderno.entidades.Registro;

import java.util.ArrayList;

public class adapterRegistros extends RecyclerView.Adapter<adapterRegistros.ViewHolder> implements View.OnClickListener {
    LayoutInflater inflater;
    ArrayList<Registro> model;

    private View.OnClickListener listener;
    public adapterRegistros(Context context, ArrayList<Registro> model){
        this.inflater = LayoutInflater.from(context);
        this.model = model;

    }
    @NonNull
    @Override
    public adapterRegistros.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =  inflater.inflate(R.layout.lista_registros,parent, false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }
    public void setOnClickListener(View.OnClickListener listener){
        this.listener = listener;
    }
    @Override
    public void onBindViewHolder(@NonNull adapterRegistros.ViewHolder holder, int position) {
        String nombre = model.get(position).getNombre();
        String especie = model.get(position).getEspecie();
        int imagen = model.get(position).getImagenID();

        holder.nombre.setText(nombre);
        holder.especie.setText(especie);
        holder.imagen.setImageResource(imagen);
    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    @Override
    public void onClick(View view) {
        if(listener != null){
            listener.onClick(view);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView nombre, especie;
        ImageView imagen;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.tv_nombre);
            especie = itemView.findViewById(R.id.tv_especie);
            imagen = itemView.findViewById(R.id.iv_Imagen);
        }
    }
}

package com.example.junior.happydinner.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.junior.happydinner.R;
import com.example.junior.happydinner.adapter.EstablishmentAdapter;
import com.example.junior.happydinner.models.Establishment;

import java.util.ArrayList;
import java.util.List;

public class EstablishmentFragment extends Fragment {

    private RecyclerView recyclerView;
    private List<Establishment> list=new ArrayList<>();
    public EstablishmentFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_establishment, container, false);

        list=getList();
        recyclerView=(RecyclerView) v.findViewById(R.id.recycler_view);
        EstablishmentAdapter adapter=new EstablishmentAdapter(list,getActivity());
        LinearLayoutManager llm=new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);
        recyclerView.setAdapter(adapter);

        return v;
    }

    public List<Establishment> getList(){
        List<Establishment> list=new ArrayList<>();

        Establishment e=new Establishment("Meu Restaurante","Restaurante","Avenida Campo Sales, 1220 Centro",1,1,true);
        list.add(e);
        Establishment e1=new Establishment("Nossa Casa","Restaurante","Avenida Principal do Dirceu, 2223 Dirceu",1,1,false);
        list.add(e1);
        Establishment e2=new Establishment("Churrascaria Bisão","Restaurante","Rua Prefeito Tal Coisa, 5332 Mocambinho",1,1,true);
        list.add(e2);
        Establishment e3=new Establishment("MCDonalds","Lanchonete","Rua Alfredo Santos, 1320 Centro",1,1,true);
        list.add(e3);
        Establishment e4=new Establishment("Fundo da Garagem","Bares/Pub","Avenida Campo Sales, 1220 Centro",1,1,false);
        list.add(e4);

        return list;
    }


}

package com.example.jamylle.ahoradopao.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.jamylle.ahoradopao.R;
import com.example.jamylle.ahoradopao.adapters.PadariaAdapter;

import java.util.ArrayList;

public class PlacesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_places, container, false);

        ListView listView = (ListView) view.findViewById(R.id.listView_places);

        PadariaAdapter adapter = new PadariaAdapter(getActivity(), initPlaces());

        listView.setAdapter(adapter);

        return view;
    }

    public ArrayList<Padaria> initPlaces() {

        ArrayList<Padaria> padarias = new ArrayList<>();

        padarias.add(new Padaria("Padaria Moura", "4.3", "1.2", "20", "Aberto"));
        padarias.add(new Padaria("Padaria da Maria", "4.5", "0.5", "12", "Aberto"));
        padarias.add(new Padaria("Panificação Irmãos Cunha", "3.5", "0.2", "5", "Fechado"));
        padarias.add(new Padaria("Padaria Top", "5.0", "3.0", "30", "Aberto"));
        padarias.add(new Padaria("Padaria 100%", "4.7", "2.0", "25", "Fechado"));

        return padarias;
    }

    public class Padaria {

        public String nome;
        public String avaliacao;
        public String distancia;
        public String tempo;
        public String status;

        public Padaria(String n, String a, String d, String t, String s) {

            this.nome = n;
            this.avaliacao = a;
            this.distancia = d;
            this.tempo = t;
            this.status = s;
        }
    }
}

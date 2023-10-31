package com.example.dwassistent;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toolbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> personagem = new ArrayList<>(Arrays.asList("corvina", "jiro"));
        ListView listaDePersonagens = findViewById(R.id.activity_main_lista_de_personagens);
        listaDePersonagens.setAdapter(new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, personagem));
    }
}

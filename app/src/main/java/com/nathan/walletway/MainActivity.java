package com.nathan.walletway;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerTransacoes;
    private TextView textSaldo;
    private List<Transacao> listaTransacoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerTransacoes = findViewById(R.id.recyclerTransacoes);
        textSaldo = findViewById(R.id.textSaldo);

        // Dados de exemplo
        listaTransacoes = new ArrayList<>();
        listaTransacoes.add(new Transacao("Salário", 3000.0, "Receita"));
        listaTransacoes.add(new Transacao("Aluguel", 1200.0, "Despesa"));
        listaTransacoes.add(new Transacao("Mercado", 500.0, "Despesa"));

        TransacaoAdapter adapter = new TransacaoAdapter(listaTransacoes);
        recyclerTransacoes.setLayoutManager(new LinearLayoutManager(this));
        recyclerTransacoes.setAdapter(adapter);

        calcularSaldo();
    }

    private void calcularSaldo() {
        double saldo = 0.0;
        for (Transacao t : listaTransacoes) {
            if (t.getTipo().equalsIgnoreCase("Receita")) {
                saldo += t.getValor();
            } else {
                saldo -= t.getValor();
            }
        }
        textSaldo.setText(String.format("Saldo: R$ %.2f", saldo));
    }
}

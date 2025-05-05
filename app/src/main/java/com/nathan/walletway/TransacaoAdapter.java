package com.nathan.walletway;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TransacaoAdapter extends RecyclerView.Adapter<TransacaoAdapter.TransacaoViewHolder> {
    private List<Transacao> listaTransacoes;

    public TransacaoAdapter(List<Transacao> listaTransacoes) {
        this.listaTransacoes = listaTransacoes;
    }

    @NonNull
    @Override
    public TransacaoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_transacao, parent, false);
        return new TransacaoViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull TransacaoViewHolder holder, int position) {
        Transacao transacao = listaTransacoes.get(position);
        holder.descricao.setText(transacao.getDescricao());
        holder.valor.setText(String.format("R$ %.2f (%s)", transacao.getValor(), transacao.getTipo()));
    }

    @Override
    public int getItemCount() {
        return listaTransacoes.size();
    }

    public static class TransacaoViewHolder extends RecyclerView.ViewHolder {
        TextView descricao, valor;

        public TransacaoViewHolder(@NonNull View itemView) {
            super(itemView);
            descricao = itemView.findViewById(R.id.textDescricao);
            valor = itemView.findViewById(R.id.textValor);
        }
    }
}

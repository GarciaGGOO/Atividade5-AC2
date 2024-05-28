package com.example.atividade5ac2.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.atividade5ac2.R;
import com.example.atividade5ac2.model.Aluno;

import java.util.List;

public class AlunoAdapter extends RecyclerView.Adapter<AlunoAdapter.AlunoViewHolder> {

    private List<Aluno> alunos;

    public AlunoAdapter(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @NonNull
    @Override
    public AlunoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_aluno, parent, false);
        return new AlunoViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull AlunoViewHolder holder, int position) {
        Aluno aluno = alunos.get(position);
        holder.raTextView.setText("RA: " + aluno.getRa());
        holder.nomeTextView.setText("Nome: " + aluno.getNome());
        holder.cepTextView.setText("CEP: " + aluno.getCep());
        holder.logradouroTextView.setText("Logradouro: " + aluno.getLogradouro());
        holder.complementoTextView.setText("Complemento: " + aluno.getComplemento());
        holder.bairroTextView.setText("Bairro: " + aluno.getBairro());
        holder.cidadeTextView.setText("Cidade: " + aluno.getCidade());
        holder.ufTextView.setText("UF: " + aluno.getUf());
    }

    @Override
    public int getItemCount() {
        return alunos.size();
    }

    public static class AlunoViewHolder extends RecyclerView.ViewHolder {

        public TextView raTextView, nomeTextView, cepTextView, logradouroTextView,
                complementoTextView, bairroTextView, cidadeTextView, ufTextView;

        public AlunoViewHolder(@NonNull View itemView) {
            super(itemView);
            raTextView = itemView.findViewById(R.id.ra_text_view);
            nomeTextView = itemView.findViewById(R.id.nome_text_view);
            cepTextView = itemView.findViewById(R.id.cep_text_view);
            logradouroTextView = itemView.findViewById(R.id.logradouro_text_view);
            complementoTextView = itemView.findViewById(R.id.complemento_text_view);
            bairroTextView = itemView.findViewById(R.id.bairro_text_view);
            cidadeTextView = itemView.findViewById(R.id.cidade_text_view);
            ufTextView = itemView.findViewById(R.id.uf_text_view);
        }
    }
}

package com.example.atividade5ac2.api;

import com.example.atividade5ac2.model.Aluno;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;


public interface AlunoService {
    @GET("aluno")
    Call<List<Aluno>> getAluno();

    @POST("aluno")
    Call<Aluno> postAluno(@Body Aluno aluno);

}

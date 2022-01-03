package com.example.dontforgetme.domain;

import java.time.Instant;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbTurma")

public class Turma {
    @Column(nullable=false, length = 45)
    private String nome;
    @Column(nullable=false)
    private int nível;

    @OneToMany(mappedBy = "turma")
    private List<Tarefa> tarefa;
    @ManyToMany(mappedBy = "turma")
    private List<Aluno> aluno;
    @ManyToMany(mappedBy = "turma")
    private List<Professor> professor;
}

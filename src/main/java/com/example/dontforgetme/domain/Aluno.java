package com.example.dontforgetme.domain;

import java.time.Instant;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
@Table(name = "tbAluno")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idaluno;
    @Column(nullable=false, length = 45)
    private String nome;
    @Column(nullable=false)
    @Temporal(TemporalType.DATE)
    private String email;
    @Column(nullable=false, length = 45)
    private String senha;
    @ManyToMany(mappedBy = "aluno")
    private List<Turma> turma;

    @ManyToOne(mappedBy = "aluno")
    private List<Professor> professor;
}

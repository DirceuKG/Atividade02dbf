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
@Table(name = "tbProfessor")
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idprofessor;
    @Column(nullable=false, length = 45)
    private String nome;
    @Column(nullable=false)
    @Temporal(TemporalType.DATE)
    private String email;
    @Column(nullable=false, length = 45)
    private String senha;
    @OneToMany(mappedBy = "professor")
    private List<Turma> turma;

    @OneToMany(mappedBy = "professor")
    private List<Aluno> professor;
}

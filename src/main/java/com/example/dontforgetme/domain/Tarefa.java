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
@Table(name = "tbTarefa")
public class Tarefa {
    @Id
    @Column(nullable=false)
    private String nome;
    @Column(nullable=false)
    @Temporal(TemporalType.DATE)
    private java.util.Date dataEntrega;
    @ManyToOne(mappedBy = "tarefa")
    private List<Professor> professor;

    @ManyToOne(mappedBy = "tarefa")
    private List<Turma> turma;
}
}

package tn.esprit.kaderproject.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table( name = "Etudiant")
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    private Integer idEtudiant; // Clé primaire
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Option op;

    @ManyToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Equipe> equipes;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="etudiant")
    @JsonIgnore
    private List<Contrat> contrats;

    @ManyToOne
    Departement departements;



// Constructeur et accesseurs (getters) et mutateurs (setters)


}
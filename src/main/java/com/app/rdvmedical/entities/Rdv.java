package com.app.rdvmedical.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Rdv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING)
    LocalDateTime dateRdv;
    String etat;

    @ManyToOne
    private Patient patient;
    @ManyToOne
    private Medecin medecin;
}

package main.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="ASSISTENCIA")
public class Assistencia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ASSISTENCIA_ID", nullable = false)
    private Long id;

    @Column(name = "NOME", nullable = false, unique = false)
    private String nome;

}

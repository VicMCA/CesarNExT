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
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NOME", nullable = false, unique = false)
    private String nome;

    @Column(name = "TELEFONE", nullable = false)
    private String telefone;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "SENHA", nullable = false)
    private String senha;
    
    @Column(name = "CATEGORIA", nullable = false)
    private CategoriaEquip categoriaEquip;

    @Column(name = "ENDERECO", nullable = false)
    private Endereco endereco;

    @Column(name = "HORARIOFUNCIONAMENTO", nullable = false)
    private String horarioFuncionamento;

    @Column(name = "HORARIO", nullable = false)
    private Horario horario;

    /*
    @OneToMany(mappedBy = "CategoriaEquip")
    @JoinColumn(name = "CATEGORIA_ID", nullable = false)
    private CategoriaEquip categoriaEquip;
    */
}

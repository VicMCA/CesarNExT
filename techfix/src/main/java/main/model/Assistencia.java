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
@Table(name="ASSISTENCIAS")
public class Assistencia implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ASSISTENCIA_ID", nullable = false)
    private Long id;

    @Column(name = "ASSISTENCIA_NOME", nullable = false, unique = false)
    private String nome;

    @Column(name = "ASSISTENCIA_TELEFONE", nullable = false)
    private String telefone;

    @Column(name = "ASSISTENCIA_EMAIL", nullable = false)
    private String email;

    @Column(name = "ASSISTENCIA_SENHA", nullable = false)
    private String senha;
    
    @Column(name = "ASSISTENCIA_CATEGORIA", nullable = false)
    private CategoriaEquip categoriaEquip;

    @Column(name = "ASSISTENCIA_ENDERECO", nullable = false)
    private Endereco endereco;

    @Column(name = "ASSISTENCIA_HORARIO_FUNCIONAMENTO", nullable = false)
    private String horarioFuncionamento;

    @Column(name = "ASSISTENCIA_HORARIO", nullable = false)
    private Horario horario;

    /*
    @OneToMany(mappedBy = "CategoriaEquip")
    @JoinColumn(name = "CATEGORIA_ID", nullable = false)
    private CategoriaEquip categoriaEquip;
    */
}

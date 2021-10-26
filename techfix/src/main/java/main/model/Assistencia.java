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
@Table(name="assistencias")
public class Assistencia implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nome", nullable = false, unique = false)
    private String nome;

    @Column(name = "telefone", nullable = false)
    private String telefone;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "senha", nullable = false)
    private String senha;
    
    @Column(name = "categoria", nullable = false)
    private CategoriaEquip categoriaEquip;

    @Column(name = "endereco", nullable = false)
    private Endereco endereco;

    @Column(name = "horario_funcionamento", nullable = false)
    private String horarioFuncionamento;

    @Column(name = "horario", nullable = false)
    private Horario horario;

    /*
    @OneToMany(mappedBy = "CategoriaEquip")
    @JoinColumn(name = "CATEGORIA_ID", nullable = false)
    private CategoriaEquip categoriaEquip;
    */
}

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
    @Column(name = "assistencia_id", nullable = false)
    private Long id;

    @Column(name = "assistencia_nome", nullable = false, unique = false)
    private String nome;

    @Column(name = "assistencia_telefone", nullable = false)
    private String telefone;

    @Column(name = "assistencia_email", nullable = false)
    private String email;

    @Column(name = "assistencia_senha", nullable = false)
    private String senha;
    
    @Column(name = "assistencia_categoria", nullable = false)
    private CategoriaEquip categoriaEquip;

    @Column(name = "assistencia_endereco", nullable = false)
    private Endereco endereco;

    @Column(name = "assistencia_horario_funcionamento", nullable = false)
    private String horarioFuncionamento;

    @Column(name = "assistencia_horario", nullable = false)
    private Horario horario;

    /*
    @OneToMany(mappedBy = "CategoriaEquip")
    @JoinColumn(name = "CATEGORIA_ID", nullable = false)
    private CategoriaEquip categoriaEquip;
    */
}

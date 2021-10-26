package main.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CLIENTES")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CLIENTE_ID", nullable = false)
    private Long id;

    @Column(name = "CLIENTE_NOME", nullable = false)
    private String nome;

    @Column(name = "CLIENTE_CPF", nullable = false, unique = true)
    private String cpf;

    @Column(name = "CLIENTE_TELEFONE", nullable = false)
    private String telefone;

    @Column(name = "CLIENTE_ENDERECO", nullable = false)
    private Endereco endereco;

    @Column(name = "CLIENTE_EMAIL", nullable = false)
    private String email;

    @Column(name = "CLIENTE_SENHA", nullable = false)
    private String senha;

    /*
    @OneToMany(mappedBy = "Endereco")
    @JoinColumn(name = "ENDERECO_ID", nullable = false)
    private Endereco endereco;
    */

    /*
    @OneToMany(mappedBy = "Equipamento")
    @JoinColumn(name = "EQUIPAMENTO_ID", nullable = false)
    private Equipamento equipamento;
    */

}

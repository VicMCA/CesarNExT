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
@Table(name = "clientes")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cliente_id", nullable = false)
    private Long id;

    @Column(name = "cliente_nome", nullable = false)
    private String nome;

    @Column(name = "cliente_cpf", nullable = false, unique = true)
    private String cpf;

    @Column(name = "cliente_telefone", nullable = false)
    private String telefone;

    @Column(name = "cliente_endereco", nullable = false)
    private Endereco endereco;

    @Column(name = "cliente_email", nullable = false)
    private String email;

    @Column(name = "cliente_senha", nullable = false)
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

package main.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "cpf", nullable = false, unique = true)
    private String cpf;

    @Column(name = "telefone", nullable = false)
    private String telefone;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "senha", nullable = false)
    private String senha;

    @OneToOne
    @JoinColumn(name = "endereco_id", nullable = false)
    private Endereco endereco;

    @OneToMany
    @JoinColumn(name = "equipamento_id")
    private List<Equipamento> equipamentos;

    /*@OneToMany
    @JoinColumn(name = "AGENDAMENTO_ID", unique = true)
    private List<Agendamento> agendamentos;*/

}

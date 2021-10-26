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
@Table(name = "enderecos")
public class Endereco implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "endereco_id", nullable = false)
    private Long id;

    @Column(name = "endereco_rua", nullable = false)
    private String rua;

    @Column(name = "endereco_numero", nullable = false)
    private int numero;

    @Column(name = "endereco_complemento", nullable = false)
    private String complemento;

    @Column(name = "endereco_bairro", nullable = false)
    private String bairro;

    @Column(name = "endereco_cidade", nullable = false)
    private String cidade;

    @Column(name = "endereco_estado", nullable = false)
    private String estado;

    @Column(name = "endereco_cep", nullable = false)
    private String cep;

    @Column(name = "endereco_pais", nullable = false)
    private String pais;
}

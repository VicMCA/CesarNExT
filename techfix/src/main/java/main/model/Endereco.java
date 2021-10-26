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
@Table(name = "ENDERECOS")
public class Endereco implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ENDERECO_ID", nullable = false)
    private Long id;

    @Column(name = "ENDERECO_RUA", nullable = false)
    private String rua;

    @Column(name = "ENDERECO_NUMERO", nullable = false)
    private int numero;

    @Column(name = "ENDERECO_COMPLEMENTO", nullable = false)
    private String complemento;

    @Column(name = "ENDERECO_BAIRRO", nullable = false)
    private String bairro;

    @Column(name = "ENDERECO_CIDADE", nullable = false)
    private String cidade;

    @Column(name = "ENDERECO_ESTADO", nullable = false)
    private String estado;

    @Column(name = "ENDERECO_CEP", nullable = false)
    private String cep;

    @Column(name = "ENDERECO_PAIS", nullable = false)
    private String pais;
}

package main.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cliente")
public class Agendamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "DATA", nullable = false)
    private Date data;

    @Column(name = "HORA", nullable = false)
    private Date hora;

    @Column(name = "CATEGORIA_EQUIPAMENTO", nullable = false)
    private List<CategoriaEquip> categoriaEquip;

    @Column(name = "DEFEITO", nullable = false)
    private String defeito;
    /*
    @OneToOne(mappedBy = "Assistencia")
    @JoinColumn(name = "ASSISTENCIA", nullable = false)
    private Cliente cliente;
    */

    /*@OneToOne(mappedBy = "Cliente")
    @JoinColumn(name = "CLIENTE_ID", nullable = false)
    private Cliente cliente;
    */

}

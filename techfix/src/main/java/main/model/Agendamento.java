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
@Table(name = "AGENDAMENTOS")
public class Agendamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AGENDAMENTO_ID", nullable = false)
    private Long id;

    @Column(name = "AGENDAMENTO_DATA", nullable = false)
    private Date data;

    @Column(name = "AGENDAMENTO_HORA", nullable = false)
    private Date hora;

    @Column(name = "AGENDAMENTO_CATEGORIA_EQUIPAMENTO", nullable = false)
    private List<CategoriaEquip> categoriaEquip;

    @Column(name = "AGENDAMENTO_DEFEITO", nullable = false)
    private String defeito;

    @OneToOne
    @JoinColumn(name="ASSISTENCIA_ID")
    @Column (name="AGENDAMENTO_ASSISTENCIAS")
    private Assistencia assistencia;

    @OneToOne
    @JoinColumn(name="CLIENTE_ID")
    @Column (name="AGENDAMENTO_CLIENTES")
    private Cliente cliente;
}

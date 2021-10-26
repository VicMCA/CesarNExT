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
@Table(name = "agendamentos")
public class Agendamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "agendamento_id", nullable = false)
    private Long id;

    @Column(name = "agendamento_data", nullable = false)
    private Date data;

    @Column(name = "agendamento_hora", nullable = false)
    private Date hora;

    @Column(name = "agendamento_categoria_equipamento", nullable = false)
    private List<CategoriaEquip> categoriaEquip;

    @Column(name = "agendamento_defeito", nullable = false)
    private String defeito;

    @OneToOne
    @JoinColumn(name="assistencia_id")
    @Column (name="agendamento_assistencias")
    private Assistencia assistencia;

    @OneToOne
    @JoinColumn(name="cliente_id")
    @Column (name="agendamento_clientes")
    private Cliente cliente;
}

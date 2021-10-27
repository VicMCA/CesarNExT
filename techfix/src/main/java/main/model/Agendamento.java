package main.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "agendamentos")
public class Agendamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "defeito", nullable = false)
    private String defeito;

    @OneToMany
    @JoinColumn(name = "categorias_equipamento", nullable = false)
    private List<CategoriaEquip> categoriaEquip;
  
    @OneToOne
    @JoinColumn(name = "assitencia_id")
    private Assistencia assistencia;

    @OneToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @OneToOne
    @JoinColumn(name = "data_id", nullable = false)
    private Horario data;
}

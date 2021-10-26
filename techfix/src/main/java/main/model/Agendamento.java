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
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "data", nullable = false)
    private Date data;

    @Column(name = "hora", nullable = false)
    private Date hora;

    @Column(name = "categoria_equipamento", nullable = false)
    private List<CategoriaEquip> categoriaEquip;

    @Column(name = "defeito", nullable = false)
    private String defeito;
  
    @OneToOne
    @JoinColumn(name = "id")
    @Column (name = "assistencias")
    private Assistencia assistencia;

    @OneToOne
    @JoinColumn(name = "id")
    @Column (name = "clientes")
    private Cliente cliente;
}

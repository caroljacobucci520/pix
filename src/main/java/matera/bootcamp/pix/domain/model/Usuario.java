package matera.bootcamp.pix.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.web.bind.annotation.PostMapping;

import lombok.Data;

@Data
@Entity
public class Usuario {

    @Id
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column()
    private String sobrenome;

    @OneToOne(optional = false)
    private ContaCorrente contaCorrente;
}

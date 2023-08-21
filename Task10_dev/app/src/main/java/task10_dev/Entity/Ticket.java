package task10_dev.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_at")
    private String createdAt;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id", referencedColumnName = "id", nullable = false)
    private Client client;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "from_planet_id", referencedColumnName = "id", nullable = false)
    private Planet fromPlanet;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "to_planet_id", referencedColumnName = "id", nullable = false)
    private Planet toPlanet;

}

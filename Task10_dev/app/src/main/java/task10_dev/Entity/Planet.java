package task10_dev.Entity;

import jakarta.persistence.*;
import lombok.Data;

import javax.validation.constraints.Pattern;

@Data
@Entity
public class Planet {

    @Id
    @Pattern(regexp = "^[A-Z0-9]+$")
    private String id;

    @Column(name = "name", length = 500)
    private String name;
}

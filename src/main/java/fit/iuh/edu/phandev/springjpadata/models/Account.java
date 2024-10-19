package fit.iuh.edu.phandev.springjpadata.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY
    )
    private long id;
    @Column(name = "username",nullable = false)
    private String username;
    private double amount;
}

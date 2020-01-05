package pl.sda.springproject.entities;




import lombok.Data;
import pl.sda.springproject.enums.UserType;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column
    private String authorizedLogin;

    @Column
    @Enumerated(EnumType.STRING)
    private UserType userType;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Track> userTracks;


}

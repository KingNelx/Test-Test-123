package crudbe.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "admins")
public class Admin {

    @Id
    @GeneratedValue

    private @Getter @Setter Long id;
    private @Getter @Setter String userName;
    private @Getter @Setter String email;
    private @Getter @Setter String password;
    private @Getter @Setter String role;

}

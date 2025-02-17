package cz.upce.fei.nnpiacv.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private long id;
    private String email;
    private String password;
}

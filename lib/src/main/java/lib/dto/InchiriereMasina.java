package lib.dto;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
public class InchiriereMasina implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private UserDTO useri;

    @OneToMany
    private Masina masina;
    private Date date;

    public InchiriereMasina(int id, UserDTO useri, Masina masina, Date date) {
        this.id = id;
        this.useri = useri;
        this.masina = masina;
        this.date = date;
    }

    public InchiriereMasina(String numarMasina, String date) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserDTO getUseri() {
        return useri;
    }

    public void setUseri(UserDTO useri) {
        this.useri = useri;
    }

    public Masina getMasina() {
        return masina;
    }

    public void setMasina(Masina masina) {
        this.masina = masina;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
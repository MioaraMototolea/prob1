package lib.dto;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Masina implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated
    private Marca marca;

    @Embedded
    private NumarInmatriculare numar;

    public Masina(int id, Marca marca, NumarInmatriculare numar) {
        this.id = id;
        this.marca = marca;
        this.numar = numar;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Marca getMarca() {
        return marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Masina masina = (Masina) o;
        return id == masina.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public NumarInmatriculare getNumar() {
        return numar;
    }

    public void setNumar(NumarInmatriculare numar) {
        this.numar = numar;
    }
}

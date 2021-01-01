package lib.dto;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class NumarInmatriculare implements Serializable {
   private String judet;
    private String numar;
    private String cod;

    public NumarInmatriculare(String judet, String numar, String cod) {
        this.judet = judet;
        this.numar = numar;
        this.cod = cod;
    }

    public String getJudet() {
        return judet;
    }

    public void setJudet(String judet) {
        this.judet = judet;
    }

    public String getNumar() {
        return numar;
    }

    public void setNumar(String numar) {
        this.numar = numar;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        return "NumarInmatriculare{" +
                "judet='" + judet + '\'' +
                ", numar='" + numar + '\'' +
                ", cod='" + cod + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumarInmatriculare that = (NumarInmatriculare) o;
        return Objects.equals(judet, that.judet) &&
                Objects.equals(numar, that.numar) &&
                Objects.equals(cod, that.cod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(judet, numar, cod);
    }
}

package one.digitainnovation.model;

import java.util.Objects;

public class Obj extends ObjArvore<Obj> {
    Integer novValor;

    public Obj(Integer novValor){
        this.novValor = novValor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obj obj = (Obj) o;
        return Objects.equals(novValor, obj.novValor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(novValor);
    }

    @Override
    public int compareTo(Obj outro) {
        int i = 0;
        if(this.novValor > outro.novValor){
            i = 1;
        }else if(this.novValor < outro.novValor){
            i = -1;
        }
        return i;
    }

    @Override
    public String toString() {
        return novValor.toString();
    }
}

package ar.edu.cac;

import java.util.ArrayList;
import java.util.List;

public class Guerrero {

    private Integer nivelDeLucha;

    private List<Artefacto> artefactos;

    public Guerrero(){
        artefactos = new ArrayList<>();
        nivelDeLucha = 0;
    }

    public Integer getNivelDeLucha() {
        return nivelDeLucha;
    }

    public void setNivelDeLucha(Integer nivelDeLucha) {
        this.nivelDeLucha = nivelDeLucha;
    }

    public List<Artefacto> getArtefactos() {
        return artefactos;
    }

    public void setArtefactos(List<Artefacto> artefactos) {
        this.artefactos = artefactos;
    }

    public void agregarArtefacto(Artefacto artefacto){
        artefactos.add(artefacto);
    }

    public Integer getCantidadArtefactos(){
        return artefactos.size();
    }
}

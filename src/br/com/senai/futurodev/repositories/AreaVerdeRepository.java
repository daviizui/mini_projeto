package br.com.senai.futurodev.repositories;

import br.com.senai.futurodev.models.AreaVerde;

import java.util.ArrayList;
import java.util.List;

public class AreaVerdeRepository {
    private static final List<AreaVerde> AREA_VERDE = new ArrayList<>();

    public void inserir(AreaVerde novaareaVerde){
        novaareaVerde.setId(AREA_VERDE.size() + 1);
        AREA_VERDE.add(novaareaVerde);
    }

    public static List<AreaVerde> listatodos() {
        List<AreaVerde> listatodos = new ArrayList<>(AREA_VERDE);
        return listatodos;
        //return new ArrayList<>(AREAS_VERDES);
    }

    public AreaVerde buscar(int idAreaVerde){
        for (AreaVerde areaVerde : AREA_VERDE){
            if (idAreaVerde == areaVerde.getId()){
                return areaVerde;
            }
        }
            return null;
    }
}

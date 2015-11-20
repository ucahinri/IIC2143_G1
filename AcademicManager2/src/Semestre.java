import java.util.*;

/**
 * Created by ahinri on 11-10-2015.
 */
public class Semestre {
    int id_semestre;
    ArrayList<Double> notas = new ArrayList<Double>();
    ArrayList<Ramo> ramos= new ArrayList<Ramo>();

    public Semestre(int id_semestre){
        this.id_semestre=id_semestre;
        notas=new ArrayList<Double>();

    }

    public boolean agregarRamo(Ramo ramo){
        try{
            ramos.add(ramo);
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

}

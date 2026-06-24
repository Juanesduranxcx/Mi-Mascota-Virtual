public class Mascota {
    private String nombre;
    private int energia ;
    private int hambre  ;

    public Mascota(String nombre ){
        this.nombre = nombre;
        this.energia = 100;
        this.hambre = 0;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getHambre() {
        return hambre;
    }

    public void setHambre(int hambre) {
        this.hambre = hambre;
    }
}

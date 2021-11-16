package co.edu.uis;

import org.springframework.boot.autoconfigure.domain.EntityScan;
 
// (2)
@EntityScan
public class Persona {
 
    // (4)
    private String nombre;
    private String lang;

    public String getNombre(){
        return this.nombre;
    }

    public String getLang()
    {
        return this.lang;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setLang(String lang){
        this.lang=lang;
    }
    
}
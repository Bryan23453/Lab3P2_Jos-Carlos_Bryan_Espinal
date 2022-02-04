
package lab3p2_jose.carlos_bryan_espinal;


/**
 *
 * @author bryan
 */
public class conductores extends personas {
    
    private int experiencia;
    private String apodo;
  


    public conductores(int experiencia, String apodo, String nom, String fecha, int id) {
        super(nom, fecha, id);
        this.experiencia = experiencia;
        this.apodo = apodo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    @Override
    public String toString() {
        return super.toString()
        + " experiencia=" + experiencia + ", apodo=" + apodo + '}';
    }


    }
    
    

    
    

   
 
    


package categorias;

public class Memento {
	
	private String categoria;
    private String equipo;
    public Memento(String categoria, String equipo) {
       this.categoria = categoria;
       this.equipo = equipo;
   }
   public String getCategoria() {
       return this.categoria;
   }
   public void setCategoria(String categoria) {
       this.categoria = categoria;
   }
   public String getEquipo() {
       return this.equipo;
   }
   public void setEquipo(String equipo) {
       this.equipo = equipo;
   }

}

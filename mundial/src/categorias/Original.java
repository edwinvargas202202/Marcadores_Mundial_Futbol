package categorias;

public class Original {
	
	private String categoria;
    private String equipo;
   // ---------------------------
    public Original(String categoria, String equipo) {
       this.categoria = categoria;
       this.equipo = equipo;
   }
   // ---------------------------
    public void setMemento(Memento m) {
       this.categoria = m.getCategoria();
       this.equipo = m.getEquipo();
   }
   // ---------------------------
    public Memento createMemento() {
       return new Memento(categoria, equipo);
   }
   // ---------------------------
   public String getCategoria() {
       return this.categoria;
   }
   // ---------------------------
   public void setCategoria(String categoria) {
       this.categoria = categoria;
   }
   // ---------------------------
   public String getEquipo() {
       return this.equipo;
   }
   // ---------------------------
   public void setEquipo(String equipo) {
       this.equipo = equipo;
   }

}


package capitulo11.collections;

/**
 *
 * @author T-101
 */
public class opcion {
    private String titulo;
    private boolean estatus;

    public opcion(String titulo, boolean estatus) {
        this.titulo = titulo;
        this.estatus = estatus;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }
}

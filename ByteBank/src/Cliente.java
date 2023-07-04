public class Cliente implements Autenticable {
    private String nombre;
    private String documento;
    private String telefono;

    private String clave;

    public String getNombre() {
        System.out.println(this.nombre);
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public void setClave(String clave) {


    }

    @Override
    public boolean iniciarSesion(String clave) {
        if (clave == this.clave) {
            return true;
        } else {
            return false;
        }
    }
}

public class Administrador extends Funcionario implements Autenticable{
    private String clave;

    public String getClave() {
        return clave;
    }
    @Override
    public void setClave(String clave) {
        this.clave = clave;
    }
    @Override
    public boolean iniciarSesion(String clave){
        if (clave == this.clave){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getBonificacion() {
        return 0;
    }
}

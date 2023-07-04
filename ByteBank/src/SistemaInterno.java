public class SistemaInterno {

    public boolean autenticar(Autenticable usuario, String clave) {
        boolean puedeIniciarSesion = usuario.iniciarSesion(clave);
        if (puedeIniciarSesion) {
            System.out.println("Exitoso");
            return true;
        } else {
            System.out.println("Fallido");
            return false;
        }

    }
}

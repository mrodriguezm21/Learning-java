public class Main {
    public static void main(String[] args) {
/*        Funcionario funcionario = new Contador();
        funcionario.setSalario(2000);
        Gerente gerente = new Gerente();
        gerente.setSalario(4000);
        Contador contador = new Contador();
        contador.setSalario(3000);

        ControlBonificacion controlBonificacion = new ControlBonificacion();
        controlBonificacion.registrarSalario(funcionario);
        controlBonificacion.registrarSalario(gerente);
        controlBonificacion.registrarSalario(contador);
        gerente.setClave("947");

        SistemaInterno sistemaInterno = new SistemaInterno();

        sistemaInterno.autenticar(gerente, "947");

        funcionario.setNombre("Pedro");
        funcionario.setDocumento("1234");*/


        CuentaAhorros cuentaAhorros = new CuentaAhorros(33,2565);
        cuentaAhorros.retirar(200);
        cuentaAhorros.depositar(2100);
        cuentaAhorros.retirar(200);
        cuentaAhorros.getSaldo();
    }
}
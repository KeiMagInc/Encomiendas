package encomiendas.model.entity.usuarios;


public class Empleado extends Usuario {

    private String telefonoAdicional;

    public Empleado(String cedula, String nombres, String apellidos, String correo, String telefono, String ciudad, String telefonoAdicional,Boolean activo, int idAgencia) {
        super(cedula, nombres, apellidos, correo, telefono, ciudad, telefonoAdicional, activo, idAgencia);
    }




}

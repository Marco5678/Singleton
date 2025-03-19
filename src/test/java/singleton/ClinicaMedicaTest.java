package singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClinicaMedicaTest {

    @Test
    public void deveRetornarMedicoResponsavel() {
        ClinicaMedica.getInstance().setMedicoResponsavel("Dr. Rafael");
        assertEquals("Dr. Rafael", ClinicaMedica.getInstance().getMedicoResponsavel());
    }

    @Test
    public void deveRetornarPacienteEmAtendimento() {
        ClinicaMedica.getInstance().setPacienteEmAtendimento("João Pedro");
        assertEquals("João Pedro", ClinicaMedica.getInstance().getPacienteEmAtendimento());
    }
}


package singleton;

public class ClinicaMedica {

    private ClinicaMedica() {}
    private static ClinicaMedica instance = new ClinicaMedica();

    public static ClinicaMedica getInstance() {
        return instance;
    }

    private String medicoResponsavel;
    private String pacienteEmAtendimento;

    public String getMedicoResponsavel() {
        return medicoResponsavel;
    }

    public void setMedicoResponsavel(String medicoResponsavel) {
        this.medicoResponsavel = medicoResponsavel;
    }

    public String getPacienteEmAtendimento() {
        return pacienteEmAtendimento;
    }

    public void setPacienteEmAtendimento(String pacienteEmAtendimento) {
        this.pacienteEmAtendimento = pacienteEmAtendimento;
    }
}

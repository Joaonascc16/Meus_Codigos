import java.time.LocalDate;

public class Pessoa {

    private String nome;
    private String email;
    private String cpf;
    private LocalDate dataNascimeinto;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimeinto() {
        return dataNascimeinto;
    }

    public void setDataNascimeinto(LocalDate dataNascimeinto) {
        this.dataNascimeinto = dataNascimeinto;
    }
}
public class Cliente {
    private static int nextId = 0;

    private final int id;
    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.id = nextId++;
        this.nome = nome;
        this.email = email;
    }

    // getters
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}

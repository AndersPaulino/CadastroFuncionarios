package br.com.example.cadastro.cadastro_app.entity;

public enum UserRole {
    ADMIN("admin"),
    USER("user");
    private String role;

    UserRole(String role){
        this.role = role;
    }

    public String getRole(){
        return role;
    }
}

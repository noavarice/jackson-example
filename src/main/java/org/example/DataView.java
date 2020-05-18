package org.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author noavarice
 * @since 1.0
 */
// Оригинальный респонс содержит больше пропертей - если они не нужны, то можно повесить эту аннотацию
@JsonIgnoreProperties(ignoreUnknown = true)
// этот класс написал как класс, а не интерфейс, для примера - тут не надо ничего указывать вообще, кроме аннотации выше
// все заработает автоматически
public class DataView {

    private int id;

    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
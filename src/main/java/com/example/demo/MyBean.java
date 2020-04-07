package com.example.demo;

public class MyBean {
    private Integer id;
    private String name;
    private String path;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "MyBean{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", path='" + path + '\'' +
            '}';
    }
}

package cn.itsource.springboot.mybatis.domain;

public class Department {
    private Long Id;
    private String name;

    public Department() {
    }

    public Department(Long id) {
        Id = id;
    }

    public Department(String name) {
        this.name = name;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Deapartment{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}

package com.example.lab1;

public class testEntity {
    private String id;
    private String qid;

    public testEntity() {
    }

    public testEntity(String id, String qid) {
        this.id = id;
        this.qid = qid;
    }

    @Override
    public String toString() {
        return "testEntity{" +
                "id='" + id + '\'' +
                ", qid='" + qid + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQid() {
        return qid;
    }

    public void setQid(String qid) {
        this.qid = qid;
    }
}

package com.fizzanasir.learn_and_test;

public class learning_list {
    int id;
    int imageid;
    String alphabet;

    public learning_list(int id, int imageid, String alphabet) {
        this.id=id;
        this.imageid = imageid;
        this.alphabet = alphabet;
    }

    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }

    public String getAlphabet() {
        return alphabet;
    }

    public void setAlphabet(String alphabet) {
        this.alphabet = alphabet;
    }
}

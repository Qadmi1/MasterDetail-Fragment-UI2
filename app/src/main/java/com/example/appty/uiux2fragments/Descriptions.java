package com.example.appty.uiux2fragments;

/**
 * Created by appty on 02/04/18.
 */

public class Descriptions {

    private String name;
    private String desc;
    private int img;

    public Descriptions(String name, String desc, int img) {
        this.name = name;
        this.desc = desc;
        this.img = img;
    }

    public static final Descriptions[] descriptionArray = {
            new Descriptions("title1","hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh",
                    R.drawable.kotlin),
            new Descriptions("title2","hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh",
                    R.drawable.javascript),
            new Descriptions("title3","hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh",
                    R.drawable.javascript),
            new Descriptions("title4","hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh",
            R.drawable.javascript)
    };

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getImg() {
        return img;
    }

    public String toString() {
        return this.name;
    }
}

package com.example.dishas;
public class ListData {
    String name;
    int category,desc,eligibility,benefits,apply,documents,link;
    int image;
    public ListData(String name, int category, int desc, int eligibility, int benefits,int apply,int documents,int link, int i) {
        this.name = name;
        this.category = category;
        this.desc = desc;
        this.eligibility= eligibility;
        this.benefits=benefits;
        this.apply=apply;
        this.documents=documents;
        this.link=link;
        this.image = image;
    }
}

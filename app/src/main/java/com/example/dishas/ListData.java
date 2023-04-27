package com.example.dishas;
public class ListData {

    int name;
    int category,desc,eligibility,benefits,apply,documents,link;
    int image;
    public ListData(int name, int category, int desc, int eligibility, int benefits,int apply,int documents,int link, int image) {


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

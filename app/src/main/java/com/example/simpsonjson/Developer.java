package com.example.simpsonjson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Developer {

    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("type")
    @Expose
    public String type;

}

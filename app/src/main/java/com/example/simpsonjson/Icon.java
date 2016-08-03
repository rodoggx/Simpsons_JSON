package com.example.simpsonjson;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Icon {

    @SerializedName("URL")
    @Expose
    public String uRL;
    @SerializedName("Height")
    @Expose
    public String height;
    @SerializedName("Width")
    @Expose
    public String width;

}

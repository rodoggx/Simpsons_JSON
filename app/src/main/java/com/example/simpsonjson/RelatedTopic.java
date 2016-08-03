
package com.example.simpsonjson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RelatedTopic {

    @SerializedName("Result")
    @Expose
    public String result;
    @SerializedName("Icon")
    @Expose
    public Icon icon;
    @SerializedName("FirstURL")
    @Expose
    public String firstURL;
    @SerializedName("Text")
    @Expose
    public String text;

}

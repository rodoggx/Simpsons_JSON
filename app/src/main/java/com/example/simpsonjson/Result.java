
package com.example.simpsonjson;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("DefinitionSource")
    @Expose
    public String definitionSource;
    @SerializedName("Heading")
    @Expose
    public String heading;
    @SerializedName("ImageWidth")
    @Expose
    public Integer imageWidth;
    @SerializedName("RelatedTopics")
    @Expose
    public List<RelatedTopic> relatedTopics = new ArrayList<RelatedTopic>();
    @SerializedName("Entity")
    @Expose
    public String entity;
    @SerializedName("meta")
    @Expose
    public Meta meta;
    @SerializedName("Type")
    @Expose
    public String type;
    @SerializedName("Redirect")
    @Expose
    public String redirect;
    @SerializedName("DefinitionURL")
    @Expose
    public String definitionURL;
    @SerializedName("AbstractURL")
    @Expose
    public String abstractURL;
    @SerializedName("Definition")
    @Expose
    public String definition;
    @SerializedName("AbstractSource")
    @Expose
    public String abstractSource;
    @SerializedName("Infobox")
    @Expose
    public String infobox;
    @SerializedName("Image")
    @Expose
    public String image;
    @SerializedName("ImageIsLogo")
    @Expose
    public Integer imageIsLogo;
    @SerializedName("Abstract")
    @Expose
    public String _abstract;
    @SerializedName("AbstractText")
    @Expose
    public String abstractText;
    @SerializedName("AnswerType")
    @Expose
    public String answerType;
    @SerializedName("ImageHeight")
    @Expose
    public Integer imageHeight;
    @SerializedName("Answer")
    @Expose
    public String answer;
    @SerializedName("Results")
    @Expose
    public List<Object> results = new ArrayList<Object>();

}

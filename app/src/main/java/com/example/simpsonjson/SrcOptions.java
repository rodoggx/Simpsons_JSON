
package com.example.simpsonjson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SrcOptions {

    @SerializedName("skip_end")
    @Expose
    public String skipEnd;
    @SerializedName("skip_abstract")
    @Expose
    public Integer skipAbstract;
    @SerializedName("skip_qr")
    @Expose
    public String skipQr;
    @SerializedName("language")
    @Expose
    public String language;
    @SerializedName("skip_icon")
    @Expose
    public Integer skipIcon;
    @SerializedName("skip_image_name")
    @Expose
    public Integer skipImageName;
    @SerializedName("directory")
    @Expose
    public String directory;
    @SerializedName("min_abstract_length")
    @Expose
    public String minAbstractLength;
    @SerializedName("skip_abstract_paren")
    @Expose
    public Integer skipAbstractParen;
    @SerializedName("is_wikipedia")
    @Expose
    public Integer isWikipedia;
    @SerializedName("source_skip")
    @Expose
    public String sourceSkip;
    @SerializedName("is_fanon")
    @Expose
    public Integer isFanon;
    @SerializedName("is_mediawiki")
    @Expose
    public Integer isMediawiki;
    @SerializedName("src_info")
    @Expose
    public String srcInfo;

}

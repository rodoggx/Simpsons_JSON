
package com.example.simpsonjson;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meta {

    @SerializedName("maintainer")
    @Expose
    public Maintainer maintainer;
    @SerializedName("perl_module")
    @Expose
    public String perlModule;
    @SerializedName("status")
    @Expose
    public String status;
    @SerializedName("production_state")
    @Expose
    public String productionState;
    @SerializedName("dev_date")
    @Expose
    public Object devDate;
    @SerializedName("js_callback_name")
    @Expose
    public String jsCallbackName;
    @SerializedName("signal_from")
    @Expose
    public String signalFrom;
    @SerializedName("live_date")
    @Expose
    public Object liveDate;
    @SerializedName("src_id")
    @Expose
    public Integer srcId;
    @SerializedName("src_options")
    @Expose
    public SrcOptions srcOptions;
    @SerializedName("repo")
    @Expose
    public String repo;
    @SerializedName("developer")
    @Expose
    public List<Developer> developer = new ArrayList<Developer>();
    @SerializedName("tab")
    @Expose
    public String tab;
    @SerializedName("producer")
    @Expose
    public Object producer;
    @SerializedName("unsafe")
    @Expose
    public Integer unsafe;
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("dev_milestone")
    @Expose
    public String devMilestone;
    @SerializedName("topic")
    @Expose
    public List<String> topic = new ArrayList<String>();
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("attribution")
    @Expose
    public Object attribution;
    @SerializedName("created_date")
    @Expose
    public Object createdDate;
    @SerializedName("example_query")
    @Expose
    public String exampleQuery;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("is_stackexchange")
    @Expose
    public Object isStackexchange;
    @SerializedName("designer")
    @Expose
    public Object designer;
    @SerializedName("src_domain")
    @Expose
    public String srcDomain;
    @SerializedName("src_name")
    @Expose
    public String srcName;
    @SerializedName("blockgroup")
    @Expose
    public Object blockgroup;
    @SerializedName("src_url")
    @Expose
    public Object srcUrl;

}

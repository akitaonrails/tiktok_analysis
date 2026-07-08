package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class HotListStruct implements Serializable {

    @C09CT("footer")
    public String footer;

    @C09CT("header")
    public String header;

    @C09CT("image_url")
    public String imageUrl;

    @C09CT("schema")
    public String schema;

    @C09CT("title")
    public String titile;

    @C09CT("type")
    public int type;

    public boolean isLocalHot() {
        return this.type == 9;
    }

    public String getFooter() {
        return this.footer;
    }

    public String getHeader() {
        return this.header;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getTitile() {
        return this.titile;
    }

    public int getType() {
        return this.type;
    }

    public void setFooter(String str) {
        this.footer = str;
    }

    public void setHeader(String str) {
        this.header = str;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setTitile(String str) {
        this.titile = str;
    }

    public void setType(int i) {
        this.type = i;
    }
}

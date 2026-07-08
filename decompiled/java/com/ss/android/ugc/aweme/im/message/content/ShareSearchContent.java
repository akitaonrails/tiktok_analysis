package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class ShareSearchContent extends BaseContent {

    @C09CT("desc")
    public String desc;

    @C09CT("image")
    public String image;

    @C09CT("schema")
    public String schema;

    @C09CT("title")
    public String title;

    @C09CT("url")
    public String url;

    public final String getDesc() {
        return this.desc;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setImage(String str) {
        this.image = str;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }
}

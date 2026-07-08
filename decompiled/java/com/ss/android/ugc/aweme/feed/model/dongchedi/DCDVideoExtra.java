package com.ss.android.ugc.aweme.feed.model.dongchedi;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class DCDVideoExtra implements Serializable {

    @C09CT("desc")
    public String desc;

    @C09CT("schema")
    public String schema;

    @C09CT("title")
    public String title;

    public final String getDesc() {
        return this.desc;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}

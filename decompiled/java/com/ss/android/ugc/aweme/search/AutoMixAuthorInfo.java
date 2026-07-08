package com.ss.android.ugc.aweme.search;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class AutoMixAuthorInfo implements Serializable {

    @C09CT("schema_url")
    public String schemaUrl;

    @C09CT("title")
    public String title;

    public final String getSchemaUrl() {
        return this.schemaUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setSchemaUrl(String str) {
        this.schemaUrl = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}

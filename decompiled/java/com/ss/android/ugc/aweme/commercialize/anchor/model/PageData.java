package com.ss.android.ugc.aweme.commercialize.anchor.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class PageData implements Serializable {

    @C09CT("page_id")
    public final String pageId;

    @C09CT("page_json")
    public String pageJson;

    public final String getPageId() {
        return this.pageId;
    }

    public final String getPageJson() {
        return this.pageJson;
    }

    public final void setPageJson(String str) {
        this.pageJson = str;
    }
}

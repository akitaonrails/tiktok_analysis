package com.ss.android.ugc.aweme.commerce;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class BizAccountSwitchInfo implements Serializable {

    @C09CT("schema")
    public String schema;

    @C09CT("subtitle")
    public String subtitle;

    @C09CT("title")
    public String title;

    public final String getSchema() {
        return this.schema;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setSubtitle(String str) {
        this.subtitle = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}

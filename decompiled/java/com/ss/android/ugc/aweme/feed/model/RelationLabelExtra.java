package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class RelationLabelExtra implements Serializable {

    @C09CT("after_text")
    public String afterText = "";

    @C09CT("comment_id")
    public String cid = "";

    @C09CT("tab_text")
    public String tabText = "";

    public final String getAfterText() {
        return this.afterText;
    }

    public final String getCid() {
        return this.cid;
    }

    public final String getTabText() {
        return this.tabText;
    }

    public final void setAfterText(String str) {
        this.afterText = str;
    }

    public final void setCid(String str) {
        this.cid = str;
    }

    public final void setTabText(String str) {
        this.tabText = str;
    }
}

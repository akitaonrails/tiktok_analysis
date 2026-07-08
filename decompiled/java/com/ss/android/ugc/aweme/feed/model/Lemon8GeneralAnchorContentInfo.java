package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes30.dex */
public final class Lemon8GeneralAnchorContentInfo implements Serializable {

    @C09CT("keyword")
    public String keyword = "";

    @C09CT("subtype")
    public String subtype = "";

    @C09CT("type")
    public int type;

    public final String getKeyword() {
        return this.keyword;
    }

    public final String getSubtype() {
        return this.subtype;
    }

    public final int getType() {
        return this.type;
    }

    public final void setKeyword(String str) {
        this.keyword = str;
    }

    public final void setSubtype(String str) {
        this.subtype = str;
    }

    public final void setType(int i) {
        this.type = i;
    }
}

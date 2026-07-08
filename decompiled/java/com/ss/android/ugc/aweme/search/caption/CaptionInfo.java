package com.ss.android.ugc.aweme.search.caption;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class CaptionInfo implements Serializable {

    @C09CT("keyword")
    public String keyword = "";

    @C09CT("link")
    public String link = "";

    public final String getKeyword() {
        return this.keyword;
    }

    public final String getLink() {
        return this.link;
    }

    public final void setKeyword(String str) {
        this.keyword = str;
    }

    public final void setLink(String str) {
        this.link = str;
    }
}

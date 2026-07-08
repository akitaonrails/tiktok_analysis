package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class AnchorShopLinkStruct implements Serializable {

    @C09CT("keyword")
    public String keyword;

    @C09CT("url")
    public String url;

    public final String getKeyword() {
        return this.keyword;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setKeyword(String str) {
        this.keyword = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }
}

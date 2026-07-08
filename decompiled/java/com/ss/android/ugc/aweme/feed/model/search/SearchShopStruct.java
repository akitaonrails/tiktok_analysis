package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class SearchShopStruct implements Serializable {

    @C09CT("height")
    public int height;

    @C09CT("rawData")
    public String rawData;

    @C09CT("scheme")
    public String scheme;

    public final int getHeight() {
        return this.height;
    }

    public final String getRawData() {
        return this.rawData;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setRawData(String str) {
        this.rawData = str;
    }

    public final void setScheme(String str) {
        this.scheme = str;
    }
}

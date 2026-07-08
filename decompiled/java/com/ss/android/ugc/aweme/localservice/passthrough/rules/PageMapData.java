package com.ss.android.ugc.aweme.localservice.passthrough.rules;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class PageMapData {

    @C09CT("btm")
    public final String btm;

    @C09CT("current_page")
    public final String currentPage;

    public PageMapData() {
        this("", "");
    }

    public PageMapData(String str, String str2) {
        this.btm = str;
        this.currentPage = str2;
    }
}

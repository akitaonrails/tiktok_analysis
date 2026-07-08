package com.ss.android.ugc.aweme.ecommerce.base.addon.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PageContextInfo {

    @C09CT("cur_page")
    public final String curPage;

    @C09CT("prev_page")
    public final String prevPage;

    public PageContextInfo(String str, String str2) {
        this.prevPage = str;
        this.curPage = str2;
    }
}

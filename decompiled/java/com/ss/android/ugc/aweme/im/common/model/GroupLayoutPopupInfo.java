package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class GroupLayoutPopupInfo {

    @C09CT("link_text")
    public final String linkText;

    @C09CT("schema")
    public final String scheme;

    @C09CT("title")
    public final String title;

    public GroupLayoutPopupInfo() {
        this("", "", "");
    }

    public GroupLayoutPopupInfo(String str, String str2, String str3) {
        this.title = str;
        this.linkText = str2;
        this.scheme = str3;
    }
}

package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class CVVHintInfo {

    @C09CT("button_text")
    public final String buttonOK;

    @C09CT("content")
    public final String content;

    @C09CT("dark_mode_icon_url")
    public final String darkModeIconUrl;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("title")
    public final String title;

    public CVVHintInfo() {
        this(null, null, null, null, null);
    }

    public CVVHintInfo(String str, String str2, String str3, String str4, String str5) {
        this.iconUrl = str;
        this.darkModeIconUrl = str2;
        this.title = str3;
        this.content = str4;
        this.buttonOK = str5;
    }
}

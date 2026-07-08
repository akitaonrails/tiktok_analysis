package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class SecurityInfoItem {

    @C09CT("dark_mode_icon_url")
    public final String darkModeIconUrl;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("text")
    public final String text;

    @C09CT("url")
    public final String url;

    public SecurityInfoItem() {
        this(null, null, null, null);
    }

    public SecurityInfoItem(String str, String str2, String str3, String str4) {
        this.text = str;
        this.url = str2;
        this.iconUrl = str3;
        this.darkModeIconUrl = str4;
    }
}

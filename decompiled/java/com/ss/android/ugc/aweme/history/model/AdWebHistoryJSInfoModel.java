package com.ss.android.ugc.aweme.history.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AdWebHistoryJSInfoModel implements Serializable {
    public static final int $stable = 0;

    @C09CT("cover_url")
    public final String coverUrl;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("title")
    public final String title;

    @C09CT("url")
    public final String url;

    public AdWebHistoryJSInfoModel() {
        this(null, null, null, null);
    }

    public AdWebHistoryJSInfoModel(String str, String str2, String str3, String str4) {
        this.url = str;
        this.title = str2;
        this.coverUrl = str3;
        this.iconUrl = str4;
    }
}

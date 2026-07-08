package com.ss.android.ugc.profile.business.profile.experiment;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class BannerData implements Serializable {
    public static final int $stable = 0;

    @C09CT("button")
    public final String button;

    @C09CT("description")
    public final String description;

    @C09CT("icon")
    public final String icon;

    @C09CT("url")
    public final String url;

    public BannerData() {
        this(null, null, null, null);
    }

    public final String getButton() {
        return this.button;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getUrl() {
        return this.url;
    }

    public BannerData(String str, String str2, String str3, String str4) {
        this.button = str;
        this.description = str2;
        this.icon = str3;
        this.url = str4;
    }
}

package com.ss.android.ugc.aweme.search.model;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class ThemeColor {

    @C09CT("dark")
    public final String dark;

    @C09CT("light")
    public final String light;

    public ThemeColor() {
        this(null, null);
    }

    public ThemeColor(String str, String str2) {
        this.light = str;
        this.dark = str2;
    }
}

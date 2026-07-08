package com.bytedance.pipo.verify.base.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class IconUrl {

    @C09CT("dark")
    public final String dark;

    @C09CT("light")
    public final String light;

    public IconUrl() {
        this(null, null);
    }

    public IconUrl(String str, String str2) {
        this.dark = str;
        this.light = str2;
    }
}

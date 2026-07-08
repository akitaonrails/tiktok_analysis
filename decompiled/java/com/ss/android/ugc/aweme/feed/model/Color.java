package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class Color implements Serializable {

    @C09CT("light")
    public String light = "";

    @C09CT("dark")
    public String dark = "";

    public final String getDark() {
        return this.dark;
    }

    public final String getLight() {
        return this.light;
    }

    public final void setDark(String str) {
        this.dark = str;
    }

    public final void setLight(String str) {
        this.light = str;
    }
}

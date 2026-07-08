package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes11.dex */
public final class Keyframe {

    @C09CT("timestamp")
    public final double timestamp;

    @C09CT("title")
    public final String title;

    @C09CT("url")
    public final String url;

    public final int hashCode() {
        int iHashCode = ((this.url.hashCode() * 31) + C786410Ut5.X2(this.timestamp)) * 31;
        String str = this.title;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public Keyframe() {
        this("", -1.0d, "");
    }

    public Keyframe(String str, double d, String str2) {
        this.url = str;
        this.timestamp = d;
        this.title = str2;
    }
}

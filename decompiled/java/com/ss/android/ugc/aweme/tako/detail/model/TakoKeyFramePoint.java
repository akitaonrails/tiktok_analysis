package com.ss.android.ugc.aweme.tako.detail.model;

import X.C09CT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TakoKeyFramePoint {

    @C09CT("timestamp")
    public final double timestamp;

    @C09CT("title")
    public String title;

    @C09CT("url")
    public final String url;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoKeyFramePoint)) {
            return false;
        }
        TakoKeyFramePoint takoKeyFramePoint = (TakoKeyFramePoint) obj;
        return Intrinsics.LJFF(this.url, takoKeyFramePoint.url) && Intrinsics.LJFF(this.title, takoKeyFramePoint.title) && Double.compare(this.timestamp, takoKeyFramePoint.timestamp) == 0;
    }

    public final int hashCode() {
        return (((this.url.hashCode() * 31) + this.title.hashCode()) * 31) + C786410Ut5.X2(this.timestamp);
    }

    public TakoKeyFramePoint() {
        this("", "", -1.0d);
    }

    public TakoKeyFramePoint(String str, String str2, double d) {
        this.url = str;
        this.title = str2;
        this.timestamp = d;
    }
}

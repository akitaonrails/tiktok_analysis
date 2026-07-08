package com.ss.android.ugc.aweme.poi.quiz.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class Location implements Serializable {

    @C09CT("lat")
    public final Float lat;

    @C09CT("lng")
    public final Float lng;

    /* JADX WARN: Illegal instructions before constructor call */
    public Location() {
        Float fValueOf = Float.valueOf(0.0f);
        this(fValueOf, fValueOf);
    }

    public int hashCode() {
        Float f = this.lat;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.lng;
        return iHashCode + (f2 != null ? f2.hashCode() : 0);
    }

    public Location(Float f, Float f2) {
        this.lat = f;
        this.lng = f2;
    }
}

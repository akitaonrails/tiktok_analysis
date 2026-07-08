package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public final class Coordinate implements Serializable {

    @C09CT("centerX")
    public final Float centerX;

    @C09CT("centerY")
    public final Float centerY;

    /* JADX WARN: Illegal instructions before constructor call */
    public Coordinate() {
        Float fValueOf = Float.valueOf(0.0f);
        this(fValueOf, fValueOf);
    }

    public Coordinate(Float f, Float f2) {
        this.centerX = f;
        this.centerY = f2;
    }
}

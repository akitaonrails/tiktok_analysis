package com.ss.android.ugc.aweme.poi;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class GuitarBundle {

    @C09CT("latitude")
    public double latitude;

    @C09CT("longitude")
    public double longitude;

    public GuitarBundle() {
        this(0.0d, 0.0d);
    }

    public final void setLatitude(double d) {
        this.latitude = d;
    }

    public final void setLongitude(double d) {
        this.longitude = d;
    }

    public GuitarBundle(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
    }
}

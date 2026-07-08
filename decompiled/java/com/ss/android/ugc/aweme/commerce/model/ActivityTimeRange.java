package com.ss.android.ugc.aweme.commerce.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ActivityTimeRange implements Serializable {

    @C09CT("end")
    public float end;

    @C09CT("start")
    public float start;

    public ActivityTimeRange() {
    }

    public ActivityTimeRange(float f, float f2) {
        this.start = f;
        this.end = f2;
    }
}

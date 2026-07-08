package com.ss.android.ugc.aweme.commerce;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class VideoInterval implements Serializable {

    @C09CT("end")
    public Float end;

    @C09CT("start")
    public Float start;

    public VideoInterval() {
        Float fValueOf = Float.valueOf(0.0f);
        this.start = fValueOf;
        this.end = fValueOf;
    }

    public final Float getEnd() {
        return this.end;
    }

    public final Float getStart() {
        return this.start;
    }

    public final void setEnd(Float f) {
        this.end = f;
    }

    public final void setStart(Float f) {
        this.start = f;
    }
}

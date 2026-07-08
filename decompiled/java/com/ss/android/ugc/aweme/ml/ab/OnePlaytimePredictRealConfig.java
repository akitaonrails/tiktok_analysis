package com.ss.android.ugc.aweme.ml.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class OnePlaytimePredictRealConfig {

    @C09CT("count")
    public int count;

    @C09CT("duration")
    public int duration;

    @C09CT("offset")
    public int offset;

    @C09CT("track_type")
    public int trackType = 101;

    @C09CT("type")
    public int type;

    public String toString() {
        return super.toString();
    }

    public final int getCount() {
        return this.count;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final int getTrackType() {
        return this.trackType;
    }

    public final int getType() {
        return this.type;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setOffset(int i) {
        this.offset = i;
    }

    public final void setTrackType(int i) {
        this.trackType = i;
    }

    public final void setType(int i) {
        this.type = i;
    }
}

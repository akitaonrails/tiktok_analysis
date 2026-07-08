package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class NeedPointStruct implements Serializable {

    @C09CT("point_type")
    public int pointType;

    @C09CT("time_stamp")
    public long timeStamp;

    public final int getPointType() {
        return this.pointType;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final void setPointType(int i) {
        this.pointType = i;
    }

    public final void setTimeStamp(long j) {
        this.timeStamp = j;
    }
}

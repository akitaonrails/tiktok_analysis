package com.bytedance.ies.ugc.aweme.commercialize.intelligence.fastscroll.model;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class AdFastScrollOutput implements Serializable {

    @C09CT("error_code")
    public final int errorCode;

    @C09CT("result")
    public final ArrayList<AdFastScrollPredictResult> result;

    @C09CT("timestamp")
    public final long timestamp;

    @C09CT("version")
    public final String version;

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final ArrayList<AdFastScrollPredictResult> getResult() {
        return this.result;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getVersion() {
        return this.version;
    }

    public AdFastScrollOutput(ArrayList<AdFastScrollPredictResult> arrayList, int i, long j, String str) {
        this.result = arrayList;
        this.errorCode = i;
        this.timestamp = j;
        this.version = str;
    }
}

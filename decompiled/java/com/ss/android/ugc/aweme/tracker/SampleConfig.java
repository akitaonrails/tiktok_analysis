package com.ss.android.ugc.aweme.tracker;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes14.dex */
public final class SampleConfig {

    @C09CT("sample_rate")
    public final Float sampleRate;

    @C09CT("tag")
    public final String tag;

    @C09CT("unique_key")
    public final String uniqueKey;

    public SampleConfig() {
        this(null, null, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SampleConfig(sampleRate=");
        sbLIZ.append(this.sampleRate);
        sbLIZ.append(", uniqueKey=");
        sbLIZ.append(this.uniqueKey);
        sbLIZ.append(", tag=");
        sbLIZ.append(this.tag);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SampleConfig(Float f, String str, String str2) {
        this.sampleRate = f;
        this.uniqueKey = str;
        this.tag = str2;
    }
}

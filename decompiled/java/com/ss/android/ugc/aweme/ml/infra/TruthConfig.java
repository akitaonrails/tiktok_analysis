package com.ss.android.ugc.aweme.ml.infra;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class TruthConfig {

    @C09CT("process_output_key")
    public final String processOutputKey;

    @C09CT("process_truth_key")
    public final String processTruthKey;

    @C09CT("sample_rate")
    public final float sampleRate;

    public TruthConfig() {
        this(0.0f, null, null);
    }

    public TruthConfig(float f, String str, String str2) {
        this.sampleRate = f;
        this.processOutputKey = str;
        this.processTruthKey = str2;
    }
}

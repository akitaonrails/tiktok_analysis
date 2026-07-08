package com.ss.android.ugc.aweme.ml.infra.synergy;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class CloudInferenceStateData {

    @C09CT("decision")
    public final int decision;

    @C09CT("details")
    public final String details;

    public CloudInferenceStateData() {
        this(0, "default");
    }

    public CloudInferenceStateData(int i, String str) {
        this.decision = i;
        this.details = str;
    }
}

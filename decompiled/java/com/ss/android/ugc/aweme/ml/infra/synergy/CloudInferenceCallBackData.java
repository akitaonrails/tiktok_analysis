package com.ss.android.ugc.aweme.ml.infra.synergy;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class CloudInferenceCallBackData {

    @C09CT("next_call")
    public final int nextCall;

    @C09CT("request_id")
    public final String requestId;

    public CloudInferenceCallBackData() {
        this(0, "");
    }

    public CloudInferenceCallBackData(int i, String str) {
        this.nextCall = i;
        this.requestId = str;
    }
}

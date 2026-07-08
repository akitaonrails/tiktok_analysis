package com.ss.android.ugc.aweme.ml.infra.synergy;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class ReportRequestParams {

    @C09CT("biz")
    public final String biz;

    @C09CT("input_data")
    public final String inputData;

    @C09CT("state_data")
    public final CloudInferenceStateData stateData;

    public ReportRequestParams() {
        this("", null, new CloudInferenceStateData(0, "default"));
    }

    public ReportRequestParams(String str, String str2, CloudInferenceStateData cloudInferenceStateData) {
        this.biz = str;
        this.inputData = str2;
        this.stateData = cloudInferenceStateData;
    }
}

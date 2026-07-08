package com.ss.android.ugc.aweme.ml.infra.synergy;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class ReportAndCallbackResponse {

    @C09CT("biz")
    public final String biz;

    @C09CT("callback_data")
    public final CloudInferenceCallBackData callbackData;

    @C09CT("data_type")
    public final int dataType;

    @C09CT("inference_result")
    public final String inferenceResult;

    public ReportAndCallbackResponse() {
        this("", 0, null, null);
    }

    public ReportAndCallbackResponse(String str, int i, CloudInferenceCallBackData cloudInferenceCallBackData, String str2) {
        this.biz = str;
        this.dataType = i;
        this.callbackData = cloudInferenceCallBackData;
        this.inferenceResult = str2;
    }
}

package com.ss.android.ugc.aweme.aigc.aifingerprint;

import X.C09CT;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;

/* JADX INFO: loaded from: classes23.dex */
public final class QueryAigcFingerprintResponse extends BaseNetResponse {
    public static final int $stable = 8;

    @C09CT("aigcFingerprint")
    public AigcFingerprintModel aigcFingerprintModel;

    public final AigcFingerprintModel getAigcFingerprintModel() {
        return this.aigcFingerprintModel;
    }

    public final void setAigcFingerprintModel(AigcFingerprintModel aigcFingerprintModel) {
        this.aigcFingerprintModel = aigcFingerprintModel;
    }
}

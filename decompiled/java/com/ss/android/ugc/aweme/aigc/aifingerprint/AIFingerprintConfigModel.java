package com.ss.android.ugc.aweme.aigc.aifingerprint;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class AIFingerprintConfigModel {

    @C09CT("algo_version")
    public final int algoVersion;

    @C09CT("algorithm_name")
    public final String algorithmName;

    @C09CT("business_id")
    public final String businessId;

    @C09CT("model_download_retry_cnt")
    public final int downloadRetryCnt;

    @C09CT("model_download_retry_interval")
    public final long downloadRetryInterval;

    @C09CT("enable_delay_init")
    public final boolean enableDelayInit;

    @C09CT("lens_model_name")
    public final String lensModelName;

    @C09CT("p_flag")
    public final int pFlag;

    public AIFingerprintConfigModel() {
        this("lens_wm_embed_conv11", "anti_cut_resize_0", 1, 0, false, "999", 3, 1000L);
    }

    public AIFingerprintConfigModel(String str, String str2, int i, int i2, boolean z, String str3, int i3, long j) {
        this.lensModelName = str;
        this.algorithmName = str2;
        this.algoVersion = i;
        this.pFlag = i2;
        this.enableDelayInit = z;
        this.businessId = str3;
        this.downloadRetryCnt = i3;
        this.downloadRetryInterval = j;
    }
}

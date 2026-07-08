package com.ss.android.ugc.aweme.plugin.realtimefeedbackexperiment;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class RealtimeFeedbackModel {

    @C09CT("is_server_config")
    public final Boolean isServerConfig;

    @C09CT("max_days")
    public final Integer maxDays;

    @C09CT("should_upload")
    public final Integer shouldUpload;

    @C09CT("vv_limit")
    public final Integer vvLimit;

    public RealtimeFeedbackModel(Integer num, Boolean bool, Integer num2, Integer num3) {
        this.shouldUpload = num;
        this.isServerConfig = bool;
        this.vvLimit = num2;
        this.maxDays = num3;
    }
}

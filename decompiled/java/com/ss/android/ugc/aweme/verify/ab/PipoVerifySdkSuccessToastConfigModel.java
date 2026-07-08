package com.ss.android.ugc.aweme.verify.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoVerifySdkSuccessToastConfigModel {

    @C09CT("custom_duration_ms")
    public final Long customDurationMs;

    @C09CT("enable_custom_duration")
    public final Boolean enableCustomDuration;

    public PipoVerifySdkSuccessToastConfigModel() {
        this(3000L, Boolean.FALSE);
    }

    public PipoVerifySdkSuccessToastConfigModel(Long l, Boolean bool) {
        this.customDurationMs = l;
        this.enableCustomDuration = bool;
    }
}

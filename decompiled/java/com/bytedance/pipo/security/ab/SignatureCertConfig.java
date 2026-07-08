package com.bytedance.pipo.security.ab;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class SignatureCertConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_block_mode")
    public final boolean enableBlockMode;

    @C09CT("enable_sign_failure_fallback_header")
    public final boolean enableSignFailureFallbackHeader;

    @C09CT("expire_opt_time")
    public final int expireOptTime;

    @C09CT("retry_config")
    public final SignatureCertRetryConfig retryConfig;

    @C09CT("sign_mode_configs")
    public final List<SignatureCertSignModeConfig> singModeConfigs;

    public SignatureCertConfig() {
        this(false, false, true, new SignatureCertRetryConfig(1, 100), 0, C1697810uHb.LJIILJJIL(new SignatureCertSignModeConfig("TTS", false), new SignatureCertSignModeConfig("TTLS", true)));
    }

    public SignatureCertConfig(boolean z, boolean z2, boolean z3, SignatureCertRetryConfig signatureCertRetryConfig, int i, List<SignatureCertSignModeConfig> list) {
        this.enable = z;
        this.enableBlockMode = z2;
        this.enableSignFailureFallbackHeader = z3;
        this.retryConfig = signatureCertRetryConfig;
        this.expireOptTime = i;
        this.singModeConfigs = list;
    }
}

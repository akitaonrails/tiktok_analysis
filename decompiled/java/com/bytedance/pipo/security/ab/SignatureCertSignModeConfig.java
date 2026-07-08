package com.bytedance.pipo.security.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class SignatureCertSignModeConfig {

    @C09CT("busi_line")
    public final String busiLine;

    @C09CT("use_sign_mode")
    public final boolean useSingMode;

    public SignatureCertSignModeConfig() {
        this("TTS", false);
    }

    public SignatureCertSignModeConfig(String str, boolean z) {
        this.busiLine = str;
        this.useSingMode = z;
    }
}

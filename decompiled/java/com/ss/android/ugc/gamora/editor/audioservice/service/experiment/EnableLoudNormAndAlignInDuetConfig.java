package com.ss.android.ugc.gamora.editor.audioservice.service.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes26.dex */
public final class EnableLoudNormAndAlignInDuetConfig {

    @C09CT("enable_aec")
    public final boolean enableAEC;

    @C09CT("enable_loudness_norm")
    public final boolean enableLoudnessNorm;

    @C09CT("enable_time_alignment")
    public final boolean enableTimeAlignment;

    @C09CT("use_red_mic_button")
    public final boolean useRedButton;

    public EnableLoudNormAndAlignInDuetConfig() {
        this(false, false, false, false);
    }

    public EnableLoudNormAndAlignInDuetConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.useRedButton = z;
        this.enableAEC = z2;
        this.enableLoudnessNorm = z3;
        this.enableTimeAlignment = z4;
    }
}

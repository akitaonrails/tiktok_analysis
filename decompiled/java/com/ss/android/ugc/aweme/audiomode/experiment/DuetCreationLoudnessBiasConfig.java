package com.ss.android.ugc.aweme.audiomode.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class DuetCreationLoudnessBiasConfig {

    @C09CT("editing_page_bgm_loudness_bias")
    public final int editingPageBgmLoudnessBias;

    @C09CT("shooting_page_bgm_loudness_bias_mic_off")
    public final int shootingPageBgmLoudnessBiasMicOff;

    @C09CT("shooting_page_bgm_loudness_bias_mic_on")
    public final int shootingPageBgmLoudnessBiasMicOn;

    public DuetCreationLoudnessBiasConfig() {
        this(0, 0, 0);
    }

    public DuetCreationLoudnessBiasConfig(int i, int i2, int i3) {
        this.shootingPageBgmLoudnessBiasMicOff = i;
        this.shootingPageBgmLoudnessBiasMicOn = i2;
        this.editingPageBgmLoudnessBias = i3;
    }
}

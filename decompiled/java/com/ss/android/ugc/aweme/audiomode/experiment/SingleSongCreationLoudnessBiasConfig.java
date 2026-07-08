package com.ss.android.ugc.aweme.audiomode.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class SingleSongCreationLoudnessBiasConfig {

    @C09CT("editing_page_bgm_loudness_bias")
    public final int editingPageBgmLoudnessBias;

    @C09CT("mdp_playback_loudness_bias")
    public final int mdpPlaybackLoudnessBias;

    @C09CT("shooting_page_bgm_loudness_bias_mic_off")
    public final int shootingPageBgmLoudnessBiasMicOff;

    @C09CT("shooting_page_bgm_loudness_bias_mic_on")
    public final int shootingPageBgmLoudnessBiasMicOn;

    public SingleSongCreationLoudnessBiasConfig() {
        this(0, 0, 0, 0);
    }

    public SingleSongCreationLoudnessBiasConfig(int i, int i2, int i3, int i4) {
        this.mdpPlaybackLoudnessBias = i;
        this.shootingPageBgmLoudnessBiasMicOff = i2;
        this.shootingPageBgmLoudnessBiasMicOn = i3;
        this.editingPageBgmLoudnessBias = i4;
    }
}

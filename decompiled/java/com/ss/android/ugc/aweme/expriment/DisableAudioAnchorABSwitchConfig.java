package com.ss.android.ugc.aweme.expriment;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class DisableAudioAnchorABSwitchConfig {

    @C09CT("disable_tts_anchor")
    public final boolean disableTTS;

    @C09CT("disable_voice_conversion_anchor")
    public final boolean disableVoiceConversion;

    public DisableAudioAnchorABSwitchConfig() {
        this(false, false);
    }

    public DisableAudioAnchorABSwitchConfig(boolean z, boolean z2) {
        this.disableTTS = z;
        this.disableVoiceConversion = z2;
    }
}

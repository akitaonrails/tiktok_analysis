package com.ss.android.ugc.gamora.editor.sticker.read.panel;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class TTSRankABSwitchConfig {

    @C09CT("tts_panel_use_new_voice_logic")
    public final boolean useNewVoiceLogic;

    @C09CT("tts_panel_use_new_voice_logic_time")
    public final long useNewVoiceLogicTime;

    @C09CT("tts_panel_use_recently_logic")
    public final boolean useRecentlyLogic;

    public TTSRankABSwitchConfig() {
        this(true, false, 604800L);
    }

    public TTSRankABSwitchConfig(boolean z, boolean z2, long j) {
        this.useRecentlyLogic = z;
        this.useNewVoiceLogic = z2;
        this.useNewVoiceLogicTime = j;
    }
}

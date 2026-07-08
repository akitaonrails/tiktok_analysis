package com.ss.android.ugc.aweme.audiomode.vopclone.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class InstantCloneConfig {

    @C09CT("enable_music_detail_page")
    public final boolean enableMusicDetailPage;

    @C09CT("enable_tts_panel")
    public final boolean enableTTSPanel;

    @C09CT("enable_voice_anchor")
    public final boolean enableVoiceAnchor;

    public InstantCloneConfig() {
        this(false, false, false);
    }

    public InstantCloneConfig(boolean z, boolean z2, boolean z3) {
        this.enableTTSPanel = z;
        this.enableVoiceAnchor = z2;
        this.enableMusicDetailPage = z3;
    }
}

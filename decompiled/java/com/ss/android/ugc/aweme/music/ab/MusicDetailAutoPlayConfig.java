package com.ss.android.ugc.aweme.music.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicDetailAutoPlayConfig {

    @C09CT("always_auto_play_mdp_music")
    public final boolean alwaysAutoPlayMDPMusic;

    @C09CT("enable_auto_play_mdp_music")
    public final boolean enableAutoPlayMDPMusic;

    @C09CT("enable_resume_play")
    public final boolean enableResumePlay;

    @C09CT("music_auto_play_from_trim_point")
    public final boolean musicAutoPlayFromTrimPoint;

    @C09CT("music_cover_design")
    public final int musicCoverDesign;

    public MusicDetailAutoPlayConfig() {
        this(false, 0, false, false, false);
    }

    public MusicDetailAutoPlayConfig(boolean z, int i, boolean z2, boolean z3, boolean z4) {
        this.enableAutoPlayMDPMusic = z;
        this.musicCoverDesign = i;
        this.musicAutoPlayFromTrimPoint = z2;
        this.alwaysAutoPlayMDPMusic = z3;
        this.enableResumePlay = z4;
    }
}

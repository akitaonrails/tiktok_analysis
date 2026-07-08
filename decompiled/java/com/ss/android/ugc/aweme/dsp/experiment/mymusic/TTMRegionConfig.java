package com.ss.android.ugc.aweme.dsp.experiment.mymusic;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class TTMRegionConfig {

    @C09CT("turning_auto_pop_count_config")
    public final int autoPopCountConfig;

    @C09CT("enable_preload")
    public final boolean enablePreload;

    @C09CT("player_entrance_schema")
    public final String playerEntranceSchema;

    @C09CT("preload_expired_time")
    public final long preloadExpiredTime;

    @C09CT("profile_library_schema")
    public final String profileLibrarySchema;

    @C09CT("profile_music_schema")
    public final String profilePlayerSchema;

    @C09CT("sub_player_schema")
    public final String subPlayerSchema;

    public TTMRegionConfig() {
        this("aweme://music/dsp/external?tab=library&music_tag=2", "aweme://music/dsp/external?tab=music&music_tag=2", "aweme://music/dsp/internal?tab=library&music_tag=2", "aweme://music/player/internal?music_tag=2", true, 86400000L, 3);
    }

    public TTMRegionConfig(String str, String str2, String str3, String str4, boolean z, long j, int i) {
        this.profileLibrarySchema = str;
        this.profilePlayerSchema = str2;
        this.playerEntranceSchema = str3;
        this.subPlayerSchema = str4;
        this.enablePreload = z;
        this.preloadExpiredTime = j;
        this.autoPopCountConfig = i;
    }
}

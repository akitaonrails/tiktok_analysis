package com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveReplayManagePlaylistData implements Serializable {
    public static final int $stable = 8;

    @C09CT("mix_name")
    public String mixName;

    @C09CT("total_items")
    public Integer partCount;

    @C09CT("playlist_id")
    public String playlistId;

    public final void setMixName(String str) {
        this.mixName = str;
    }

    public final void setPartCount(Integer num) {
        this.partCount = num;
    }

    public final void setPlaylistId(String str) {
        this.playlistId = str;
    }

    public LiveReplayManagePlaylistData(String str, String str2, Integer num) {
        this.playlistId = str;
        this.mixName = str2;
        this.partCount = num;
    }
}

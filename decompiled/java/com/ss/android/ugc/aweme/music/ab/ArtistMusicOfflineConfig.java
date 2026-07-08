package com.ss.android.ugc.aweme.music.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class ArtistMusicOfflineConfig {

    @C09CT("notice_show_count")
    public final int count;

    @C09CT("notice_url")
    public final String url;

    public ArtistMusicOfflineConfig() {
        this("", 0);
    }

    public ArtistMusicOfflineConfig(String str, int i) {
        this.url = str;
        this.count = i;
    }
}

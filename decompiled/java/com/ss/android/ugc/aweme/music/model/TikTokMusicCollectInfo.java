package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class TikTokMusicCollectInfo implements Serializable {

    @C09CT("added_on_ttmusic")
    public final boolean addedOnTtm;

    @C09CT("deep_link")
    public final String deepLink;

    public TikTokMusicCollectInfo(boolean z, String str) {
        this.addedOnTtm = z;
        this.deepLink = str;
    }
}

package com.ss.android.ugc.aweme.common;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class MusicContent implements Serializable {

    @C09CT("music_id")
    public final String musicId;

    @C09CT("music_start_time")
    public final int musicStartTime;

    public MusicContent() {
        this(null, 0);
    }

    public MusicContent(String str, int i) {
        this.musicId = str;
        this.musicStartTime = i;
    }
}

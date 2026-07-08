package com.ss.android.ugc.aweme.services.external;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;

/* JADX INFO: loaded from: classes9.dex */
public final class MusicResponse {
    public final Integer errCode;
    public final Exception exception;
    public final boolean fromCache;
    public final AVMusic music;
    public final String musicFile;
    public final String musicId;

    public MusicResponse(Integer num, String str, Exception exc, AVMusic aVMusic, String str2, boolean z) {
        this.errCode = num;
        this.musicId = str;
        this.exception = exc;
        this.music = aVMusic;
        this.musicFile = str2;
        this.fromCache = z;
    }
}

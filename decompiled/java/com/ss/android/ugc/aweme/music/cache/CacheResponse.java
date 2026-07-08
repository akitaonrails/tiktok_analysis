package com.ss.android.ugc.aweme.music.cache;

import java.io.Serializable;

/* JADX INFO: loaded from: classes31.dex */
public final class CacheResponse implements Serializable {
    public final String response;
    public final long time;

    public CacheResponse(long j, String str) {
        this.time = j;
        this.response = str;
    }
}

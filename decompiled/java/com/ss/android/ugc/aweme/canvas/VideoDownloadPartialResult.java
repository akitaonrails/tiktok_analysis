package com.ss.android.ugc.aweme.canvas;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes31.dex */
public final class VideoDownloadPartialResult implements Serializable {

    @C09CT("cacheSizeFromZero")
    public final long cacheSizeFromZero;

    @C09CT("localFilePath")
    public final String localFilePath;

    @C09CT("mediaSize")
    public final long mediaSize;

    public VideoDownloadPartialResult() {
        this(0L, 0L, null);
    }

    public VideoDownloadPartialResult(long j, long j2, String str) {
        this.mediaSize = j;
        this.cacheSizeFromZero = j2;
        this.localFilePath = str;
    }
}

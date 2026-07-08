package com.ss.android.ugc.aweme.minis.performance.video;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class MinisPreloadVideoMetadata implements Serializable {
    public static final int $stable = 8;

    @C09CT("Content-Length")
    public String contentLength;

    @C09CT("Content-Length-In-Bytes")
    public long contentLengthInBytes;

    @C09CT("Content-Range")
    public String contentRange;

    @C09CT("Content-Type")
    public String contentType;

    @C09CT("headers")
    public String headers;

    @C09CT("totalBytes")
    public long totalBytes;

    @C09CT("videoType")
    public String videoType;

    public MinisPreloadVideoMetadata() {
        this("", 0L, null, 0L, "", null, null);
    }

    public final void setContentLength(String str) {
        this.contentLength = str;
    }

    public final void setContentLengthInBytes(long j) {
        this.contentLengthInBytes = j;
    }

    public final void setContentRange(String str) {
        this.contentRange = str;
    }

    public final void setContentType(String str) {
        this.contentType = str;
    }

    public final void setHeaders(String str) {
        this.headers = str;
    }

    public final void setTotalBytes(long j) {
        this.totalBytes = j;
    }

    public final void setVideoType(String str) {
        this.videoType = str;
    }

    public MinisPreloadVideoMetadata(String str, long j, String str2, long j2, String str3, String str4, String str5) {
        this.contentLength = str;
        this.contentLengthInBytes = j;
        this.contentRange = str2;
        this.totalBytes = j2;
        this.contentType = str3;
        this.videoType = str4;
        this.headers = str5;
    }
}

package com.ss.android.ugc.aweme.sticker.channel.download;

import X.C09CT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class DownloadRequest {

    @C09CT("needUpzip")
    public int needUpzip;

    @C09CT("url")
    public List<String> url;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        return this.needUpzip == downloadRequest.needUpzip && Intrinsics.LJFF(this.url, downloadRequest.url);
    }

    public final int hashCode() {
        return (this.needUpzip * 31) + this.url.hashCode();
    }

    public DownloadRequest(int i, List<String> list) {
        this.needUpzip = i;
        this.url = list;
    }
}

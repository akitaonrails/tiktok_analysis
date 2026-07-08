package com.ss.android.ugc.aweme.aigc.graph.nodes.slot;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class DownloadItemResult {

    @C09CT("localFilePath")
    public final String localFilePath;

    @C09CT("thumbnailLocalFilePath")
    public final String thumbnailLocalFilePath;

    @C09CT("thumbnailUrl")
    public final String thumbnailUrl;

    @C09CT("timestamp")
    public final long timestamp;

    @C09CT("url")
    public final String url;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadItemResult)) {
            return false;
        }
        DownloadItemResult downloadItemResult = (DownloadItemResult) obj;
        return Intrinsics.LJFF(this.url, downloadItemResult.url) && Intrinsics.LJFF(this.localFilePath, downloadItemResult.localFilePath) && Intrinsics.LJFF(this.thumbnailUrl, downloadItemResult.thumbnailUrl) && Intrinsics.LJFF(this.thumbnailLocalFilePath, downloadItemResult.thumbnailLocalFilePath) && this.timestamp == downloadItemResult.timestamp;
    }

    public final int hashCode() {
        return (((((((this.url.hashCode() * 31) + this.localFilePath.hashCode()) * 31) + this.thumbnailUrl.hashCode()) * 31) + this.thumbnailLocalFilePath.hashCode()) * 31) + C786410Ut5.Y2(this.timestamp);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DownloadItemResult(url=");
        sbLIZ.append(this.url);
        sbLIZ.append(", localFilePath=");
        sbLIZ.append(this.localFilePath);
        sbLIZ.append(", thumbnailUrl=");
        sbLIZ.append(this.thumbnailUrl);
        sbLIZ.append(", thumbnailLocalFilePath=");
        sbLIZ.append(this.thumbnailLocalFilePath);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.timestamp);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DownloadItemResult() {
        this("", "", "", "", 0L);
    }

    public DownloadItemResult(String str, String str2, String str3, String str4, long j) {
        this.url = str;
        this.localFilePath = str2;
        this.thumbnailUrl = str3;
        this.thumbnailLocalFilePath = str4;
        this.timestamp = j;
    }
}

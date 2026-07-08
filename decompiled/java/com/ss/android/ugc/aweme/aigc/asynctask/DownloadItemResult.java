package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;

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

    public static DownloadItemResult LIZ(DownloadItemResult downloadItemResult, String str, String str2, String str3, String str4, long j, int i) {
        long j2 = j;
        String str5 = str4;
        String str6 = str3;
        String str7 = str2;
        String str8 = str;
        if ((i & 1) != 0) {
            str8 = downloadItemResult.url;
        }
        if ((i & 2) != 0) {
            str7 = downloadItemResult.localFilePath;
        }
        if ((i & 4) != 0) {
            str6 = downloadItemResult.thumbnailUrl;
        }
        if ((i & 8) != 0) {
            str5 = downloadItemResult.thumbnailLocalFilePath;
        }
        if ((i & 16) != 0) {
            j2 = downloadItemResult.timestamp;
        }
        downloadItemResult.getClass();
        return new DownloadItemResult(str8, str7, str6, str5, j2);
    }
}

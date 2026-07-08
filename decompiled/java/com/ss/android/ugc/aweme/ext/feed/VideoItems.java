package com.ss.android.ugc.aweme.ext.feed;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class VideoItems {

    @C09CT("backup_url")
    public final String backupUrl;

    @C09CT("main_url")
    public final String mainUrl;

    @C09CT("video_meta")
    public final VideoMeta videoMetaData;

    public VideoItems(String str, String str2, VideoMeta videoMeta) {
        this.mainUrl = str;
        this.backupUrl = str2;
        this.videoMetaData = videoMeta;
    }
}

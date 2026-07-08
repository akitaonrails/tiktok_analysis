package com.ss.android.ugc.aweme.service.profilerec.model;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public final class VideoCoverStruct {

    @C09CT("cover_image_url")
    public final String coverUrl;

    @C09CT("item_id")
    public final String videoId;

    public VideoCoverStruct() {
        this("", null);
    }

    public VideoCoverStruct(String str, String str2) {
        this.videoId = str;
        this.coverUrl = str2;
    }
}

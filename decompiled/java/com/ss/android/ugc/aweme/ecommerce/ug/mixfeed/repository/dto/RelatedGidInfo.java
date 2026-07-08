package com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class RelatedGidInfo {

    @C09CT("author_id")
    public final String authorID;

    @C09CT("room_id")
    public final String roomID;

    @C09CT("video_id")
    public final String videoID;

    public RelatedGidInfo() {
        this(null, null, null);
    }

    public RelatedGidInfo(String str, String str2, String str3) {
        this.authorID = str;
        this.roomID = str2;
        this.videoID = str3;
    }
}

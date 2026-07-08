package com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.data;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class ECLivePlaybackLiveRoomInfo {

    @C09CT("author_tt_handle")
    public final String authorName;

    @C09CT("author_tt_sec_uid")
    public final String authorSecUid;

    @C09CT("author_tt_uid")
    public final String authorUid;

    @C09CT("author_avatar_url")
    public final String avatarUrl;

    public ECLivePlaybackLiveRoomInfo() {
        this(null, null, null, null);
    }

    public ECLivePlaybackLiveRoomInfo(String str, String str2, String str3, String str4) {
        this.authorName = str;
        this.avatarUrl = str2;
        this.authorUid = str3;
        this.authorSecUid = str4;
    }
}

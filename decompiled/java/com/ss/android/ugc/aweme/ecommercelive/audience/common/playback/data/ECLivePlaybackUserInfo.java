package com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.data;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class ECLivePlaybackUserInfo {

    @C09CT("follow_author_button_text")
    public final String buttonText;

    @C09CT("follow_author_status")
    public final Integer followStatus;

    @C09CT("tt_sec_uid")
    public final String secUid;

    @C09CT("tt_uid")
    public final String uid;

    public ECLivePlaybackUserInfo() {
        this(null, null, null, null);
    }

    public ECLivePlaybackUserInfo(String str, String str2, Integer num, String str3) {
        this.uid = str;
        this.secUid = str2;
        this.followStatus = num;
        this.buttonText = str3;
    }
}

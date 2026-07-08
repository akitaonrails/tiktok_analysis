package com.ss.android.ugc.aweme.notification.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class NoticeInfo {

    @C09CT("simple_user")
    public final SimpleUserInfo simpleUserInfo;

    @C09CT("video")
    public final VideoInfo videoInfo;

    public NoticeInfo() {
        this(null, null);
    }

    public NoticeInfo(SimpleUserInfo simpleUserInfo, VideoInfo videoInfo) {
        this.simpleUserInfo = simpleUserInfo;
        this.videoInfo = videoInfo;
    }
}

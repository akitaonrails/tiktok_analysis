package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class InviteInfo {

    @C09CT("mentor_u_code")
    public final String inviteCode;

    @C09CT("video_item_id")
    public final String videoId;

    public InviteInfo() {
        this("", "");
    }

    public InviteInfo(String str, String str2) {
        this.inviteCode = str;
        this.videoId = str2;
    }
}

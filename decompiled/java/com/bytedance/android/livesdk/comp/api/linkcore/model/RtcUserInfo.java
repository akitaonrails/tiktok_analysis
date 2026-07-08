package com.bytedance.android.livesdk.comp.api.linkcore.model;

/* JADX INFO: loaded from: classes16.dex */
public final class RtcUserInfo {
    public final long channelId;
    public final long groupChannelId;
    public final String groupLinkMicId;
    public final boolean isOwner;
    public final String linkMicId;
    public final long roomId;
    public final long userId;

    public final boolean isOwner() {
        return this.isOwner;
    }

    public RtcUserInfo(long j, long j2, String str, boolean z, long j3, long j4, String str2) {
        this.roomId = j;
        this.userId = j2;
        this.linkMicId = str;
        this.isOwner = z;
        this.channelId = j3;
        this.groupChannelId = j4;
        this.groupLinkMicId = str2;
    }
}

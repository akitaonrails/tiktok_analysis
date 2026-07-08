package com.bytedance.android.livesdk.chatroom.utils;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class LastLiveActionInfo {

    @C09CT("author_id")
    public Long authorId;

    @C09CT("current_product_id")
    public Long currentProductId;

    @C09CT("duration")
    public Long duration;

    @C09CT("entrance")
    public String entrance;

    @C09CT("is_ecom")
    public Long isEcom;

    @C09CT("preview_duration")
    public Long previewDuration;

    @C09CT("room_id")
    public long roomId;

    public LastLiveActionInfo() {
        this(0L, "", null, null, null, null, null);
    }

    public LastLiveActionInfo(long j, String str, Long l, Long l2, Long l3, Long l4, Long l5) {
        this.roomId = j;
        this.entrance = str;
        this.authorId = l;
        this.currentProductId = l2;
        this.isEcom = l3;
        this.duration = l4;
        this.previewDuration = l5;
    }
}

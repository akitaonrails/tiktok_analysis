package com.ss.android.ugc.aweme.ecommerce.showcase.service.api;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class ShopLiveInfo {

    @C09CT("room_id")
    public final String roomId;

    @C09CT("stream_data")
    public final String streamData;

    @C09CT("upcoming_start_time")
    public final long upcomingStartTime;

    public ShopLiveInfo(String str, long j, String str2) {
        this.roomId = str;
        this.upcomingStartTime = j;
        this.streamData = str2;
    }
}

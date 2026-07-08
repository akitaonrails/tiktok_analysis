package com.ss.android.ugc.aweme.ecommercelive.common.infra.hotroom;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class HotRoomInfo {

    @C09CT("expire_at")
    public final long expireAt;

    @C09CT("path_map")
    public final Map<String, String> pathMap;

    @C09CT("receive_time")
    public final long receiveTime;

    public HotRoomInfo() {
        this(0L, null, System.currentTimeMillis());
    }

    public HotRoomInfo(long j, Map<String, String> map, long j2) {
        this.expireAt = j;
        this.pathMap = map;
        this.receiveTime = j2;
    }
}

package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class DurationInfo {
    public static final TypeAdapter ADAPTER;

    @C09CT("duration")
    public long duration;

    @C09CT("gift_id")
    public long giftId;

    static {
        NormalGson.singleton();
        ADAPTER = new DurationInfo_OptTypeAdapter();
    }

    public DurationInfo() {
        this(0L, 0L);
    }

    public DurationInfo(long j, long j2) {
        this.giftId = j;
        this.duration = j2;
    }
}

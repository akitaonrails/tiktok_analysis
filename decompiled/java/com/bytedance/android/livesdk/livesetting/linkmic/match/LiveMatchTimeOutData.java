package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveMatchTimeOutData {
    public static final TypeAdapter ADAPTER;

    @C09CT("live_interact_match_inviter_extra_time")
    public int extra_time;

    @C09CT("live_interact_match_timeout_v2")
    public int timeout_v2;

    @C09CT("live_interact_match_timeout_v3")
    public int timeout_v3;

    @C09CT("live_interact_match_timeout_v4")
    public int timeout_v4;

    @C09CT("live_interact_match_timeout_v5")
    public int timeout_v5;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveMatchTimeOutData_OptTypeAdapter();
    }

    public LiveMatchTimeOutData() {
        this(40, 50, 60, 70, 10);
    }

    public LiveMatchTimeOutData(int i, int i2, int i3, int i4, int i5) {
        this.timeout_v2 = i;
        this.timeout_v3 = i2;
        this.timeout_v4 = i3;
        this.timeout_v5 = i4;
        this.extra_time = i5;
    }
}

package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveMatchOptNtpParams {
    public static final TypeAdapter ADAPTER;

    @C09CT("enable")
    public int enable;

    @C09CT("max_update_ntp_interval")
    public long maxUpdateNetInterval;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveMatchOptNtpParams_OptTypeAdapter();
    }

    public LiveMatchOptNtpParams() {
        this(1, 21600000L);
    }

    public LiveMatchOptNtpParams(int i, long j) {
        this.enable = i;
        this.maxUpdateNetInterval = j;
    }
}

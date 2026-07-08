package com.bytedance.android.livesdk.livesetting.watchlive.player;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveDnsOptimizeConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("check_host_count")
    public int checkHostCount;

    @C09CT("enable_check_dns")
    public int enableCheckDns;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveDnsOptimizeConfig_OptTypeAdapter();
    }

    public LiveDnsOptimizeConfig() {
        this(0, 0);
    }

    public LiveDnsOptimizeConfig(int i, int i2) {
        this.enableCheckDns = i;
        this.checkHostCount = i2;
    }
}

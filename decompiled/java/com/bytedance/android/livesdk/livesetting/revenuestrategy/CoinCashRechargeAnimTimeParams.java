package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class CoinCashRechargeAnimTimeParams {
    public static final TypeAdapter ADAPTER;

    @C09CT("exit_duration")
    public long exitDuration;

    @C09CT("reset_duration")
    public long resetDuration;

    static {
        NormalGson.singleton();
        ADAPTER = new CoinCashRechargeAnimTimeParams_OptTypeAdapter();
    }

    public CoinCashRechargeAnimTimeParams() {
        this(172800L, 86400L);
    }

    public CoinCashRechargeAnimTimeParams(long j, long j2) {
        this.exitDuration = j;
        this.resetDuration = j2;
    }
}

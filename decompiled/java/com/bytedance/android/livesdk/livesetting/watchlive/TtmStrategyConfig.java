package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class TtmStrategyConfig {
    public static final TypeAdapter ADAPTER = new TtmStrategyConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("cold_start_single_request")
    public boolean coldStartSingleRequest;

    @C09CT("enable")
    public boolean enable;

    public TtmStrategyConfig() {
        this(false, false);
    }

    public TtmStrategyConfig(boolean z, boolean z2) {
        this.enable = z;
        this.coldStartSingleRequest = z2;
    }
}

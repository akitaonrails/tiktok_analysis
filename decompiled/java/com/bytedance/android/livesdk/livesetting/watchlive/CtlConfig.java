package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class CtlConfig {
    public static final TypeAdapter ADAPTER = new CtlConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("distance")
    public int distance;

    @C09CT("perfOpt")
    public boolean doPerfOpt;

    @C09CT("enable")
    public boolean enable;

    @C09CT("nonTabSwitch")
    public boolean enableInflowStrategy;

    @C09CT("ignorePlayerState")
    public boolean ignorePlayerState;

    @C09CT("interval")
    public long interval;

    @C09CT("strategy")
    public int strategyOption;

    public CtlConfig() {
        this(false, 1, 30000L, 0, false, true, false);
    }

    public CtlConfig(boolean z, int i, long j, int i2, boolean z2, boolean z3, boolean z4) {
        this.enable = z;
        this.distance = i;
        this.interval = j;
        this.strategyOption = i2;
        this.enableInflowStrategy = z2;
        this.doPerfOpt = z3;
        this.ignorePlayerState = z4;
    }
}

package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveHostChargeConfig {
    public static final TypeAdapter ADAPTER = new LiveHostChargeConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("block_charge_check_time")
    public int blockChargeCheckTime;

    @C09CT("check_charge_interval_time")
    public long checkChargeIntervalTime;

    @C09CT("enable")
    public boolean enable;

    @C09CT("predicted_live_duration")
    public int predictedLiveDuration;

    @C09CT("skip_check_battery_value")
    public List<Integer> skipCheckBattery;

    public LiveHostChargeConfig() {
        this(false, C1697810uHb.LJIIJJI(10, 20), 60, 60L, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
    }

    public LiveHostChargeConfig(boolean z, List<Integer> list, int i, long j, int i2) {
        this.enable = z;
        this.skipCheckBattery = list;
        this.predictedLiveDuration = i;
        this.checkChargeIntervalTime = j;
        this.blockChargeCheckTime = i2;
    }
}

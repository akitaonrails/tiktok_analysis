package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class CheckBattleInfoConfig {
    public static final TypeAdapter ADAPTER = new CheckBattleInfoConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("avg_settling_cost")
    public boolean avg_settling_cost;

    @C09CT("avg_settling_message_cost")
    public float avg_settling_message_cost;

    @C09CT("retry_count_when_enter")
    public int retry_count_when_enter;

    @C09CT("retry_count_when_finish")
    public int retry_count_when_finish;

    @C09CT("retry_duration_when_enter")
    public int retry_duration_when_enter;

    @C09CT("retry_duration_when_finish")
    public int retry_duration_when_finish;

    public CheckBattleInfoConfig() {
        this(false, 1.5f, 1, 2, 2, 2);
    }

    public CheckBattleInfoConfig(boolean z, float f, int i, int i2, int i3, int i4) {
        this.avg_settling_cost = z;
        this.avg_settling_message_cost = f;
        this.retry_count_when_enter = i;
        this.retry_count_when_finish = i2;
        this.retry_duration_when_enter = i3;
        this.retry_duration_when_finish = i4;
    }
}

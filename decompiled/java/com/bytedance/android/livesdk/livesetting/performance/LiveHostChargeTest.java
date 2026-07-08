package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveHostChargeTest {
    public static final TypeAdapter ADAPTER = new LiveHostChargeTest_OptTypeAdapter(NormalGson.singleton());

    @C09CT("mock_battery_level")
    public int batteryLevel;

    @C09CT("mock_battery_scale")
    public int batteryScale;

    @C09CT("enable")
    public boolean enable;

    @C09CT("mock_is_charge")
    public boolean isCharge;

    public LiveHostChargeTest() {
        this(false, true, 100, 100);
    }

    public LiveHostChargeTest(boolean z, boolean z2, int i, int i2) {
        this.enable = z;
        this.isCharge = z2;
        this.batteryLevel = i;
        this.batteryScale = i2;
    }
}

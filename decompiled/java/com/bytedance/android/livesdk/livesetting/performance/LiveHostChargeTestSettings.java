package com.bytedance.android.livesdk.livesetting.performance;

import X.C1161920gLG;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_host_charge_test_settings")
public final class LiveHostChargeTestSettings {
    public static final LiveHostChargeTestSettings INSTANCE = new LiveHostChargeTestSettings();
    public static final LiveHostChargeTest DEFAULT = new LiveHostChargeTest(false, true, 100, 100);

    private final LiveHostChargeTest config() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveHostChargeTest liveHostChargeTest = DEFAULT;
        LiveHostChargeTest liveHostChargeTest2 = (LiveHostChargeTest) settingsManager.getValueSafely("live_host_charge_test_settings", liveHostChargeTest);
        return liveHostChargeTest2 != null ? liveHostChargeTest2 : liveHostChargeTest;
    }

    public static final boolean enable() {
        return INSTANCE.config().enable && ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest();
    }

    public static final int mockBatteryLevel() {
        return INSTANCE.config().batteryLevel;
    }

    public static final int mockBatteryScale() {
        return INSTANCE.config().batteryScale;
    }

    public static final boolean mockIsCharge() {
        return INSTANCE.config().isCharge;
    }
}

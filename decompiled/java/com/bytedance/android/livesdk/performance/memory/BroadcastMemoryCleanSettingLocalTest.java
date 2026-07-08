package com.bytedance.android.livesdk.performance.memory;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_broadcast_memory_clean_setting_localtest")
public final class BroadcastMemoryCleanSettingLocalTest {
    public static final BroadcastMemoryCleanSettingLocalTest INSTANCE = new BroadcastMemoryCleanSettingLocalTest();
    public static final BroadcastMemoryCleanConfigLocalTest DEFAULT = new BroadcastMemoryCleanConfigLocalTest(false, false);

    private final BroadcastMemoryCleanConfigLocalTest getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        BroadcastMemoryCleanConfigLocalTest broadcastMemoryCleanConfigLocalTest = DEFAULT;
        BroadcastMemoryCleanConfigLocalTest broadcastMemoryCleanConfigLocalTest2 = (BroadcastMemoryCleanConfigLocalTest) settingsManager.getValueSafely("live_broadcast_memory_clean_setting_localtest", broadcastMemoryCleanConfigLocalTest);
        return broadcastMemoryCleanConfigLocalTest2 != null ? broadcastMemoryCleanConfigLocalTest2 : broadcastMemoryCleanConfigLocalTest;
    }

    public static final boolean localTestCritical() {
        return INSTANCE.getConfig().getEnableCritical();
    }

    public static final boolean localTestLow() {
        return INSTANCE.getConfig().getEnableLow();
    }
}

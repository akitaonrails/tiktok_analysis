package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "dual_device_live_optimize")
public final class BroadcastGameDualDeviceOptimizeLibra {
    public static final int DEFAULT = 0;
    public static final int GROUP_EXPERIMENT = 1;
    public static final BroadcastGameDualDeviceOptimizeLibra INSTANCE = new BroadcastGameDualDeviceOptimizeLibra();

    public final String getSettingKeys() {
        return "dual_device_live_optimize";
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("dual_device_live_optimize", DEFAULT);
    }

    public final boolean isExperimentGroup(Map<String, ? extends Object> map) {
        Integer num;
        if (map == null) {
            return false;
        }
        Object obj = map.get(getSettingKeys());
        if (!(obj instanceof Integer) || (num = (Integer) obj) == null) {
            return false;
        }
        num.intValue();
        if (num.intValue() != 1) {
            return false;
        }
        return true;
    }
}

package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_game_intelligent_rotation_device_config")
public final class TtliveGameIntelligentRotationDeviceConfigSetting {
    public static final TtliveGameIntelligentRotationDeviceConfigSetting INSTANCE = new TtliveGameIntelligentRotationDeviceConfigSetting();
    public static final Map<String, Double> DEFAULT = C2097608Jq.LJ();

    public final Map<String, Double> getValue() {
        Map<String, Double> map = (Map) SettingsManager.INSTANCE.getValueSafely(TtliveGameIntelligentRotationDeviceConfigSetting.class);
        return map == null ? DEFAULT : map;
    }
}

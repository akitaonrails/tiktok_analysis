package com.bytedance.android.livesdk.livesetting.clientai;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_client_ai_algorithm_package_launch_filter")
public final class ClientAiAlgorithmPackageLaunchFilterSettings {
    public static final ClientAiAlgorithmPackageLaunchFilterSettings INSTANCE = new ClientAiAlgorithmPackageLaunchFilterSettings();
    public static final Map<String, Integer> DEFAULT = C2097608Jq.LJ();

    public final Map<String, Integer> getGetStickValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Map<String, Integer> map = DEFAULT;
        Map<String, Integer> map2 = (Map) settingsManager.getValueSafely("live_client_ai_algorithm_package_launch_filter", map);
        return map2 != null ? map2 : map;
    }

    public final Map<String, Integer> getDEFAULT() {
        return DEFAULT;
    }
}

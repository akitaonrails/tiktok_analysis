package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "livesdk_optimize_fov_config_id_map")
public final class LivesdkLinkMicFovRtcParamsMappingSetting {
    public static final LivesdkLinkMicFovRtcParamsMappingSetting INSTANCE = new LivesdkLinkMicFovRtcParamsMappingSetting();
    public static final Map<String, String> DEFAULT = C2097608Jq.LJ();

    public final Map<String, String> getValue() {
        return (Map) SettingsManager.INSTANCE.getValueSafely("livesdk_optimize_fov_config_id_map", DEFAULT);
    }

    public final String getMappedParamsKey(String str) {
        String str2;
        Map<String, String> value = getValue();
        if (value != null && (str2 = value.get(str)) != null) {
            return str2;
        }
        return str;
    }
}

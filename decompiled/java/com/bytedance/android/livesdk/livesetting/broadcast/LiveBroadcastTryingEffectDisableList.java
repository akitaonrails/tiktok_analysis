package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C13LQ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@SettingsKey(preciseExperiment = false, value = "live_effect_requirements_to_disable_preview")
public final class LiveBroadcastTryingEffectDisableList {
    public static final String[] DEFAULT;
    public static final LiveBroadcastTryingEffectDisableList INSTANCE = new LiveBroadcastTryingEffectDisableList();
    public static final String[] value;

    static {
        String[] strArr = new String[0];
        DEFAULT = strArr;
        String[] stringArrayValue = SettingsManager.INSTANCE.getStringArrayValue("live_effect_requirements_to_disable_preview", strArr);
        if (stringArrayValue != null) {
            strArr = stringArrayValue;
        }
        value = strArr;
    }

    public static final boolean disableTryingEffect(List<String> list) {
        for (String str : list) {
            if (C13LQ.LJIILLIIL(str, value)) {
                if (str != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}

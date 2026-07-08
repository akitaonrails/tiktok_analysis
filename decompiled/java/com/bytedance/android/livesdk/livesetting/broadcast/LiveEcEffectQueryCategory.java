package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_host_ec_effect_category")
public final class LiveEcEffectQueryCategory {
    public static final String value;
    public static final LiveEcEffectQueryCategory INSTANCE = new LiveEcEffectQueryCategory();
    public static final String DEFAULT = "greenscreen";

    public static /* synthetic */ void getValue$annotations() {
    }

    static {
        String stringValue = SettingsManager.INSTANCE.getStringValue("live_host_ec_effect_category", "greenscreen");
        value = stringValue != null ? stringValue : "greenscreen";
    }

    public static final String getValue() {
        return value;
    }
}

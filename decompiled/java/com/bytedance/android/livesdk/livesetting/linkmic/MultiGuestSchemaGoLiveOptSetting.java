package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "multiguest_schema_golive_opt")
public final class MultiGuestSchemaGoLiveOptSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestSchemaGoLiveOptSetting INSTANCE = new MultiGuestSchemaGoLiveOptSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multiguest_schema_golive_opt", DEFAULT);
    }
}

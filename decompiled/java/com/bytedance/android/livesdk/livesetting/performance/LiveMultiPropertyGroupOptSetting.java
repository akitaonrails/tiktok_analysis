package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_multi_property_group_opt")
public final class LiveMultiPropertyGroupOptSetting {
    public static final LiveMultiPropertyGroupOptSetting INSTANCE = new LiveMultiPropertyGroupOptSetting();
    public static final boolean DEFAULT = false;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_multi_property_group_opt", DEFAULT);

    public final boolean enable() {
        return value;
    }
}

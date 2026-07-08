package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_marketing_component_setting")
public final class LiveMarketingComponentSetting {
    public static final int DEFAULT = 0;
    public static final LiveMarketingComponentSetting INSTANCE = new LiveMarketingComponentSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_marketing_component_setting", DEFAULT) > 0;
    }
}

package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_tab_cache_enable_setting")
public final class LiveTabCacheOptSetting {
    public static final int DEFAULT = 0;
    public static final LiveTabCacheOptSetting INSTANCE = new LiveTabCacheOptSetting();
    public static final int V1 = 1;
    public static Integer settingValue;

    private final int getValue() {
        Integer num = settingValue;
        if (num != null) {
            return num.intValue();
        }
        int intValue = SettingsManager.INSTANCE.getIntValue("live_tab_cache_enable_setting", DEFAULT);
        settingValue = Integer.valueOf(intValue);
        return intValue;
    }

    public final boolean isExp() {
        return getValue() > 0;
    }

    public final Integer getSettingValue() {
        return settingValue;
    }

    public final void setSettingValue(Integer num) {
        settingValue = num;
    }
}

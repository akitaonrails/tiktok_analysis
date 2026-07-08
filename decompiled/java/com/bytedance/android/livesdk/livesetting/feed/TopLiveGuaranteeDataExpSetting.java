package com.bytedance.android.livesdk.livesetting.feed;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("toplive_guarantee_data_setting")
public final class TopLiveGuaranteeDataExpSetting {
    public static final TopLiveGuaranteeDataExpSetting INSTANCE = new TopLiveGuaranteeDataExpSetting();
    public static final TopLiveGuaranteeDataExpConfig DEFAULT = new TopLiveGuaranteeDataExpConfig(false, -1, C2097608Jq.LJ(), -1);

    public final TopLiveGuaranteeDataExpConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        TopLiveGuaranteeDataExpConfig topLiveGuaranteeDataExpConfig = DEFAULT;
        TopLiveGuaranteeDataExpConfig topLiveGuaranteeDataExpConfig2 = (TopLiveGuaranteeDataExpConfig) settingsManager.getValueSafely("toplive_guarantee_data_setting", topLiveGuaranteeDataExpConfig);
        return topLiveGuaranteeDataExpConfig2 != null ? topLiveGuaranteeDataExpConfig2 : topLiveGuaranteeDataExpConfig;
    }

    public final boolean enable() {
        return getConfig().enable;
    }

    public final TopLiveGuaranteeDataExpConfig getDEFAULT() {
        return DEFAULT;
    }
}

package com.bytedance.android.livesdk.livesetting.slot;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_privilege_gecko_config")
public final class LivePrivilegeGeckoConfigSetting {
    public static final LivePrivilegeGeckoConfigSetting INSTANCE = new LivePrivilegeGeckoConfigSetting();
    public static final GeckoContent[] DEFAULT = new GeckoContent[0];

    public final GeckoContent[] getPrivilegeGeckoConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GeckoContent[] geckoContentArr = DEFAULT;
        GeckoContent[] geckoContentArr2 = (GeckoContent[]) settingsManager.getValueSafely("live_privilege_gecko_config", geckoContentArr);
        return geckoContentArr2 != null ? geckoContentArr2 : geckoContentArr;
    }
}

package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = true, value = "profile_page_banner_status")
public final class ProfilePageBannerStatusABSetting {
    public static final int DEFAULT = 0;
    public static final ProfilePageBannerStatusABSetting INSTANCE = new ProfilePageBannerStatusABSetting();

    public final boolean isLibOne() {
        return SettingsManager.INSTANCE.getIntValue("profile_page_banner_status", DEFAULT) == 1;
    }

    public final boolean isLibTwo() {
        return SettingsManager.INSTANCE.getIntValue("profile_page_banner_status", DEFAULT) == 2;
    }

    public final boolean isMatch() {
        return isLibOne() || isLibTwo();
    }
}

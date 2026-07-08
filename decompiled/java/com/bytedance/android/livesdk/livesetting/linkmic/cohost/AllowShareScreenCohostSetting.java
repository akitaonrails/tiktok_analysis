package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "allow_share_screen_cohost")
public final class AllowShareScreenCohostSetting {
    public static final boolean DEFAULT = true;
    public static final AllowShareScreenCohostSetting INSTANCE = new AllowShareScreenCohostSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("allow_share_screen_cohost", DEFAULT);
    }
}

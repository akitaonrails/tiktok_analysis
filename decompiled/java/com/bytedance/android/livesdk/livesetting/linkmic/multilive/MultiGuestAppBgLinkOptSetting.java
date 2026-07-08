package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_app_bg_link_opt_setting")
public final class MultiGuestAppBgLinkOptSetting {
    public static final int DEFAULT = 0;
    public static final MultiGuestAppBgLinkOptSetting INSTANCE = new MultiGuestAppBgLinkOptSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_app_bg_link_opt_setting", DEFAULT);
    }

    public final boolean enableBgLinkMic() {
        return getValue() == 1 || getValue() == 2;
    }

    public final boolean enableBgTimeOut() {
        return getValue() == 2;
    }

    public final boolean isV3() {
        return getValue() == 3;
    }
}

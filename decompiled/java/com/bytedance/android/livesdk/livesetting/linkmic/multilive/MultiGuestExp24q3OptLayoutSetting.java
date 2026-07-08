package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_exp_24q3_opt_layout_ver")
public final class MultiGuestExp24q3OptLayoutSetting {
    public static final int DEFAULT = 0;
    public static final MultiGuestExp24q3OptLayoutSetting INSTANCE = new MultiGuestExp24q3OptLayoutSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_exp_24q3_opt_layout_ver", DEFAULT);
    }
}

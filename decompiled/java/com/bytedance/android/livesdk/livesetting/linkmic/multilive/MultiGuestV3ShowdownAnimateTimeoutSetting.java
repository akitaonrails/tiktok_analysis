package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("multi_linkmic_showdown_animate_timeout")
public final class MultiGuestV3ShowdownAnimateTimeoutSetting {
    public static final long DEFAULT = 5000;
    public static final MultiGuestV3ShowdownAnimateTimeoutSetting INSTANCE = new MultiGuestV3ShowdownAnimateTimeoutSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("multi_linkmic_showdown_animate_timeout", DEFAULT);
    }
}

package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "studio_nle_public_enable_swing_live")
public final class MultiGuestNoticeBoardNLESwing {
    public static final boolean DEFAULT = true;
    public static final MultiGuestNoticeBoardNLESwing INSTANCE = new MultiGuestNoticeBoardNLESwing();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("studio_nle_public_enable_swing_live", DEFAULT);
    }
}

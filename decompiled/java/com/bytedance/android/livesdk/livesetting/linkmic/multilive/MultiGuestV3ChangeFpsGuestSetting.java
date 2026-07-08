package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("linkmic_multiguestv3_fps_guest")
public final class MultiGuestV3ChangeFpsGuestSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestV3ChangeFpsGuestSetting INSTANCE = new MultiGuestV3ChangeFpsGuestSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestV3ChangeFpsGuestSetting.class);
    }
}

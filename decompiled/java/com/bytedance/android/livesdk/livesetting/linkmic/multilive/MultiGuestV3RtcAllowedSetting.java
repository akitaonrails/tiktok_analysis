package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("linkmic_multiguestv3_split_dsl_params")
public final class MultiGuestV3RtcAllowedSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestV3RtcAllowedSetting INSTANCE = new MultiGuestV3RtcAllowedSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestV3RtcAllowedSetting.class);
    }
}

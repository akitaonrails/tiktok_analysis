package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("linkmic_multiguestv3_fps_anchor")
public final class MultiGuestV3ChangeFpsAnchorSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestV3ChangeFpsAnchorSetting INSTANCE = new MultiGuestV3ChangeFpsAnchorSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestV3ChangeFpsAnchorSetting.class);
    }
}

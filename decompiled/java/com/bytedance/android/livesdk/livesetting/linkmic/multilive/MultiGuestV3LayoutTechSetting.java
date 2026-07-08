package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("linkmic_multiguestv3_layout_tech_opt")
public final class MultiGuestV3LayoutTechSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestV3LayoutTechSetting INSTANCE = new MultiGuestV3LayoutTechSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestV3LayoutTechSetting.class);
    }
}

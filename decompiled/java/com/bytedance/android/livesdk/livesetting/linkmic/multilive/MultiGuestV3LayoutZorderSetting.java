package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("multi_linkmic_layout_zorder_opt")
public final class MultiGuestV3LayoutZorderSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestV3LayoutZorderSetting INSTANCE = new MultiGuestV3LayoutZorderSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_linkmic_layout_zorder_opt", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}

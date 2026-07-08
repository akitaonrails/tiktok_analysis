package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("enable_hide_cohost_icon_after_mix_mode_end")
public final class EnableHideCohostIconAfterMixModeEnd {
    public static final boolean DEFAULT = true;
    public static final EnableHideCohostIconAfterMixModeEnd INSTANCE = new EnableHideCohostIconAfterMixModeEnd();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_hide_cohost_icon_after_mix_mode_end", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}

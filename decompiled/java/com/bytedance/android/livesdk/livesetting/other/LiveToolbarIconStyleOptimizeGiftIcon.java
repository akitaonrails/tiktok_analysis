package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_toolbar_icon_style_optimize_gify_icon")
public final class LiveToolbarIconStyleOptimizeGiftIcon {
    public static final boolean DEFAULT = true;
    public static final LiveToolbarIconStyleOptimizeGiftIcon INSTANCE = new LiveToolbarIconStyleOptimizeGiftIcon();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_toolbar_icon_style_optimize_gify_icon", DEFAULT) && LiveToolbarIconStyleSetting.INSTANCE.getValue() != 0;
    }
}

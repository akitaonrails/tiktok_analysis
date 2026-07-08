package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("tech_opt_layout_render_setting")
public final class TechOptLayoutRenderSetting {
    public static final int DEFAULT = 1;
    public static final TechOptLayoutRenderSetting INSTANCE = new TechOptLayoutRenderSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("tech_opt_layout_render_setting", DEFAULT);
    }

    public final boolean enable() {
        return getValue() == 1;
    }
}

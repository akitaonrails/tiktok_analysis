package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_render_opt")
public final class MultiGuestRenderOptSetting {
    public static final MultiGuestRenderOptSetting INSTANCE = new MultiGuestRenderOptSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_render_opt", DEFAULT);
    }

    public final boolean enable() {
        return getValue() && MultiGuestGaussOptSetting.INSTANCE.enable();
    }
}

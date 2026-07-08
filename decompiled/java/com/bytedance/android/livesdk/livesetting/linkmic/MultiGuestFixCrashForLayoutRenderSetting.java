package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_fix_crash_for_layout_render")
public final class MultiGuestFixCrashForLayoutRenderSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestFixCrashForLayoutRenderSetting INSTANCE = new MultiGuestFixCrashForLayoutRenderSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_fix_crash_for_layout_render", DEFAULT);
    }
}

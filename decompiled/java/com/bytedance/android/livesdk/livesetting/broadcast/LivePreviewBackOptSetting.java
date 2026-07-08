package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_preview_back_opt")
public final class LivePreviewBackOptSetting {
    public static final boolean DEFAULT = false;
    public static final LivePreviewBackOptSetting INSTANCE = new LivePreviewBackOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_preview_back_opt", DEFAULT);
    }
}

package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_effect_download_opt")
public final class LiveEffectDownloadOptSetting {
    public static final boolean DEFAULT = false;
    public static final LiveEffectDownloadOptSetting INSTANCE = new LiveEffectDownloadOptSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_effect_download_opt", DEFAULT);
    }
}

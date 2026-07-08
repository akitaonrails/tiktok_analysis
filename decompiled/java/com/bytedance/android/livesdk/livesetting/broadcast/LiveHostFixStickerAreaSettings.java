package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_host_fix_sticker_area_settings")
public final class LiveHostFixStickerAreaSettings {
    public static final LiveHostFixStickerAreaSettings INSTANCE = new LiveHostFixStickerAreaSettings();
    public static final boolean DEFAULT = true;

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_host_fix_sticker_area_settings", DEFAULT);
    }
}

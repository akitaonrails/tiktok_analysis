package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_like_bitmap_opt")
public final class LiveLikeBitmapOptSetting {
    public static final LiveLikeBitmapOptSetting INSTANCE = new LiveLikeBitmapOptSetting();
    public static final boolean DEFAULT = false;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_like_bitmap_opt", DEFAULT);

    public final boolean enableLikeBitmapOpt() {
        return value;
    }
}

package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("ttlive_live_image_loader_module")
public final class LiveImageLoaderModuleSetting {
    public static final boolean DEFAULT = false;
    public static final LiveImageLoaderModuleSetting INSTANCE = new LiveImageLoaderModuleSetting();

    public static final boolean useImageModule() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_live_image_loader_module", DEFAULT);
    }
}

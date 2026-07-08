package com.bytedance.android.livesdk.broadcast.preview.widget.revision;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "banner_image_load_default_type")
public final class BannerImageLoadDefaultTypeSetting {
    public static final boolean DEFAULT = true;
    public static final BannerImageLoadDefaultTypeSetting INSTANCE = new BannerImageLoadDefaultTypeSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("banner_image_load_default_type", DEFAULT);
    }
}

package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "hit_gallery_repurchase_animation")
public final class HitGalleryRepurchaseAnimationSetting {
    public static final boolean DEFAULT = false;
    public static final HitGalleryRepurchaseAnimationSetting INSTANCE = new HitGalleryRepurchaseAnimationSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("hit_gallery_repurchase_animation", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}

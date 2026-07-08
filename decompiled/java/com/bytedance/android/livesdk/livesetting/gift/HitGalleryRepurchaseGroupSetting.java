package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "hit_gallery_repurchase_group")
public final class HitGalleryRepurchaseGroupSetting {
    public static final int DEFAULT = 0;
    public static final HitGalleryRepurchaseGroupSetting INSTANCE = new HitGalleryRepurchaseGroupSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("hit_gallery_repurchase_group", DEFAULT);
    }
}

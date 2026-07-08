package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "gift_resource_integrity_check")
public final class LiveGiftResourceIntegrityCheckSetting {
    public static final int DEFAULT = 0;
    public static final LiveGiftResourceIntegrityCheckSetting INSTANCE = new LiveGiftResourceIntegrityCheckSetting();
    public static final int TYPE_STICKER = 1;

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("gift_resource_integrity_check", DEFAULT);
    }

    public final boolean isEnabled(AssetsModel assetsModel) {
        if (getValue() != 1 || assetsModel == null || assetsModel.resourceType != AssetsModel.RESOURCE_TYPE_STICKER) {
            return false;
        }
        return true;
    }
}

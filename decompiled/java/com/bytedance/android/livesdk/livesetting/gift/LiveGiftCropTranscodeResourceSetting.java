package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "gift_crop_transcode_strategy_android")
public final class LiveGiftCropTranscodeResourceSetting {
    public static final int CROP = 1;
    public static final int CROP_TRANSCODE = 3;
    public static final int DEFAULT = 0;
    public static final LiveGiftCropTranscodeResourceSetting INSTANCE = new LiveGiftCropTranscodeResourceSetting();
    public static final int TRANSCODE = 2;

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("gift_crop_transcode_strategy_android", DEFAULT);
    }

    public final boolean shouldCrop() {
        return getValue() == 1;
    }

    public final boolean shouldCropTranscode() {
        return getValue() == 3;
    }

    public final boolean shouldTranscode() {
        return getValue() == 2;
    }
}

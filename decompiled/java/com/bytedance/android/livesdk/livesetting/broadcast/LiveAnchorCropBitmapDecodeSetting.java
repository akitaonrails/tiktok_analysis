package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_cover_crop_bitmap_decode")
public final class LiveAnchorCropBitmapDecodeSetting {
    public static final LiveAnchorCropBitmapDecodeSetting INSTANCE = new LiveAnchorCropBitmapDecodeSetting();
    public static final boolean DEFAULT = false;
    public static boolean value = SettingsManager.INSTANCE.getBooleanValue("live_cover_crop_bitmap_decode", DEFAULT);

    public final boolean getValue() {
        return value;
    }
}

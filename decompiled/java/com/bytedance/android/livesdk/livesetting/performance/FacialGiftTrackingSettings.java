package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_sticker_gift_tracking_setting")
public final class FacialGiftTrackingSettings {
    public static final FacialGiftTrackingSettings INSTANCE = new FacialGiftTrackingSettings();
    public static final FacialGiftTrackingModel DEFAULT = new FacialGiftTrackingModel(Boolean.TRUE, 270900);

    public final int getMultiHostPermanentSeiMinVersion() {
        Integer num;
        FacialGiftTrackingModel facialGiftTrackingModel = (FacialGiftTrackingModel) SettingsManager.INSTANCE.getValueSafely(FacialGiftTrackingSettings.class);
        if (facialGiftTrackingModel == null || (num = facialGiftTrackingModel.linkTrackingMinVersion) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final boolean isEnabled() {
        FacialGiftTrackingModel facialGiftTrackingModel = (FacialGiftTrackingModel) SettingsManager.INSTANCE.getValueSafely(FacialGiftTrackingSettings.class);
        if (facialGiftTrackingModel != null) {
            return Intrinsics.LJFF(facialGiftTrackingModel.trackingEnabled, Boolean.TRUE);
        }
        return false;
    }
}

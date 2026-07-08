package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_biz_spot_info_center")
public final class MultiGuestBizSpotInfoCenterSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestBizSpotInfoCenterSetting INSTANCE = new MultiGuestBizSpotInfoCenterSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_biz_spot_info_center", DEFAULT);
    }
}

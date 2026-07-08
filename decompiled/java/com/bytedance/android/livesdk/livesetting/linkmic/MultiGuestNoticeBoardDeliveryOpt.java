package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "studio_nle_public_enable_editing_delivery_opt_live")
public final class MultiGuestNoticeBoardDeliveryOpt {
    public static final boolean DEFAULT = false;
    public static final MultiGuestNoticeBoardDeliveryOpt INSTANCE = new MultiGuestNoticeBoardDeliveryOpt();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("studio_nle_public_enable_editing_delivery_opt_live", DEFAULT);
    }
}

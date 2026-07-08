package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_anchor_permit_limit_opt_setting")
public final class MultiGuestAnchorPermitLimitOptSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestAnchorPermitLimitOptSetting INSTANCE = new MultiGuestAnchorPermitLimitOptSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_anchor_permit_limit_opt_setting", DEFAULT);
    }
}

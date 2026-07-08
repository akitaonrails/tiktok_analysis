package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("linkmic_permit_group_direct_flag")
public final class LinkMicPermitGroupDirectFlagSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicPermitGroupDirectFlagSetting INSTANCE = new LinkMicPermitGroupDirectFlagSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_permit_group_direct_flag", DEFAULT);
    }
}

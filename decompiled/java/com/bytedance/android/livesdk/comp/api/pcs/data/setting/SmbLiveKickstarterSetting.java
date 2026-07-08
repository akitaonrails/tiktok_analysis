package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("smb_kickstart_live_guide")
public final class SmbLiveKickstarterSetting {
    public static final int DEFAULT = 0;
    public static final int ENABLED = 1;
    public static final SmbLiveKickstarterSetting INSTANCE = new SmbLiveKickstarterSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getIntValue("smb_kickstart_live_guide", DEFAULT) == 1;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}

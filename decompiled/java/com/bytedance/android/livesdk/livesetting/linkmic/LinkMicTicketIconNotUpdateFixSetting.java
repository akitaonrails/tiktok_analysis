package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("linkmic_ticket_icon_not_update_fix")
public final class LinkMicTicketIconNotUpdateFixSetting {
    public static final LinkMicTicketIconNotUpdateFixSetting INSTANCE = new LinkMicTicketIconNotUpdateFixSetting();
    public static final boolean DEFAULT = true;

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_ticket_icon_not_update_fix", DEFAULT);
    }
}

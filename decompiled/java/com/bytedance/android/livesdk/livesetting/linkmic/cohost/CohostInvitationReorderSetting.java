package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_queue_reorder_enable")
public final class CohostInvitationReorderSetting {
    public static final int DEFAULT = 0;
    public static final CohostInvitationReorderSetting INSTANCE = new CohostInvitationReorderSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_queue_reorder_enable", DEFAULT) == 1;
    }
}

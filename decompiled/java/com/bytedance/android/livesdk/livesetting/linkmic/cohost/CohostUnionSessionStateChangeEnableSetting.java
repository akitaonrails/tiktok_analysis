package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_union_session_state_change_enable")
public final class CohostUnionSessionStateChangeEnableSetting {
    public static final boolean DEFAULT = true;
    public static final CohostUnionSessionStateChangeEnableSetting INSTANCE = new CohostUnionSessionStateChangeEnableSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_union_session_state_change_enable", DEFAULT);
    }
}

package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("competition_ignore_other_users_disconnection")
public final class CompetitionIgnoreOtherUsersDisconnectSettings {
    public static final boolean DEFAULT = true;
    public static final CompetitionIgnoreOtherUsersDisconnectSettings INSTANCE = new CompetitionIgnoreOtherUsersDisconnectSettings();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("competition_ignore_other_users_disconnection", DEFAULT);
    }
}

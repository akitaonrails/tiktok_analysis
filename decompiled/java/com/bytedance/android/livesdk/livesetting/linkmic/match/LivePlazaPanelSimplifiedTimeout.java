package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_competition_invite_timeout")
public final class LivePlazaPanelSimplifiedTimeout {
    public static final long DEFAULT = 60;
    public static final LivePlazaPanelSimplifiedTimeout INSTANCE = new LivePlazaPanelSimplifiedTimeout();

    public final long timeout() {
        return SettingsManager.INSTANCE.getLongValue("live_competition_invite_timeout", DEFAULT);
    }
}

package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_with_guest_phase2_adding_mg_check_from_notify_ch")
public final class CohostWithGuestPhase2AddingMgCheckFromNotifyCoHost {
    public static final boolean DEFAULT = true;
    public static final CohostWithGuestPhase2AddingMgCheckFromNotifyCoHost INSTANCE = new CohostWithGuestPhase2AddingMgCheckFromNotifyCoHost();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_with_guest_phase2_adding_mg_check_from_notify_ch", DEFAULT);
    }
}

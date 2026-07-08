package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "playbook_non_multi_guest_enable")
public final class PlaybookNonMultiGuestEnableSetting {
    public static final boolean DEFAULT = false;
    public static final PlaybookNonMultiGuestEnableSetting INSTANCE = new PlaybookNonMultiGuestEnableSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("playbook_non_multi_guest_enable", DEFAULT);
    }
}

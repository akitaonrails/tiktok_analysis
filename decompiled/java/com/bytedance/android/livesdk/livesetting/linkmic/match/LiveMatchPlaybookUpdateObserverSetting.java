package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_match_playbook_update_observer")
public final class LiveMatchPlaybookUpdateObserverSetting {
    public static final boolean DEFAULT = true;
    public static final LiveMatchPlaybookUpdateObserverSetting INSTANCE = new LiveMatchPlaybookUpdateObserverSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_playbook_update_observer", DEFAULT);
    }

    public final boolean isEnabled() {
        return getValue();
    }
}

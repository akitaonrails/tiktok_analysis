package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_match_1vn_waiting_sei_change_poc")
public final class LiveMatch1vNWaitingSeiSettings {
    public static final boolean DEFAULT = true;
    public static final LiveMatch1vNWaitingSeiSettings INSTANCE = new LiveMatch1vNWaitingSeiSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_1vn_waiting_sei_change_poc", DEFAULT);
    }
}

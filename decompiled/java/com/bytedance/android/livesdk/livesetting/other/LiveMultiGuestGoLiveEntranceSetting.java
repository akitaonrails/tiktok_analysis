package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_multi_guest_go_live")
public final class LiveMultiGuestGoLiveEntranceSetting {
    public static final int DEFAULT = 0;
    public static final LiveMultiGuestGoLiveEntranceSetting INSTANCE = new LiveMultiGuestGoLiveEntranceSetting();

    public final boolean hasEntrance() {
        return SettingsManager.INSTANCE.getIntValue("live_multi_guest_go_live", DEFAULT) == 1;
    }
}

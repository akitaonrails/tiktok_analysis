package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_bugfix_super_fan_barrage_event")
public final class LiveSuperFanBarrageBugfix {
    public static final boolean DEFAULT = true;
    public static final LiveSuperFanBarrageBugfix INSTANCE = new LiveSuperFanBarrageBugfix();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_bugfix_super_fan_barrage_event", DEFAULT);
    }
}

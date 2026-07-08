package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_tray_stuck_recovery")
public final class LiveGiftTrayStuckRecoverySetting {
    public static final int DEFAULT = 15;
    public static final LiveGiftTrayStuckRecoverySetting INSTANCE = new LiveGiftTrayStuckRecoverySetting();

    public final boolean exitOnAllState() {
        return (SettingsManager.INSTANCE.getIntValue("live_gift_tray_stuck_recovery", DEFAULT) & 4) == 4;
    }

    public final boolean getLifecycleByDataChannel() {
        return (SettingsManager.INSTANCE.getIntValue("live_gift_tray_stuck_recovery", DEFAULT) & 1) == 1;
    }

    public final boolean progressOnEmptyAnimation() {
        return (SettingsManager.INSTANCE.getIntValue("live_gift_tray_stuck_recovery", DEFAULT) & 8) == 8;
    }

    public final boolean recoverIfLifecycleNull() {
        return (SettingsManager.INSTANCE.getIntValue("live_gift_tray_stuck_recovery", DEFAULT) & 2) == 2;
    }
}

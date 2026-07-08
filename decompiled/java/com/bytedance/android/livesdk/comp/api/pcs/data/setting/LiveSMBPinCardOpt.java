package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_smb_pin_card_opt")
public final class LiveSMBPinCardOpt {
    public static final int DEFAULT = 0;
    public static final LiveSMBPinCardOpt INSTANCE = new LiveSMBPinCardOpt();
    public static final int ENABLE = 1;

    public final boolean enable() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        int i = DEFAULT;
        return settingsManager.getIntValue("live_smb_pin_card_opt", i) > i;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public final int getENABLE() {
        return ENABLE;
    }
}

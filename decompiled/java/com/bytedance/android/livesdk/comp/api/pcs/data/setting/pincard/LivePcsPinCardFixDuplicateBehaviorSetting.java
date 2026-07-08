package com.bytedance.android.livesdk.comp.api.pcs.data.setting.pincard;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_pcs_pin_card_fix_duplicate_behavior")
public final class LivePcsPinCardFixDuplicateBehaviorSetting {
    public static final boolean DEFAULT = false;
    public static final LivePcsPinCardFixDuplicateBehaviorSetting INSTANCE = new LivePcsPinCardFixDuplicateBehaviorSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_pcs_pin_card_fix_duplicate_behavior", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}

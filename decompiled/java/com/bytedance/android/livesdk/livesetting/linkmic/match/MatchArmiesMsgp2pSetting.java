package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("linkmic_armies_p2p")
public final class MatchArmiesMsgp2pSetting {
    public static final boolean DEFAULT = false;
    public static final MatchArmiesMsgp2pSetting INSTANCE = new MatchArmiesMsgp2pSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_armies_p2p", DEFAULT);
    }
}

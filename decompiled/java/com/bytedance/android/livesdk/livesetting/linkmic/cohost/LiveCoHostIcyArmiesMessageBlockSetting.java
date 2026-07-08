package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_icy_armies_message_block_enable")
public final class LiveCoHostIcyArmiesMessageBlockSetting {
    public static final LiveCoHostIcyArmiesMessageBlockSetting INSTANCE = new LiveCoHostIcyArmiesMessageBlockSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_icy_armies_message_block_enable", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}

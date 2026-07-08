package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_take_the_stage_new_final_call_anim_enable")
public final class LiveCoHostTakeTheStageFinalCallAnimEnableSetting {
    public static final boolean DEFAULT = false;
    public static final LiveCoHostTakeTheStageFinalCallAnimEnableSetting INSTANCE = new LiveCoHostTakeTheStageFinalCallAnimEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_take_the_stage_new_final_call_anim_enable", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}

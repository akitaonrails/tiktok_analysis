package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("multi_host_pre_joinchannel_setting")
public final class MultiHostPreJoinChannelSetting {
    public static final MultiHostPreJoinChannelSetting INSTANCE = new MultiHostPreJoinChannelSetting();
    public static final MultiHostPreJoinChannelConf DEFAULT = new MultiHostPreJoinChannelConf(false, false, false);

    public final MultiHostPreJoinChannelConf getValue() {
        MultiHostPreJoinChannelConf multiHostPreJoinChannelConf = (MultiHostPreJoinChannelConf) SettingsManager.INSTANCE.getValueSafely(MultiHostPreJoinChannelSetting.class);
        return multiHostPreJoinChannelConf == null ? DEFAULT : multiHostPreJoinChannelConf;
    }
}

package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_need_callback_when_has_size_enable")
public final class LiveCoHostNeedCallbackWhenHasSizeSetting {
    public static final LiveCoHostNeedCallbackWhenHasSizeSetting INSTANCE = new LiveCoHostNeedCallbackWhenHasSizeSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_need_callback_when_has_size_enable", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}

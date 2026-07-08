package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C1161920gLG;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_guet_head_phone_monitor")
public final class LiveSdkMultiGuestEarFeedbackSetting {
    public static final boolean DEFAULT = false;
    public static final LiveSdkMultiGuestEarFeedbackSetting INSTANCE = new LiveSdkMultiGuestEarFeedbackSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_guet_head_phone_monitor", DEFAULT) || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline();
    }
}

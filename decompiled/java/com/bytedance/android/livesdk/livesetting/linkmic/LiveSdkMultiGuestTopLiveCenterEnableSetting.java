package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C1161920gLG;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_multi_guest_top_live_center_enable")
public final class LiveSdkMultiGuestTopLiveCenterEnableSetting {
    public static final boolean DEFAULT = false;
    public static final LiveSdkMultiGuestTopLiveCenterEnableSetting INSTANCE = new LiveSdkMultiGuestTopLiveCenterEnableSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_multi_guest_top_live_center_enable", DEFAULT) || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline();
    }
}

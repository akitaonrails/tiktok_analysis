package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C1161920gLG;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.user.IHostPad;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_linkmic_pad_enable")
public final class LiveSdkLinkMicLandscapeSetting {
    public static final boolean DEFAULT = false;
    public static final LiveSdkLinkMicLandscapeSetting INSTANCE = new LiveSdkLinkMicLandscapeSetting();

    public static final boolean isEnable() {
        return (SettingsManager.INSTANCE.getBooleanValue("live_linkmic_pad_enable", DEFAULT) || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) && ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad();
    }
}

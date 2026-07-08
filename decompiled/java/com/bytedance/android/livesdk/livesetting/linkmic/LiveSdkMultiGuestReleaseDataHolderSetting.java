package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C1161920gLG;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_multi_guest_release_dataholder")
public final class LiveSdkMultiGuestReleaseDataHolderSetting {
    public static final boolean DEFAULT = false;
    public static final LiveSdkMultiGuestReleaseDataHolderSetting INSTANCE = new LiveSdkMultiGuestReleaseDataHolderSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_multi_guest_release_dataholder", DEFAULT) || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline();
    }
}

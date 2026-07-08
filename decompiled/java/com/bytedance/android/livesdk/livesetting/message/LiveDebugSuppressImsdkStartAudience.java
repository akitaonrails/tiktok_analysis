package com.bytedance.android.livesdk.livesetting.message;

import X.C1161920gLG;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_debug_suppress_imsdk_start_audience")
public final class LiveDebugSuppressImsdkStartAudience {
    public static final boolean DEFAULT = false;
    public static final LiveDebugSuppressImsdkStartAudience INSTANCE = new LiveDebugSuppressImsdkStartAudience();

    public final boolean enable() {
        return (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline() || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isRegressionTest() || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) ? SettingsManager.INSTANCE.getBooleanValue("live_debug_suppress_imsdk_start_audience", DEFAULT) : DEFAULT;
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}

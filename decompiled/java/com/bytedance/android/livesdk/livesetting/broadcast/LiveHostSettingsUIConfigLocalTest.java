package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C1161920gLG;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_host_settings_ui_config_localtest")
public final class LiveHostSettingsUIConfigLocalTest {
    public static final boolean DEFAULT = false;
    public static final LiveHostSettingsUIConfigLocalTest INSTANCE = new LiveHostSettingsUIConfigLocalTest();

    public static final boolean localTest() {
        return ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest() && SettingsManager.INSTANCE.getBooleanValue("live_host_settings_ui_config_localtest", DEFAULT);
    }
}

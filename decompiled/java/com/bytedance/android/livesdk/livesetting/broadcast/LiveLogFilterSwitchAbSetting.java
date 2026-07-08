package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C1161920gLG;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_ttls_log_filter_ab")
public final class LiveLogFilterSwitchAbSetting {
    public static final int DEFAULT = 1;
    public static final LiveLogFilterSwitchAbSetting INSTANCE = new LiveLogFilterSwitchAbSetting();

    public final boolean enablePrintLog() {
        return SettingsManager.INSTANCE.getIntValue("live_ttls_log_filter_ab", DEFAULT) == 1;
    }

    public final boolean printLogSwitch() {
        return enablePrintLog() || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest();
    }
}

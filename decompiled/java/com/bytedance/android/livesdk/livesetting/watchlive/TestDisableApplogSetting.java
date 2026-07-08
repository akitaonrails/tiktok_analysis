package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C1161920gLG;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("test_disable_applog")
public final class TestDisableApplogSetting {
    public static final boolean DEFAULT = false;
    public static final TestDisableApplogSetting INSTANCE = new TestDisableApplogSetting();

    public final boolean getValue() {
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            return SettingsManager.INSTANCE.getBooleanValue("test_disable_applog", DEFAULT);
        }
        return false;
    }
}

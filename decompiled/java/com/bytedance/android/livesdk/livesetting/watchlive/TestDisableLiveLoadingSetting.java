package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C1161920gLG;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("test_disable_loading_view")
public final class TestDisableLiveLoadingSetting {
    public static final boolean DEFAULT = false;
    public static final TestDisableLiveLoadingSetting INSTANCE = new TestDisableLiveLoadingSetting();

    public static final boolean disableLiveLoadingView() {
        return !INSTANCE.getValue();
    }

    public final boolean getValue() {
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            return SettingsManager.INSTANCE.getBooleanValue("test_disable_loading_view", DEFAULT);
        }
        return false;
    }
}

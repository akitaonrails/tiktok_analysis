package com.bytedance.android.livesdk.livesetting.gift;

import X.C1161920gLG;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_debug_tools_config")
public final class LiveGiftDebugToolsSetting {
    public static final boolean DEFAULT = true;
    public static final LiveGiftDebugToolsSetting INSTANCE = new LiveGiftDebugToolsSetting();

    public final boolean getValue() {
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest() || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLiveInhouse() || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isRegressionTest()) {
            return SettingsManager.INSTANCE.getBooleanValue("live_gift_debug_tools_config", DEFAULT);
        }
        return false;
    }
}

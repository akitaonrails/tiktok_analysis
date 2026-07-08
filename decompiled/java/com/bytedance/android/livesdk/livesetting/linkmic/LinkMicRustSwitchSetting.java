package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C1161920gLG;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("linkmic_rust_switch")
public final class LinkMicRustSwitchSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicRustSwitchSetting INSTANCE = new LinkMicRustSwitchSetting();

    public static final boolean isLinkerEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_rust_switch", DEFAULT) || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline();
    }
}

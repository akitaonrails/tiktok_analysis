package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C1161920gLG;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("linkmic_rust_cohost_anchor")
public final class MtLinkMicRustCohostAnchorSetting {
    public static final boolean DEFAULT = false;
    public static final MtLinkMicRustCohostAnchorSetting INSTANCE = new MtLinkMicRustCohostAnchorSetting();

    public static final boolean isLinkerEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_rust_cohost_anchor", DEFAULT) || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline();
    }
}

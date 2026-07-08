package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C1161920gLG;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_debug_tool_swtich")
public final class LiveDebugToolSwitch {
    public static final LiveDebugToolSwitch INSTANCE = new LiveDebugToolSwitch();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_debug_tool_swtich", DEFAULT);

    public final boolean getValue() {
        return value && ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest();
    }
}

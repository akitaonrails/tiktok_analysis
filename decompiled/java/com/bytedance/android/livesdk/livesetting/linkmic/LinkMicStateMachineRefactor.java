package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("linkmic_link_state_machine_refactor")
public final class LinkMicStateMachineRefactor {
    public static final boolean DEFAULT = false;
    public static final LinkMicStateMachineRefactor INSTANCE = new LinkMicStateMachineRefactor();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_link_state_machine_refactor", DEFAULT);
    }
}

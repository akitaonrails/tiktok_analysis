package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("multi_guest_live_playbook_ugc_ai")
public final class LinkMicPlaybookUGCAISetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicPlaybookUGCAISetting INSTANCE = new LinkMicPlaybookUGCAISetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_live_playbook_ugc_ai", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}

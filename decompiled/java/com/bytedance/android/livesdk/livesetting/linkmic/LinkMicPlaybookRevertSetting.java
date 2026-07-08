package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_playbook_reversal")
public final class LinkMicPlaybookRevertSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicPlaybookRevertSetting INSTANCE = new LinkMicPlaybookRevertSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_playbook_reversal", DEFAULT);
    }
}

package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("bug_fix_playbook_data_channel_null_setting")
public final class BugFixPlaybookDataChannelNullSetting {
    public static final int DEFAULT = 1;
    public static final BugFixPlaybookDataChannelNullSetting INSTANCE = new BugFixPlaybookDataChannelNullSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("bug_fix_playbook_data_channel_null_setting", DEFAULT);
    }

    public final boolean enable() {
        return getValue() == 1;
    }
}

package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("bug_fix_apply_view_data_holder_empty_setting")
public final class BugFixApplyViewDataHolderEmptySetting {
    public static final int DEFAULT = 1;
    public static final BugFixApplyViewDataHolderEmptySetting INSTANCE = new BugFixApplyViewDataHolderEmptySetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("bug_fix_apply_view_data_holder_empty_setting", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}

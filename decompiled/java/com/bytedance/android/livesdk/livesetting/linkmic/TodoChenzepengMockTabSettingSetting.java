package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "todo_chenzepeng_mock_tab_setting")
public final class TodoChenzepengMockTabSettingSetting {
    public static final int DEFAULT = 1;
    public static final TodoChenzepengMockTabSettingSetting INSTANCE = new TodoChenzepengMockTabSettingSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("todo_chenzepeng_mock_tab_setting", DEFAULT);
    }

    public final boolean isOpt() {
        return getValue() == 1;
    }
}

package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "fix_replace_content_view")
public final class FixReplaceContentViewSetting {
    public static final FixReplaceContentViewSetting INSTANCE = new FixReplaceContentViewSetting();
    public static final boolean DEFAULT = false;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("fix_replace_content_view", DEFAULT);

    public final boolean enable() {
        return value;
    }
}

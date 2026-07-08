package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_cohost_2v2_apply_fail_fix")
public final class MultiCohost2v2ApplyFailFixSetting {
    public static final boolean DEFAULT = true;
    public static final MultiCohost2v2ApplyFailFixSetting INSTANCE = new MultiCohost2v2ApplyFailFixSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_cohost_2v2_apply_fail_fix", DEFAULT);
    }
}

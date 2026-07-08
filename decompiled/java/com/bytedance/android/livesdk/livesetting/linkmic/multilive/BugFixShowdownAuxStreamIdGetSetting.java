package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("bug_fix_showdown_aux_stream_id_get")
public final class BugFixShowdownAuxStreamIdGetSetting {
    public static final int DEFAULT = 1;
    public static final BugFixShowdownAuxStreamIdGetSetting INSTANCE = new BugFixShowdownAuxStreamIdGetSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("bug_fix_showdown_aux_stream_id_get", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}

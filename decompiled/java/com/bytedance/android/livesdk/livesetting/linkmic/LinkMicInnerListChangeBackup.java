package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_inner_list_change_backup")
public final class LinkMicInnerListChangeBackup {
    public static final boolean DEFAULT = true;
    public static final LinkMicInnerListChangeBackup INSTANCE = new LinkMicInnerListChangeBackup();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_inner_list_change_backup", DEFAULT);
    }
}

package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_playbook_editor_ugc")
public final class PlaybookEditorUgcSetting {
    public static final boolean DEFAULT = false;
    public static final PlaybookEditorUgcSetting INSTANCE = new PlaybookEditorUgcSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_playbook_editor_ugc", DEFAULT);
    }

    public final boolean isUgcEnable() {
        return getValue();
    }
}

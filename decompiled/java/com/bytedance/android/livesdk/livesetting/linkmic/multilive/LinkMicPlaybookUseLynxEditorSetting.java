package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_playbook_use_lynx_editor")
public final class LinkMicPlaybookUseLynxEditorSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicPlaybookUseLynxEditorSetting INSTANCE = new LinkMicPlaybookUseLynxEditorSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_playbook_use_lynx_editor", DEFAULT);
    }
}

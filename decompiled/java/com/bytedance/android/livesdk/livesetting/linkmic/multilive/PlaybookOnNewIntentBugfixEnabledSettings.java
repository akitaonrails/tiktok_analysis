package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "playbook_on_new_intent_bugfix_enabled")
public final class PlaybookOnNewIntentBugfixEnabledSettings {
    public static final boolean DEFAULT = true;
    public static final PlaybookOnNewIntentBugfixEnabledSettings INSTANCE = new PlaybookOnNewIntentBugfixEnabledSettings();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("playbook_on_new_intent_bugfix_enabled", DEFAULT);
    }
}

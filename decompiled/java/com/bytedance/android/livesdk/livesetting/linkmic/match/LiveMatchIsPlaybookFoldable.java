package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_match_is_playbook_foldable")
public final class LiveMatchIsPlaybookFoldable {
    public static final boolean DEFAULT = false;
    public static final LiveMatchIsPlaybookFoldable INSTANCE = new LiveMatchIsPlaybookFoldable();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_is_playbook_foldable", DEFAULT);
    }

    public final boolean isEnabled() {
        return getValue();
    }
}

package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_match_playbook_default_value")
public final class LiveMatchPlaybookDefaultValueSetting {
    public static final LiveMatchPlaybookDefaultValueSetting INSTANCE = new LiveMatchPlaybookDefaultValueSetting();
    public static final LiveMatchPlaybookDefaultValueModel DEFAULT = new LiveMatchPlaybookDefaultValueModel(0, false);

    public final LiveMatchPlaybookDefaultValueModel getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveMatchPlaybookDefaultValueModel liveMatchPlaybookDefaultValueModel = DEFAULT;
        LiveMatchPlaybookDefaultValueModel liveMatchPlaybookDefaultValueModel2 = (LiveMatchPlaybookDefaultValueModel) settingsManager.getValueSafely("live_match_playbook_default_value", liveMatchPlaybookDefaultValueModel);
        return liveMatchPlaybookDefaultValueModel2 != null ? liveMatchPlaybookDefaultValueModel2 : liveMatchPlaybookDefaultValueModel;
    }
}

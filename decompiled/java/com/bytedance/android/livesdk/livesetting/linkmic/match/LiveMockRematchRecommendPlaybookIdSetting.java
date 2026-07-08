package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.depend.model.live.match.RecommendedPlaybookInfo;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_mock_rematch_recommend_playbook_id")
public final class LiveMockRematchRecommendPlaybookIdSetting {
    public static final long DEFAULT = 0;
    public static final LiveMockRematchRecommendPlaybookIdSetting INSTANCE = new LiveMockRematchRecommendPlaybookIdSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_mock_rematch_recommend_playbook_id", DEFAULT);
    }

    public final RecommendedPlaybookInfo getMockInfo() {
        long value = getValue();
        if (value == 0) {
            return null;
        }
        RecommendedPlaybookInfo recommendedPlaybookInfo = new RecommendedPlaybookInfo();
        recommendedPlaybookInfo.playbookIds = C1697810uHb.LJIILJJIL(Long.valueOf(value));
        return recommendedPlaybookInfo;
    }
}

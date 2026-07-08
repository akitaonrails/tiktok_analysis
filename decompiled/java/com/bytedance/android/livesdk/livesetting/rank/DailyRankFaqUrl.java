package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_daily_ranking_faq_url")
public final class DailyRankFaqUrl {
    public static final DailyRankFaqUrl INSTANCE = new DailyRankFaqUrl();
    public static final String DEFAULT = "";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_daily_ranking_faq_url", DEFAULT);
    }
}

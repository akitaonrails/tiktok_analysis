package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.live.model.LiveFeedDraw;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("feed_draw_mt")
public final class FeedDrawMtSetting {
    public static final LiveFeedDraw DEFAULT;
    public static final FeedDrawMtSetting INSTANCE = new FeedDrawMtSetting();

    static {
        LiveFeedDraw.Companion.getClass();
        DEFAULT = new LiveFeedDraw();
    }

    public final LiveFeedDraw getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveFeedDraw liveFeedDraw = DEFAULT;
        LiveFeedDraw liveFeedDraw2 = (LiveFeedDraw) settingsManager.getValueSafely("feed_draw_mt", liveFeedDraw);
        return liveFeedDraw2 != null ? liveFeedDraw2 : liveFeedDraw;
    }

    public final LiveFeedDraw getDEFAULT() {
        return DEFAULT;
    }
}

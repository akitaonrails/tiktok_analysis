package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C2188811AlT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_stream_goal_edit_web_link")
public final class LiveStreamGoalEditWebLinkSetting {
    public static final LiveStreamGoalEditWebLinkSetting INSTANCE = new LiveStreamGoalEditWebLinkSetting();
    public static final String DEFAULT = "sslocal://webcast_lynxview_popup?use_spark=1&use_forest=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Fmusically%2Ffe%2Flive%2Ftiktok_live_revenue_wish_list%2Fpages%2Fedit_goal.js&container_bg_color=252525&height=890rpx&radius=8&keyboard_adjust=2";
    public static final String value = SettingsManager.INSTANCE.getStringValue("live_stream_goal_edit_web_link", DEFAULT);

    public final String getPreviewValue() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(value);
        sbLIZ.append("&is_open_live=1");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getValue() {
        return value;
    }
}

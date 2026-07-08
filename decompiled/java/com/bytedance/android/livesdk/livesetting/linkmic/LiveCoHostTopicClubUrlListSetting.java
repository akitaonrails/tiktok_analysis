package com.bytedance.android.livesdk.livesetting.linkmic;

import android.text.TextUtils;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("cohost_topic_club_url_list")
public final class LiveCoHostTopicClubUrlListSetting {
    public static final String DEFAULT = "";
    public static final LiveCoHostTopicClubUrlListSetting INSTANCE;
    public static final String cohost_topic_club_faq;
    public static final String cohost_topic_club_plaza;
    public static final String cohost_topic_club_setting;

    static {
        LiveCoHostTopicClubUrlListSetting liveCoHostTopicClubUrlListSetting = new LiveCoHostTopicClubUrlListSetting();
        INSTANCE = liveCoHostTopicClubUrlListSetting;
        cohost_topic_club_faq = liveCoHostTopicClubUrlListSetting.getValue().optString("cohost_topic_club_faq", "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_cohost%2Fpages%2Ffaq%2Ftemplate.js&gravity=bottom&height=70%25&radius=8&bdhm_bid=tiktok_live_revenue_cohost&container_bg_color=transparent");
        cohost_topic_club_plaza = liveCoHostTopicClubUrlListSetting.getValue().optString("cohost_topic_club_plaza", "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_cohost%2Fpages%2Fplaza%2Ftemplate.js&gravity=bottom&height=70%25&radius=8&bdhm_bid=tiktok_live_revenue_cohost&container_bg_color=transparent&type=topic_club");
        cohost_topic_club_setting = liveCoHostTopicClubUrlListSetting.getValue().optString("cohost_topic_club_setting", "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_cohost%2Fpages%2Fplaza%2Ftemplate.js&gravity=bottom&height=70%25&radius=8&bdhm_bid=tiktok_live_revenue_cohost&container_bg_color=transparent&type=set_topic");
    }

    public final JSONObject getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        String str = DEFAULT;
        return TextUtils.isEmpty(settingsManager.getStringValue("cohost_topic_club_url_list", str)) ? new JSONObject() : new JSONObject(settingsManager.getStringValue("cohost_topic_club_url_list", str));
    }

    public final String getCohost_topic_club_faq() {
        return cohost_topic_club_faq;
    }

    public final String getCohost_topic_club_plaza() {
        return cohost_topic_club_plaza;
    }

    public final String getCohost_topic_club_setting() {
        return cohost_topic_club_setting;
    }
}

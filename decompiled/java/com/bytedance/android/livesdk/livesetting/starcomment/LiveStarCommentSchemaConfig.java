package com.bytedance.android.livesdk.livesetting.starcomment;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_star_comment_schema")
public final class LiveStarCommentSchemaConfig {
    public static final LiveStarCommentSchemaConfig INSTANCE = new LiveStarCommentSchemaConfig();
    public static final Config DEFAULT = new Config("sslocal://webcast_lynxview_popup?show_mask=0&container_bg_color=0B0B1F&use_spark=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Fmusically%2Ffe%2Flive%2Ftiktok_live_revenue_privilege%2Fpages%2Fstar_comment_settings%2Ftemplate.js&gravity=bottom&height=900rpx&use_forest=1&bdhm_bid=tiktok_live_revenue_privilege", "sslocal://webcast_lynxview_popup?show_mask=0&container_bg_color=0B0B1F&use_spark=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Fmusically%2Ffe%2Flive%2Ftiktok_live_revenue_privilege%2Fpages%2Fstar_comment_history%2Ftemplate.js&gravity=bottom&height=900rpx&use_forest=1&bdhm_bid=tiktok_live_revenue_privilege", "sslocal://webcast_webview?url=https%3A%2F%2Fsf16-draftcdn-sg.ibytedtos.com%2Fobj%2Fies-hotsoon-draft-sg%2Ftiktok-live-faq%2Ftiktok_live_revenue_star_comment_faq.html%3Ftrait_mode%3Ddark&show_amount_strategy%3D1&darkmode_color=BGSecondary&type=popup&gravity=bottom&radius=10&height=450", "sslocal://webcast_webview?url=https%3A%2F%2Fsf16-draftcdn-sg.ibytedtos.com%2Fobj%2Fies-hotsoon-draft-sg%2Ftiktok-live-faq%2Ftiktok_live_revenue_star_comment_faq_user.html%3Ftrait_mode%3Ddark&show_amount_strategy%3D1&darkmode_color=BGSecondary&type=popup&gravity=bottom&radius=10&height=450", "sslocal://webcast_webview?url=https%3A%2F%2Fsf19-draftcdn-sg.ibytedtos.com%2Fobj%2Fies-hotsoon-draft-sg%2Ftiktok-live-faq%2Fstar-comment-price-desc.html%3Ftrait_mode%3Ddark&show_amount_strategy%3D1&darkmode_color=BGSecondary&type=popup&gravity=bottom&radius=10");

    public static final class Config {
        public static final TypeAdapter ADAPTER;

        @C09CT("anchor_settings_scheme")
        public String anchor_settings_scheme;

        @C09CT("star_comment_purchase_page_bubble_faq")
        public String bubblePageFaq;

        @C09CT("star_comment_anchor_faq")
        public String starCommentAnchorFaq;

        @C09CT("star_comment_audience_faq")
        public String starCommentAudienceFaq;

        @C09CT("star_comment_history")
        public String starCommentHistory;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveStarCommentSchemaConfig_Config_OptTypeAdapter();
        }

        public Config() {
            this("", "", "", "", "");
        }

        public Config(String str, String str2, String str3, String str4, String str5) {
            this.anchor_settings_scheme = str;
            this.starCommentHistory = str2;
            this.starCommentAnchorFaq = str3;
            this.starCommentAudienceFaq = str4;
            this.bubblePageFaq = str5;
        }
    }

    public final Config getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("live_star_comment_schema", config);
        return config2 != null ? config2 : config;
    }
}

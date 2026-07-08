package com.ss.android.ugc.aweme.vibefeed.experiment;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class SocialVibeFeedConfigSetting {
    public static final Config LIZ = new Config(C1697810uHb.LJIIJJI("ci_share_feed_invite", "ci_share_feed_turn_off", "ci_share_feed_complete", "ci_share_feed_group_invite", "ci_share_feed_group_turn_off", "ci_share_feed_group_complete"), 86400, "https://sf-teko-source.tiktokcdn.com/obj/tiktok-teko-source-sg/10/teko/resource/dm_common_channel_0/shared_feed/vibe_feed_tutorial.webp", "https://sf-teko-source.tiktokcdn.com/obj/tiktok-teko-source-sg/10/teko/resource/dm_common_channel_0/shared_feed/invite_entrance/vibe_feed_invite_page_dark.webp", "https://sf-teko-source.tiktokcdn.com/obj/tiktok-teko-source-sg/10/teko/resource/dm_common_channel_0/shared_feed/invite_entrance/vibe_feed_invite_page_light.webp", "https://sf-teko-source.tiktokcdn.com/obj/tiktok-teko-source-sg/10/teko/resource/dm_common_channel_0/shared_feed/vibe_feed/feed_end_page_background.webp", "https://sf-teko-source.tiktokcdn.com/obj/tiktok-teko-source-sg/10/teko/resource/dm_common_channel_0/shared_feed/vibe_feed/summary_page_unlock.webp", "https://sf-teko-source.tiktokcdn.com/obj/tiktok-teko-source-sg/10/teko/resource/dm_common_channel_0/shared_feed/vibe_both_like/like_heart.png");

    public static final class Config {

        @C09CT("digg_summary_page_digg_prefix_url")
        public final String diggSummaryPageDiggPrefixUrl;

        @C09CT("inline_msg_push_enable_list")
        public final List<String> enableList;

        @C09CT("invite_panel_page_background_url")
        public final String invitePanelPageBackgroundUrl;

        @C09CT("invite_panel_top_dark_pic_url")
        public final String invitePanelTopDarkPicUrl;

        @C09CT("invite_panel_top_light_pic_url")
        public final String invitePanelTopLightPicUrl;

        @C09CT("invite_ttl_second")
        public final long inviteTTLSecond;

        @C09CT("tutorial_pic_url")
        public final String tutorialPicUrl;

        @C09CT("vibe_feed_summary_page_unlock_url")
        public final String vibeFeedSummaryPageUnlockUrl;

        public Config() {
            this(C1697810uHb.LJIIJJI("ci_share_feed_invite", "ci_share_feed_turn_off", "ci_share_feed_complete", "ci_share_feed_group_invite", "ci_share_feed_group_turn_off", "ci_share_feed_group_complete"), 86400L, "https://sf-teko-source.tiktokcdn.com/obj/tiktok-teko-source-sg/10/teko/resource/dm_common_channel_0/shared_feed/vibe_feed_tutorial.webp", "https://sf-teko-source.tiktokcdn.com/obj/tiktok-teko-source-sg/10/teko/resource/dm_common_channel_0/shared_feed/invite_entrance/vibe_feed_invite_page_dark.webp", "https://sf-teko-source.tiktokcdn.com/obj/tiktok-teko-source-sg/10/teko/resource/dm_common_channel_0/shared_feed/invite_entrance/vibe_feed_invite_page_light.webp", "https://sf-teko-source.tiktokcdn.com/obj/tiktok-teko-source-sg/10/teko/resource/dm_common_channel_0/shared_feed/vibe_feed/feed_end_page_background.webp", "https://sf-teko-source.tiktokcdn.com/obj/tiktok-teko-source-sg/10/teko/resource/dm_common_channel_0/shared_feed/vibe_feed/summary_page_unlock.webp", "https://sf-teko-source.tiktokcdn.com/obj/tiktok-teko-source-sg/10/teko/resource/dm_common_channel_0/shared_feed/vibe_both_like/like_heart.png");
        }

        public Config(List<String> list, long j, String str, String str2, String str3, String str4, String str5, String str6) {
            this.enableList = list;
            this.inviteTTLSecond = j;
            this.tutorialPicUrl = str;
            this.invitePanelTopDarkPicUrl = str2;
            this.invitePanelTopLightPicUrl = str3;
            this.invitePanelPageBackgroundUrl = str4;
            this.vibeFeedSummaryPageUnlockUrl = str5;
            this.diggSummaryPageDiggPrefixUrl = str6;
        }
    }

    public static Config LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        Config config = LIZ;
        Config config2 = (Config) settingsManagerLIZLLL.LJIIIIZZ("social_vibe_feed_settings", Config.class, config);
        return config2 != null ? config2 : config;
    }
}

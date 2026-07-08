package webcast.api.game_revenue;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class DiscordConnectOauthCallbackResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("discord_status")
        public int discordStatus;

        @C09CT("guild_setting_info")
        public GuildSettingInfo guildSettingInfo;

        @C09CT("bio_url")
        public String bioUrl = "";

        @C09CT("guild_id")
        public String guildId = "";

        @C09CT("oauth_url")
        public String oauthUrl = "";
    }
}

package webcast.api.game_revenue;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class DiscordGetUserJoinStatusResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("join_status")
        public int joinStatus;

        @C09CT("user_oauth_url")
        public String userOauthUrl = "";

        @C09CT("guild_id")
        public String guildId = "";

        @C09CT("guild_url")
        public String guildUrl = "";
    }
}

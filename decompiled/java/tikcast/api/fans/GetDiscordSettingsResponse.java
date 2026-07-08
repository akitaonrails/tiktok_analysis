package tikcast.api.fans;

import X.C09CT;
import webcast.data.FansDiscordGuildInfo;
import webcast.data.FansDiscordRoleInfo;

/* JADX INFO: loaded from: classes29.dex */
public final class GetDiscordSettingsResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("guild_info")
        public FansDiscordGuildInfo guildInfo;

        @C09CT("role_info")
        public FansDiscordRoleInfo roleInfo;
    }
}

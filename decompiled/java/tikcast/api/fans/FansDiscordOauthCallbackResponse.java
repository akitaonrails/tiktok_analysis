package tikcast.api.fans;

import X.C09CT;
import webcast.data.FansDiscordGuildInfo;

/* JADX INFO: loaded from: classes29.dex */
public final class FansDiscordOauthCallbackResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("guild_info")
        public FansDiscordGuildInfo guildInfo;
    }
}

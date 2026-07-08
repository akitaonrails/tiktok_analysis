package webcast.api.game_revenue;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class DiscordGetLSEntranceResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("meet_identify")
        public boolean meetIdentify;

        @C09CT("oauth_url")
        public String oauthUrl = "";
    }
}

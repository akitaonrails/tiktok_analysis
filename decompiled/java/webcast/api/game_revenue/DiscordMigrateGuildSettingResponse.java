package webcast.api.game_revenue;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes29.dex */
public final class DiscordMigrateGuildSettingResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("oauth_url")
        public String oauthUrl = "";

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;
    }
}

package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LiveVideoClipCampaignContributeAnchorListResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("user_list")
        public List<UserInfo> userList = new ArrayList();

        public static final class UserInfo {

            @C09CT("relate_task_id")
            public long relateTaskId;

            @C09CT("user_id")
            public long userId;

            @C09CT("user_avatar")
            public String userAvatar = "";

            @C09CT("user_name")
            public String userName = "";

            @C09CT("user_uniq_id")
            public String userUniqId = "";

            @C09CT("sec_user_id")
            public String secUserId = "";
        }
    }
}

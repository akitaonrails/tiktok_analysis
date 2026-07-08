package webcast.api.user;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class GetAdminListResponse {

    @C09CT("extra")
    public GetAdminListExtra extra;

    @C09CT("data")
    public List<AdminUser> data = new ArrayList();

    @C09CT("suggested_moderators")
    public List<SuggestedModerator> suggestedModerators = new ArrayList();

    public static final class AdminUser {

        @C09CT("deprecated2")
        public long deprecated2;

        @C09CT("deprecated3")
        public boolean deprecated3;

        @C09CT("is_anchor_assign")
        public boolean isAnchorAssign;

        @C09CT("recent_watch_status")
        public int recentWatchStatus;

        @C09CT("user_info")
        public User userInfo;

        @C09CT("deprecated1")
        public String deprecated1 = "";

        @C09CT("permissions")
        public Map<Integer, Integer> permissions = new LinkedHashMap();

        @C09CT("user_tag")
        public String userTag = "";

        @C09CT("tag_key")
        public String tagKey = "";
    }
}

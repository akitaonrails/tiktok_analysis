package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorAdminListResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("admin_max_count")
        public int adminMaxCount;

        @C09CT("admins")
        public List<AnchorAdminInfo> admins = new ArrayList();

        @C09CT("suggested_moderators")
        public List<AnchorSuggestedModerator> suggestedModerators = new ArrayList();
    }
}

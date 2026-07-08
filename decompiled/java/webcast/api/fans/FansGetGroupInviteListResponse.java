package webcast.api.fans;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class FansGetGroupInviteListResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("groups")
        public List<GroupInviteItem> groups = new ArrayList();
    }
}

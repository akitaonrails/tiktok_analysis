package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.AnchorUser;

/* JADX INFO: loaded from: classes4.dex */
public final class GetAnchorFriendListResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("friend_list")
        public List<AnchorUser> friendList = new ArrayList();

        @C09CT("has_more")
        public boolean hasMore;
    }
}

package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.AnchorUser;

/* JADX INFO: loaded from: classes4.dex */
public final class SearchUserResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("matched_user_list")
        public List<AnchorUser> matchedUserList = new ArrayList();
    }
}

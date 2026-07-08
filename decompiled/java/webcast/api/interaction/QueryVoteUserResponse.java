package webcast.api.interaction;

import X.C09CT;
import com.bytedance.android.livesdk.model.VoteUser;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class QueryVoteUserResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("total")
        public long total;

        @C09CT("vote_user_list")
        public List<VoteUser> voteUserList = new ArrayList();
    }
}

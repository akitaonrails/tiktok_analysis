package webcast.api.sub;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class EmotePollVotesResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("vote_user_list")
        public List<VoteUserWithBadge> voteUserList = new ArrayList();
    }
}

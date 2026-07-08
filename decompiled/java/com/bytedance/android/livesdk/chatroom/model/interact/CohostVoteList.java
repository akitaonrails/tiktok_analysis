package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class CohostVoteList {

    @C09CT("vote_list")
    public List<CohostVote> voteList = new ArrayList();

    public static final class CohostVote {

        @C09CT("from_user_id")
        public long fromUserId;

        @C09CT("vote_time_sec")
        public long voteTimeSec;

        @C09CT("voted_user_id")
        public long votedUserId;
    }
}

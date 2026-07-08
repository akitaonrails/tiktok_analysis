package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class SpacePoll {

    @C09CT("end_time_sec")
    public long endTimeSec;

    @C09CT("is_end")
    public boolean isEnd;

    @C09CT("option_list")
    public List<SpacePollOption> optionList = new ArrayList();

    @C09CT("poll_id")
    public long pollId;

    @C09CT("vote_info")
    public VoteInfo voteInfo;
}

package com.bytedance.android.livesdk.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class UserVoteInfo {

    @C09CT("has_voted")
    public boolean hasVoted;

    @C09CT("vote_option_index")
    public int voteOptionIndex;

    @C09CT("vote_option_list")
    public List<UserVoteOptionInfo> voteOptionList = new ArrayList();
}

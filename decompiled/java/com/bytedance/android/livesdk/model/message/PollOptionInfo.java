package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.livesdk.model.VoteUser;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PollOptionInfo {

    @C09CT("option_idx")
    public int optionIndex;

    @C09CT("votes")
    public long votes;

    @C09CT("display_content")
    public String displayContent = "";

    @C09CT("vote_user_list")
    public List<VoteUser> voteUserList = new ArrayList();
}

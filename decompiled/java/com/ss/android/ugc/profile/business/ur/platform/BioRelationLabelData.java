package com.ss.android.ugc.profile.business.ur.platform;

import X.C09CT;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;

/* JADX INFO: loaded from: classes20.dex */
public final class BioRelationLabelData extends BizBaseData {
    public static final int $stable = 8;

    @C09CT("matched_friend")
    public MatchedFriendStruct matchedFriend;

    public final MatchedFriendStruct getMatchedFriend() {
        return this.matchedFriend;
    }

    public final void setMatchedFriend(MatchedFriendStruct matchedFriendStruct) {
        this.matchedFriend = matchedFriendStruct;
    }
}

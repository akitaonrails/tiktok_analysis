package com.ss.android.ugc.aweme.feed.model.upvote;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class UpvoteInfo implements Serializable {

    @C09CT("friends_recall_info")
    public String friendsRecallInfo;

    @C09CT("repost_bubble_timing")
    public RepostBubbleTiming repostBubbleTiming;

    @C09CT("repost_initiate_predict")
    public Integer repostInitiatePredict;

    @C09CT("repost_initiate_score")
    public Float repostInitiateScore;

    @C09CT("user_upvoted")
    public Boolean userReposted;

    public UpvoteInfo() {
    }

    public UpvoteInfo(Boolean bool, String str, Integer num, Float f, RepostBubbleTiming repostBubbleTiming) {
        this.userReposted = bool;
        this.friendsRecallInfo = str;
        this.repostInitiatePredict = num;
        this.repostInitiateScore = f;
        this.repostBubbleTiming = repostBubbleTiming;
    }
}

package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class UserRankPlayerState {

    @C09CT("comparison")
    public UserRankComparison comparison;

    @C09CT("feature_meta")
    public FeatureMeta featureMeta;

    @C09CT("rank")
    public int rank;

    @C09CT("score")
    public long score;

    @C09CT("uid")
    public long uid;

    @C09CT("user_info")
    public CustomActivityUserInfo userInfo;

    @C09CT("lead_contributors")
    public List<UserRankLeadContributor> leadContributors = new ArrayList();

    @C09CT("state_id")
    public String stateId = "";
}

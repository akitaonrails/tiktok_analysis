package com.ss.android.ugc.aweme.im.saas.host.api.im.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GroupUserRecommendationAck implements Serializable {

    @C09CT("blocked_user_id")
    public final List<Long> userIdList;

    public GroupUserRecommendationAck() {
        this(null);
    }

    public final List<Long> getUserIdList() {
        return this.userIdList;
    }

    public GroupUserRecommendationAck(List<Long> list) {
        this.userIdList = list;
    }
}

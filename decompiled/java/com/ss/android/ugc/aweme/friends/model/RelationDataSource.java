package com.ss.android.ugc.aweme.friends.model;

import X.C1223390hwP;
import X.C1243340iSa;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;

/* JADX INFO: loaded from: classes20.dex */
public final class RelationDataSource {
    public static final RelationDataSource INSTANCE = new RelationDataSource();
    public static final EventLiveData<FollowStatus> relationLiveData = new EventLiveData<>();
    public static final EventLiveData<C1223390hwP> isRemovedLiveData = new EventLiveData<>();
    public static final EventLiveData<C1243340iSa> aliasLiveData = new EventLiveData<>();
    public static final EventLiveData<FollowStatus> followRequestSuccessLiveData = new EventLiveData<>();
    public static final int $stable = 8;

    public final EventLiveData<FollowStatus> get() {
        return relationLiveData;
    }

    public final EventLiveData<C1243340iSa> getAlias() {
        return aliasLiveData;
    }

    public final EventLiveData<FollowStatus> getFollowRequestSuccessLiveData() {
        return followRequestSuccessLiveData;
    }

    public final EventLiveData<C1223390hwP> getIsRemoved() {
        return isRemovedLiveData;
    }
}

package com.ss.android.ugc.aweme.im.saas.host.api.friends;

import X.C1243340iSa;
import X.C898250ZLr;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;

/* JADX INFO: loaded from: classes15.dex */
public interface IMHostApiRelationService {
    public static final C898250ZLr LIZ = C898250ZLr.LIZ;

    EventLiveData<C1243340iSa> LIZ();

    EventLiveData<FollowStatus> getRelationObservable();
}

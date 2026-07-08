package com.ss.android.ugc.aweme.friends.service;

import X.C1223390hwP;
import X.C1243340iSa;
import X.C1252380ihA;
import X.C1252650ihb;
import X.InterfaceC898260ZLs;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;

/* JADX INFO: loaded from: classes20.dex */
public interface RelationService {
    EventLiveData<C1243340iSa> LIZ();

    InterfaceC898260ZLs LIZIZ(ViewModelStoreOwner viewModelStoreOwner);

    EventLiveData<C1223390hwP> LIZJ();

    C1252650ihb LIZLLL(C1252380ihA c1252380ihA);

    boolean LJ();

    EventLiveData<FollowStatus> LJFF();

    EventLiveData<FollowStatus> getRelationObservable();
}

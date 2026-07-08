package com.ss.android.ugc.aweme.friends.service;

import X.C01GW;
import X.C0BUB;
import X.C0OF5;
import X.C1223390hwP;
import X.C1243340iSa;
import X.C1245020iVI;
import X.C1252380ihA;
import X.C1252430ihF;
import X.C1252640iha;
import X.C1252650ihb;
import X.InterfaceC898260ZLs;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.friends.model.RelationDataSource;
import com.ss.android.ugc.aweme.im.saas.host.api.friends.IMHostApiRelationService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.relation.follow.logic.RelationViewVM;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public final class RelationServiceImpl implements RelationService, IMHostApiRelationService {
    @Override // com.ss.android.ugc.aweme.friends.service.RelationService, com.ss.android.ugc.aweme.im.saas.host.api.friends.IMHostApiRelationService
    public final EventLiveData<C1243340iSa> LIZ() {
        return RelationDataSource.INSTANCE.getAlias();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.RelationService
    public final EventLiveData<C1223390hwP> LIZJ() {
        return RelationDataSource.INSTANCE.getIsRemoved();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.RelationService
    public final boolean LJ() {
        C01GW c01gw = C1245020iVI.LIZ;
        return C1245020iVI.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.RelationService
    public final EventLiveData<FollowStatus> LJFF() {
        return RelationDataSource.INSTANCE.getFollowRequestSuccessLiveData();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.RelationService, com.ss.android.ugc.aweme.im.saas.host.api.friends.IMHostApiRelationService
    public final EventLiveData<FollowStatus> getRelationObservable() {
        return RelationDataSource.INSTANCE.get();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.RelationService
    public final InterfaceC898260ZLs LIZIZ(ViewModelStoreOwner viewModelStoreOwner) {
        return (InterfaceC898260ZLs) new ViewModelProvider(viewModelStoreOwner).get(RelationViewVM.class);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.RelationService
    public final C1252650ihb LIZLLL(C1252380ihA c1252380ihA) {
        C1252640iha c1252640iha = new C1252640iha();
        String str = c1252380ihA.LIZ;
        Map mapLIZIZ = C0OF5.LIZIZ(c1252380ihA);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (C0BUB.LIZ()) {
            C1252430ihF c1252430ihF = C1252430ihF.LIZ;
            int i = c1252380ihA.LIZLLL;
            int i2 = c1252380ihA.LJIIJJI;
            boolean z = c1252380ihA.LJIILIIL;
            c1252430ihF.getClass();
            C1252640iha.LIZ(c1252380ihA, C1252430ihF.LIZIZ(i, i2, z));
        }
        return new C1252650ihb(C0OF5.LIZ(str, mapLIZIZ), c1252640iha, jCurrentTimeMillis, c1252380ihA);
    }
}

package com.ss.android.ugc.aweme.inbox.bulletin.core.service;

import X.C01GW;
import X.C099R;
import X.C0OJX;
import X.C0OPX;
import X.C0ORW;
import X.C2188811AlT;
import X.C452501pT;
import X.C616950OHt;
import X.C617140OIm;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.inbox.bulletin.core.convert.model.SimpleBulletinBoardInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleStruct;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinBoardDataServiceImpl implements IBulletinBoardDataService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(143));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(144));

    public final IBulletinBoardDataService LJIILLIIL() {
        if (C0OJX.LIZIZ() && C0OJX.LIZ) {
            return (C0ORW) this.LIZ.getValue();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinBoardDataServiceImpl: Db Enable:");
        sbLIZ.append(C0OJX.LIZIZ());
        sbLIZ.append(", Client init: ");
        sbLIZ.append(C0OJX.LIZ);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        return (C617140OIm) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService
    public final void LJ(BulletinAccountInfoResponse bulletinAccountInfoResponse) {
        LJIILLIIL().LJ(bulletinAccountInfoResponse);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService
    public final void LJFF(SimpleBulletinBoardInfo simpleBulletinBoardInfo) {
        LJIILLIIL().LJFF(simpleBulletinBoardInfo);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService
    public final void LJI(String str) {
        LJIILLIIL().LJI(str);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService
    public final void LJIIJ(List<BulletinStyleStruct> list) {
        LJIILLIIL().LJIIJ(list);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService
    public final void LJIIL(BulletinStyleStruct bulletinStyleStruct) {
        LJIILLIIL().LJIIL(bulletinStyleStruct);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService
    public final void LIZIZ(long j, String str) {
        LJIILLIIL().LIZIZ(j, str);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService
    public final Object LIZJ(String str, InterfaceC1364105Vn<? super BulletinAccountInfoResponse> interfaceC1364105Vn) {
        return LJIILLIIL().LIZJ(str, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService
    public final Object LIZLLL(String str, C616950OHt c616950OHt) {
        return LJIILLIIL().LIZLLL(str, c616950OHt);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService
    public final void LJIIIIZZ(int i, String str) {
        LJIILLIIL().LJIIIIZZ(i, str);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService
    public final Object LJIIIZ(String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        return LJIILLIIL().LJIIIZ(str, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService
    public final Object LJIIJJI(BulletinAccountInfoResponse bulletinAccountInfoResponse, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLJIIJJI = LJIILLIIL().LJIIJJI(bulletinAccountInfoResponse, interfaceC1364105Vn);
        if (objLJIIJJI == C099R.LJFF()) {
            return objLJIIJJI;
        }
        return Unit.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService
    public final void LIZ(BulletinItem bulletinItem, String str, boolean z) {
        LJIILLIIL().LIZ(bulletinItem, str, z);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService
    public final void LJIILIIL(BulletinListResponse bulletinListResponse, String str, boolean z) {
        LJIILLIIL().LJIILIIL(bulletinListResponse, str, z);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService
    public final void LJIILL(String str, boolean z, List list) {
        LJIILLIIL().LJIILL(str, z, list);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService
    public final Object LJIILJJIL(BulletinListResponse bulletinListResponse, String str, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        Object objLJIILJJIL = LJIILLIIL().LJIILJJIL(bulletinListResponse, str, interfaceC1364105Vn, z);
        if (objLJIILJJIL == C099R.LJFF()) {
            return objLJIILJJIL;
        }
        return Unit.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService
    public final Object LJII(String str, BulletinListResponse bulletinListResponse, Long l, Long l2, boolean z, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLJII = LJIILLIIL().LJII(str, bulletinListResponse, l, l2, z, interfaceC1364105Vn);
        if (objLJII == C099R.LJFF()) {
            return objLJII;
        }
        return Unit.LIZ;
    }
}

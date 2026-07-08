package com.ss.android.ugc.aweme.inbox.bulletin.core.service;

import X.C616950OHt;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.inbox.bulletin.core.convert.model.SimpleBulletinBoardInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleStruct;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public interface IBulletinBoardDataService {
    void LIZ(BulletinItem bulletinItem, String str, boolean z);

    void LIZIZ(long j, String str);

    Object LIZJ(String str, InterfaceC1364105Vn<? super BulletinAccountInfoResponse> interfaceC1364105Vn);

    Object LIZLLL(String str, C616950OHt c616950OHt);

    void LJ(BulletinAccountInfoResponse bulletinAccountInfoResponse);

    void LJFF(SimpleBulletinBoardInfo simpleBulletinBoardInfo);

    void LJI(String str);

    Object LJII(String str, BulletinListResponse bulletinListResponse, Long l, Long l2, boolean z, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    void LJIIIIZZ(int i, String str);

    Object LJIIIZ(String str, InterfaceC1364105Vn interfaceC1364105Vn);

    void LJIIJ(List<BulletinStyleStruct> list);

    Object LJIIJJI(BulletinAccountInfoResponse bulletinAccountInfoResponse, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    void LJIIL(BulletinStyleStruct bulletinStyleStruct);

    void LJIILIIL(BulletinListResponse bulletinListResponse, String str, boolean z);

    Object LJIILJJIL(BulletinListResponse bulletinListResponse, String str, InterfaceC1364105Vn interfaceC1364105Vn, boolean z);

    void LJIILL(String str, boolean z, List list);
}

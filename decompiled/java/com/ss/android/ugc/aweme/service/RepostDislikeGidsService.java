package com.ss.android.ugc.aweme.service;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C09JN;
import X.C0VNG;
import X.C0VRS;
import X.C0XQ7;
import X.C11NZ;
import X.C11S5;
import X.C13BV;
import X.C1587150rP7;
import X.C1697810uHb;
import X.C452501pT;
import X.C854770Xg3;
import X.InterfaceC1478005qU;
import Y.AfS178S0100000_9;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.friendstab.service.IRepostDislikeService;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class RepostDislikeGidsService implements IRepostDislikeService {
    public static final /* synthetic */ int LIZIZ = 0;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(165));

    @Override // com.ss.android.ugc.aweme.friendstab.service.IRepostDislikeService
    public final void LIZ() {
        final long jLJJII = C1587150rP7.LIZIZ.LJJII(false);
        C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0VRT
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<Integer> c09aj) {
                C1C7U.LIZ("RepostDislikeGidsService@3220.deleteExpiredEntities$dis$1");
                c09aj.onNext(Integer.valueOf(((C0VRS) this.LIZ.LIZ.getValue()).LIZIZ(jLJJII, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())));
                c09aj.onComplete();
                C1C7U.LIZIZ("RepostDislikeGidsService@3220.deleteExpiredEntities$dis$1");
            }
        }).LJL(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.0VRU
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("RepostDislikeGidsService@3220.deleteExpiredEntities$dis$2");
                C1C7U.LIZIZ("RepostDislikeGidsService@3220.deleteExpiredEntities$dis$2");
            }
        }, new C09JN() { // from class: X.0VRV
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("RepostDislikeGidsService@3220.deleteExpiredEntities$dis$3");
                C1C7U.LIZIZ("RepostDislikeGidsService@3220.deleteExpiredEntities$dis$3");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IRepostDislikeService
    public final List<C0VNG> LIZIZ() {
        try {
            return ((C0VRS) this.LIZ.getValue()).LIZJ(C1587150rP7.LIZIZ.LJJII(false), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C13BV.INSTANCE;
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IRepostDislikeService
    public final void LIZJ(C0VNG c0vng) {
        ArrayList arrayListLJ = C1697810uHb.LJ(c0vng);
        C11NZ.LJIJJLI(new C854770Xg3(this, arrayListLJ, 2)).LJL(C11S5.LIZ()).LJJLL(new AfS178S0100000_9(arrayListLJ, 56), new C09JN() { // from class: X.00Ot
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("RepostDislikeGidsService@3220.insertEntities$dis$3");
                C1C7U.LIZIZ("RepostDislikeGidsService@3220.insertEntities$dis$3");
            }
        });
    }
}

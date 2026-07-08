package com.ss.android.ugc.aweme.service;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C09JN;
import X.C0VNJ;
import X.C0XQ7;
import X.C11NZ;
import X.C11S5;
import X.C13BV;
import X.C452501pT;
import X.C854770Xg3;
import X.InterfaceC1478005qU;
import X.InterfaceC797800VRi;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabRedDotOptimizationSettings;
import com.ss.android.ugc.aweme.friendstab.service.IFriendsRedDotService;
import java.util.List;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class FriendsRedDotGidsService implements IFriendsRedDotService {
    public static final /* synthetic */ int LIZIZ = 0;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(163));

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsRedDotService
    public final List<C0VNJ> LIZJ() {
        try {
            return ((InterfaceC797800VRi) this.LIZ.getValue()).LIZJ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C13BV.INSTANCE;
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsRedDotService
    public final void LIZ() {
        final long jCurrentTimeMillis = System.currentTimeMillis() - (FriendsTabRedDotOptimizationSettings.LIZ().expireTimeSeconds * 1000);
        C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0VRd
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<Integer> c09aj) {
                C1C7U.LIZ("FriendsRedDotGidsService@4d7d.deleteExpiredEntities$dis$1");
                c09aj.onNext(Integer.valueOf(((InterfaceC797800VRi) this.LIZ.LIZ.getValue()).LIZIZ(jCurrentTimeMillis, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())));
                c09aj.onComplete();
                C1C7U.LIZIZ("FriendsRedDotGidsService@4d7d.deleteExpiredEntities$dis$1");
            }
        }).LJL(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.0VRg
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("FriendsRedDotGidsService@4d7d.deleteExpiredEntities$dis$2");
                C1C7U.LIZIZ("FriendsRedDotGidsService@4d7d.deleteExpiredEntities$dis$2");
            }
        }, new C09JN() { // from class: X.0VRh
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("FriendsRedDotGidsService@4d7d.deleteExpiredEntities$dis$3");
                C1C7U.LIZIZ("FriendsRedDotGidsService@4d7d.deleteExpiredEntities$dis$3");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsRedDotService
    public final void LIZIZ(C0VNJ c0vnj) {
        C11NZ.LJIJJLI(new C854770Xg3(this, c0vnj, 0)).LJL(C11S5.LIZ()).LJJIJIIJIL(new C09JN() { // from class: X.0VRe
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("FriendsRedDotGidsService@4d7d.insertSingleEntity$dis$2");
                C1C7U.LIZIZ("FriendsRedDotGidsService@4d7d.insertSingleEntity$dis$2");
            }
        }).LJJIJIIJI(new C09JN() { // from class: X.0VRf
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("FriendsRedDotGidsService@4d7d.insertSingleEntity$dis$3");
                C1C7U.LIZIZ("FriendsRedDotGidsService@4d7d.insertSingleEntity$dis$3");
            }
        }).LJJLJ();
    }
}

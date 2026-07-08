package com.ss.android.ugc.aweme.service;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C09JN;
import X.C0VNP;
import X.C0XQ7;
import X.C11NZ;
import X.C11S5;
import X.C13BV;
import X.C1697810uHb;
import X.C452501pT;
import X.C854770Xg3;
import X.C854780Xg4;
import X.InterfaceC797850VRn;
import Y.AfS182S0100000_13;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.friendstab.service.IFriendsUnreadService;
import java.util.List;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class FriendsUnreadGidsService implements IFriendsUnreadService {
    public static final /* synthetic */ int LIZIZ = 0;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(164));

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsUnreadService
    public final List<C0VNP> LIZIZ() {
        try {
            return ((InterfaceC797850VRn) this.LIZ.getValue()).LIZIZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C13BV.INSTANCE;
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsUnreadService
    public final void clear() {
        C11NZ.LJIJJLI(new C854780Xg4(this, 0)).LJL(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.0VRo
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("FriendsUnreadGidsService@ce29.clear$dis$2");
                C1C7U.LIZIZ("FriendsUnreadGidsService@ce29.clear$dis$2");
            }
        }, new C09JN() { // from class: X.0VRp
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("FriendsUnreadGidsService@ce29.clear$dis$3");
                C1C7U.LIZIZ("FriendsUnreadGidsService@ce29.clear$dis$3");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsUnreadService
    public final void LIZ(C0VNP c0vnp) {
        LIZJ(C1697810uHb.LJ(c0vnp));
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsUnreadService
    public final void LIZJ(List<C0VNP> list) {
        C11NZ.LJIJJLI(new C854770Xg3(this, list, 1)).LJL(C11S5.LIZ()).LJJLL(new AfS182S0100000_13(list, 71), new C09JN() { // from class: X.0VRq
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("FriendsUnreadGidsService@ce29.insertEntities$dis$3");
                C1C7U.LIZIZ("FriendsUnreadGidsService@ce29.insertEntities$dis$3");
            }
        });
    }
}

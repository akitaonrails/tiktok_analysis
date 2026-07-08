package com.ss.android.ugc.aweme.service;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0VNC;
import X.C0XQ7;
import X.C1227904rF;
import X.C12976055y;
import X.C13BV;
import X.C15438062q;
import X.C23250099c;
import X.C452501pT;
import X.C607900Nsq;
import X.C607910Nsr;
import X.C607920Nss;
import X.C607940Nsu;
import X.InterfaceC497601wk;
import X.InterfaceC607930Nst;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.friendstab.service.IFollowReadService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class FollowReadService implements IFollowReadService {
    public final C01GW LIZ = C452501pT.LIZIZ(new C12976055y());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C607940Nsu());

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFollowReadService
    public final void LIZ() {
        C23250099c.LIZLLL((InterfaceC497601wk) this.LIZ.getValue(), null, null, new C607910Nsr(this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFollowReadService
    public final List<String> LIZLLL() {
        try {
            List listLIZ = C607920Nss.LIZ((InterfaceC607930Nst) this.LIZIZ.getValue());
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
            Iterator it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C0VNC) it2.next()).LIZ);
            }
            return arrayList;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C13BV.INSTANCE;
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFollowReadService
    public final int getCount() {
        try {
            return ((InterfaceC607930Nst) this.LIZIZ.getValue()).LIZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFollowReadService
    public final String LIZJ() {
        List<String> listLIZLLL = LIZLLL();
        if (!(!listLIZLLL.isEmpty())) {
            return null;
        }
        C1227904rF.LIZ.getClass();
        return C1227904rF.LJI(listLIZLLL);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFollowReadService
    public final void LIZIZ(C0VNC c0vnc, long j) {
        C23250099c.LIZLLL((InterfaceC497601wk) this.LIZ.getValue(), null, null, new C607900Nsq(j, this, c0vnc, null), 3);
    }
}

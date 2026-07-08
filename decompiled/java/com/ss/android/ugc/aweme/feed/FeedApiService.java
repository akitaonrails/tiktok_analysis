package com.ss.android.ugc.aweme.feed;

import X.C01GW;
import X.C036E;
import X.C0NJP;
import X.C1492370owF;
import X.C1492460owO;
import X.C1492490owR;
import X.C1492520owU;
import X.C1601460rmC;
import X.C844470XAv;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.api.FeedApi;
import com.ss.android.ugc.aweme.feed.cache.IFeedApi;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes24.dex */
public class FeedApiService implements IFeedApi {
    @Override // com.ss.android.ugc.aweme.feed.cache.IFeedApi
    public FeedItemList fetchFeedList(C1601460rmC c1601460rmC) throws Throwable {
        boolean zLIZIZ;
        C1492370owF c1492370owF;
        boolean zLJI = MethodIDManager.LJI(198918);
        int i = c1601460rmC.LIZ;
        int i2 = c1601460rmC.LIZIZ;
        boolean z = C0NJP.LIZ;
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        boolean z2 = false;
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        boolean z3 = z & zLIZIZ;
        if ((i == 1 || i == 0) && i2 != 8) {
            z2 = true;
        }
        if (z2 & z3) {
            C01GW c01gw = C1492520owU.LIZ;
            c1492370owF = new C1492370owF((C1492460owO) c01gw.getValue());
            if (C0NJP.LIZ) {
                C1492460owO c1492460owO = (C1492460owO) c01gw.getValue();
                synchronized (c1492460owO) {
                    if (c1492460owO.LIZIZ == null) {
                        c1492460owO.LIZIZ = c1492370owF;
                    }
                    ((ArrayList) c1492460owO.LIZ).add(c1492370owF);
                }
            }
            try {
                c1492370owF.LJ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (th instanceof C1492490owR) {
                    throw th.getRealThrowable();
                }
                throw th;
            }
        } else {
            c1492370owF = null;
        }
        try {
            FeedItemList feedItemListLIZIZ = FeedApi.LIZIZ(c1601460rmC);
            if (c1492370owF != null) {
                c1492370owF.LIZLLL();
            }
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return feedItemListLIZIZ;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            throw new RuntimeException(th2) { // from class: X.0owR
                public static final int $stable = 8;
                public final Throwable LL;

                public final Throwable getRealThrowable() {
                    return this.LL;
                }

                {
                    this.LL = th2;
                }
            };
        }
    }
}

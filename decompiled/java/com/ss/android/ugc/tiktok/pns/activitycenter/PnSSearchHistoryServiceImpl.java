package com.ss.android.ugc.tiktok.pns.activitycenter;

import X.C04TD;
import X.C08JS;
import X.C0CQM;
import X.C0QEA;
import X.C11S5;
import X.C1701940uOG;
import Y.AfS173S0100000_4;
import com.ss.android.ugc.tiktok.pns.activitycenter.api.IPnSSearchHistoryService;
import com.ss.android.ugc.tiktok.pns.activitycenter.searchhistory.PnSSearchHistoryApi;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class PnSSearchHistoryServiceImpl implements IPnSSearchHistoryService {
    public static IPnSSearchHistoryService LIZIZ() {
        Object objLIZ = C04TD.LIZ(IPnSSearchHistoryService.class, false);
        if (objLIZ != null) {
            return (IPnSSearchHistoryService) objLIZ;
        }
        if (C04TD.Y6 == null) {
            synchronized (IPnSSearchHistoryService.class) {
                if (C04TD.Y6 == null) {
                    C04TD.Y6 = new PnSSearchHistoryServiceImpl();
                }
            }
        }
        return C04TD.Y6;
    }

    @Override // com.ss.android.ugc.tiktok.pns.activitycenter.api.IPnSSearchHistoryService
    public final void LIZ(List list, C0QEA c0qea) {
        C0CQM c0cqm = PnSSearchHistoryApi.LIZ;
        String strLIZLLL = C08JS.LIZLLL(list);
        c0cqm.getClass();
        C0CQM.LIZIZ.deleteSearchItem(strLIZLLL).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS173S0100000_4(c0qea, 25), new AfS173S0100000_4(c0qea, 26));
    }
}

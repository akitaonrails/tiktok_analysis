package com.ss.android.ugc.aweme.main.dialogmanager;

import X.C09JN;
import X.C10HL;
import X.C11NZ;
import X.C11S5;
import X.C1701940uOG;
import X.C19336110kp;
import X.C2018507vT;
import X.C2214201BlK;
import Y.AfS49S1200000_28;
import android.app.Activity;
import com.ss.android.ugc.aweme.clean.ICleanDialogService;

/* JADX INFO: loaded from: classes29.dex */
public final class CleanDialogServiceImpl implements ICleanDialogService {
    @Override // com.ss.android.ugc.aweme.clean.ICleanDialogService
    public final boolean LIZ() {
        if (System.currentTimeMillis() - C2018507vT.LIZ().getLong("last_check_storage_time", 0L) <= 604800000 || (C2018507vT.LIZ().getInt("show_storage_manager_count", 0) >= 3 && C2018507vT.LIZ().getInt("show_system_clean_count", 0) >= 3)) {
            return false;
        }
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF != null) {
            C11NZ.LJIJJLI(new C19336110kp(activityLJFF, 5)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS49S1200000_28(activityLJFF, new C10HL(), 1), new C09JN() { // from class: X.05QM
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("CleanCacheDialog@a56d.show$disposable$3");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("CleanCacheDialog#show: ");
                    sbLIZ.append(((Throwable) obj).getMessage());
                    C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
                    C1C7U.LIZIZ("CleanCacheDialog@a56d.show$disposable$3");
                }
            });
        }
        return true;
    }
}

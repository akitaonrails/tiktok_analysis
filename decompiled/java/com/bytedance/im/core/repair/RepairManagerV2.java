package com.bytedance.im.core.repair;

import X.C01GW;
import X.C0YEM;
import X.C13LQ;
import X.C2188811AlT;
import X.C452501pT;
import X.C868780Y6i;
import X.C870740YDw;
import X.C871320YGc;
import android.os.HandlerThread;
import android.util.SparseArray;
import com.bytedance.im.core.repair.RepairManagerV2$handler$2;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class RepairManagerV2 {
    public final C0YEM LIZ;
    public final HandlerThread LIZIZ = new HandlerThread("RepairManagerV2-Thread");
    public final C01GW LIZJ = C452501pT.LIZIZ(new RepairManagerV2$handler$2(this));
    public final SparseArray<C871320YGc> LJ = new SparseArray<>();
    public final boolean LIZLLL = true;

    public final void LIZ() {
        C868780Y6i.LJ(this.LIZ.LIZLLL(), "RepairManagerV2 ", "cancelPollingMsg for all inboxes", 4);
        if (this.LIZ.LJIIIZ().LJJJ.LIZ) {
            int size = this.LJ.size();
            for (int i = 0; i < size; i++) {
                LJFF(this.LJ.keyAt(i));
            }
        }
    }

    public final RepairManagerV2$handler$2.AnonymousClass1 LIZIZ() {
        return (RepairManagerV2$handler$2.AnonymousClass1) this.LIZJ.getValue();
    }

    public final void LIZLLL() {
        C868780Y6i.LJ(this.LIZ.LIZLLL(), "RepairManagerV2 ", "startPollingMsg for all inboxes", 4);
        if (this.LIZ.isLogin()) {
            int size = this.LJ.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = this.LJ.keyAt(i);
                C871320YGc c871320YGc = this.LJ.get(iKeyAt);
                if (!LIZIZ().hasMessages(iKeyAt)) {
                    LIZIZ().sendEmptyMessageDelayed(iKeyAt, LIZJ(iKeyAt) * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                }
                c871320YGc.LIZ = 8;
            }
        }
    }

    public final void LJ() {
        C868780Y6i.LJ(this.LIZ.LIZLLL(), "RepairManagerV2 ", "stopAllMsgPolling", 4);
        if (this.LIZLLL) {
            int size = this.LJ.size();
            for (int i = 0; i < size; i++) {
                LJFF(this.LJ.keyAt(i));
            }
            LIZIZ().removeCallbacksAndMessages(null);
        }
    }

    public RepairManagerV2(C0YEM c0yem) {
        this.LIZ = c0yem;
        int[] iArrLJ = C870740YDw.LJ(c0yem.LJIIIZ());
        List<Integer> list = c0yem.LJIIIZ().LJJJ.LIZLLL;
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (C13LQ.LJJIJ(num.intValue(), iArrLJ) >= 0) {
                arrayList.add(num);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            this.LJ.put(iIntValue, new C871320YGc(LIZJ(iIntValue)));
        }
    }

    public final long LIZJ(int i) {
        if (this.LIZ.LJIIIZ().LJJJ.LIZ) {
            return 60L;
        }
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getNextPollingMsgIntervalSeconds inbox: ");
        sbLIZ.append(i);
        C868780Y6i.LJ(c868780Y6iLIZLLL, "RepairManagerV2 ", C2188811AlT.LIZIZ(sbLIZ), 4);
        C871320YGc c871320YGc = this.LJ.get(i);
        if (c871320YGc != null) {
            return c871320YGc.LIZIZ;
        }
        if (i == 3) {
            return this.LIZ.LJIIIZ().LJJJ.LIZJ;
        }
        return this.LIZ.LJIIIZ().LJJJ.LIZIZ;
    }

    public final void LJFF(int i) {
        long j;
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopPollingMsg inbox: ");
        sbLIZ.append(i);
        C868780Y6i.LJ(c868780Y6iLIZLLL, "RepairManagerV2 ", C2188811AlT.LIZIZ(sbLIZ), 4);
        if (LIZIZ().hasMessages(i)) {
            LIZIZ().removeMessages(i);
            C871320YGc c871320YGc = this.LJ.get(i);
            if (c871320YGc != null) {
                if (i == 3) {
                    j = this.LIZ.LJIIIZ().LJJJ.LIZJ;
                } else {
                    j = this.LIZ.LJIIIZ().LJJJ.LIZIZ;
                }
                c871320YGc.LIZIZ = j;
            }
        }
    }
}

package com.ss.android.ugc.aweme.storage.impl;

import X.C01GW;
import X.C0CHQ;
import X.C0M2T;
import X.C0M4J;
import X.C0MZY;
import X.C0VSJ;
import X.C13VD;
import X.C13VF;
import X.C13VI;
import X.C13VP;
import X.C13VQ;
import X.C13VU;
import X.C1444630nhF;
import X.C1444640nhG;
import X.C1449640npK;
import X.C1453840nw6;
import X.C15438062q;
import X.C1639930smF;
import X.C20186013yc;
import X.C452501pT;
import X.C545640Lac;
import X.EnumC1335420kr6;
import X.InterfaceC1645170suh;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class AVFilterStorage extends C13VI {
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(101));

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final String LIZ() {
        return "AV_STORAGE_CLEANER_CACHE";
    }

    public final long LJIILL() {
        C0MZY.LIZ.getClass();
        Set setLIZIZ = C0MZY.LIZIZ();
        C0VSJ c0vsjLIZJ = C0CHQ.LIZ().LJJIIJZLJL().getFileProvider().LIZJ(C0CHQ.LIZ.getFilesDir(), "filter");
        C13VD c13vd = new C13VD(setLIZIZ, null, 2);
        if (c0vsjLIZJ.exists()) {
            C13VF c13vf = new C13VF();
            c13vf.LIZ(c13vd);
            c13vf.LIZIZ(c0vsjLIZJ);
        }
        long j = c13vd.LIZJ + 0;
        C0VSJ c0vsjLIZ = C0CHQ.LIZ().LJJIIJZLJL().getFileProvider().LIZ(C1449640npK.LJIIJJI);
        C13VD c13vd2 = new C13VD(setLIZIZ, null, 2);
        if (c0vsjLIZ.exists()) {
            C13VF c13vf2 = new C13VF();
            c13vf2.LIZ(c13vd2);
            c13vf2.LIZIZ(c0vsjLIZ);
        }
        return j + c13vd2.LIZJ + 0;
    }

    public static void LJIILLIIL() {
        String str;
        List<AwemeDraft> listQueryDraftList = C0CHQ.LIZ().LJI().LJIILJJIL().queryDraftList(new C0M4J(true, false, null, null, null, 126));
        ArrayList<AwemeDraft> arrayList = new ArrayList();
        for (AwemeDraft awemeDraft : listQueryDraftList) {
            AwemeDraft awemeDraft2 = awemeDraft;
            if (awemeDraft2.LJIILIIL >= 0 && ((str = awemeDraft2.LJJJJIZL.filterLocalPath) == null || str.length() == 0)) {
                arrayList.add(awemeDraft);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (AwemeDraft awemeDraft3 : arrayList) {
            awemeDraft3.LJJJJIZL.filterLocalPath = C0CHQ.LIZ().LJJIL().LIZ().getFilter(awemeDraft3.LJIILIIL).getFilterFolder();
            arrayList2.add(C0CHQ.LIZ().LJI().LIZIZ().LJFF(new C545640Lac(awemeDraft3, new C0M2T(false, "AVFilterStorage", null, 6, false, 28))));
        }
        C0CHQ.LIZ().getRegionService();
        InterfaceC1645170suh c1444630nhF = C20186013yc.LIZIZ().booleanValue() ^ true ? new C1444630nhF() : new C1444640nhG();
        c1444630nhF.LIZIZ("-1");
        c1444630nhF.LIZ("-1");
        C0CHQ.LIZ().LJJIL().LIZIZ().LJIILIIL();
        C0CHQ.LIZ().LJJIL().LIZLLL().LIZJ();
        C1639930smF.LIZ.LIZ();
        C0CHQ.LIZ().LJJIJ(C1453840nw6.LIZIZ()).LIZIZ().LJIILIIL();
        C0CHQ.LIZ().LJJIJ(C1453840nw6.LIZIZ()).LIZLLL().LIZJ();
    }

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        return C0CHQ.LIZ().LJJIIJZLJL().getFileProvider().LIZ(C1449640npK.LJIIJJI);
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.RESOURCE;
    }

    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        return LJIILL();
    }

    @Override // X.C13VI
    public final long LJIIJ(boolean z) {
        long jLJIILL = LJIILL();
        if (z) {
            C0VSJ c0vsjLIZJ = C0CHQ.LIZ().LJJIIJZLJL().getFileProvider().LIZJ(C0CHQ.LIZ.getFilesDir(), "filter");
            if (c0vsjLIZJ.exists()) {
                C0MZY.LIZ.getClass();
                C13VU c13vu = new C13VU(C0MZY.LIZIZ(), 2);
                c13vu.LIZJ = true;
                C13VF c13vf = new C13VF();
                c13vf.LIZ(c13vu);
                c13vf.LIZIZ(c0vsjLIZJ);
                c13vu.LIZIZ(null);
            }
            if (LJIIIIZZ().exists()) {
                C0MZY.LIZ.getClass();
                C13VU c13vu2 = new C13VU(C0MZY.LIZIZ(), 2);
                c13vu2.LIZJ = true;
                C13VF c13vf2 = new C13VF();
                c13vf2.LIZ(c13vu2);
                c13vf2.LIZIZ(LJIIIIZZ());
                c13vu2.LIZIZ(null);
            }
            LJIILLIIL();
        }
        return jLJIILL;
    }

    @Override // X.C13VI
    public final long LJIIL(boolean z) {
        C13VP.LIZ.getClass();
        if (C13VP.LIZIZ()) {
            C13VQ c13vq = C13VQ.LIZ;
            long jLIZ = C13VQ.LIZ(c13vq, (File) this.LIZIZ.getValue(), z);
            long jLIZ2 = C13VQ.LIZ(c13vq, LJIIIIZZ(), z);
            LJIILLIIL();
            return jLIZ + jLIZ2;
        }
        return LJIILL();
    }
}

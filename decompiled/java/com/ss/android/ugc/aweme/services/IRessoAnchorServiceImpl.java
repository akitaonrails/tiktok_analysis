package com.ss.android.ugc.aweme.services;

import X.C04TD;
import X.C1324040kYk;
import X.C1324050kYl;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.q;
import kotlin.Pair;

/* JADX INFO: loaded from: classes21.dex */
public final class IRessoAnchorServiceImpl implements IRessoAnchorService {
    public static IRessoAnchorService createIRessoAnchorServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IRessoAnchorService.class, z);
        if (objLIZ != null) {
            return (IRessoAnchorService) objLIZ;
        }
        return new IRessoAnchorServiceImpl();
    }

    @Override // com.ss.android.ugc.aweme.services.IRessoAnchorService
    public Pair<Long, Integer> getCopyrightLimitMsUninstalledResso(String str) {
        n nVarLJJIJ;
        C1324050kYl.LIZ.getClass();
        n nVar = C1324040kYk.LIZ;
        n nVar2 = (n) SettingsManager.LIZLLL().LJIIIIZZ("resso_control_list", n.class, C1324040kYk.LIZ);
        long jLJIIZILJ = Long.MAX_VALUE;
        int iLJIIJJI = 0;
        if (nVar2 != null) {
            try {
                if (nVar2.LJJIJIIJIL(str) && (nVarLJJIJ = nVar2.LJJIJ(str)) != null) {
                    q qVarLJJIJIIJI = nVarLJJIJ.LJJIJIIJI("show_interval_in_millSeconds");
                    if (qVarLJJIJIIJI != null) {
                        jLJIIZILJ = qVarLJJIJIIJI.LJIIZILJ();
                    } else {
                        jLJIIZILJ = 0;
                    }
                    q qVarLJJIJIIJI2 = nVarLJJIJ.LJJIJIIJI("max_finish_count");
                    if (qVarLJJIJIIJI2 != null) {
                        iLJIIJJI = qVarLJJIJIIJI2.LJIIJJI();
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return new Pair<>(Long.valueOf(jLJIIZILJ), Integer.valueOf(iLJIIJJI));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d A[PHI: r10
      0x004d: PHI (r10v6 long) = (r10v0 long), (r10v1 long), (r10v0 long), (r10v0 long), (r10v3 long) binds: [B:3:0x001f, B:16:0x004a, B:5:0x0025, B:7:0x002b, B:12:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4  */
    @Override // com.ss.android.ugc.aweme.services.IRessoAnchorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean showAnchorUninstalledResso(java.lang.String r13, android.content.Context r14) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.IRessoAnchorServiceImpl.showAnchorUninstalledResso(java.lang.String, android.content.Context):boolean");
    }
}

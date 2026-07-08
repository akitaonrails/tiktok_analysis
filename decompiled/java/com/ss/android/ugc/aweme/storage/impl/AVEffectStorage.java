package com.ss.android.ugc.aweme.storage.impl;

import X.C0CHQ;
import X.C0MZY;
import X.C120T;
import X.C13UP;
import X.C13VD;
import X.C13VF;
import X.C13VI;
import X.C13VJ;
import X.C13VP;
import X.C13VU;
import X.C1633850scR;
import X.C1663790tOj;
import X.C1866300yfM;
import X.C2296208zA;
import X.C2299808zk;
import X.EnumC1335420kr6;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.services.effect.EffectType;
import com.ss.android.ugc.aweme.services.effect.IEffectStorageCleanService;
import com.ss.android.ugc.aweme.setting.performance.EPEffectReadyOpt;
import com.ss.android.ugc.effectmanager.EffectManager;
import java.io.File;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class AVEffectStorage extends C13VI {
    @Override // X.C13VI, X.InterfaceC345370DgN
    public final String LIZ() {
        return "AV_STORAGE_CLEANER_CACHE";
    }

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        return C0CHQ.LIZ().LJJIIJZLJL().getFileProvider().LIZJ(C0CHQ.LIZ.getFilesDir(), "effect");
    }

    public final void LJIILL() {
        EffectManager effectManagerLLJILJILJ;
        C2299808zk c2299808zkLIZ = C2296208zA.LIZ();
        c2299808zkLIZ.getClass();
        C2299808zk.LJFF.getValue().LIZ.LJIIIZ(-1);
        c2299808zkLIZ.LIZIZ = null;
        c2299808zkLIZ.LIZJ = null;
        C120T c120tLIZ = C1663790tOj.LIZ();
        c120tLIZ.getClass();
        C120T.LJ.getValue().LIZ.LJIIIZ(-1);
        c120tLIZ.LIZIZ = null;
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().cleanEffectCache();
        if (!((EPEffectReadyOpt.EffectReadyConfig) EPEffectReadyOpt.LIZIZ.getValue()).enable || (effectManagerLLJILJILJ = C1633850scR.LIZ(C0CHQ.LIZ, null).LLJILJILJ()) == null) {
            return;
        }
        effectManagerLLJILJILJ.cleanOthersCache();
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.RESOURCE;
    }

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final void LJFF(boolean z) {
        super.LJFF(z);
        if (z) {
            C13VJ.LIZ(true);
        }
    }

    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        if (z) {
            ((IEffectStorageCleanService) ServiceManager.get().getService(IEffectStorageCleanService.class)).tryClean(new AwS574S0100000_30(this, 385));
            return 0L;
        }
        return 0L;
    }

    @Override // X.C13VI
    public final long LJIIJ(boolean z) {
        C0MZY.LIZ.getClass();
        C13VD c13vd = new C13VD(C0MZY.LIZIZ(), null, 2);
        if (LJIIIIZZ().exists()) {
            C13VF c13vf = new C13VF();
            c13vf.LIZ(c13vd);
            c13vf.LIZIZ(LJIIIIZZ());
        }
        long j = c13vd.LIZJ + 0;
        if (z && LJIIIIZZ().exists()) {
            C13VU c13vu = new C13VU(C0MZY.LIZIZ(), 2);
            c13vu.LIZJ = true;
            C13VF c13vf2 = new C13VF();
            c13vf2.LIZ(c13vu);
            c13vf2.LIZIZ(LJIIIIZZ());
            c13vu.LIZIZ(null);
            if (C1866300yfM.LIZ()) {
                C13UP.LIZ.getClass();
                C13UP.LIZ().LIZ();
            }
            LJIILL();
        }
        return j;
    }

    @Override // X.C13VI
    public final long LJIIL(boolean z) {
        C13VP.LIZ.getClass();
        if (C13VP.LIZIZ()) {
            IEffectStorageCleanService.DefaultImpls.tryCleanOnForExtremeLowStorage$default((IEffectStorageCleanService) ServiceManager.get().getService(IEffectStorageCleanService.class), EffectType.NORMAL, null, new AwS574S0100000_30(this, 201), 2, null);
            return 0L;
        }
        LJIIIZ(z);
        return 0L;
    }

    @Override // X.C13VI
    public final void LJIILJJIL(long j, boolean z) {
        super.LJIILJJIL(j, z);
        if (z) {
            C13VJ.LIZ(false);
        }
    }
}

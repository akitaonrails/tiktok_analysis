package com.ss.android.ugc.aweme.storage.impl;

import X.C0CHQ;
import X.C0MZY;
import X.C120T;
import X.C13UP;
import X.C13VD;
import X.C13VF;
import X.C13VI;
import X.C13VL;
import X.C1633850scR;
import X.C1663790tOj;
import X.C1697810uHb;
import X.C20020913Vf;
import X.C201955140j;
import X.C2296208zA;
import X.C2299808zk;
import X.C287590BOz;
import X.C297640Bla;
import X.C571880Mbq;
import X.EnumC1335420kr6;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.setting.performance.EPEffectReadyOpt;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.tiktok.tools.performance.api.storage.IToolsStorageService;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class AVToolsCacheStorage extends C13VI {
    public final List<C13VI> LIZIZ = C1697810uHb.LJIIJJI(new AVEffectStorage(), new AVEffectModelStorage(), new AVMusicResStorage(), new AVMVThemeStorage(), new AVFontStorage());

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final String LIZ() {
        return "AV_STORAGE_CLEANER_CACHE";
    }

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        return null;
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

    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        long jLIZLLL;
        C13VL c13vlLIZ;
        if (!z) {
            return 0L;
        }
        C201955140j.LIZJ(C20020913Vf.LIZIZ, "AVToolsCacheStorage: onClean");
        if (C287590BOz.LIZ()) {
            IToolsStorageService iToolsStorageService = (IToolsStorageService) PluggableExtentionKt.pluggableSpi$default(IToolsStorageService.class, false, false, false, 14, null);
            if (iToolsStorageService != null && (c13vlLIZ = iToolsStorageService.LIZ()) != null) {
                jLIZLLL = c13vlLIZ.LIZLLL();
            } else {
                jLIZLLL = 0;
            }
        } else {
            ArrayList<String> arrayListLJJJJL = EffectPlatform.LJJJJL(true);
            C13UP.LIZ.getClass();
            C13UP.LIZ().LJIILIIL("effect", arrayListLJJJJL);
            if (C297640Bla.LIZ()) {
                if (!C571880Mbq.LIZIZ) {
                    C571880Mbq.LIZ(C571880Mbq.LIZ);
                }
                C13UP.LIZ().LJIILIIL("effect_model", C571880Mbq.LJFF);
            }
            jLIZLLL = C13UP.LIZ().LIZLLL();
        }
        long j = 0 + jLIZLLL;
        LJIILL();
        return j;
    }

    @Override // X.C13VI
    public final long LJIIJ(boolean z) {
        C0MZY.LIZ.getClass();
        C13VD c13vd = new C13VD(C0MZY.LIZIZ(), null, 2);
        long j = 0;
        for (C13VI c13vi : this.LIZIZ) {
            File fileLJIIIIZZ = c13vi.LJIIIIZZ();
            if (fileLJIIIIZZ != null && fileLJIIIIZZ.exists()) {
                C13VF c13vf = new C13VF();
                c13vf.LIZ(c13vd);
                c13vf.LIZIZ(c13vi.LJIIIIZZ());
            }
            j += c13vd.LIZJ;
        }
        if (z) {
            Iterator<C13VI> it2 = this.LIZIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LJIIJ(true);
            }
        }
        return j;
    }

    @Override // X.C13VI
    public final long LJIIJJI(boolean z) {
        long jLJ;
        C13VL c13vlLIZ;
        long j = 0;
        if (z) {
            C201955140j.LIZJ(C20020913Vf.LIZIZ, "AVToolsCacheStorage: onCleanForExtremeLowStorage");
            if (C287590BOz.LIZ()) {
                IToolsStorageService iToolsStorageService = (IToolsStorageService) PluggableExtentionKt.pluggableSpi$default(IToolsStorageService.class, false, false, false, 14, null);
                if (iToolsStorageService != null && (c13vlLIZ = iToolsStorageService.LIZ()) != null) {
                    jLJ = c13vlLIZ.LJ();
                } else {
                    jLJ = 0;
                }
                j = 0 + jLJ;
            } else {
                C13UP.LIZ.getClass();
                long jLJ2 = C13UP.LIZ().LJ() + 0;
                new AVMVThemeStorage().LJIIJ(true);
                j = jLJ2;
            }
            LJIILL();
        }
        return j;
    }

    @Override // X.C13VI
    public final long LJIIL(boolean z) {
        long jLIZJ;
        C13VL c13vlLIZ;
        long j = 0;
        if (z) {
            C201955140j.LIZJ(C20020913Vf.LIZIZ, "AVToolsCacheStorage: onCleanForLowStorage");
            if (C287590BOz.LIZ()) {
                IToolsStorageService iToolsStorageService = (IToolsStorageService) PluggableExtentionKt.pluggableSpi$default(IToolsStorageService.class, false, false, false, 14, null);
                if (iToolsStorageService != null && (c13vlLIZ = iToolsStorageService.LIZ()) != null) {
                    jLIZJ = c13vlLIZ.LIZJ();
                } else {
                    jLIZJ = 0;
                }
                j = 0 + jLIZJ;
            } else {
                C13UP.LIZ.getClass();
                long jLIZJ2 = C13UP.LIZ().LIZJ() + 0;
                new AVMVThemeStorage().LJIIJ(true);
                j = jLIZJ2;
            }
            LJIILL();
        }
        return j;
    }
}

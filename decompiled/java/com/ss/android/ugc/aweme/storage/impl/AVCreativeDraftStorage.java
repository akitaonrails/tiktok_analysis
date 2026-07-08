package com.ss.android.ugc.aweme.storage.impl;

import X.C0CHQ;
import X.C0MZY;
import X.C0VSJ;
import X.C13VD;
import X.C13VF;
import X.C13VI;
import X.C13VP;
import X.C13VU;
import X.C263030ASn;
import X.C844470XAv;
import X.EnumC1335420kr6;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IDraftOfflineMonitorService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.io.File;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class AVCreativeDraftStorage extends C13VI {
    @Override // X.C13VI, X.InterfaceC345370DgN
    public final String LIZ() {
        return "AV_STORAGE_CLEANER_CACHE";
    }

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        return new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService().getCreativeRoot());
    }

    public final boolean LJIILL() {
        CreativeToolsPluginService creativeToolsPluginService;
        if (LJIIIIZZ().exists() && (creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null)) != null) {
            C844470XAv.LIZ.getClass();
            if (creativeToolsPluginService.LJI(C844470XAv.LIZ())) {
                C0MZY.LIZ.getClass();
                C13VU c13vu = new C13VU(C0MZY.LIZIZ(), 2);
                c13vu.LIZJ = true;
                C13VF c13vf = new C13VF();
                c13vf.LIZ(c13vu);
                c13vf.LIZIZ(LJIIIIZZ());
                c13vu.LIZIZ(null);
                return true;
            }
        }
        return true;
    }

    public final long LJIILLIIL() {
        if (!LJIIIIZZ().exists()) {
            return 0L;
        }
        C0MZY.LIZ.getClass();
        C13VD c13vd = new C13VD(C0MZY.LIZIZ(), null, 2);
        C13VF c13vf = new C13VF();
        c13vf.LIZ(c13vd);
        c13vf.LIZIZ(LJIIIIZZ());
        return c13vd.LIZJ;
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.CACHE;
    }

    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        if (((Boolean) C263030ASn.LIZ.getValue()).booleanValue()) {
            return LJIIJ(true);
        }
        return 0L;
    }

    @Override // X.C13VI
    public final long LJIIJ(boolean z) {
        long jLJIILLIIL = LJIILLIIL();
        if (z) {
            IDraftOfflineMonitorService iDraftOfflineMonitorService = (IDraftOfflineMonitorService) PluggableExtentionKt.pluggableSpi$default(IDraftOfflineMonitorService.class, false, false, false, 14, null);
            if (iDraftOfflineMonitorService != null) {
                ((Boolean) iDraftOfflineMonitorService.LIZIZ(new AwS574S0100000_30(this, 199))).booleanValue();
            } else {
                LJIILL();
                return jLJIILLIIL;
            }
        }
        return jLJIILLIIL;
    }

    @Override // X.C13VI
    public final long LJIIJJI(boolean z) {
        C13VP.LIZ.getClass();
        if (C13VP.LIZ()) {
            long jLJIILLIIL = LJIILLIIL();
            if (z) {
                IDraftOfflineMonitorService iDraftOfflineMonitorService = (IDraftOfflineMonitorService) PluggableExtentionKt.pluggableSpi$default(IDraftOfflineMonitorService.class, false, false, false, 14, null);
                if (iDraftOfflineMonitorService != null) {
                    ((Boolean) iDraftOfflineMonitorService.LIZIZ(new AwS574S0100000_30(this, 200))).booleanValue();
                } else {
                    LJIILL();
                    return jLJIILLIIL;
                }
            }
            return jLJIILLIIL;
        }
        return LJIIIZ(z);
    }
}

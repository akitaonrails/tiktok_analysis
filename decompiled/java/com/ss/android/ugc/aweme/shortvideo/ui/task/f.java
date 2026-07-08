package com.ss.android.ugc.aweme.shortvideo.ui.task;

import X.AbstractRunnableC21377818lM;
import X.C0CHQ;
import X.C1661800tLW;
import X.C1C7U;
import X.C278290AvT;
import X.EnumC194317110p;
import X.InterfaceC1408530ml1;
import kotlin.jvm.internal.AFwS266S0000000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class f extends AbstractRunnableC21377818lM implements InterfaceC1408530ml1 {
    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZIZ() {
        return false;
    }

    @Override // X.AbstractRunnableC21377818lM, java.lang.Runnable, X.InterfaceC1408530ml1
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("PreLoadInitTextStickerServiceTask@4e8d.run");
        try {
            C0CHQ.LIZ().LIZ().init();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreLoadInitTextStickerServiceTask@4e8d.run");
    }

    public f() {
        LJ(AFwS266S0000000_25.get$arr$(68));
    }

    @Override // X.InterfaceC1408530ml1
    public final EnumC194317110p LIZJ() {
        if (C278290AvT.LIZ()) {
            return EnumC194317110p.P3;
        }
        int iLIZ = C1661800tLW.LIZ();
        return iLIZ != 1 ? iLIZ != 2 ? EnumC194317110p.P1 : EnumC194317110p.P3 : EnumC194317110p.P1;
    }
}

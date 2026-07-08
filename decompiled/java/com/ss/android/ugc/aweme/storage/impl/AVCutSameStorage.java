package com.ss.android.ugc.aweme.storage.impl;

import X.AbstractC2454309jZ;
import X.C08OW;
import X.C09RB;
import X.C0CHQ;
import X.C0MZY;
import X.C0VSJ;
import X.C13BV;
import X.C13LQ;
import X.C13VD;
import X.C13VF;
import X.C13VU;
import X.C20020913Vf;
import X.C201955140j;
import X.C2454209jY;
import X.EnumC1335420kr6;
import com.ss.android.ugc.aweme.setting.CutCameStorageOpt;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AFwS263S0000000_23;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes31.dex */
public final class AVCutSameStorage extends AbstractC2454309jZ {
    @Override // X.AbstractC2454309jZ, X.InterfaceC345370DgN
    public final String LIZ() {
        return "AV_STORAGE_CLEANER_CACHE";
    }

    @Override // X.AbstractC2454309jZ, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        return new C0VSJ(C08OW.LIZ(C0CHQ.LIZ));
    }

    @Override // X.AbstractC2454309jZ
    public final List<File> LJIIJ() {
        C201955140j.LIZJ(C20020913Vf.LIZIZ, "AVCutSameStorage clean");
        return C2454209jY.LIZ(((CutCameStorageOpt.CutCameStorageConfig) CutCameStorageOpt.LIZIZ.getValue()).commonExpireDays * 86400000, LJIIL());
    }

    @Override // X.AbstractC2454309jZ
    public final List<File> LJIIJJI() {
        return C2454209jY.LIZ(((long) ((CutCameStorageOpt.CutCameStorageConfig) CutCameStorageOpt.LIZIZ.getValue()).extremeLowStorageExpireDays) * 86400000, LJIIL());
    }

    @Override // X.AbstractC2454309jZ
    public final List<File> LJIIL() {
        Sequence sequenceLJIIJJI;
        List<File> listLJJII;
        if (!LJIIIIZZ().exists() || !LJIIIIZZ().isDirectory()) {
            return C13BV.INSTANCE;
        }
        File[] fileArrListFiles = LJIIIIZZ().listFiles();
        return (fileArrListFiles == null || (sequenceLJIIJJI = C13LQ.LJIIJJI(fileArrListFiles)) == null || (listLJJII = C09RB.LJJII(C09RB.LJIILIIL(C09RB.LJIIIZ(sequenceLJIIJJI, AFwS263S0000000_23.get$arr$(29)), AFwS263S0000000_23.get$arr$(30)))) == null) ? C13BV.INSTANCE : listLJJII;
    }

    @Override // X.AbstractC2454309jZ
    public final List<File> LJIILIIL() {
        return LJIIJ();
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.RESOURCE;
    }

    @Override // X.AbstractC2454309jZ
    public final List<File> LJIILJJIL() {
        return C13BV.INSTANCE;
    }

    @Override // X.AbstractC2454309jZ
    public final long LJIILL(boolean z) {
        C0MZY.LIZ.getClass();
        C13VD c13vd = new C13VD(C0MZY.LIZIZ(), null, 2);
        if (LJIIIIZZ().exists()) {
            C13VF c13vf = new C13VF();
            c13vf.LIZ(c13vd);
            c13vf.LIZIZ(LJIIIIZZ());
        }
        long j = c13vd.LIZJ + 0;
        if (z && LJIIIIZZ().exists()) {
            C201955140j.LIZJ(C20020913Vf.LIZIZ, "AVCutSameStorage doClean");
            C13VU c13vu = new C13VU(C0MZY.LIZIZ(), 2);
            c13vu.LIZJ = true;
            C13VF c13vf2 = new C13VF();
            c13vf2.LIZ(c13vu);
            c13vf2.LIZIZ(LJIIIIZZ());
            c13vu.LIZIZ(null);
        }
        return j;
    }
}

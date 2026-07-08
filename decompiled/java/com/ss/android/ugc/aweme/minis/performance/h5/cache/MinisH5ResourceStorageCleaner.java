package com.ss.android.ugc.aweme.minis.performance.h5.cache;

import X.AbstractC2454309jZ;
import X.C01GW;
import X.C13BV;
import X.C13LQ;
import X.C452501pT;
import X.EnumC1335420kr6;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class MinisH5ResourceStorageCleaner extends AbstractC2454309jZ {
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(511));

    @Override // X.AbstractC2454309jZ, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        return (File) this.LIZIZ.getValue();
    }

    @Override // X.AbstractC2454309jZ
    public final List<File> LJIIJJI() {
        List<File> listLJJLL;
        File[] fileArrListFiles = LJIIIIZZ().listFiles();
        return (fileArrListFiles == null || (listLJJLL = C13LQ.LJJLL(fileArrListFiles)) == null) ? C13BV.INSTANCE : listLJJLL;
    }

    @Override // X.AbstractC2454309jZ
    public final List<File> LJIILIIL() {
        List<File> listLJJLL;
        File[] fileArrListFiles = LJIIIIZZ().listFiles();
        return (fileArrListFiles == null || (listLJJLL = C13LQ.LJJLL(fileArrListFiles)) == null) ? C13BV.INSTANCE : listLJJLL;
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.CACHE;
    }

    @Override // X.AbstractC2454309jZ
    public final List<File> LJIIL() {
        return C13BV.INSTANCE;
    }

    @Override // X.AbstractC2454309jZ
    public final List<File> LJIILJJIL() {
        return C13BV.INSTANCE;
    }
}

package com.ss.android.storage.cleaner;

import X.AbstractC2454309jZ;
import X.C0VSJ;
import X.C13BV;
import X.C13LQ;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC1335420kr6;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class AwemeCacheStorageCleaner extends AbstractC2454309jZ {
    @Override // X.AbstractC2454309jZ
    public final List<File> LJIIL() {
        List<File> listLJJLL;
        C844470XAv.LIZ.getClass();
        File[] fileArrListFiles = new C0VSJ(C786410Ut5.w2(C844470XAv.LIZ()).getPath(), "awemeCache").listFiles();
        return (fileArrListFiles == null || (listLJJLL = C13LQ.LJJLL(fileArrListFiles)) == null) ? C13BV.INSTANCE : listLJJLL;
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.CACHE;
    }

    @Override // X.AbstractC2454309jZ
    public final List<File> LJIILJJIL() {
        return C13BV.INSTANCE;
    }
}

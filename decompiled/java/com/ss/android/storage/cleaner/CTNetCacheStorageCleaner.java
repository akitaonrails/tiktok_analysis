package com.ss.android.storage.cleaner;

import X.AbstractC2454309jZ;
import X.AbstractC848400XPy;
import X.C0VSJ;
import X.C0XQ7;
import X.C13BV;
import X.C13LQ;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC1335420kr6;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class CTNetCacheStorageCleaner extends AbstractC2454309jZ {
    @Override // X.AbstractC2454309jZ
    public final List<File> LJIIL() {
        List<File> listLJJLL;
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ctNetCache_");
        sbLIZ.append(curUserId);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C844470XAv.LIZ.getClass();
        String path = C786410Ut5.w2(C844470XAv.LIZ()).getPath();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(path);
        sbLIZ2.append(File.separator);
        sbLIZ2.append(strLIZIZ);
        File[] fileArrListFiles = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2)).listFiles();
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

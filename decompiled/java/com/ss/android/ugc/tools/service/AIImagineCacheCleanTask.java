package com.ss.android.ugc.tools.service;

import X.AbstractC2454309jZ;
import X.C15438062q;
import X.C21290818Tq;
import X.C2454209jY;
import X.EnumC1335420kr6;
import X.InterfaceC2454409ja;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class AIImagineCacheCleanTask extends AbstractC2454309jZ {
    public final InterfaceC2454409ja LIZIZ;

    @Override // X.AbstractC2454309jZ
    public final List<File> LJIIL() {
        return this.LIZIZ.LIZIZ();
    }

    @Override // X.AbstractC2454309jZ
    public final List<File> LJIILJJIL() {
        List<File> notCleanableFileList = this.LIZIZ.getNotCleanableFileList();
        StringBuilder sb = new StringBuilder("NonCleanable files=");
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(notCleanableFileList, 10));
        Iterator<File> it2 = notCleanableFileList.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getPath());
        }
        sb.append(arrayList);
        C21290818Tq.LIZJ("AIImagineCacheCleanTask", sb.toString());
        return notCleanableFileList;
    }

    @Override // X.AbstractC2454309jZ
    public final List<File> LJIIJ() {
        return C2454209jY.LIZ(2592000000L, LJIIL());
    }

    @Override // X.AbstractC2454309jZ
    public final List<File> LJIIJJI() {
        List<File> listLIZ = C2454209jY.LIZ(86400000L, LJIIL());
        StringBuilder sb = new StringBuilder("cleanable files=");
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
        Iterator it2 = ((ArrayList) listLIZ).iterator();
        while (it2.hasNext()) {
            arrayList.add(((File) it2.next()).getPath());
        }
        sb.append(arrayList);
        C21290818Tq.LIZJ("AIImagineCacheCleanTask", sb.toString());
        return listLIZ;
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.CACHE;
    }

    public AIImagineCacheCleanTask(InterfaceC2454409ja interfaceC2454409ja) {
        this.LIZIZ = interfaceC2454409ja;
    }
}

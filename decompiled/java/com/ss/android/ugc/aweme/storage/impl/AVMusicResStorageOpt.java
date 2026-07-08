package com.ss.android.ugc.aweme.storage.impl;

import X.AbstractC2454309jZ;
import X.C0AR6;
import X.C0CHQ;
import X.C0MZY;
import X.C0VSJ;
import X.C13BV;
import X.C13LQ;
import X.C13TD;
import X.C13VD;
import X.C13VF;
import X.C13VU;
import X.C15438062q;
import X.C2454209jY;
import X.C279530AxT;
import X.EnumC1335420kr6;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes31.dex */
public final class AVMusicResStorageOpt extends AbstractC2454309jZ {
    public final long LIZIZ = ((Number) C0AR6.LIZ.getValue()).longValue();

    @Override // X.AbstractC2454309jZ, X.InterfaceC345370DgN
    public final String LIZ() {
        return "AV_STORAGE_CLEANER_CACHE";
    }

    @Override // X.AbstractC2454309jZ
    public final List<File> LJIILJJIL() {
        boolean z = C13TD.LIZIZ;
        Set<String> set = C13TD.LJ;
        ArrayList<String> arrayListDraftMusicList = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().cacheConfig().draftMusicList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(set);
        linkedHashSet.addAll(arrayListDraftMusicList);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(linkedHashSet, 10));
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C0VSJ((String) it2.next()));
        }
        return arrayList;
    }

    @Override // X.AbstractC2454309jZ, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        return C0CHQ.LIZ().LJJIIJZLJL().getFileProvider().LIZ(C0CHQ.LIZ().LJJJJL().getDownloadDir());
    }

    @Override // X.AbstractC2454309jZ
    public final List<File> LJIIJ() {
        return C2454209jY.LIZ(this.LIZIZ, LJIIL());
    }

    @Override // X.AbstractC2454309jZ
    public final List<File> LJIIJJI() {
        return C2454209jY.LIZ(((Number) C279530AxT.LIZ.getValue()).longValue(), LJIIL());
    }

    @Override // X.AbstractC2454309jZ
    public final List<File> LJIIL() {
        List<File> listLJJLL;
        if (!LJIIIIZZ().exists() || !LJIIIIZZ().isDirectory()) {
            return C13BV.INSTANCE;
        }
        File[] fileArrListFiles = LJIIIIZZ().listFiles();
        return (fileArrListFiles == null || (listLJJLL = C13LQ.LJJLL(fileArrListFiles)) == null) ? C13BV.INSTANCE : listLJJLL;
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
            C13VU c13vu = new C13VU(C0MZY.LIZIZ(), 2);
            C13VF c13vf2 = new C13VF();
            c13vf2.LIZ(c13vu);
            c13vf2.LIZIZ(LJIIIIZZ());
            c13vu.LIZIZ(null);
        }
        return j;
    }
}

package com.ss.android.ugc.aweme.setting.services;

import X.C04TD;
import X.C1BLJ;
import X.C2426909f9;
import X.C2427009fA;
import X.EnumC1335420kr6;
import X.InterfaceC20279414Wq;
import X.InterfaceC345370DgN;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class StorageServiceImpl implements IStorageService {
    public static IStorageService LIZLLL() {
        Object objLIZ = C04TD.LIZ(IStorageService.class, false);
        if (objLIZ != null) {
            return (IStorageService) objLIZ;
        }
        if (C04TD.T4 == null) {
            synchronized (IStorageService.class) {
                if (C04TD.T4 == null) {
                    C04TD.T4 = new StorageServiceImpl();
                }
            }
        }
        return C04TD.T4;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IStorageService
    public final long LIZ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(EnumC1335420kr6.CACHE);
        arrayList.add(EnumC1335420kr6.RESOURCE);
        arrayList.add(EnumC1335420kr6.DRAFT);
        List<InterfaceC345370DgN> listLJIIJJI = C2427009fA.LJIIJJI();
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC345370DgN interfaceC345370DgN : listLJIIJJI) {
            if (arrayList.contains(interfaceC345370DgN.LIZLLL())) {
                arrayList2.add(interfaceC345370DgN);
            }
        }
        Iterator it2 = arrayList2.iterator();
        long jLJII = 0;
        while (it2.hasNext()) {
            jLJII += ((InterfaceC345370DgN) it2.next()).LJII(false);
        }
        if (jLJII >= 31457280) {
            return jLJII;
        }
        return 0L;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IStorageService
    public final void LIZIZ(C1BLJ c1blj) {
        ((ArrayList) C2426909f9.LIZ).add(c1blj);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IStorageService
    public final void LIZJ(InterfaceC20279414Wq interfaceC20279414Wq) {
        ((ArrayList) C2426909f9.LIZ).remove(interfaceC20279414Wq);
    }
}

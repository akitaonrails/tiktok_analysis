package com.ss.android.ugc.aweme.sync;

import X.C1526600ppS;
import X.EnumC1733330vCt;
import X.InterfaceC596980NbE;
import X.InterfaceC809840Vpm;
import com.bytedance.sync.SyncSDK;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes14.dex */
public final class ByteSyncApiImpl implements IByteSyncApi {
    @Override // com.ss.android.ugc.aweme.sync.IByteSyncApi
    public final void LIZIZ(EnumC1733330vCt enumC1733330vCt) {
        InterfaceC809840Vpm interfaceC809840VpmRemove;
        AtomicBoolean atomicBoolean = C1526600ppS.LIZ;
        long serverId = enumC1733330vCt.getServerId();
        if (C1526600ppS.LIZJ(serverId) && (interfaceC809840VpmRemove = C1526600ppS.LIZJ.remove(Long.valueOf(serverId))) != null) {
            interfaceC809840VpmRemove.remove();
        }
    }

    @Override // com.ss.android.ugc.aweme.sync.IByteSyncApi
    public final void LIZ(EnumC1733330vCt enumC1733330vCt, final InterfaceC596980NbE interfaceC596980NbE) {
        AtomicBoolean atomicBoolean = C1526600ppS.LIZ;
        final long serverId = enumC1733330vCt.getServerId();
        if (C1526600ppS.LIZJ(serverId) && !C1526600ppS.LIZJ.containsKey(Long.valueOf(serverId))) {
            SyncSDK.runAfterStart(new Runnable() { // from class: X.0Vpo
                public final void LIZ() {
                    ConcurrentHashMap<Long, InterfaceC809840Vpm> concurrentHashMap = C1526600ppS.LIZJ;
                    if (concurrentHashMap.containsKey(Long.valueOf(serverId))) {
                        return;
                    }
                    C809900Vps c809900Vps = new C809900Vps(serverId);
                    ((ArrayList) c809900Vps.LIZIZ).add(interfaceC596980NbE);
                    concurrentHashMap.put(Long.valueOf(serverId), SyncSDK.registerBusiness(c809900Vps.LIZ()));
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SyncManager@e7b0.registerSyncBiz$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SyncManager@e7b0.registerSyncBiz$1");
                }
            });
        }
    }
}

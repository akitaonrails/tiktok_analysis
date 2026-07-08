package com.ss.android.ugc.aweme.service;

import X.C0VNS;
import X.C0VR0;
import X.C797690VQx;
import com.ss.android.ugc.aweme.friendstab.service.IRecentGidsCacheService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes14.dex */
public final class RecentGidsCacheServiceImpl implements IRecentGidsCacheService {
    @Override // com.ss.android.ugc.aweme.friendstab.service.IRecentGidsCacheService
    public final void LIZLLL() {
        C797690VQx.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IRecentGidsCacheService
    public final void LIZIZ(C0VR0 c0vr0) {
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) C797690VQx.LIZJ.getValue();
        if (concurrentLinkedQueue != null) {
            concurrentLinkedQueue.add(c0vr0);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IRecentGidsCacheService
    public final void LIZJ(C0VR0 c0vr0) {
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) C797690VQx.LIZJ.getValue();
        if (concurrentLinkedQueue != null) {
            concurrentLinkedQueue.remove(c0vr0);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IRecentGidsCacheService
    public final List LIZ(Integer num, long j) {
        ConcurrentHashMap concurrentHashMapLIZ = C797690VQx.LIZ();
        ArrayList arrayList = new ArrayList(concurrentHashMapLIZ.size());
        Iterator it2 = concurrentHashMapLIZ.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(((Map.Entry) it2.next()).getValue());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C0VNS c0vns = (C0VNS) obj;
            if (c0vns.LIZIZ > j && (num == null || c0vns.LIZJ != num.intValue())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}

package com.ss.android.ugc.tiktok.pns.jsbridgekit.impl;

import X.C1703890uRP;
import X.InterfaceC1119904Zp;
import com.ss.android.ugc.tiktok.pns.jsbridgekit.biz.interfaces.IJsbBroadcastService;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class JsbBroadcastServiceImpl implements IJsbBroadcastService {
    public final ConcurrentHashMap<String, List<InterfaceC1119904Zp>> LIZ = new ConcurrentHashMap<>();

    @Override // com.ss.android.ugc.tiktok.pns.jsbridgekit.biz.interfaces.IJsbBroadcastService
    public final void LJIIIZ(C1703890uRP c1703890uRP) {
        List<InterfaceC1119904Zp> copyOnWriteArrayList = this.LIZ.get("setSignupRegion");
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.LIZ.put("setSignupRegion", copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(c1703890uRP);
    }

    @Override // com.ss.android.ugc.tiktok.pns.jsbridgekit.biz.interfaces.IJsbBroadcastService
    public final void LIZJ(String str, Map<String, String> map) {
        List<InterfaceC1119904Zp> list = this.LIZ.get(str);
        if (list != null) {
            Iterator<InterfaceC1119904Zp> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(map);
            }
        }
    }
}

package com.ss.android.ugc.aweme.localservice.service;

import X.C09JN;
import X.C13BV;
import X.C1906580ziK;
import X.C813210VvD;
import android.util.LruCache;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.TTKLSUserTraceConfig;
import com.ss.android.ugc.aweme.localservice.network.LocalServiceTraceBlocker;
import com.ss.android.ugc.aweme.localservice.network.LocalServiceTraceBystander;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes14.dex */
public final class LocalServiceMonitorServiceImpl implements ILocalServiceMonitorService {
    @Override // com.ss.android.ugc.aweme.localservice.service.ILocalServiceMonitorService
    public final List<NetworkPartner> LIZ() {
        ArrayList arrayList = new ArrayList();
        if (Intrinsics.LJFF(TTKLSUserTraceConfig.LIZ().enable, Boolean.TRUE)) {
            arrayList.add(LocalServiceTraceBystander.LIZ);
            List list = TTKLSUserTraceConfig.LIZ().networkPaths;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            arrayList.add(new LocalServiceTraceBlocker(list));
            C813210VvD.LIZ().addObserver(new Observer() { // from class: X.0X4f
                @Override // java.util.Observer
                public final void update(Observable observable, Object obj) {
                    Map map;
                    String str;
                    Object obj2;
                    String str2;
                    if ((obj instanceof Map) && (map = (Map) obj) != null) {
                        Object obj3 = map.get("content_type");
                        if (obj3 != null && (obj3 instanceof String)) {
                            str = (String) obj3;
                        } else {
                            str = null;
                        }
                        if ((str == null || a0.LJJIIZI(str, "text/plain", false)) && map != null && (obj2 = map.get("url")) != null && (obj2 instanceof String) && (str2 = (String) obj2) != null) {
                            LocalServiceTraceBystander.LIZ.getClass();
                            try {
                                String path = UriProtector.parse(str2).getPath();
                                if (path == null) {
                                    path = "";
                                }
                                List<String> list2 = LocalServiceTraceBystander.LIZIZ;
                                if ((!list2.isEmpty()) && list2.contains(path)) {
                                    C23250099c.LIZLLL(C817503Hh.LL, null, null, new C842770X4h(str2, null), 3);
                                }
                                C189200o6.m2constructorimpl(Unit.LIZ);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C189200o6.m2constructorimpl(new C098200Yq(th));
                            }
                        }
                    }
                }
            });
            C1906580ziK.LIZJ().LIZ().LJJLJLI(new C09JN() { // from class: X.0X4g
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("LocalServiceMonitorServiceImpl@379.getLocalServiceBystander$1");
                    if (((C606810Nr5) obj).LIZIZ) {
                        LocalServiceTraceBystander.LIZ.getClass();
                        LruCache<String, C842780X4i> lruCache = LocalServiceTraceBystander.LIZJ;
                        if (lruCache.size() > 0) {
                            lruCache.evictAll();
                        }
                    } else {
                        LocalServiceTraceBystander.LIZ.getClass();
                    }
                    C1C7U.LIZIZ("LocalServiceMonitorServiceImpl@379.getLocalServiceBystander$1");
                }
            });
        }
        return arrayList;
    }
}

package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di;

import X.C01GW;
import X.C1765940w3U;
import X.C1E5H;
import X.C2097608Jq;
import X.C452501pT;
import X.InterfaceC494301wD;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class PageStateContext implements InterfaceC494301wD {
    public final C01GW LL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(110));
    public final C1765940w3U LLILLJJLI = new C1765940w3U();

    public static Object LIZ(PageStateContext pageStateContext, String str) {
        C2097608Jq.LJ();
        C1E5H c1e5h = (C1E5H) ((ConcurrentHashMap) pageStateContext.LLILLJJLI.LIZ.getValue()).get(str);
        if (c1e5h != null) {
            return c1e5h.LIZJ.getValue();
        }
        return null;
    }

    public static String LIZIZ(PageStateContext pageStateContext, String str, IPageStateContextCallback iPageStateContextCallback) {
        String strValueOf;
        Object objPutIfAbsent;
        C2097608Jq.LJ();
        C1765940w3U c1765940w3U = pageStateContext.LLILLJJLI;
        if (iPageStateContextCallback == null) {
            c1765940w3U.getClass();
            return null;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c1765940w3U.LIZIZ.getValue();
        Object concurrentHashMap2 = concurrentHashMap.get(str);
        if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
            concurrentHashMap2 = objPutIfAbsent;
        }
        ConcurrentHashMap concurrentHashMap3 = (ConcurrentHashMap) concurrentHashMap2;
        synchronized (concurrentHashMap3) {
            try {
                strValueOf = String.valueOf(c1765940w3U.LIZJ.getAndIncrement());
                concurrentHashMap3.put(strValueOf, iPageStateContextCallback);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return strValueOf;
    }

    public static void LIZLLL(PageStateContext pageStateContext, String str, Object obj) {
        C2097608Jq.LJ();
        pageStateContext.LLILLJJLI.LIZ(obj, str);
    }

    public static void LJFF(PageStateContext pageStateContext, String str, String str2) {
        C2097608Jq.LJ();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ((ConcurrentHashMap) pageStateContext.LLILLJJLI.LIZIZ.getValue()).get(str);
        if (concurrentHashMap != null) {
            synchronized (concurrentHashMap) {
                try {
                    concurrentHashMap.remove(str2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}

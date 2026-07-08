package com.bytedance.frameworks.baselib.netx.partner;

import X.C01GW;
import X.C098200Yq;
import X.C0X52;
import X.C0XM9;
import X.C0XS7;
import X.C1494590ozp;
import X.C1499330p7T;
import X.C1499350p7V;
import X.C1499400p7a;
import X.C1499750p89;
import X.C155000ia;
import X.C189200o6;
import X.C259800zU;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import Y.ARunnableS92S0200000_23;
import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartnerGroup$PartnerInterceptor$Companion$globalBystanderHandler$2;
import com.bytedance.frameworks.baselib.netx.partner.monitor.PartnerMonitor;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes24.dex */
public final class NetworkPartnerGroup {
    public final List<NetworkPartner.Blocker> LIZ = new ArrayList();
    public final List<NetworkPartner.RequestHandler> LIZIZ = new ArrayList();
    public final List<NetworkPartner.ResponseHandler> LIZJ = new ArrayList();
    public final List<NetworkPartner.ExceptionHandler> LIZLLL = new ArrayList();
    public final List<NetworkPartner.Bystander> LJ = new ArrayList();

    public static final class PartnerInterceptor implements InterfaceC1904907d9 {
        public static final C01GW<NetworkPartnerGroup$PartnerInterceptor$Companion$globalBystanderHandler$2.AnonymousClass1> LLILZLL = C452501pT.LIZIZ(new NetworkPartnerGroup$PartnerInterceptor$Companion$globalBystanderHandler$2());
        public final List<NetworkPartner.Blocker> LL;
        public final List<NetworkPartner.RequestHandler> LLILLJJLI;
        public final List<NetworkPartner.ResponseHandler> LLILLL;
        public final List<NetworkPartner.ExceptionHandler> LLILZ;
        public final List<NetworkPartner.Bystander> LLILZIL;

        public PartnerInterceptor(NetworkPartnerGroup networkPartnerGroup) {
            this.LL = new ArrayList(networkPartnerGroup.LIZ);
            this.LLILLJJLI = new ArrayList(networkPartnerGroup.LIZIZ);
            this.LLILLL = new ArrayList(networkPartnerGroup.LIZJ);
            this.LLILZ = new ArrayList(networkPartnerGroup.LIZLLL);
            this.LLILZIL = new ArrayList(networkPartnerGroup.LJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.InterfaceC1904907d9
        public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
            C0X52<?> c0x52LIZ;
            Handler handlerLIZ;
            Runnable runnable;
            Object c098200Yq;
            long jUptimeMillis = SystemClock.uptimeMillis();
            C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
            final Request requestLIZLLL = c1494590ozp.LIZJ;
            C0XM9 c0xm9 = new C0XM9(requestLIZLLL);
            final C259800zU c259800zU = new C259800zU();
            String str = "";
            c259800zU.element = "";
            C1499330p7T c1499330p7T = new C1499330p7T(c1494590ozp);
            final C1499350p7V c1499350p7V = c1499330p7T.LIZJ;
            int i = 0;
            do {
                try {
                    C0X52<?> c0x52LIZIZ = LIZIZ(c0xm9, c1499330p7T);
                    if (c0x52LIZIZ != null) {
                        if (c0xm9.LIZIZ(C1499750p89.class) != null) {
                            LJFF(c0xm9.LIZ(), c0x52LIZIZ, null);
                        } else {
                            LJFF(requestLIZLLL, c0x52LIZIZ, null);
                        }
                        final String path = requestLIZLLL.getPath();
                        c1499350p7V.LIZIZ = SystemClock.uptimeMillis() - jUptimeMillis;
                        C786410Ut5.LJJZZIII(C1499400p7a.LIZ(), new Runnable() { // from class: X.0p7U
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("NetworkPartnerGroup$PartnerInterceptor@e714.intercept$4");
                                try {
                                    PartnerMonitor partnerMonitor = PartnerMonitor.LIZ;
                                    String str2 = path;
                                    String str3 = c259800zU.element;
                                    C1499350p7V c1499350p7V2 = c1499350p7V;
                                    partnerMonitor.getClass();
                                    if (!((Boolean) C276750Asz.LIZ.getValue()).booleanValue()) {
                                        try {
                                            PartnerMonitor.LIZIZ(c1499350p7V2, str2, str3);
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                        }
                                    }
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("NetworkPartnerGroup$PartnerInterceptor@e714.intercept$4");
                            }
                        });
                        return c0x52LIZIZ;
                    }
                    C786410Ut5.LJJZZIII(C1499400p7a.LIZ(), new Runnable() { // from class: X.0p7Y
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("NetworkPartnerGroup$PartnerInterceptor@e714.postHandleRequest$1");
                            try {
                                for (NetworkPartner.Bystander bystander : (ArrayList) this.LL.LLILZIL) {
                                    if (bystander.enable()) {
                                        bystander.LJI(requestLIZLLL);
                                    }
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("NetworkPartnerGroup$PartnerInterceptor@e714.postHandleRequest$1");
                        }
                    });
                    requestLIZLLL = LIZLLL(c0xm9, c1499330p7T);
                    c0x52LIZ = LIZ(c0xm9, c1499330p7T);
                    if (c0x52LIZ != null) {
                        LJFF(requestLIZLLL, c0x52LIZ, null);
                        final String path2 = requestLIZLLL.getPath();
                        c1499350p7V.LIZIZ = SystemClock.uptimeMillis() - jUptimeMillis;
                        handlerLIZ = C1499400p7a.LIZ();
                        runnable = new Runnable() { // from class: X.0p7U
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("NetworkPartnerGroup$PartnerInterceptor@e714.intercept$4");
                                try {
                                    PartnerMonitor partnerMonitor = PartnerMonitor.LIZ;
                                    String str2 = path2;
                                    String str3 = c259800zU.element;
                                    C1499350p7V c1499350p7V2 = c1499350p7V;
                                    partnerMonitor.getClass();
                                    if (!((Boolean) C276750Asz.LIZ.getValue()).booleanValue()) {
                                        try {
                                            PartnerMonitor.LIZIZ(c1499350p7V2, str2, str3);
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                        }
                                    }
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("NetworkPartnerGroup$PartnerInterceptor@e714.intercept$4");
                            }
                        };
                        break;
                    }
                    C786410Ut5.LJJZZIII(C1499400p7a.LIZ(), new Runnable() { // from class: X.0p7Z
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("NetworkPartnerGroup$PartnerInterceptor@e714.postRequestReady$1");
                            try {
                                for (NetworkPartner.Bystander bystander : (ArrayList) this.LL.LLILZIL) {
                                    if (bystander.enable()) {
                                        bystander.LJIIJ(requestLIZLLL);
                                    }
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("NetworkPartnerGroup$PartnerInterceptor@e714.postRequestReady$1");
                        }
                    });
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    try {
                        c098200Yq = ((C1494590ozp) interfaceC841770X0l).LIZ(requestLIZLLL);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    c1499350p7V.LIZ = SystemClock.uptimeMillis() - jUptimeMillis2;
                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    if (thM5exceptionOrNullimpl == null) {
                        break;
                    }
                    C786410Ut5.LJJZZIII(C1499400p7a.LIZ(), new ARunnableS92S0200000_23(this, thM5exceptionOrNullimpl, 10));
                    c0xm9 = new C0XM9(requestLIZLLL);
                    if (LIZJ(c0xm9, c1499330p7T, thM5exceptionOrNullimpl, i)) {
                        i++;
                    } else {
                        LJFF(requestLIZLLL, null, thM5exceptionOrNullimpl);
                        throw thM5exceptionOrNullimpl;
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    final String path3 = requestLIZLLL.getPath();
                    c1499350p7V.LIZIZ = SystemClock.uptimeMillis() - jUptimeMillis;
                    C786410Ut5.LJJZZIII(C1499400p7a.LIZ(), new Runnable() { // from class: X.0p7U
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("NetworkPartnerGroup$PartnerInterceptor@e714.intercept$4");
                            try {
                                PartnerMonitor partnerMonitor = PartnerMonitor.LIZ;
                                String str2 = path3;
                                String str3 = c259800zU.element;
                                C1499350p7V c1499350p7V2 = c1499350p7V;
                                partnerMonitor.getClass();
                                if (!((Boolean) C276750Asz.LIZ.getValue()).booleanValue()) {
                                    try {
                                        PartnerMonitor.LIZIZ(c1499350p7V2, str2, str3);
                                    } catch (Throwable th3) {
                                        TryCatchGuardChecker.doCheck(th3);
                                    }
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("NetworkPartnerGroup$PartnerInterceptor@e714.intercept$4");
                        }
                    });
                    throw th2;
                }
            } while (i < 10);
            C155000ia.LIZIZ(c098200Yq);
            final C0X52 c0x52 = (C0X52) c098200Yq;
            C786410Ut5.LJJZZIII(C1499400p7a.LIZ(), new Runnable() { // from class: X.0p7X
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("NetworkPartnerGroup$PartnerInterceptor@e714.postResponse$1");
                    try {
                        for (NetworkPartner.Bystander bystander : (ArrayList) this.LL.LLILZIL) {
                            if (bystander.enable()) {
                                bystander.LIZLLL(c0x52);
                            }
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("NetworkPartnerGroup$PartnerInterceptor@e714.postResponse$1");
                }
            });
            C0XS7<?> c0xs7 = new C0XS7<>(c0x52);
            String strLIZJ = c0xs7.LJ.LIZJ("x-tt-logid");
            T t = str;
            if (strLIZJ != null) {
                t = strLIZJ;
            }
            c259800zU.element = t;
            c0x52LIZ = LJ(c0xs7, c1499330p7T);
            LJFF(requestLIZLLL, c0x52LIZ, null);
            ((HashMap) ((C1494590ozp) interfaceC841770X0l).LIZJ.getMetrics().LJL).put("network_parter_requestduration", c1499350p7V.LIZJ);
            ((HashMap) ((C1494590ozp) interfaceC841770X0l).LIZJ.getMetrics().LJL).put("network_parter_responseduration", c1499350p7V.LIZLLL);
            ((HashMap) ((C1494590ozp) interfaceC841770X0l).LIZJ.getMetrics().LJL).put("network_parter_blockDuration", c1499350p7V.LJFF);
            final String path4 = requestLIZLLL.getPath();
            c1499350p7V.LIZIZ = SystemClock.uptimeMillis() - jUptimeMillis;
            handlerLIZ = C1499400p7a.LIZ();
            runnable = new Runnable() { // from class: X.0p7U
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("NetworkPartnerGroup$PartnerInterceptor@e714.intercept$4");
                    try {
                        PartnerMonitor partnerMonitor = PartnerMonitor.LIZ;
                        String str2 = path4;
                        String str3 = c259800zU.element;
                        C1499350p7V c1499350p7V2 = c1499350p7V;
                        partnerMonitor.getClass();
                        if (!((Boolean) C276750Asz.LIZ.getValue()).booleanValue()) {
                            try {
                                PartnerMonitor.LIZIZ(c1499350p7V2, str2, str3);
                            } catch (Throwable th3) {
                                TryCatchGuardChecker.doCheck(th3);
                            }
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("NetworkPartnerGroup$PartnerInterceptor@e714.intercept$4");
                }
            };
            C786410Ut5.LJJZZIII(handlerLIZ, runnable);
            return c0x52LIZ;
        }

        public final C0X52<?> LIZ(C0XM9 c0xm9, C1499330p7T c1499330p7T) throws Throwable {
            C1499350p7V c1499350p7V = c1499330p7T.LIZJ;
            try {
                for (NetworkPartner.Blocker blocker : (ArrayList) this.LL) {
                    if (blocker.enable()) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        C0X52<?> c0x52LJFF = blocker.LJFF(c0xm9, c1499330p7T);
                        String strLJII = blocker.LJII();
                        long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                        HashMap<String, Long> map = c1499350p7V.LJFF;
                        map.put(strLJII, Long.valueOf(C1499350p7V.LIZ(jUptimeMillis2, map.get(strLJII))));
                        if (c0x52LJFF != null) {
                            return c0x52LJFF;
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Object c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl == null) {
                    return (C0X52) c098200Yq;
                }
                C786410Ut5.LJJZZIII(C1499400p7a.LIZ(), new ARunnableS92S0200000_23(this, thM5exceptionOrNullimpl, 10));
                throw thM5exceptionOrNullimpl;
            }
        }

        public final C0X52<?> LIZIZ(C0XM9 c0xm9, C1499330p7T c1499330p7T) throws Throwable {
            C1499350p7V c1499350p7V = c1499330p7T.LIZJ;
            try {
                for (NetworkPartner.Blocker blocker : (ArrayList) this.LL) {
                    if (blocker.enable()) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        C0X52<?> c0x52LIZJ = blocker.LIZJ(c0xm9, c1499330p7T);
                        String strLJII = blocker.LJII();
                        long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                        HashMap<String, Long> map = c1499350p7V.LJFF;
                        map.put(strLJII, Long.valueOf(C1499350p7V.LIZ(jUptimeMillis2, map.get(strLJII))));
                        if (c0x52LIZJ != null) {
                            return c0x52LIZJ;
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Object c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl == null) {
                    return (C0X52) c098200Yq;
                }
                C786410Ut5.LJJZZIII(C1499400p7a.LIZ(), new ARunnableS92S0200000_23(this, thM5exceptionOrNullimpl, 10));
                throw thM5exceptionOrNullimpl;
            }
        }

        public final Request LIZLLL(C0XM9 c0xm9, C1499330p7T c1499330p7T) {
            C1499350p7V c1499350p7V = c1499330p7T.LIZJ;
            for (NetworkPartner.RequestHandler requestHandler : (ArrayList) this.LLILLJJLI) {
                if (requestHandler.enable()) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    requestHandler.LJIIIIZZ(c0xm9, c1499330p7T);
                    String strLJII = requestHandler.LJII();
                    long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                    HashMap<String, Long> map = c1499350p7V.LIZJ;
                    map.put(strLJII, Long.valueOf(C1499350p7V.LIZ(jUptimeMillis2, map.get(strLJII))));
                }
            }
            return c0xm9.LIZ();
        }

        public final C0X52<?> LJ(C0XS7<?> c0xs7, C1499330p7T c1499330p7T) {
            C1499350p7V c1499350p7V = c1499330p7T.LIZJ;
            for (NetworkPartner.ResponseHandler responseHandler : (ArrayList) this.LLILLL) {
                if (responseHandler.enable()) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    responseHandler.LIZ(c0xs7, c1499330p7T);
                    String strLJII = responseHandler.LJII();
                    long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                    HashMap<String, Long> map = c1499350p7V.LIZLLL;
                    map.put(strLJII, Long.valueOf(C1499350p7V.LIZ(jUptimeMillis2, map.get(strLJII))));
                }
            }
            return c0xs7.LIZ();
        }

        public final void LJFF(final Request request, final C0X52<?> c0x52, final Throwable th) {
            C786410Ut5.LJJZZIII(C1499400p7a.LIZ(), new Runnable() { // from class: X.0p7W
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("NetworkPartnerGroup$PartnerInterceptor@e714.postComplete$1");
                    try {
                        for (NetworkPartner.Bystander bystander : (ArrayList) this.LL.LLILZIL) {
                            if (bystander.enable()) {
                                bystander.LJIIJJI(request, c0x52, th);
                            }
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("NetworkPartnerGroup$PartnerInterceptor@e714.postComplete$1");
                }
            });
        }

        public final boolean LIZJ(C0XM9 c0xm9, C1499330p7T c1499330p7T, Throwable th, int i) {
            C1499350p7V c1499350p7V = c1499330p7T.LIZJ;
            boolean z = false;
            for (NetworkPartner.ExceptionHandler exceptionHandler : (ArrayList) this.LLILZ) {
                if (exceptionHandler.enable()) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    if (!z && !exceptionHandler.LJIIIZ(c0xm9, c1499330p7T, th, i, z)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    String strLJII = exceptionHandler.LJII();
                    long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                    HashMap<String, Long> map = c1499350p7V.LJ;
                    map.put(strLJII, Long.valueOf(C1499350p7V.LIZ(jUptimeMillis2, map.get(strLJII))));
                }
            }
            return z;
        }
    }

    public static int LIZLLL(List list) {
        int iHashCode;
        int i = 0;
        if (list != null) {
            i = 0;
            for (Object obj : (ArrayList) list) {
                if (obj != null) {
                    iHashCode = obj.getClass().hashCode();
                } else {
                    iHashCode = 0;
                }
                i = (i * 31) + iHashCode;
            }
        }
        return i;
    }

    public final void LIZ(NetworkPartner networkPartner) {
        if (networkPartner instanceof NetworkPartner.Bystander) {
            ((ArrayList) this.LJ).add(networkPartner);
            return;
        }
        if (networkPartner instanceof NetworkPartner.Blocker) {
            ((ArrayList) this.LIZ).add(networkPartner);
        }
        if (networkPartner instanceof NetworkPartner.ExceptionHandler) {
            ((ArrayList) this.LIZLLL).add(networkPartner);
        }
        if (networkPartner instanceof NetworkPartner.ResponseHandler) {
            ((ArrayList) this.LIZJ).add(networkPartner);
        }
        if (networkPartner instanceof NetworkPartner.RequestHandler) {
            ((ArrayList) this.LIZIZ).add(networkPartner);
        }
    }

    public final void LIZJ(NetworkPartnerGroup networkPartnerGroup) {
        ((ArrayList) this.LIZ).addAll(networkPartnerGroup.LIZ);
        ((ArrayList) this.LIZIZ).addAll(networkPartnerGroup.LIZIZ);
        ((ArrayList) this.LIZJ).addAll(networkPartnerGroup.LIZJ);
        ((ArrayList) this.LIZLLL).addAll(networkPartnerGroup.LIZLLL);
        ((ArrayList) this.LJ).addAll(networkPartnerGroup.LJ);
    }

    public final void LIZIZ(NetworkPartner networkPartner, Function0 function0) {
        if (networkPartner instanceof NetworkPartner.Bystander) {
            ((ArrayList) this.LJ).add(new NetworkPartner.BystanderProxy((NetworkPartner.Bystander) networkPartner, function0));
            return;
        }
        if (networkPartner instanceof NetworkPartner.Blocker) {
            ((ArrayList) this.LIZ).add(new NetworkPartner.BlockerProxy((NetworkPartner.Blocker) networkPartner, function0));
        }
        if (networkPartner instanceof NetworkPartner.ExceptionHandler) {
            ((ArrayList) this.LIZLLL).add(new NetworkPartner.ExceptionHandlerProxy((NetworkPartner.ExceptionHandler) networkPartner, function0));
        }
        if (networkPartner instanceof NetworkPartner.ResponseHandler) {
            ((ArrayList) this.LIZJ).add(new NetworkPartner.ResponseHandlerProxy((NetworkPartner.ResponseHandler) networkPartner, function0));
        }
        if (networkPartner instanceof NetworkPartner.RequestHandler) {
            ((ArrayList) this.LIZIZ).add(new NetworkPartner.RequestHandlerProxy((NetworkPartner.RequestHandler) networkPartner, function0));
        }
    }
}

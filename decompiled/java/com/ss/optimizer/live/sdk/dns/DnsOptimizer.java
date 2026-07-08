package com.ss.optimizer.live.sdk.dns;

import X.AbstractCallableC1470180oMS;
import X.C0CGZ;
import X.C1968707nR;
import X.C1C7U;
import X.C2178951APl;
import X.C2179031APt;
import X.C2179041APu;
import X.C2179051APv;
import X.C822650WOx;
import X.C830490Whz;
import X.C854540Xfg;
import X.CallableC2178981APo;
import X.InterfaceC1282830jUH;
import X.InterfaceC1970907nn;
import X.InterfaceC2179001APq;
import X.InterfaceC2179091APz;
import Y.ARunnableS66S0300000_33;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.librarian.Librarian;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.ss.optimizer.live.sdk.dns.DnsOptimizer;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes34.dex */
public final class DnsOptimizer implements InterfaceC1282830jUH {
    public static final C830490Whz LJIILL;
    public InterfaceC1970907nn LIZ;
    public final C822650WOx LIZIZ;
    public final Context LIZLLL;
    public Set<String> LJIIIZ;
    public final boolean LJIILJJIL;
    public final Handler LIZJ = new BPEAHandler(Looper.getMainLooper()) { // from class: com.ss.optimizer.live.sdk.dns.DnsOptimizer.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("DnsOptimizer@bdef.<field>$2");
            if (message != null && message.what == 1024) {
                DnsOptimizer dnsOptimizer = DnsOptimizer.this;
                if (dnsOptimizer.LJIIL) {
                    dnsOptimizer.LJFF();
                } else {
                    C2178951APl.LIZIZ().LIZJ.LIZ();
                }
            }
            C1C7U.LIZIZ("DnsOptimizer@bdef.<field>$2");
        }
    };
    public final C854540Xfg LJ = new C854540Xfg(this, 4);
    public final C830490Whz LJFF = new C830490Whz();
    public final List<Callable<?>> LJI = new LinkedList();
    public final List<String> LJII = new ArrayList();
    public boolean LJIIIIZZ = false;
    public long LJIIJ = 300000;
    public boolean LJIIJJI = true;
    public boolean LJIIL = true;
    public int LJIILIIL = 0;

    static {
        C0CGZ.LIZ = false;
        LJIILL = new C830490Whz();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJ() {
        Set<String> set = this.LJIIIZ;
        if (set == null || ((HashSet) set).size() == 0) {
            LJIILL.clear();
            return;
        }
        Iterator it2 = ((HashSet) this.LJIIIZ).iterator();
        while (it2.hasNext()) {
            C2179031APt c2179031APt = (C2179031APt) LJIILL.get(it2.next());
            if (c2179031APt != null) {
                c2179031APt.LJ.lock();
                c2179031APt.LIZLLL = null;
                c2179031APt.LJ.unlock();
                c2179031APt.LIZ();
                c2179031APt.LJ.lock();
                c2179031APt.LIZJ = null;
                c2179031APt.LJ.unlock();
                c2179031APt.LIZ();
            }
        }
    }

    public final void LJFF() {
        C830490Whz c830490Whz;
        if (!this.LJIIL || (c830490Whz = LJIILL) == null) {
            return;
        }
        if (c830490Whz.LLILLL == 0) {
            LJI(new CallableC2178981APo(), new InterfaceC2179091APz<C2179051APv>() { // from class: X.1APx
                @Override // X.InterfaceC2179091APz
                public final void call(C2179051APv c2179051APv) {
                    this.LIZ.LJII(c2179051APv);
                    this.LIZ.LIZJ.removeMessages(1024);
                    DnsOptimizer dnsOptimizer = this.LIZ;
                    C786410Ut5.LJLJJI(1024, dnsOptimizer.LJIIJ, dnsOptimizer.LIZJ);
                }
            });
            return;
        }
        this.LJIILIIL = 0;
        for (C2179031APt c2179031APt : (C830490Whz.e) c830490Whz.values()) {
            final String str = c2179031APt.LIZ;
            LJI(new AbstractCallableC1470180oMS(str) { // from class: X.0oMR
                @Override // java.util.concurrent.Callable
                public final C1968707nR call() throws Throwable {
                    C1968707nR c1968707nR;
                    C1C7U.LIZ("LocalResolveTask@ee07.call");
                    try {
                        InetAddress[] inetAddressArrC0 = C2204961BRm.c0(this.LL, new C0WZX("dzBzEhEpEcXMQV4sTAiBdDkxDsA1l5WwudAjr2c/HokTZ6InQH6/TOJ7W999hQ==", null));
                        ArrayList arrayList = new ArrayList();
                        if (inetAddressArrC0 != null && inetAddressArrC0.length > 0) {
                            for (InetAddress inetAddress : inetAddressArrC0) {
                                String strD0 = C2204961BRm.d0(inetAddress, new C0WZX("dzBzEhEpEcXMQV4sTAiBdDkxDsA1l5WwudAjr2c/HokTZ6InQH6/TOJ7W999hQ==", null));
                                if (AbstractCallableC1470180oMS.LLILLJJLI == null) {
                                    AbstractCallableC1470180oMS.LLILLJJLI = PatternProtector.compile("^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$");
                                }
                                if (!TextUtils.isEmpty(strD0) && strD0.length() >= 7 && strD0.length() <= 15 && AbstractCallableC1470180oMS.LLILLJJLI.matcher(strD0).matches()) {
                                    arrayList.add(strD0);
                                }
                            }
                        }
                        if (C0CGZ.LIZ) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("succeed, host= ");
                            sbLIZ.append(this.LL);
                            sbLIZ.append(", ips= ");
                            sbLIZ.append(arrayList);
                            C2188811AlT.LIZIZ(sbLIZ);
                        }
                        c1968707nR = new C1968707nR(this.LL, arrayList);
                    } catch (UnknownHostException e) {
                        TryCatchGuardChecker.doCheck(e);
                        if (C0CGZ.LIZ) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("failed, host= ");
                            sbLIZ2.append(this.LL);
                            C2188811AlT.LIZIZ(sbLIZ2);
                        }
                        c1968707nR = new C1968707nR(this.LL, null);
                    }
                    C1C7U.LIZIZ("LocalResolveTask@ee07.call");
                    return c1968707nR;
                }
            }, new C2179041APu(this, c2179031APt));
        }
    }

    public DnsOptimizer(Context context) {
        this.LJIILJJIL = false;
        this.LIZLLL = context;
        ((HashSet) C2178951APl.LIZIZ().LIZJ.LIZ).add(new InterfaceC2179001APq() { // from class: X.1APr
            @Override // X.InterfaceC2179001APq
            public final void LIZ(C2179051APv c2179051APv) {
                DnsOptimizer dnsOptimizer = this.LIZ;
                if (c2179051APv != null) {
                    if (dnsOptimizer.LJIIIIZZ) {
                        dnsOptimizer.LJII(c2179051APv);
                        if (dnsOptimizer.LJIIJJI) {
                            dnsOptimizer.LJFF();
                            return;
                        }
                        return;
                    }
                    return;
                }
                dnsOptimizer.getClass();
            }
        });
        C2178951APl.LIZIZ().getClass();
        C822650WOx c822650WOx = new C822650WOx(1, 2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: X.08UE
            public final ThreadGroup LL;
            public final AtomicInteger LLILLJJLI = new AtomicInteger(1);
            public final String LLILLL;

            {
                SecurityManager securityManager = System.getSecurityManager();
                this.LL = securityManager != null ? securityManager.getThreadGroup() : C786410Ut5.u3().getThreadGroup();
                this.LLILLL = "dns-optimizer-";
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                ThreadGroup threadGroup = this.LL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(this.LLILLJJLI.getAndIncrement());
                BPEAThread bPEAThread = new BPEAThread(threadGroup, runnable, C2188811AlT.LIZIZ(sbLIZ), 0L);
                if (bPEAThread.isDaemon()) {
                    bPEAThread.setDaemon(false);
                }
                if (bPEAThread.getPriority() != 1) {
                    ThreadMethodProxy.setPriority(bPEAThread, 1);
                }
                return bPEAThread;
            }
        });
        this.LIZIZ = c822650WOx;
        c822650WOx.allowCoreThreadTimeOut(true);
        boolean z = C2178951APl.LIZIZ().LIZLLL;
        this.LJIILJJIL = z;
        if (z) {
            LoadSoLancet.LIZJ("vctfo");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("vctfo");
            LoadSoLancet.LJ(jUptimeMillis, "vctfo");
            LoadSoLancet.LIZLLL(jUptimeMillis, "vctfo");
            LoadSoLancet.LIZIZ("vctfo");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1282830jUH
    public final String LIZ(String str) {
        C2179031APt c2179031APt;
        String strLIZLLL = null;
        if (this.LJIIIIZZ && this.LJIIJJI) {
            C2179031APt c2179031APt2 = (C2179031APt) LJIILL.get(str);
            if ((c2179031APt2 == null || (strLIZLLL = c2179031APt2.LIZLLL()) == null) && (c2179031APt = (C2179031APt) this.LJFF.get(str)) != null) {
                strLIZLLL = c2179031APt.LIZLLL();
            }
            if (this.LJIILJJIL && !((ArrayList) this.LJII).isEmpty() && !TextUtils.isEmpty(strLIZLLL)) {
                ((ArrayList) this.LJII).contains(strLIZLLL);
            }
        }
        return strLIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1282830jUH
    public final List<String> LIZIZ(String str) {
        if (!this.LJIIIIZZ) {
            return null;
        }
        C2179031APt c2179031APt = (C2179031APt) LJIILL.get(str);
        if (c2179031APt != null) {
            return c2179031APt.LIZJ();
        }
        C2179031APt c2179031APt2 = (C2179031APt) this.LJFF.get(str);
        if (c2179031APt2 == null) {
            return null;
        }
        return c2179031APt2.LIZJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1282830jUH
    public final List<String> LIZJ(String str) {
        if (!this.LJIIIIZZ) {
            return null;
        }
        C2179031APt c2179031APt = (C2179031APt) LJIILL.get(str);
        if (c2179031APt != null) {
            return c2179031APt.LIZIZ();
        }
        C2179031APt c2179031APt2 = (C2179031APt) this.LJFF.get(str);
        if (c2179031APt2 == null) {
            return null;
        }
        return c2179031APt2.LIZIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(X.C2179051APv r8) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.optimizer.live.sdk.dns.DnsOptimizer.LJII(X.1APv):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1282830jUH
    public final String LIZLLL(String str, String str2) {
        C1968707nR c1968707nR;
        List<String> list;
        List<String> list2;
        if (!this.LJIIIIZZ) {
            return null;
        }
        C2179031APt c2179031APt = (C2179031APt) LJIILL.get(str);
        if (c2179031APt != null) {
            C1968707nR c1968707nR2 = c2179031APt.LIZJ;
            if (c1968707nR2 == null || (list2 = c1968707nR2.LIZIZ) == null) {
                return null;
            }
            if (!((ArrayList) list2).contains(str2)) {
                return "local_dns";
            }
            return c2179031APt.LJII;
        }
        C2179031APt c2179031APt2 = (C2179031APt) this.LJFF.get(str);
        if (c2179031APt2 == null || (c1968707nR = c2179031APt2.LIZJ) == null || (list = c1968707nR.LIZIZ) == null) {
            return null;
        }
        if (!((ArrayList) list).contains(str2)) {
            return "local_dns";
        }
        return c2179031APt2.LJII;
    }

    public final <T> void LJI(Callable<T> callable, InterfaceC2179091APz<T> interfaceC2179091APz) {
        if (!this.LJIIIIZZ) {
            return;
        }
        synchronized (this.LJI) {
            try {
                ((LinkedList) this.LJI).add(callable);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LIZIZ.submit(new ARunnableS66S0300000_33(this, callable, interfaceC2179091APz, 14));
    }
}

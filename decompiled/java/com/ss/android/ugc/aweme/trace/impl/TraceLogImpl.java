package com.ss.android.ugc.aweme.trace.impl;

import X.AnonymousClass0956;
import X.C054G;
import X.C098200Yq;
import X.C099R;
import X.C0C64;
import X.C0PEM;
import X.C11JF;
import X.C189200o6;
import X.C1906580ziK;
import X.C20684815ws;
import X.C2232408os;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C2344009Gk;
import X.C255800A0s;
import X.C806020Vjc;
import X.C806040Vje;
import X.C806050Vjf;
import X.C806060Vjg;
import X.C806070Vjh;
import X.C806170Vjr;
import X.C806210Vjv;
import X.C823050WQl;
import X.ExecutorServiceC822430WOb;
import X.InterfaceC1364105Vn;
import Y.AfS182S0100000_13;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.trace.api.TraceLogApi;
import com.ss.android.ugc.aweme.trace.api.TraceLogProvider;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public final class TraceLogImpl implements TraceLogApi {
    public final String LIZ = UUID.randomUUID().toString();
    public long LIZIZ;
    public final C054G LIZJ;
    public final C054G LIZLLL;
    public boolean LJ;
    public AnonymousClass0956 LJFF;
    public C11JF LJI;
    public final ReentrantReadWriteLock LJII;
    public final ConcurrentHashMap<String, TraceLogProvider> LJIIIIZZ;
    public volatile boolean LJIIIZ;
    public final Object LJIIJ;
    public final C806020Vjc LJIIJJI;

    public final synchronized void LJFF() {
        AnonymousClass0956 anonymousClass0956 = this.LJFF;
        if (anonymousClass0956 == null || !anonymousClass0956.isActive()) {
            this.LJ = true;
            this.LJFF = C23250099c.LIZLLL(this.LIZJ, null, null, new C806060Vjg(this, null), 3);
        }
    }

    public TraceLogImpl() {
        C054G c054gLIZ = C2296808zG.LIZ(new C2232408os(new ExecutorServiceC822430WOb(C823050WQl.LIZLLL(), 1)).plus(C2296908zH.LIZ()));
        this.LIZJ = c054gLIZ;
        this.LIZLLL = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
        this.LJ = true;
        this.LJII = new ReentrantReadWriteLock();
        this.LJIIIIZZ = new ConcurrentHashMap<>();
        this.LJIIJ = new Object();
        this.LJIIJJI = new C806020Vjc(c054gLIZ.LL);
    }

    public final Object LJI(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_trace_4kb_limit", true, true)) {
            Object objLJIIIIZZ = LJIIIIZZ(interfaceC1364105Vn);
            if (objLJIIIIZZ == C099R.LJFF()) {
                return objLJIIIIZZ;
            }
            return Unit.LIZ;
        }
        Object objLJII = LJII(interfaceC1364105Vn);
        if (objLJII == C099R.LJFF()) {
            return objLJII;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C806140Vjo
            if (r0 == 0) goto L6b
            r7 = r9
            X.0Vjo r7 = (X.C806140Vjo) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6b
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r2 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r1 = r7.LLILLL
            r5 = 0
            r4 = 3
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L2c
            if (r1 == r0) goto L41
            if (r1 == r3) goto L79
            if (r1 != r4) goto L71
            X.C155000ia.LIZIZ(r2)
        L29:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2c:
            X.C155000ia.LIZIZ(r2)
            X.0Vjc r2 = r8.LJIIJJI
            r7.LLILLL = r0
            kotlin.coroutines.CoroutineContext r1 = r2.LIZ
            X.0Vjb r0 = new X.0Vjb
            r0.<init>(r2, r5)
            java.lang.Object r2 = X.C23250099c.LJI(r7, r1, r0)
            if (r2 != r6) goto L44
            return r6
        L41:
            X.C155000ia.LIZIZ(r2)
        L44:
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L60
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L60
            X.054G r0 = r8.LIZLLL
            kotlin.coroutines.CoroutineContext r1 = r0.LL
            X.0Vjj r0 = new X.0Vjj
            r0.<init>(r8, r2, r5)
            r7.LLILLL = r3
            java.lang.Object r0 = X.C23250099c.LJI(r7, r1, r0)
            if (r0 != r6) goto L7c
            return r6
        L60:
            X.0Vjc r0 = r8.LJIIJJI
            r7.LLILLL = r4
            java.lang.Object r0 = r0.LIZIZ(r7)
            if (r0 != r6) goto L29
            return r6
        L6b:
            X.0Vjo r7 = new X.0Vjo
            r7.<init>(r8, r9)
            goto L12
        L71:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L79:
            X.C155000ia.LIZIZ(r2)
        L7c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.trace.impl.TraceLogImpl.LJII(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C806130Vjn
            if (r0 == 0) goto L99
            r4 = r11
            X.0Vjn r4 = (X.C806130Vjn) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L99
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r7 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r6 = 0
            r5 = 3
            r8 = 2
            r0 = 1
            if (r1 == 0) goto L2c
            if (r1 == r0) goto L47
            if (r1 == r8) goto La8
            if (r1 != r5) goto La0
            X.C155000ia.LIZIZ(r7)
        L29:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2c:
            X.C155000ia.LIZIZ(r7)
            long r1 = java.lang.System.currentTimeMillis()
            X.0Vjc r9 = r10.LJIIJJI
            r4.LL = r1
            r4.LLILZ = r0
            kotlin.coroutines.CoroutineContext r7 = r9.LIZ
            X.0Vjb r0 = new X.0Vjb
            r0.<init>(r9, r6)
            java.lang.Object r7 = X.C23250099c.LJI(r4, r7, r0)
            if (r7 != r3) goto L4c
            return r3
        L47:
            long r1 = r4.LL
            X.C155000ia.LIZIZ(r7)
        L4c:
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L53
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L53:
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            X.C844470XAv.LIZ()
            X.0Vh4 r0 = X.C036E.LIZ     // Catch: java.lang.Exception -> L62
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L62
            goto L67
        L62:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = 0
        L67:
            if (r0 != 0) goto L6c
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L6c:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L82
            java.lang.String r0 = "1"
            LIZJ(r1, r0)
            X.0Vjc r0 = r10.LJIIJJI
            r4.LLILZ = r8
            java.lang.Object r0 = r0.LIZIZ(r4)
            if (r0 != r3) goto Lab
            return r3
        L82:
            java.lang.String r0 = "0"
            LIZJ(r1, r0)
            X.054G r0 = r10.LIZLLL
            kotlin.coroutines.CoroutineContext r1 = r0.LL
            X.0Vjl r0 = new X.0Vjl
            r0.<init>(r10, r7, r6)
            r4.LLILZ = r5
            java.lang.Object r0 = X.C23250099c.LJI(r4, r1, r0)
            if (r0 != r3) goto L29
            return r3
        L99:
            X.0Vjn r4 = new X.0Vjn
            r4.<init>(r10, r11)
            goto L12
        La0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La8:
            X.C155000ia.LIZIZ(r7)
        Lab:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.trace.impl.TraceLogImpl.LJIIIIZZ(X.05Vn):java.lang.Object");
    }

    public static void LIZJ(long j, String str) {
        if (!C255800A0s.LIZ()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
        c2344009Gk.LJFF("error", str);
        C20684815ws.LJIILLIIL("creation_trace_log_read", c2344009Gk.LIZ);
    }

    public static void LIZLLL(long j, String str) {
        if (!C255800A0s.LIZ()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
        c2344009Gk.LJFF("error", str);
        C20684815ws.LJIILLIIL("creation_trace_log_upload", c2344009Gk.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005b -> B:26:0x0067). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(int r9, X.InterfaceC1364105Vn r10, kotlin.jvm.functions.Function1 r11) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C806120Vjm
            if (r0 == 0) goto L76
            r7 = r10
            X.0Vjm r7 = (X.C806120Vjm) r7
            int r2 = r7.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L76
            int r2 = r2 - r1
            r7.LLILZLL = r2
        L12:
            java.lang.Object r1 = r7.LLILZ
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZLL
            r5 = 2
            r4 = 3
            r3 = 1
            if (r0 == 0) goto L33
            if (r0 == r3) goto L29
            if (r0 == r5) goto L5e
            if (r0 != r4) goto L7c
            X.C155000ia.LIZIZ(r1)
        L28:
            return r1
        L29:
            int r2 = r7.LLILLL
            int r9 = r7.LLILLJJLI
            kotlin.jvm.functions.Function1 r11 = r7.LL
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L49
            goto L84
        L33:
            X.C155000ia.LIZIZ(r1)
            int r9 = r9 - r3
            r2 = 0
        L38:
            if (r2 >= r9) goto L6a
            r7.LL = r11     // Catch: java.lang.Exception -> L47
            r7.LLILLJJLI = r9     // Catch: java.lang.Exception -> L47
            r7.LLILLL = r2     // Catch: java.lang.Exception -> L47
            r7.LLILZLL = r3     // Catch: java.lang.Exception -> L47
            java.lang.Object r1 = r11.invoke(r7)     // Catch: java.lang.Exception -> L47
            goto L85
        L47:
            r0 = move-exception
            goto L4a
        L49:
            r0 = move-exception
        L4a:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r7.LL = r11
            r7.LLILLJJLI = r9
            r7.LLILLL = r2
            r7.LLILZLL = r5
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r7)
            if (r0 != r6) goto L67
            return r6
        L5e:
            int r2 = r7.LLILLL
            int r9 = r7.LLILLJJLI
            kotlin.jvm.functions.Function1 r11 = r7.LL
            X.C155000ia.LIZIZ(r1)
        L67:
            int r2 = r2 + 1
            goto L38
        L6a:
            r0 = 0
            r7.LL = r0
            r7.LLILZLL = r4
            java.lang.Object r1 = r11.invoke(r7)
            if (r1 != r6) goto L28
            return r6
        L76:
            X.0Vjm r7 = new X.0Vjm
            r7.<init>(r8, r10)
            goto L12
        L7c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L84:
            return r1
        L85:
            if (r1 != r6) goto L88
            return r6
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.trace.impl.TraceLogImpl.LJ(int, X.05Vn, kotlin.jvm.functions.Function1):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.trace.api.TraceLogApi
    public final void LIZ(String str, String str2, String str3, String str4, String str5, long j, String str6, Map map) {
        C23250099c.LIZLLL(this.LIZLLL, null, null, new C806070Vjh(str, str2, str3, str4, str5, map, j, str6, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.trace.api.TraceLogApi
    public final void LIZIZ(String str, String str2, String str3, String str4, String str5, long j, String str6, Map map) {
        int readHoldCount;
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "effect_trace_log_enabled", true, false)) {
            return;
        }
        C806050Vjf c806050Vjf = new C806050Vjf(str, str2, str3, str4, str5, j, str6, map);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_enable_trace_phase_2", true, false)) {
            if (!this.LJIIIZ) {
                synchronized (this.LJIIJ) {
                    try {
                        if (!this.LJIIIZ) {
                            try {
                                Set<TraceLogProvider> services = ServiceManager.get().getServices(TraceLogProvider.class);
                                ReentrantReadWriteLock reentrantReadWriteLock = this.LJII;
                                ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                                if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                                    readHoldCount = reentrantReadWriteLock.getReadHoldCount();
                                    for (int i = 0; i < readHoldCount; i++) {
                                        lock.unlock();
                                    }
                                } else {
                                    readHoldCount = 0;
                                }
                                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                                writeLock.lock();
                                try {
                                    for (TraceLogProvider traceLogProvider : services) {
                                        String businessId = traceLogProvider.getBusinessId();
                                        if (traceLogProvider.LIZ() && businessId.length() > 0 && !this.LJIIIIZZ.containsKey(businessId)) {
                                            this.LJIIIIZZ.put(businessId, traceLogProvider);
                                        }
                                    }
                                    for (int i2 = 0; i2 < readHoldCount; i2++) {
                                        lock.lock();
                                    }
                                    writeLock.unlock();
                                    C189200o6.m2constructorimpl(Unit.LIZ);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    for (int i3 = 0; i3 < readHoldCount; i3++) {
                                        lock.lock();
                                    }
                                    writeLock.unlock();
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                C189200o6.m2constructorimpl(new C098200Yq(th2));
                            }
                            this.LJIIIZ = true;
                        }
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        throw th3;
                    }
                }
            }
            String str7 = c806050Vjf.LIZIZ;
            if (str7.length() != 0) {
                ReentrantReadWriteLock.ReadLock lock2 = this.LJII.readLock();
                lock2.lock();
                try {
                    TraceLogProvider traceLogProvider2 = this.LJIIIIZZ.get(str7);
                    lock2.unlock();
                    if (traceLogProvider2 != null) {
                        C806210Vjv c806210VjvLIZIZ = traceLogProvider2.LIZIZ();
                        if (C806170Vjr.LIZIZ(c806210VjvLIZIZ) && !C806170Vjr.LIZ(c806210VjvLIZIZ, c806050Vjf)) {
                            return;
                        }
                    }
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    lock2.unlock();
                    throw th4;
                }
            }
        }
        if (this.LJI == null) {
            this.LJI = C1906580ziK.LIZJ().LIZJ().LJLLLLLL(new AfS182S0100000_13(this, 107));
            LJFF();
        }
        C23250099c.LIZLLL(this.LIZJ, null, null, new C806040Vje(this, c806050Vjf, null), 3);
    }
}

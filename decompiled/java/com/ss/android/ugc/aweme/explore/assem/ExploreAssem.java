package com.ss.android.ugc.aweme.explore.assem;

import X.AbstractC738140SxQ;
import X.AnonymousClass0956;
import X.C01GW;
import X.C0AH8;
import X.C0CWJ;
import X.C15T0;
import X.C15TA;
import X.C1602200rnO;
import X.C1841760y1m;
import X.C1841870y1x;
import X.C1BCA;
import X.C20524115St;
import X.C2153908cD;
import X.C452501pT;
import X.EnumC312610CNf;
import X.InterfaceC1006670cIr;
import X.InterfaceC586170Myt;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.explore.assem.ExploreAssem;
import com.ss.android.ugc.aweme.explore.domian.ExploreCustomTopicDataSource;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class ExploreAssem extends AbstractC738140SxQ implements InterfaceC586170Myt {
    public final C01GW LL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1685));
    public C0CWJ LLILLJJLI;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r3.hashCode() == X.C15TA.LIZLLL) goto L10;
     */
    @Override // X.AbstractC738140SxQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate() {
        /*
            r4 = this;
            super.onCreate()
            X.15TA r1 = X.C15TA.LIZ
            android.content.Context r3 = r4.getContext()
            boolean r0 = r3 instanceof android.app.Activity
            if (r0 != 0) goto Le
            r3 = 0
        Le:
            r1.getClass()
            int r1 = X.C15TA.LIZLLL
            r2 = 1
            r0 = 0
            if (r1 == 0) goto L2d
            if (r3 == 0) goto L33
            int r1 = r3.hashCode()
            int r0 = X.C15TA.LIZLLL
            if (r1 != r0) goto L2f
        L21:
            X.01GW r0 = r4.LL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.IAccountService r0 = (com.ss.android.ugc.aweme.IAccountService) r0
            r0.LJIILL(r4)
            return
        L2d:
            if (r3 == 0) goto L33
        L2f:
            int r0 = r3.hashCode()
        L33:
            X.C15TA.LIZLLL = r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            X.C15TA.LJ = r0
            X.C15TA.LJJJI = r2
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.assem.ExploreAssem.onCreate():void");
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C20524115St c20524115St = C20524115St.LL;
        c20524115St.getClass();
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null) {
            iAccountService.LJI(c20524115St);
        }
        C2153908cD c2153908cD = C2153908cD.LIZ;
        ReentrantLock reentrantLock = C20524115St.LLILLJJLI;
        reentrantLock.lock();
        try {
            C20524115St.LLILLL = null;
            reentrantLock.unlock();
            C20524115St.LLILZ.LJ();
            AnonymousClass0956 anonymousClass0956 = C20524115St.LLILZLL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            C20524115St.LLILZLL = null;
            ((C1841870y1x) C20524115St.LLJ.getValue()).LIZ();
            AnonymousClass0956 anonymousClass09562 = C20524115St.LLIZ;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
            AnonymousClass0956 anonymousClass09563 = C20524115St.LLIZLLLIL;
            if (anonymousClass09563 != null) {
                anonymousClass09563.LIZIZ(null);
            }
            C20524115St.LLIZLLLIL = null;
            C20524115St.LLIZ = null;
            C0CWJ c0cwj = this.LLILLJJLI;
            if (c0cwj != null) {
                C1BCA.LJJIJIIJI(EnumC312610CNf.SATRTUP, c0cwj);
            }
            ExploreCustomTopicDataSource.Companion.getClass();
            C1841760y1m.LIZ.release();
            ((IAccountService) this.LL.getValue()).LJI(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0CWJ, X.0cIr] */
    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        ?? r1 = new InterfaceC1006670cIr<C1602200rnO>(this) { // from class: X.0CWJ
            public final WeakReference<ExploreAssem> LL;

            {
                this.LL = new WeakReference<>(this);
            }

            @Override // X.InterfaceC1006670cIr
            public final void LJIIJ(C1602200rnO c1602200rnO, C1602200rnO c1602200rnO2) {
                C1602200rnO c1602200rnO3 = c1602200rnO2;
                ExploreAssem exploreAssem = this.LL.get();
                if (exploreAssem != null && c1602200rnO3.LIZJ()) {
                    LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(exploreAssem);
                    C1DFB c1dfb = C0PEM.LIZJ;
                    C23250099c.LIZLLL(lifecycleScope, c1dfb, null, new C328890Cut(exploreAssem, null), 2);
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(exploreAssem), c1dfb, null, new C0CWH(exploreAssem, null), 2);
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(exploreAssem), c1dfb, null, new C15UO(exploreAssem, null), 2);
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(exploreAssem), c1dfb, null, new C0CWM(null), 2);
                }
            }
        };
        this.LLILLJJLI = r1;
        C1BCA.LJIJJLI(EnumC312610CNf.SATRTUP, r1);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object bo(X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C0CWI
            if (r0 == 0) goto L7d
            r4 = r10
            X.0CWI r4 = (X.C0CWI) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7d
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L65
            if (r0 != r2) goto L8e
            X.C155000ia.LIZIZ(r1)
        L22:
            X.15St r1 = X.C20524115St.LL
            r1.getClass()
            boolean r0 = X.C305140Bxg.LIZIZ()
            if (r0 == 0) goto L99
            X.0956 r0 = X.C20524115St.LLILZLL
            r8 = 0
            if (r0 == 0) goto L35
            r0.LIZIZ(r8)
        L35:
            X.C20524115St.LLILZLL = r8
            X.11NJ r2 = X.C20524115St.LLILZ
            r2.LJ()
            java.lang.Class<com.ss.android.ugc.aweme.IAccountService> r3 = com.ss.android.ugc.aweme.IAccountService.class
            r4 = 0
            r7 = 14
            r5 = r4
            r6 = r4
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.IAccountService r0 = (com.ss.android.ugc.aweme.IAccountService) r0
            if (r0 == 0) goto L4e
            r0.LJIILL(r1)
        L4e:
            X.0ziL r0 = X.C1906580ziK.LIZJ()
            X.09Pw r1 = r0.LIZJ()
            X.0CNU<T> r0 = new X.C09JN() { // from class: X.0CNU
                static {
                    /*
                        X.0CNU r0 = new X.0CNU
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0CNU<T>) X.0CNU.LL X.0CNU
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0CNU.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0CNU.<init>():void");
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
                @Override // X.C09JN
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void accept(java.lang.Object r3) {
                    /*
                        r2 = this;
                        java.lang.String r1 = "ExploreHotCacheDataManager@1354.initialize$1"
                        X.C1C7U.LIZ(r1)
                        java.lang.Boolean r3 = (java.lang.Boolean) r3
                        boolean r0 = r3.booleanValue()
                        if (r0 == 0) goto L50
                        X.01GW r0 = X.C278050Av5.LIZ
                        java.lang.Object r0 = r0.getValue()
                        java.lang.Boolean r0 = (java.lang.Boolean) r0
                        boolean r0 = r0.booleanValue()
                        if (r0 == 0) goto L34
                        X.15St r0 = X.C20524115St.LL
                        r0.getClass()
                        X.0XAv r0 = X.C844470XAv.LIZ     // Catch: java.lang.Throwable -> L30
                        r0.getClass()     // Catch: java.lang.Throwable -> L30
                        android.content.Context r0 = X.C844470XAv.LIZ()     // Catch: java.lang.Throwable -> L30
                        boolean r0 = X.C2188561Al4.LJIIJ(r0)     // Catch: java.lang.Throwable -> L30
                        if (r0 == 0) goto L34
                        goto L4e
                    L30:
                        r0 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    L34:
                        com.ss.android.ugc.aweme.explore.experiment.performance.ExploreHotCacheWeakNetworkConfig r0 = X.C305140Bxg.LIZ()
                        boolean r0 = r0.enable
                        if (r0 == 0) goto L45
                        com.ss.android.ugc.aweme.explore.experiment.performance.ExploreHotCacheWeakNetworkConfig r0 = X.C305140Bxg.LIZ()
                        boolean r0 = r0.disEnableHotCache
                        if (r0 == 0) goto L45
                        goto L50
                    L45:
                        X.15St r0 = X.C20524115St.LL
                        r0.getClass()
                        X.C20524115St.LIZJ()
                        goto L50
                    L4e:
                        X.08cD r0 = X.C2153908cD.LIZ
                    L50:
                        X.C1C7U.LIZIZ(r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0CNU.accept(java.lang.Object):void");
                }
            }
            X.01kM r0 = r1.LJJLJLI(r0)
            r2.LIZ(r0)
            java.util.concurrent.locks.ReentrantLock r1 = X.C20524115St.LLILLJJLI
            r1.lock()
            goto L83
        L65:
            X.C155000ia.LIZIZ(r1)
            boolean r0 = X.C305140Bxg.LIZIZ()
            if (r0 == 0) goto L9c
            com.ss.android.ugc.aweme.explore.experiment.performance.ExploreHotCacheWeakNetworkConfig r0 = X.C305140Bxg.LIZ()
            long r0 = r0.delayCheckDuration
            r4.LLILLL = r2
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r4)
            if (r0 != r3) goto L22
            return r3
        L7d:
            X.0CWI r4 = new X.0CWI
            r4.<init>(r9, r10)
            goto L12
        L83:
            X.C20524115St.LLILLL = r8     // Catch: java.lang.Throwable -> L86
            goto L96
        L86:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L86
            r1.unlock()
            throw r0
        L8e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L96:
            r1.unlock()
        L99:
            X.C20524115St.LIZJ()
        L9c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.assem.ExploreAssem.bo(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (i != 2 && i != 3) {
            return;
        }
        C15TA.LIZ.getClass();
        ((LinkedHashMap) C15TA.LJFF).clear();
        C15TA.LJIIL = true;
        if (!((Boolean) C0AH8.LIZ.getValue()).booleanValue()) {
            return;
        }
        C15T0.LIZ.set(false);
        C15T0.LIZIZ.set(false);
        C15T0.LJFF.set(false);
        C15T0.LIZLLL.set(false);
    }
}

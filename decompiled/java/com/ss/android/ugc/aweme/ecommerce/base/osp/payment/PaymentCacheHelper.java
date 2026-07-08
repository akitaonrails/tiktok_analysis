package com.ss.android.ugc.aweme.ecommerce.base.osp.payment;

import X.AnonymousClass0317;
import X.AnonymousClass0956;
import X.C034S;
import X.C03MR;
import X.C03MS;
import X.C03QB;
import X.C03QI;
import X.C03S8;
import X.C0PEM;
import X.C1120604Zw;
import X.C13BV;
import X.C189200o6;
import X.C1AQS;
import X.C23250099c;
import X.C959003oy;
import android.os.SystemClock;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.dependency.location.LocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AwS150S1100000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS86S1000000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentCacheHelper {
    public static LifecycleOwner LIZIZ;
    public static Region LJ;
    public static AnonymousClass0956 LJFF;
    public static long LJIIL;
    public static final PaymentCacheHelper LIZ = new PaymentCacheHelper();
    public static final HashMap<String, List<PaymentElement>> LIZJ = new HashMap<>();
    public static final LinkedList<PaymentInfo> LIZLLL = new LinkedList<>();
    public static final HashMap<String, Boolean> LJI = new HashMap<>();
    public static final ConcurrentHashMap<String, Boolean> LJII = new ConcurrentHashMap<>();
    public static final ReentrantLock LJIIIIZZ = new ReentrantLock(true);
    public static final ReentrantLock LJIIIZ = new ReentrantLock(true);
    public static final ReentrantLock LJIIJ = new ReentrantLock(true);
    public static final ReentrantLock LJIIJJI = new ReentrantLock(true);
    public static final PaymentCacheHelper$lifecycleObserver$1 LJIILIIL = new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper$lifecycleObserver$1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                onDestroy();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public final void onDestroy() {
            PaymentCacheHelper.LIZ.getClass();
            PaymentCacheHelper.LIZJ();
        }
    };

    public static List LJ() {
        List listLJFF = LJFF(null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJFF) {
            PaymentMethod paymentMethod = ((PaymentInfo) obj).paymentMethod;
            String str = paymentMethod != null ? paymentMethod.id : null;
            if (!Intrinsics.LJFF(str, "pm_pi_atmcard_all") && C03S8.LJIILJJIL(str)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static void LIZJ() {
        Lifecycle lifecycle;
        LifecycleOwner lifecycleOwner = LIZIZ;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(LJIILIIL);
        }
        LIZIZ = null;
        LIZJ.clear();
        AnonymousClass0956 anonymousClass0956 = LJFF;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        LIZLLL.clear();
        LJFF = null;
        LJ = null;
        LJI.clear();
        C959003oy.LIZ(LJIIJJI, AFwS185S0000000_1.get$arr$(90));
    }

    public static Region LJIIIIZZ() {
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin;
        Region region = LJ;
        if (region == null) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
                C1AQS.LIZJ(jElapsedRealtime, 1, ILocationDependencyService.class.getName(), anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocationDependencyService.class);
            }
            String upperCase = ((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin).getCurrentRegionCode().toUpperCase(Locale.ROOT);
            if (upperCase == null) {
                upperCase = "";
            }
            region = new Region(null, null, upperCase, null, null, null, null);
        }
        return region;
    }

    public static void LJIIL() {
        if (System.currentTimeMillis() - LJIIL > 500) {
            C959003oy.LIZ(LJIIJJI, AFwS185S0000000_1.get$arr$(90));
        }
    }

    public static void LIZIZ(PaymentInfo paymentInfo) {
        if (paymentInfo == null) {
            return;
        }
        C959003oy.LIZ(LJIIIZ, new AwS545S0100000_1(paymentInfo, 919));
    }

    public static List LJFF(C03QB c03qb) {
        Object objLIZ = C959003oy.LIZ(LJIIIZ, new AwS545S0100000_1(c03qb, 920));
        if (C189200o6.m7isFailureimpl(objLIZ)) {
            objLIZ = null;
        }
        List list = (List) objLIZ;
        if (list == null) {
            return C13BV.INSTANCE;
        }
        return list;
    }

    public static PaymentInfo LJII(String str) {
        Object obj = null;
        if (str == null) {
            return null;
        }
        Object objLIZ = C959003oy.LIZ(LJIIIZ, new AwS86S1000000_1(str, 0));
        if (!C189200o6.m7isFailureimpl(objLIZ)) {
            obj = objLIZ;
        }
        return (PaymentInfo) obj;
    }

    public static Boolean LJIIIZ(String str) {
        Object objLIZ = C959003oy.LIZ(LJIIJ, new AwS86S1000000_1(str, 1));
        if (C189200o6.m7isFailureimpl(objLIZ)) {
            objLIZ = null;
        }
        return (Boolean) objLIZ;
    }

    public static void LJIIJ(LifecycleOwner lifecycleOwner) {
        LifecycleCoroutineScope lifecycleScope;
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin;
        LifecycleCoroutineScope lifecycleScope2;
        String name;
        Lifecycle lifecycle;
        if (Intrinsics.LJFF(LIZIZ, lifecycleOwner)) {
            return;
        }
        LIZJ();
        LIZIZ = lifecycleOwner;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(LJIILIIL);
        }
        C03QI.LIZ.getClass();
        AnonymousClass0956 anonymousClass0956LIZLLL = null;
        if (C03QI.LIZ().enableOptimize) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                boolean z = false;
                anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                    z = true;
                }
                String name2 = ILocationDependencyService.class.getName();
                if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocationDependencyService.class);
            }
            LJ = new Region(null, null, ((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin).getCurrentRegionCode().toUpperCase(Locale.ROOT), null, null, null, null);
            LifecycleOwner lifecycleOwner2 = LIZIZ;
            if (lifecycleOwner2 != null && (lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner2)) != null) {
                anonymousClass0956LIZLLL = C23250099c.LIZLLL(lifecycleScope2, C0PEM.LIZJ, null, new C03MS(null), 2);
            }
            LJFF = anonymousClass0956LIZLLL;
            return;
        }
        LifecycleOwner lifecycleOwner3 = LIZIZ;
        if (lifecycleOwner3 != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner3)) != null) {
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(lifecycleScope, null, null, new C03MR(null), 3);
        }
        LJFF = anonymousClass0956LIZLLL;
    }

    public static void LJIIJJI(String str) {
        if (str == null) {
            return;
        }
        C959003oy.LIZ(LJIIIZ, new AwS86S1000000_1(str, 2));
    }

    public static void LIZ(String str, List list) {
        if (LIZIZ == null || list == null) {
            return;
        }
        C959003oy.LIZ(LJIIIIZZ, new AwS150S1100000_1(list, (List<PaymentElement>) str, (String) 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region r15, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region> r16) {
        /*
            r14 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C03SD
            if (r0 == 0) goto L23
            r13 = r3
            X.03SD r13 = (X.C03SD) r13
            int r2 = r13.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r13.LLILLL = r2
        L14:
            java.lang.Object r0 = r13.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r13.LLILLL
            r6 = 0
            r1 = 1
            if (r2 == 0) goto L31
            if (r2 != r1) goto L29
            goto L4a
        L23:
            X.03SD r13 = new X.03SD
            r13.<init>(r14, r3)
            goto L14
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r0)
            X.03sT r4 = com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi.LIZ     // Catch: java.lang.Throwable -> L5d
            r13.LLILLL = r1     // Catch: java.lang.Throwable -> L5d
            r0 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L5d
            r5 = r15
            r7 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            java.lang.Object r0 = r4.LIZLLL(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L5d
            if (r0 != r3) goto L4d
            return r3
        L4a:
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Throwable -> L5d
        L4d:
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0     // Catch: java.lang.Throwable -> L5d
            T r0 = r0.data     // Catch: java.lang.Throwable -> L5d
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData) r0     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L5b
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region r1 = r0.regionInfo     // Catch: java.lang.Throwable -> L5d
        L57:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L5d
            goto L69
        L5b:
            r1 = r6
            goto L57
        L5d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L69:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L70
            return r1
        L70:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper.LIZLLL(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILIIL(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r13, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper.LJIILIIL(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0204 A[PHI: r3
      0x0204: PHI (r3v3 java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod>) = 
      (r3v2 java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod>)
      (r3v12 java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod>)
     binds: [B:157:0x0200, B:14:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILJJIL(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r9, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper.LJIILJJIL(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData, boolean, boolean):void");
    }
}

package com.ss.android.ugc.aweme.search.common.utils;

import X.AbstractC1387200mCc;
import X.C01D1;
import X.C01GW;
import X.C07DM;
import X.C07H0;
import X.C07H4;
import X.C07H5;
import X.C07H6;
import X.C0J7K;
import X.C0PE2;
import X.C0PHE;
import X.C0PHF;
import X.C0R1H;
import X.C1210904oV;
import X.C1388190mED;
import X.C13SZ;
import X.C1558360qeg;
import X.C1825907Dd;
import X.C1826507Dj;
import X.C1826607Dk;
import X.C1835007Gq;
import X.C1906580ziK;
import X.C1929907hB;
import X.C19EG;
import X.C1AF0;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C271070Ajp;
import X.C294780Bgy;
import X.C356901a3;
import X.C452501pT;
import X.C485430J1x;
import X.C651580Ph6;
import X.C662250PyJ;
import X.C663640Q1i;
import X.C737910Sx3;
import X.InterfaceC1294060jmO;
import X.InterfaceC214897198d;
import X.InterfaceC214902198i;
import X.InterfaceC641270PDh;
import X.InterfaceC651320Pgg;
import X.InterfaceC665370Q7z;
import X.InterfaceC724760Sbq;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.lifecycle.SAFLifecycleCompatLifecycle;
import com.ss.android.ugc.aweme.search.ISearchContextService;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes11.dex */
public final class SAFHelper {
    public static int LIZIZ;
    public static final SAFHelper LIZ = new SAFHelper();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(533));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C1825907Dd());
    public static final C01GW LJ = C452501pT.LIZIZ(new C1826607Dk());
    public static final C01GW LJFF = C452501pT.LIZIZ(new C1826507Dj());
    public static final C01GW LJI = C452501pT.LIZIZ(new C1929907hB());
    public static final C01GW LJII = C452501pT.LIZIZ(new C662250PyJ());
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(new C0J7K());

    public static boolean LJIIJ() {
        return ((Boolean) LIZLLL.getValue()).booleanValue();
    }

    public static boolean LJIIJJI() {
        return ((Boolean) LIZJ.getValue()).booleanValue();
    }

    public static boolean LJIIL() {
        return ((Boolean) LJ.getValue()).booleanValue();
    }

    public static Fragment LJIIIZ() {
        if (LJIIJJI()) {
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            Object obj = abstractC1387200mCcLIZIZ != null ? abstractC1387200mCcLIZIZ.LIZ : null;
            Fragment fragment = obj instanceof Fragment ? (Fragment) obj : null;
            if (fragment instanceof C0PE2) {
                return fragment;
            }
        }
        return null;
    }

    public static Activity LJJIII() {
        Activity activityLIZIZ;
        if (!LJIIJJI()) {
            return ActivityStack.getPreviousActivity();
        }
        AbstractC1387200mCc abstractC1387200mCcLIZLLL = C1906580ziK.LIZLLL();
        if (abstractC1387200mCcLIZLLL == null || (activityLIZIZ = abstractC1387200mCcLIZLLL.LIZIZ()) == null) {
            return null;
        }
        return C737910Sx3.LIZIZ(activityLIZIZ);
    }

    public static InterfaceC724760Sbq LJJJIL() {
        return C07H6.LIZ() ? C485430J1x.LIZ : C01D1.LIZ;
    }

    public static final class SAFLifecycleCompatWrapper implements LifecycleOwner {
        public final InterfaceC214902198i LL;
        public final SAFLifecycleCompatLifecycle LLILLJJLI;
        public AnonymousClass1 LLILLL;
        public volatile boolean LLILZ;

        @Override // androidx.lifecycle.LifecycleOwner
        public final Lifecycle getLifecycle() {
            return this.LLILLJJLI;
        }

        /* JADX INFO: renamed from: com.ss.android.ugc.aweme.search.common.utils.SAFHelper$SAFLifecycleCompatWrapper$1, reason: invalid class name */
        public final class AnonymousClass1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                C356901a3.LIZ(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                C356901a3.LIZJ(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                C356901a3.LIZLLL(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                C356901a3.LJ(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                C356901a3.LJFF(this, lifecycleOwner);
            }

            public AnonymousClass1() {
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onDestroy(LifecycleOwner lifecycleOwner) {
                C356901a3.LIZIZ(this, lifecycleOwner);
                SAFLifecycleCompatWrapper sAFLifecycleCompatWrapper = SAFLifecycleCompatWrapper.this;
                sAFLifecycleCompatWrapper.getClass();
                if (((Boolean) C07DM.LIZ.getValue()).booleanValue() && !sAFLifecycleCompatWrapper.LLILZ) {
                    sAFLifecycleCompatWrapper.LLILZ = true;
                    AnonymousClass1 anonymousClass1 = sAFLifecycleCompatWrapper.LLILLL;
                    if (anonymousClass1 != null) {
                        sAFLifecycleCompatWrapper.LLILLJJLI.removeObserver(anonymousClass1);
                        sAFLifecycleCompatWrapper.LLILLL = null;
                    }
                    SAFHelper.LIZ.getClass();
                    C01GW c01gw = SAFHelper.LJIIIIZZ;
                    ((Map) c01gw.getValue()).remove(sAFLifecycleCompatWrapper.LL);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[SAFLifecycleCompatWrapper] Finish cleanupCache. curSize:");
                    sbLIZ.append(((Map) c01gw.getValue()).size());
                    sbLIZ.append(" - ");
                    sbLIZ.append(sAFLifecycleCompatWrapper.LL.getClass().getSimpleName());
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
        }

        public SAFLifecycleCompatWrapper(InterfaceC214902198i interfaceC214902198i) {
            this.LL = interfaceC214902198i;
            SAFLifecycleCompatLifecycle sAFLifecycleCompatLifecycle = new SAFLifecycleCompatLifecycle(interfaceC214902198i);
            this.LLILLJJLI = sAFLifecycleCompatLifecycle;
            if (((Boolean) C07DM.LIZ.getValue()).booleanValue()) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1();
                this.LLILLL = anonymousClass1;
                sAFLifecycleCompatLifecycle.addObserver(anonymousClass1);
            }
        }
    }

    public static Fragment LIZIZ(C19EG c19eg) throws Throwable {
        Object objLJIILLIIL;
        LJJJJZI(c19eg, null);
        if (c19eg == null) {
            return null;
        }
        int iHashCode = c19eg.hashCode();
        C01GW c01gw = LJII;
        if (((ConcurrentHashMap) c01gw.getValue()).containsKey(Integer.valueOf(c19eg.hashCode()))) {
            return (Fragment) ((ConcurrentHashMap) c01gw.getValue()).get(Integer.valueOf(iHashCode));
        }
        InterfaceC214902198i interfaceC214902198iLIZ = C651580Ph6.LIZ(c19eg);
        if (interfaceC214902198iLIZ == null) {
            interfaceC214902198iLIZ = SAFExtensionKt.LJIILLIIL(c19eg);
        }
        LIZ.getClass();
        if (!LJJJJLL(interfaceC214902198iLIZ, c19eg) || (objLJIILLIIL = SAFExtensionKt.LJIILLIIL(c19eg)) == null) {
            return null;
        }
        Fragment fragment = (Fragment) objLJIILLIIL;
        if (!(fragment instanceof C0PE2)) {
            return null;
        }
        if (fragment == null) {
            return fragment;
        }
        C0R1H.LIZIZ(c19eg, new SAFHelper$findValidSearchRootFragment$3(iHashCode));
        ((ConcurrentHashMap) c01gw.getValue()).put(Integer.valueOf(iHashCode), fragment);
        return fragment;
    }

    public static Context LJ(Context context) {
        if (C07H0.LIZ()) {
            if (context != null) {
                return C737910Sx3.LIZIZ(context);
            }
            return null;
        }
        return context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Activity LJIIIIZZ(InterfaceC214902198i interfaceC214902198i) {
        Activity activityLIZIZ;
        C19EG activity;
        if (LJIIJJI()) {
            if (interfaceC214902198i != 0 && (activity = ((Fragment) interfaceC214902198i).getActivity()) != null) {
                return activity;
            }
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
                return C737910Sx3.LIZIZ(activityLIZIZ);
            }
            return null;
        }
        return C2214201BlK.LJFF();
    }

    public static Lifecycle LJIJ(LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycleOwner instanceof InterfaceC214902198i) {
            InterfaceC214902198i interfaceC214902198i = (InterfaceC214902198i) lifecycleOwner;
            if (interfaceC214902198i.W1()) {
                return new SAFLifecycleCompatLifecycle(interfaceC214902198i);
            }
            return lifecycle;
        }
        return lifecycle;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000f  */
    @X.InterfaceC1294060jmO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.lifecycle.LifecycleOwner LJIJJLI(X.C19EG r3) {
        /*
            r2 = 0
            if (r3 == 0) goto L18
            X.198i r0 = X.C651580Ph6.LIZ(r3)
            if (r0 == 0) goto Lf
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 != 0) goto L36
            if (r3 == 0) goto L18
        Lf:
            X.198i r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJIILLIIL(r3)
            if (r0 == 0) goto L18
            r2 = r0
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
        L18:
            boolean r0 = X.C07H4.LIZ()
            if (r0 == 0) goto L35
            boolean r0 = LJJJJL(r3, r2)
            if (r0 == 0) goto L35
            boolean r0 = r2 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L38
            r1 = r2
            X.198i r1 = (X.InterfaceC214902198i) r1
            boolean r0 = r1.W1()
            if (r0 == 0) goto L38
            com.ss.android.ugc.aweme.search.common.utils.SAFHelper$SAFLifecycleCompatWrapper r3 = LJJIFFI(r1)
        L35:
            return r3
        L36:
            r2 = r0
            goto L18
        L38:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJIJJLI(X.19EG):androidx.lifecycle.LifecycleOwner");
    }

    public static SAFLifecycleCompatWrapper LJJIFFI(InterfaceC214902198i interfaceC214902198i) {
        SAFLifecycleCompatWrapper sAFLifecycleCompatWrapper;
        C01GW c01gw = LJIIIIZZ;
        Reference reference = (Reference) ((Map) c01gw.getValue()).get(interfaceC214902198i);
        if (reference != null && (sAFLifecycleCompatWrapper = (SAFLifecycleCompatWrapper) reference.get()) != null) {
            return sAFLifecycleCompatWrapper;
        }
        SAFLifecycleCompatWrapper sAFLifecycleCompatWrapper2 = new SAFLifecycleCompatWrapper(interfaceC214902198i);
        ((Map) c01gw.getValue()).put(interfaceC214902198i, new WeakReference(sAFLifecycleCompatWrapper2));
        return sAFLifecycleCompatWrapper2;
    }

    @InterfaceC1294060jmO
    public static Fragment LJJJ(C19EG c19eg) throws Throwable {
        Object objLJIILLIIL;
        Fragment fragment;
        LJJJJZI(c19eg, null);
        Object objLIZ = C651580Ph6.LIZ(c19eg);
        if (objLIZ != null && (fragment = (Fragment) objLIZ) != null) {
            return fragment;
        }
        if (c19eg == null || (objLJIILLIIL = SAFExtensionKt.LJIILLIIL(c19eg)) == null) {
            return null;
        }
        return (Fragment) objLJIILLIIL;
    }

    @InterfaceC1294060jmO
    public static InterfaceC214902198i LJJJI(C19EG c19eg) throws Throwable {
        LJJJJZI(c19eg, null);
        InterfaceC214902198i interfaceC214902198iLIZ = C651580Ph6.LIZ(c19eg);
        if (interfaceC214902198iLIZ == null) {
            if (c19eg == null) {
                return null;
            }
            return SAFExtensionKt.LJIILLIIL(c19eg);
        }
        return interfaceC214902198iLIZ;
    }

    public static boolean LJJJJ(Activity activity) {
        C19EG c19eg;
        InterfaceC214902198i interfaceC214902198iLIZ = C651580Ph6.LIZ(activity);
        if (interfaceC214902198iLIZ == null) {
            interfaceC214902198iLIZ = null;
            if ((activity instanceof C19EG) && (c19eg = (C19EG) activity) != null) {
                interfaceC214902198iLIZ = SAFExtensionKt.LJIILLIIL(c19eg);
            }
        }
        if (C1835007Gq.LIZ() && LJJJJLL(interfaceC214902198iLIZ, activity)) {
            if (interfaceC214902198iLIZ instanceof C0PE2) {
                return C651580Ph6.LIZJ(interfaceC214902198iLIZ);
            }
            if (activity != null) {
                return activity.isDestroyed();
            }
            return true;
        }
        if (activity != null) {
            return activity.isDestroyed();
        }
        return true;
    }

    public static boolean LJJJJIZL(Activity activity) {
        C19EG c19eg;
        InterfaceC214902198i interfaceC214902198iLIZ = C651580Ph6.LIZ(activity);
        if (interfaceC214902198iLIZ == null) {
            interfaceC214902198iLIZ = null;
            if ((activity instanceof C19EG) && (c19eg = (C19EG) activity) != null) {
                interfaceC214902198iLIZ = SAFExtensionKt.LJIILLIIL(c19eg);
            }
        }
        if (C1835007Gq.LIZ() && LJJJJLL(interfaceC214902198iLIZ, activity)) {
            if (interfaceC214902198iLIZ instanceof C0PE2) {
                return C651580Ph6.LIZJ(interfaceC214902198iLIZ);
            }
            if (activity != null) {
                return activity.isFinishing();
            }
            return true;
        }
        if (activity != null) {
            return activity.isFinishing();
        }
        return true;
    }

    @InterfaceC1294060jmO
    public static boolean LJJJJJL(Activity activity) {
        C19EG c19eg;
        InterfaceC214902198i interfaceC214902198iLIZ = C651580Ph6.LIZ(activity);
        if (interfaceC214902198iLIZ == null) {
            interfaceC214902198iLIZ = null;
            if ((activity instanceof C19EG) && (c19eg = (C19EG) activity) != null) {
                interfaceC214902198iLIZ = SAFExtensionKt.LJIILLIIL(c19eg);
            }
        }
        return LJJJJLL(interfaceC214902198iLIZ, activity);
    }

    public static boolean LJJJJZ(AbstractC1387200mCc abstractC1387200mCc) {
        Object obj;
        Object objLJIILLIIL;
        C19EG c19egLIZIZ;
        C19EG c19egLIZIZ2;
        if (abstractC1387200mCc == null || (obj = abstractC1387200mCc.LIZ) == null) {
            return false;
        }
        if (LJIIJJI()) {
            Activity activityLIZIZ = abstractC1387200mCc.LIZIZ();
            C19EG c19egLIZIZ3 = null;
            if (activityLIZIZ == null || (c19egLIZIZ2 = C1388190mED.LIZIZ(activityLIZIZ)) == null || (objLJIILLIIL = C651580Ph6.LIZ(c19egLIZIZ2)) == null) {
                if (obj instanceof InterfaceC214902198i) {
                    objLJIILLIIL = obj;
                } else {
                    Activity activityLIZIZ2 = abstractC1387200mCc.LIZIZ();
                    if (activityLIZIZ2 != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ2)) != null) {
                        objLJIILLIIL = SAFExtensionKt.LJIILLIIL(c19egLIZIZ);
                    } else {
                        objLJIILLIIL = null;
                    }
                }
            }
            if (!(objLJIILLIIL instanceof C0PE2)) {
                Activity activityLIZIZ3 = abstractC1387200mCc.LIZIZ();
                if (activityLIZIZ3 != null) {
                    c19egLIZIZ3 = C1388190mED.LIZIZ(activityLIZIZ3);
                }
                if (!(c19egLIZIZ3 instanceof InterfaceC641270PDh)) {
                    return false;
                }
            }
            return true;
        }
        if (!(obj instanceof C0PE2) && !(obj instanceof InterfaceC641270PDh)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LIZ(Fragment fragment, C19EG c19eg) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        Fragment fragmentLIZIZ;
        InterfaceC651320Pgg interfaceC651320PggLIZLLL = C0PHF.LIZLLL(fragment);
        if (interfaceC651320PggLIZLLL != null && (fragmentLIZIZ = C0PHF.LIZIZ(interfaceC651320PggLIZLLL)) != null) {
            if (fragmentLIZIZ.getActivity() != null) {
                return true;
            }
            return false;
        }
        if (!C07H6.LIZ() || !LJJJJL(c19eg, fragment)) {
            return true;
        }
        Fragment fragment2 = null;
        if (fragment != 0) {
            Context context = fragment.getContext();
            if (context != null) {
                componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
            } else {
                componentCallbacks2LJFF = null;
            }
            if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                while (true) {
                    if (fragment instanceof InterfaceC214902198i) {
                        Object obj = (InterfaceC214902198i) fragment;
                        if (obj != null) {
                            fragment2 = (Fragment) obj;
                        }
                    } else {
                        fragment = fragment.getParentFragment();
                        if (fragment == 0) {
                            break;
                        }
                    }
                }
            }
        }
        if (!(fragment2 instanceof C0PE2) || fragment2.getActivity() != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(androidx.fragment.app.Fragment r6, X.C19EG r7) throws java.lang.Throwable {
        /*
            java.lang.Class<com.ss.android.ugc.aweme.search.ISearchService> r0 = com.ss.android.ugc.aweme.search.ISearchService.class
            r1 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r2 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.search.ISearchService r2 = (com.ss.android.ugc.aweme.search.ISearchService) r2
            r1 = 1
            if (r2 == 0) goto L1b
            boolean r0 = r2.LLLLLLIL(r7)
            if (r0 != r1) goto L1b
            r2.g(r7)
            return
        L1b:
            boolean r0 = X.C1835007Gq.LIZ()
            if (r0 == 0) goto L6e
            boolean r0 = LJJJJL(r7, r6)
            if (r0 == 0) goto L6e
            X.198i r1 = X.C651580Ph6.LIZ(r7)
            if (r1 != 0) goto L48
            r1 = 0
            if (r6 == 0) goto L44
            android.content.Context r0 = r6.getContext()
            if (r0 == 0) goto L3a
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        L3a:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L50
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L5f
        L44:
            X.198i r1 = LJJJI(r7)
        L48:
            boolean r0 = r1 instanceof X.C0PE2
            if (r0 == 0) goto L4f
            r1.finish()
        L4f:
            return
        L50:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L44
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L5f
            goto L44
        L5d:
            if (r6 == 0) goto L44
        L5f:
            boolean r0 = r6 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L69
            X.198i r6 = (X.InterfaceC214902198i) r6
            r1 = r6
            if (r6 != 0) goto L48
            goto L44
        L69:
            androidx.fragment.app.Fragment r6 = r6.getParentFragment()
            goto L5d
        L6e:
            if (r7 == 0) goto L4f
            r7.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LIZJ(androidx.fragment.app.Fragment, X.19EG):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Bundle LIZLLL(Fragment fragment, C19EG c19eg) {
        Intent intent;
        ComponentCallbacks2 componentCallbacks2LJFF;
        boolean z;
        Object obj;
        Bundle extras = null;
        if (LJIIJJI()) {
            Context context = fragment.getContext();
            if (context != null) {
                componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
            } else {
                componentCallbacks2LJFF = null;
            }
            if (!C294780Bgy.LIZ() ? !(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF() : !(componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                obj = null;
            } else {
                while (fragment != 0) {
                    if (fragment instanceof InterfaceC214902198i) {
                        obj = (InterfaceC214902198i) fragment;
                        break;
                    }
                    fragment = fragment.getParentFragment();
                }
                obj = null;
            }
            if (obj == null) {
                return null;
            }
            return ((Fragment) obj).getArguments();
        }
        if (c19eg == null || (intent = c19eg.getIntent()) == null) {
            return null;
        }
        try {
            extras = intent.getExtras();
            return extras;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return extras;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Context LJFF(android.view.View r4, X.C19EG r5) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJFF(android.view.View, X.19EG):android.content.Context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Context LJI(androidx.fragment.app.Fragment r4, X.C19EG r5) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJI(androidx.fragment.app.Fragment, X.19EG):android.content.Context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Context LJII(androidx.fragment.app.Fragment r4, X.C19EG r5) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJII(androidx.fragment.app.Fragment, X.19EG):android.content.Context");
    }

    public static FragmentManager LJIILIIL(View view, C19EG c19eg) {
        Fragment fragmentLIZLLL;
        InterfaceC651320Pgg interfaceC651320PggLIZJ;
        Fragment fragmentLIZIZ;
        if (view != null && (interfaceC651320PggLIZJ = C0PHF.LIZJ(view)) != null && (fragmentLIZIZ = C0PHF.LIZIZ(interfaceC651320PggLIZJ)) != null) {
            return fragmentLIZIZ.getChildFragmentManager();
        }
        if (C1210904oV.LIZ()) {
            if (view != null) {
                fragmentLIZLLL = C0PHE.LIZ(view);
            } else {
                fragmentLIZLLL = null;
            }
        } else {
            fragmentLIZLLL = C651580Ph6.LIZLLL(view);
        }
        if (C663640Q1i.LIZ() && LJJJJL(c19eg, fragmentLIZLLL)) {
            if (fragmentLIZLLL == null) {
                return null;
            }
            return fragmentLIZLLL.getChildFragmentManager();
        }
        if (c19eg == null) {
            return null;
        }
        return c19eg.getSupportFragmentManager();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.fragment.app.FragmentManager LJIILJJIL(androidx.fragment.app.Fragment r3, X.C19EG r4) {
        /*
            if (r3 == 0) goto L13
            X.0Pgg r0 = X.C0PHF.LIZLLL(r3)
            if (r0 == 0) goto L13
            androidx.fragment.app.Fragment r0 = X.C0PHF.LIZIZ(r0)
            if (r0 == 0) goto L13
            androidx.fragment.app.FragmentManager r0 = r0.getChildFragmentManager()
            return r0
        L13:
            boolean r0 = X.C1210904oV.LIZ()
            r2 = 0
            if (r0 == 0) goto L3a
            if (r3 == 0) goto L33
            androidx.fragment.app.Fragment r1 = X.C0PHE.LIZIZ(r3)
        L20:
            if (r1 == 0) goto L33
            boolean r0 = X.C663640Q1i.LIZ()
            if (r0 == 0) goto L33
            boolean r0 = LJJJJL(r4, r3)
            if (r0 == 0) goto L33
            androidx.fragment.app.FragmentManager r2 = com.ss.android.ugc.aweme.SAFExtensionKt.LJIIJJI(r1)
        L32:
            return r2
        L33:
            if (r4 == 0) goto L32
            androidx.fragment.app.FragmentManager r2 = r4.getSupportFragmentManager()
            return r2
        L3a:
            r1 = r3
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJIILJJIL(androidx.fragment.app.Fragment, X.19EG):androidx.fragment.app.FragmentManager");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJIILL(androidx.fragment.app.Fragment r3, X.C19EG r4) {
        /*
            if (r3 == 0) goto L13
            X.0Pgg r0 = X.C0PHF.LIZLLL(r3)
            if (r0 == 0) goto L13
            androidx.fragment.app.Fragment r0 = X.C0PHF.LIZIZ(r0)
            if (r0 == 0) goto L13
            int r0 = r0.hashCode()
            return r0
        L13:
            boolean r0 = X.C1835007Gq.LIZ()
            if (r0 == 0) goto Lb7
            r2 = 0
            if (r4 == 0) goto L7b
            X.198i r1 = X.C651580Ph6.LIZ(r4)
        L20:
            boolean r0 = X.C1210904oV.LIZ()
            if (r0 == 0) goto L43
            if (r1 != 0) goto L2e
            if (r3 == 0) goto L5b
            androidx.fragment.app.Fragment r1 = X.C0PHE.LIZIZ(r3)
        L2e:
            boolean r0 = r1 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L7d
            r0 = r1
            X.198i r0 = (X.InterfaceC214902198i) r0
            boolean r0 = r0.W1()
            if (r0 == 0) goto L7d
            int r1 = r1.hashCode()
            int r0 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LIZIZ
            int r1 = r1 + r0
            return r1
        L43:
            if (r1 != 0) goto L2e
            if (r3 == 0) goto L5b
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L79
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        L51:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L5d
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L6a
        L5b:
            r1 = r2
            goto L2e
        L5d:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L5b
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L6a
            goto L5b
        L6a:
            r1 = r3
        L6b:
            boolean r0 = r1 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L72
            X.198i r1 = (X.InterfaceC214902198i) r1
            goto L2e
        L72:
            androidx.fragment.app.Fragment r1 = r1.getParentFragment()
            if (r1 == 0) goto L5b
            goto L6b
        L79:
            r1 = r2
            goto L51
        L7b:
            r1 = r2
            goto L20
        L7d:
            if (r3 == 0) goto L93
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L89
            android.app.Activity r2 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        L89:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L9a
            boolean r0 = r2 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto La9
        L93:
            if (r4 == 0) goto Lbe
            int r1 = r4.hashCode()
            return r1
        L9a:
            boolean r0 = r2 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L93
            X.198d r2 = (X.InterfaceC214897198d) r2
            boolean r0 = r2.getEnableSAF()
            if (r0 != 0) goto La9
            goto L93
        La7:
            if (r3 == 0) goto L93
        La9:
            boolean r0 = r3 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto Lb2
            int r1 = r3.hashCode()
            return r1
        Lb2:
            androidx.fragment.app.Fragment r3 = r3.getParentFragment()
            goto La7
        Lb7:
            if (r4 == 0) goto Lbe
            int r1 = r4.hashCode()
            return r1
        Lbe:
            r1 = -1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJIILL(androidx.fragment.app.Fragment, X.19EG):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.lifecycle.Lifecycle LJIILLIIL(android.view.View r4, X.C19EG r5) {
        /*
            if (r4 == 0) goto L13
            X.0Pgg r0 = X.C0PHF.LIZJ(r4)
            if (r0 == 0) goto L13
            androidx.fragment.app.Fragment r0 = X.C0PHF.LIZIZ(r0)
            if (r0 == 0) goto L13
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            return r0
        L13:
            boolean r0 = X.C1210904oV.LIZ()
            r3 = 0
            if (r0 == 0) goto L4e
            if (r4 == 0) goto L55
            androidx.fragment.app.Fragment r2 = X.C0PHE.LIZ(r4)
        L20:
            boolean r0 = X.C07H4.LIZ()
            if (r0 == 0) goto L47
            boolean r0 = LJJJJL(r5, r2)
            if (r0 == 0) goto L47
            boolean r0 = r2 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L40
            r1 = r2
            X.198i r1 = (X.InterfaceC214902198i) r1
            boolean r0 = r1.W1()
            if (r0 == 0) goto L40
            com.ss.android.ugc.aweme.search.common.utils.SAFHelper$SAFLifecycleCompatWrapper r0 = LJJIFFI(r1)
            com.ss.android.ugc.aweme.lifecycle.SAFLifecycleCompatLifecycle r3 = r0.LLILLJJLI
        L3f:
            return r3
        L40:
            if (r2 == 0) goto L3f
            androidx.lifecycle.Lifecycle r3 = r2.getLifecycle()
            return r3
        L47:
            if (r5 == 0) goto L3f
            androidx.lifecycle.Lifecycle r3 = r5.getLifecycle()
            return r3
        L4e:
            if (r4 == 0) goto L55
            androidx.fragment.app.Fragment r2 = X.C651580Ph6.LIZLLL(r4)
            goto L20
        L55:
            r2 = r3
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJIILLIIL(android.view.View, X.19EG):androidx.lifecycle.Lifecycle");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.lifecycle.Lifecycle LJIIZILJ(androidx.fragment.app.Fragment r3, X.C19EG r4) {
        /*
            if (r3 == 0) goto L13
            X.0Pgg r0 = X.C0PHF.LIZLLL(r3)
            if (r0 == 0) goto L13
            androidx.fragment.app.Fragment r0 = X.C0PHF.LIZIZ(r0)
            if (r0 == 0) goto L13
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            return r0
        L13:
            boolean r0 = X.C07H4.LIZ()
            r2 = 0
            if (r0 == 0) goto L85
            boolean r0 = LJJJJL(r4, r3)
            if (r0 == 0) goto L85
            boolean r0 = X.C1210904oV.LIZ()
            if (r0 == 0) goto L4b
            if (r3 == 0) goto L61
            androidx.fragment.app.Fragment r1 = X.C0PHE.LIZIZ(r3)
        L2c:
            boolean r0 = r1 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L44
            r0 = r1
            X.198i r0 = (X.InterfaceC214902198i) r0
            boolean r0 = r0.W1()
            if (r0 == 0) goto L44
            androidx.lifecycle.LifecycleOwner r0 = LJIJJ(r3, r4)
            if (r0 == 0) goto L43
            androidx.lifecycle.Lifecycle r2 = r0.getLifecycle()
        L43:
            return r2
        L44:
            if (r1 == 0) goto L43
            androidx.lifecycle.Lifecycle r2 = r1.getLifecycle()
            return r2
        L4b:
            if (r3 == 0) goto L61
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L83
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        L57:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L63
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L70
        L61:
            r1 = r2
            goto L2c
        L63:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L61
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L70
            goto L61
        L70:
            r1 = r3
        L71:
            boolean r0 = r1 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L7c
            X.198i r1 = (X.InterfaceC214902198i) r1
            if (r1 == 0) goto L61
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            goto L2c
        L7c:
            androidx.fragment.app.Fragment r1 = r1.getParentFragment()
            if (r1 == 0) goto L61
            goto L71
        L83:
            r1 = r2
            goto L57
        L85:
            if (r4 == 0) goto L43
            androidx.lifecycle.Lifecycle r2 = r4.getLifecycle()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJIIZILJ(androidx.fragment.app.Fragment, X.19EG):androidx.lifecycle.Lifecycle");
    }

    public static LifecycleOwner LJIJI(View view, C19EG c19eg) {
        InterfaceC651320Pgg interfaceC651320PggLIZJ;
        Fragment fragmentLIZIZ;
        if (view != null && (interfaceC651320PggLIZJ = C0PHF.LIZJ(view)) != null && (fragmentLIZIZ = C0PHF.LIZIZ(interfaceC651320PggLIZJ)) != null) {
            return fragmentLIZIZ;
        }
        Fragment fragmentLIZLLL = null;
        if (C1210904oV.LIZ()) {
            if (view != null) {
                fragmentLIZLLL = C0PHE.LIZ(view);
            }
        } else if (view != null) {
            fragmentLIZLLL = C651580Ph6.LIZLLL(view);
        }
        if (C07H4.LIZ() && LJJJJL(c19eg, fragmentLIZLLL)) {
            if (fragmentLIZLLL instanceof InterfaceC214902198i) {
                InterfaceC214902198i interfaceC214902198i = (InterfaceC214902198i) fragmentLIZLLL;
                if (interfaceC214902198i.W1()) {
                    return LJJIFFI(interfaceC214902198i);
                }
            }
        } else {
            IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
            if (iDetailFeedSafService == null || iDetailFeedSafService.LIZLLL(fragmentLIZLLL) == null) {
                return c19eg;
            }
        }
        return fragmentLIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LifecycleOwner LJIJJ(Fragment fragment, C19EG c19eg) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        InterfaceC651320Pgg interfaceC651320PggLIZLLL;
        Fragment fragmentLIZIZ;
        if (fragment != 0 && (interfaceC651320PggLIZLLL = C0PHF.LIZLLL(fragment)) != null && (fragmentLIZIZ = C0PHF.LIZIZ(interfaceC651320PggLIZLLL)) != null) {
            return fragmentLIZIZ;
        }
        if (C07H4.LIZ() && LJJJJL(c19eg, fragment)) {
            Fragment fragmentLIZIZ2 = null;
            if (C1210904oV.LIZ()) {
                if (fragment != 0) {
                    fragmentLIZIZ2 = C0PHE.LIZIZ(fragment);
                }
            } else if (fragment != 0) {
                Context context = fragment.getContext();
                if (context != null) {
                    componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
                } else {
                    componentCallbacks2LJFF = null;
                }
                if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                    while (true) {
                        if (fragment instanceof InterfaceC214902198i) {
                            Object obj = (InterfaceC214902198i) fragment;
                            if (obj != null) {
                                fragmentLIZIZ2 = (Fragment) obj;
                            }
                        } else {
                            fragment = fragment.getParentFragment();
                            if (fragment == 0) {
                                break;
                            }
                        }
                    }
                }
            }
            if (fragmentLIZIZ2 instanceof InterfaceC214902198i) {
                InterfaceC214902198i interfaceC214902198i = (InterfaceC214902198i) fragmentLIZIZ2;
                if (interfaceC214902198i.W1()) {
                    return LJJIFFI(interfaceC214902198i);
                }
                return fragmentLIZIZ2;
            }
            return fragmentLIZIZ2;
        }
        return c19eg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.19EG, android.app.Activity] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.lifecycle.LifecycleOwner] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v6 */
    public static LifecycleOwner LJIL(Fragment fragment, C19EG c19eg) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        Object objLIZ;
        InterfaceC651320Pgg interfaceC651320PggLIZLLL;
        Fragment fragmentLIZIZ;
        if (fragment != 0 && (interfaceC651320PggLIZLLL = C0PHF.LIZLLL(fragment)) != null && (fragmentLIZIZ = C0PHF.LIZIZ(interfaceC651320PggLIZLLL)) != null) {
            return fragmentLIZIZ;
        }
        if (C07H5.LIZ() && LJJJJL(c19eg, fragment)) {
            Fragment fragmentLIZIZ2 = null;
            if (c19eg != 0 && (objLIZ = C651580Ph6.LIZ(c19eg)) != null) {
                c19eg = (Fragment) objLIZ;
            } else {
                c19eg = 0;
            }
            if (C1210904oV.LIZ()) {
                if (fragment != 0) {
                    fragmentLIZIZ2 = C0PHE.LIZIZ(fragment);
                }
            } else if (fragment != 0) {
                Context context = fragment.getContext();
                if (context != null) {
                    componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
                } else {
                    componentCallbacks2LJFF = null;
                }
                if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                    while (true) {
                        if (fragment instanceof InterfaceC214902198i) {
                            Object obj = (InterfaceC214902198i) fragment;
                            if (obj != null) {
                                fragmentLIZIZ2 = (Fragment) obj;
                            }
                        } else {
                            fragment = fragment.getParentFragment();
                            if (fragment == 0) {
                                break;
                            }
                        }
                    }
                }
            }
            if (c19eg == 0) {
                return fragmentLIZIZ2;
            }
        }
        return c19eg;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.lifecycle.LifecycleOwner LJJ(android.view.View r3, X.C19EG r4) {
        /*
            if (r3 == 0) goto Lf
            X.0Pgg r0 = X.C0PHF.LIZJ(r3)
            if (r0 == 0) goto Lf
            androidx.fragment.app.Fragment r0 = X.C0PHF.LIZIZ(r0)
            if (r0 == 0) goto Lf
            return r0
        Lf:
            r2 = 0
            if (r4 == 0) goto L51
            X.198i r1 = X.C651580Ph6.LIZ(r4)
            if (r1 == 0) goto L51
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
        L1a:
            boolean r0 = X.C1210904oV.LIZ()
            if (r0 == 0) goto L46
            if (r1 != 0) goto L4f
            if (r3 == 0) goto L28
            androidx.fragment.app.Fragment r2 = X.C0PHE.LIZ(r3)
        L28:
            boolean r0 = LJIIJJI()
            if (r0 == 0) goto L53
            boolean r0 = LJJJJL(r4, r2)
            if (r0 == 0) goto L53
            boolean r0 = r2 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L45
            r1 = r2
            X.198i r1 = (X.InterfaceC214902198i) r1
            boolean r0 = r1.W1()
            if (r0 == 0) goto L45
            com.ss.android.ugc.aweme.search.common.utils.SAFHelper$SAFLifecycleCompatWrapper r2 = LJJIFFI(r1)
        L45:
            return r2
        L46:
            if (r1 != 0) goto L4f
            if (r3 == 0) goto L28
            androidx.fragment.app.Fragment r2 = X.C651580Ph6.LIZLLL(r3)
            goto L28
        L4f:
            r2 = r1
            goto L28
        L51:
            r1 = r2
            goto L1a
        L53:
            androidx.lifecycle.LifecycleOwner r2 = LJIJJLI(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJJ(android.view.View, X.19EG):androidx.lifecycle.LifecycleOwner");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LifecycleOwner LJJI(Fragment fragment, C19EG c19eg) {
        Fragment fragment2;
        ComponentCallbacks2 componentCallbacks2LJFF;
        Object objLIZ;
        InterfaceC651320Pgg interfaceC651320PggLIZLLL;
        Fragment fragmentLIZIZ;
        if (fragment != 0 && (interfaceC651320PggLIZLLL = C0PHF.LIZLLL(fragment)) != null && (fragmentLIZIZ = C0PHF.LIZIZ(interfaceC651320PggLIZLLL)) != null) {
            return fragmentLIZIZ;
        }
        if (LJIIJJI() && LJJJJL(c19eg, fragment)) {
            Fragment fragmentLIZIZ2 = null;
            if (c19eg != null && (objLIZ = C651580Ph6.LIZ(c19eg)) != null) {
                fragment2 = (Fragment) objLIZ;
            } else {
                fragment2 = null;
            }
            if (C1210904oV.LIZ()) {
                if (fragment != 0) {
                    fragmentLIZIZ2 = C0PHE.LIZIZ(fragment);
                }
            } else if (fragment != 0) {
                Context context = fragment.getContext();
                if (context != null) {
                    componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
                } else {
                    componentCallbacks2LJFF = null;
                }
                if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                    while (true) {
                        if (fragment instanceof InterfaceC214902198i) {
                            Object obj = (InterfaceC214902198i) fragment;
                            if (obj != null) {
                                fragmentLIZIZ2 = (Fragment) obj;
                            }
                        } else {
                            fragment = fragment.getParentFragment();
                            if (fragment == 0) {
                                break;
                            }
                        }
                    }
                }
            }
            if (fragment2 == null) {
                fragment2 = fragmentLIZIZ2;
            }
            if (fragment2 instanceof InterfaceC214902198i) {
                InterfaceC214902198i interfaceC214902198i = (InterfaceC214902198i) fragment2;
                if (interfaceC214902198i.W1()) {
                    return LJJIFFI(interfaceC214902198i);
                }
                return fragment2;
            }
            return fragment2;
        }
        return LJIJJLI(c19eg);
    }

    public static LifecycleOwner LJJII(View view, C19EG c19eg) {
        LifecycleOwner lifecycleOwnerLJIJI = LJIJI(view, c19eg);
        if ((lifecycleOwnerLJIJI instanceof SAFLifecycleCompatWrapper) && ((Number) C271070Ajp.LIZ.getValue()).intValue() == 0) {
            Object obj = ((SAFLifecycleCompatWrapper) lifecycleOwnerLJIJI).LL;
            if (obj != null) {
                return (Fragment) obj;
            }
            return null;
        }
        return lifecycleOwnerLJIJI;
    }

    public static FragmentManager LJJIIJ(View view, C19EG c19eg) {
        FragmentManager fragmentManagerLJIIJ;
        Fragment fragmentLIZIZ;
        InterfaceC651320Pgg interfaceC651320PggLIZJ = C0PHF.LIZJ(view);
        if (interfaceC651320PggLIZJ != null && (fragmentLIZIZ = C0PHF.LIZIZ(interfaceC651320PggLIZJ)) != null) {
            return fragmentLIZIZ.getChildFragmentManager();
        }
        if (C663640Q1i.LIZ() && LJJJJL(c19eg, C651580Ph6.LIZLLL(view))) {
            if (C1210904oV.LIZ()) {
                Fragment fragmentLIZ = C0PHE.LIZ(view);
                if (fragmentLIZ == null || (fragmentManagerLJIIJ = fragmentLIZ.getChildFragmentManager()) == null) {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                fragmentManagerLJIIJ = SAFExtensionKt.LJIIJ(view);
                if (fragmentManagerLJIIJ == null) {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            return fragmentManagerLJIIJ;
        }
        return c19eg.getSupportFragmentManager();
    }

    public static FragmentManager LJJIIJZLJL(Fragment fragment, C19EG c19eg) {
        Fragment fragmentLIZIZ;
        Fragment fragmentLIZIZ2;
        InterfaceC651320Pgg interfaceC651320PggLIZLLL = C0PHF.LIZLLL(fragment);
        if (interfaceC651320PggLIZLLL != null && (fragmentLIZIZ2 = C0PHF.LIZIZ(interfaceC651320PggLIZLLL)) != null) {
            return fragmentLIZIZ2.getChildFragmentManager();
        }
        if (C1210904oV.LIZ() && (fragmentLIZIZ = C0PHE.LIZIZ(fragment)) != null) {
            fragment = fragmentLIZIZ;
        }
        if (C663640Q1i.LIZ() && LJJJJL(c19eg, fragment)) {
            return SAFExtensionKt.LJIJJLI(fragment, false, null);
        }
        return c19eg.getSupportFragmentManager();
    }

    public static LifecycleOwner LJJIIZ(Fragment fragment, C19EG c19eg) {
        Fragment fragment2;
        Fragment fragmentLIZLLL;
        Object obj;
        Fragment fragmentLIZIZ;
        InterfaceC651320Pgg interfaceC651320PggLIZLLL = C0PHF.LIZLLL(fragment);
        if (interfaceC651320PggLIZLLL != null && (fragmentLIZIZ = C0PHF.LIZIZ(interfaceC651320PggLIZLLL)) != null) {
            return fragmentLIZIZ;
        }
        if (C07H4.LIZ() && LJJJJL(c19eg, fragment)) {
            Object objLIZ = C651580Ph6.LIZ(c19eg);
            if (objLIZ != null) {
                fragment2 = (Fragment) objLIZ;
            } else {
                fragment2 = null;
            }
            if (C1210904oV.LIZ()) {
                fragmentLIZLLL = C0PHE.LIZIZ(fragment);
            } else {
                fragmentLIZLLL = SAFExtensionKt.LIZLLL(fragment);
            }
            if (fragment2 != null) {
                obj = fragment2;
            } else {
                obj = fragmentLIZLLL;
            }
            if (obj instanceof InterfaceC214902198i) {
                InterfaceC214902198i interfaceC214902198i = (InterfaceC214902198i) obj;
                if (interfaceC214902198i.W1()) {
                    return LJJIFFI(interfaceC214902198i);
                }
            }
            if (fragment2 != null) {
                return fragment2;
            }
            Fragment fragment3 = fragmentLIZLLL;
            if (fragmentLIZLLL != null) {
                return fragment3;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        return c19eg;
    }

    public static Fragment LJJIIZI(View view, C19EG c19eg) throws Throwable {
        Fragment fragment;
        Object objLIZ;
        InterfaceC651320Pgg interfaceC651320PggLIZJ;
        Fragment fragmentLIZIZ;
        if (view != null && (interfaceC651320PggLIZJ = C0PHF.LIZJ(view)) != null && (fragmentLIZIZ = C0PHF.LIZIZ(interfaceC651320PggLIZJ)) != null) {
            return fragmentLIZIZ;
        }
        Fragment fragmentLIZLLL = null;
        if (c19eg != null && (objLIZ = C651580Ph6.LIZ(c19eg)) != null) {
            fragment = (Fragment) objLIZ;
        } else {
            fragment = null;
        }
        if (C1210904oV.LIZ()) {
            if (fragment == null) {
                if (view != null) {
                    fragmentLIZLLL = C0PHE.LIZ(view);
                }
                fragment = fragmentLIZLLL;
            }
        } else if (fragment == null) {
            if (view != null) {
                fragmentLIZLLL = C651580Ph6.LIZLLL(view);
            }
            fragment = fragmentLIZLLL;
        }
        if (LJIIJJI() && LJJJJL(c19eg, fragment)) {
            return fragment;
        }
        return LJJJ(c19eg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Fragment LJJIJ(Fragment fragment, C19EG c19eg) {
        Fragment fragment2;
        ComponentCallbacks2 componentCallbacks2LJFF;
        Object objLIZ;
        InterfaceC651320Pgg interfaceC651320PggLIZLLL;
        Fragment fragmentLIZIZ;
        if (fragment != 0 && (interfaceC651320PggLIZLLL = C0PHF.LIZLLL(fragment)) != null && (fragmentLIZIZ = C0PHF.LIZIZ(interfaceC651320PggLIZLLL)) != null) {
            return fragmentLIZIZ;
        }
        if (LJIIJJI() && LJJJJL(c19eg, fragment)) {
            if (c19eg != null && (objLIZ = C651580Ph6.LIZ(c19eg)) != null) {
                fragment2 = (Fragment) objLIZ;
            } else {
                fragment2 = null;
            }
            if (C1210904oV.LIZ()) {
                if (fragment2 == null) {
                    if (fragment == 0) {
                        return null;
                    }
                    return C0PHE.LIZIZ(fragment);
                }
            } else if (fragment2 == null) {
                if (fragment == 0) {
                    return null;
                }
                Context context = fragment.getContext();
                if (context != null) {
                    componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
                } else {
                    componentCallbacks2LJFF = null;
                }
                if (C294780Bgy.LIZ()) {
                    if (!(componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                        return null;
                    }
                } else if (!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) {
                    return null;
                }
                while (!(fragment instanceof InterfaceC214902198i)) {
                    fragment = fragment.getParentFragment();
                    if (fragment == 0) {
                        return null;
                    }
                }
                Object obj = (InterfaceC214902198i) fragment;
                if (obj == null) {
                    return null;
                }
                return (Fragment) obj;
            }
            return fragment2;
        }
        return LJJJ(c19eg);
    }

    public static Integer LJJIJIIJI(InterfaceC214902198i interfaceC214902198i, Activity activity) {
        int iHashCode;
        Object objLJJJ;
        C19EG c19eg;
        if (LJIIJJI() && LJJJJLL(interfaceC214902198i, activity)) {
            if (interfaceC214902198i == null) {
                if (activity instanceof C19EG) {
                    c19eg = (C19EG) activity;
                } else {
                    c19eg = null;
                }
                objLJJJ = LJJJ(c19eg);
            } else {
                boolean zW1 = interfaceC214902198i.W1();
                objLJJJ = interfaceC214902198i;
                if (zW1) {
                    if (interfaceC214902198i != null) {
                        iHashCode = interfaceC214902198i.hashCode();
                    } else {
                        iHashCode = -1;
                    }
                    return Integer.valueOf(iHashCode + LIZIZ);
                }
            }
            if (objLJJJ == null) {
                return null;
            }
            return Integer.valueOf(objLJJJ.hashCode());
        }
        LJJJJLL(interfaceC214902198i, activity);
        if (activity == null) {
            return null;
        }
        return Integer.valueOf(activity.hashCode());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Integer LJJIJIIJIL(Activity activity, View view) throws Throwable {
        C19EG c19eg;
        C19EG c19eg2;
        int iHashCode;
        int iHashCode2;
        boolean z = activity instanceof C19EG;
        if (z) {
            c19eg = (C19EG) activity;
        } else {
            c19eg = null;
        }
        Fragment fragmentLJJIIZI = LJJIIZI(view, c19eg);
        if (LJIIJJI() && LJJJJL(activity, fragmentLJJIIZI)) {
            if (fragmentLJJIIZI instanceof InterfaceC214902198i) {
                if (((InterfaceC214902198i) fragmentLJJIIZI).W1()) {
                    iHashCode2 = fragmentLJJIIZI.hashCode() + LIZIZ;
                } else {
                    iHashCode2 = fragmentLJJIIZI.hashCode();
                }
                return Integer.valueOf(iHashCode2);
            }
            if (fragmentLJJIIZI != 0) {
                iHashCode = fragmentLJJIIZI.hashCode();
            } else {
                if (z) {
                    c19eg2 = (C19EG) activity;
                } else {
                    c19eg2 = null;
                }
                Fragment fragmentLJJJ = LJJJ(c19eg2);
                if (fragmentLJJJ == null) {
                    return null;
                }
                iHashCode = fragmentLJJJ.hashCode();
            }
            return Integer.valueOf(iHashCode);
        }
        LJJJJL(activity, fragmentLJJIIZI);
        if (activity == null) {
            return null;
        }
        return Integer.valueOf(activity.hashCode());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Integer LJJIJIL(Fragment fragment, C19EG c19eg) throws Throwable {
        int iHashCode;
        Fragment fragmentLJJIJ = LJJIJ(fragment, c19eg);
        if (LJIIJJI() && LJJJJL(c19eg, fragmentLJJIJ)) {
            boolean z = fragmentLJJIJ instanceof InterfaceC214902198i;
            Fragment fragment2 = fragmentLJJIJ;
            if (z) {
                if (((InterfaceC214902198i) fragmentLJJIJ).W1()) {
                    iHashCode = fragmentLJJIJ.hashCode() + LIZIZ;
                } else {
                    iHashCode = fragmentLJJIJ.hashCode();
                }
                return Integer.valueOf(iHashCode);
            }
            if (fragmentLJJIJ == 0) {
                Fragment fragmentLJJJ = LJJJ(c19eg);
                fragment2 = fragmentLJJJ;
                if (fragmentLJJJ == null) {
                    return null;
                }
            }
            return Integer.valueOf(fragment2.hashCode());
        }
        LJJJJL(c19eg, fragmentLJJIJ);
        if (c19eg != null) {
            return Integer.valueOf(c19eg.hashCode());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.InterfaceC665370Q7z LJJIJL(android.view.View r8, X.C19EG r9) throws java.lang.Throwable {
        /*
            r7 = 0
            if (r8 == 0) goto L14
            X.0Pgg r0 = X.C0PHF.LIZJ(r8)
            if (r0 == 0) goto L14
            androidx.fragment.app.Fragment r0 = X.C0PHF.LIZIZ(r0)
            if (r0 == 0) goto L14
            X.0Q7z r0 = X.C1558360qeg.LJFF(r0, r7)
            return r0
        L14:
            X.198i r1 = X.C651580Ph6.LIZ(r9)
            if (r1 == 0) goto L76
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
        L1c:
            boolean r0 = X.C1210904oV.LIZ()
            if (r0 == 0) goto L6b
            if (r1 != 0) goto L2a
            if (r8 == 0) goto L74
            androidx.fragment.app.Fragment r1 = X.C0PHE.LIZ(r8)
        L2a:
            boolean r0 = X.C07H5.LIZ()
            if (r0 == 0) goto L48
            boolean r0 = LJJJJL(r9, r1)
            if (r0 == 0) goto L48
            if (r1 == 0) goto L3d
            X.0Q7z r7 = X.C1558360qeg.LJFF(r1, r7)
        L3c:
            return r7
        L3d:
            androidx.fragment.app.Fragment r0 = LJJJ(r9)
            if (r0 == 0) goto L3c
            X.0Q7z r7 = X.C1558360qeg.LJFF(r0, r7)
            return r7
        L48:
            java.lang.Class<com.ss.android.ugc.aweme.IDetailFeedSafService> r2 = com.ss.android.ugc.aweme.IDetailFeedSafService.class
            r3 = 0
            r6 = 14
            r4 = r3
            r5 = r3
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r2, r3, r4, r5, r6, r7)
            com.ss.android.ugc.aweme.IDetailFeedSafService r0 = (com.ss.android.ugc.aweme.IDetailFeedSafService) r0
            if (r0 == 0) goto L64
            androidx.fragment.app.Fragment r0 = r0.LIZLLL(r1)
            if (r0 == 0) goto L64
            if (r1 == 0) goto L3c
            X.0Q7z r7 = X.C1558360qeg.LJFF(r1, r7)
            return r7
        L64:
            if (r9 == 0) goto L3c
            X.0Q7z r7 = X.C1558360qeg.LJI(r9, r7)
            return r7
        L6b:
            if (r1 != 0) goto L2a
            if (r8 == 0) goto L74
            androidx.fragment.app.Fragment r1 = X.C651580Ph6.LIZLLL(r8)
            goto L2a
        L74:
            r1 = r7
            goto L2a
        L76:
            r1 = r7
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJJIJL(android.view.View, X.19EG):X.0Q7z");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.InterfaceC665370Q7z LJJIJLIJ(androidx.fragment.app.Fragment r4, X.C19EG r5) throws java.lang.Throwable {
        /*
            r3 = 0
            if (r4 == 0) goto L14
            X.0Pgg r0 = X.C0PHF.LIZLLL(r4)
            if (r0 == 0) goto L14
            androidx.fragment.app.Fragment r0 = X.C0PHF.LIZIZ(r0)
            if (r0 == 0) goto L14
            X.0Q7z r0 = X.C1558360qeg.LJFF(r0, r3)
            return r0
        L14:
            boolean r0 = X.C07H5.LIZ()
            if (r0 == 0) goto L94
            boolean r0 = LJJJJL(r5, r4)
            if (r0 == 0) goto L94
            X.198i r2 = X.C651580Ph6.LIZ(r5)
            if (r2 == 0) goto L92
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
        L28:
            boolean r0 = X.C1210904oV.LIZ()
            if (r0 == 0) goto L49
            if (r4 == 0) goto L3b
            androidx.fragment.app.Fragment r0 = X.C0PHE.LIZIZ(r4)
            if (r0 == 0) goto L3b
        L36:
            X.0Q7z r3 = X.C1558360qeg.LJFF(r0, r3)
        L3a:
            return r3
        L3b:
            if (r2 == 0) goto L42
            X.0Q7z r3 = X.C1558360qeg.LJFF(r2, r3)
            return r3
        L42:
            androidx.fragment.app.Fragment r0 = LJJJ(r5)
            if (r0 == 0) goto L3a
            goto L36
        L49:
            if (r4 == 0) goto L5f
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L85
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        L55:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L66
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L75
        L5f:
            if (r2 == 0) goto L87
            X.0Q7z r3 = X.C1558360qeg.LJFF(r2, r3)
            return r3
        L66:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L5f
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L75
            goto L5f
        L73:
            if (r4 == 0) goto L5f
        L75:
            boolean r0 = r4 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L80
            X.198i r4 = (X.InterfaceC214902198i) r4
            if (r4 == 0) goto L5f
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            goto L8d
        L80:
            androidx.fragment.app.Fragment r4 = r4.getParentFragment()
            goto L73
        L85:
            r1 = r3
            goto L55
        L87:
            androidx.fragment.app.Fragment r4 = LJJJ(r5)
            if (r4 == 0) goto L3a
        L8d:
            X.0Q7z r3 = X.C1558360qeg.LJFF(r4, r3)
            return r3
        L92:
            r2 = r3
            goto L28
        L94:
            if (r5 == 0) goto L3a
            X.0Q7z r3 = X.C1558360qeg.LJI(r5, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJJIJLIJ(androidx.fragment.app.Fragment, X.19EG):X.0Q7z");
    }

    public static InterfaceC665370Q7z LJJIL(Fragment fragment, C19EG c19eg) throws Throwable {
        Fragment fragment2;
        C0PE2 c0pe2LJFF;
        Fragment fragmentLIZ;
        if (fragment != null && (c0pe2LJFF = C0PHF.LJFF(fragment)) != null && (fragmentLIZ = C0PHF.LIZ(c0pe2LJFF)) != null) {
            return C1558360qeg.LJFF(fragmentLIZ, null);
        }
        if (C1210904oV.LIZ()) {
            if (fragment != null) {
                fragment = C0PHE.LIZIZ(fragment);
            } else {
                fragment = null;
            }
        }
        if (LJIIJJI() && LJJJJL(c19eg, fragment)) {
            Object objLIZ = C651580Ph6.LIZ(c19eg);
            if (objLIZ != null) {
                fragment2 = (Fragment) objLIZ;
            } else {
                fragment2 = null;
            }
            if (fragment == null) {
                if (fragment2 != null) {
                    return C1558360qeg.LJFF(fragment2, null);
                }
                fragment = LJJJ(c19eg);
                if (fragment == null) {
                    return null;
                }
            }
            return C1558360qeg.LJFF(fragment, null);
        }
        if (C07H5.LIZ() && LJJJJL(c19eg, fragment)) {
            Fragment fragmentLJJJ = LJJJ(c19eg);
            if (fragmentLJJJ == null) {
                return null;
            }
            return C1558360qeg.LJFF(fragmentLJJJ, null);
        }
        if (c19eg == null) {
            return null;
        }
        return C1558360qeg.LJI(c19eg, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ISearchContextAbility LJJIZ(C19EG c19eg, InterfaceC214902198i interfaceC214902198i) {
        if (c19eg == null) {
            return null;
        }
        if (LJIIJJI() && (interfaceC214902198i instanceof C0PE2)) {
            return ((ISearchContextService) ServiceManager.get().getService(ISearchService.class)).A0((Fragment) interfaceC214902198i);
        }
        return ((ISearchContextService) ServiceManager.get().getService(ISearchService.class)).A0(c19eg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c A[PHI: r3
      0x006c: PHI (r3v2 X.198i) = (r3v1 X.198i), (r3v4 X.198i) binds: [B:38:0x006a, B:49:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJJJJI(androidx.fragment.app.Fragment r3, X.C19EG r4) throws java.lang.Throwable {
        /*
            X.0Pgg r0 = X.C0PHF.LIZLLL(r3)
            if (r0 == 0) goto Lb
            boolean r0 = r0.T0()
            return r0
        Lb:
            boolean r0 = X.C1835007Gq.LIZ()
            if (r0 == 0) goto L9f
            boolean r0 = LJJJJL(r4, r3)
            if (r0 == 0) goto L9f
            X.198i r1 = X.C651580Ph6.LIZ(r4)
            boolean r0 = X.C1210904oV.LIZ()
            r2 = 0
            if (r0 == 0) goto L4a
            if (r1 == 0) goto L36
            r2 = r1
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
        L27:
            boolean r0 = r2 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L8f
            boolean r0 = r2 instanceof X.C0PE2
            if (r0 == 0) goto L8f
            X.198i r2 = (X.InterfaceC214902198i) r2
            boolean r0 = X.C651580Ph6.LIZJ(r2)
            return r0
        L36:
            if (r3 == 0) goto L40
            androidx.fragment.app.Fragment r0 = X.C0PHE.LIZIZ(r3)
            if (r0 == 0) goto L40
            r2 = r0
            goto L27
        L40:
            X.198i r0 = LJJJI(r4)
            if (r0 == 0) goto L27
            r2 = r0
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            goto L27
        L4a:
            if (r1 == 0) goto L50
            r2 = r1
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            goto L27
        L50:
            if (r3 == 0) goto L66
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L8d
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        L5c:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L70
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L7f
        L66:
            X.198i r3 = LJJJI(r4)
            if (r3 == 0) goto L27
        L6c:
            r2 = r3
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            goto L27
        L70:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L66
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L7f
            goto L66
        L7d:
            if (r3 == 0) goto L66
        L7f:
            boolean r0 = r3 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L88
            X.198i r3 = (X.InterfaceC214902198i) r3
            if (r3 == 0) goto L66
            goto L6c
        L88:
            androidx.fragment.app.Fragment r3 = r3.getParentFragment()
            goto L7d
        L8d:
            r1 = r2
            goto L5c
        L8f:
            boolean r0 = r2 instanceof X.InterfaceC651320Pgg
            if (r0 == 0) goto L9a
            X.0Pgg r2 = (X.InterfaceC651320Pgg) r2
            boolean r0 = r2.T0()
            return r0
        L9a:
            boolean r0 = r4.isDestroyed()
            return r0
        L9f:
            boolean r0 = r4.isDestroyed()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJJJJI(androidx.fragment.app.Fragment, X.19EG):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f A[PHI: r4
      0x007f: PHI (r4v2 X.198i) = (r4v1 X.198i), (r4v4 X.198i) binds: [B:45:0x007d, B:56:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJJJJJ(androidx.fragment.app.Fragment r4, X.C19EG r5) throws java.lang.Throwable {
        /*
            X.0Pgg r0 = X.C0PHF.LIZLLL(r4)
            if (r0 == 0) goto Lb
            boolean r0 = r0.T0()
            return r0
        Lb:
            boolean r0 = X.C1835007Gq.LIZ()
            r3 = 1
            if (r0 == 0) goto La2
            boolean r0 = LJJJJL(r5, r4)
            if (r0 == 0) goto La2
            X.198i r1 = X.C651580Ph6.LIZ(r5)
            boolean r0 = X.C1210904oV.LIZ()
            r2 = 0
            if (r0 == 0) goto L5d
            if (r1 == 0) goto L49
            r2 = r1
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
        L28:
            boolean r0 = r2 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L37
            boolean r0 = r2 instanceof X.C0PE2
            if (r0 == 0) goto L37
            X.198i r2 = (X.InterfaceC214902198i) r2
            boolean r3 = X.C651580Ph6.LIZJ(r2)
        L36:
            return r3
        L37:
            boolean r0 = r2 instanceof X.InterfaceC651320Pgg
            if (r0 == 0) goto L42
            X.0Pgg r2 = (X.InterfaceC651320Pgg) r2
            boolean r3 = r2.T0()
            return r3
        L42:
            if (r5 == 0) goto L36
            boolean r3 = r5.isFinishing()
            return r3
        L49:
            if (r4 == 0) goto L53
            androidx.fragment.app.Fragment r0 = X.C0PHE.LIZIZ(r4)
            if (r0 == 0) goto L53
            r2 = r0
            goto L28
        L53:
            X.198i r0 = LJJJI(r5)
            if (r0 == 0) goto L28
            r2 = r0
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            goto L28
        L5d:
            if (r1 == 0) goto L63
            r2 = r1
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            goto L28
        L63:
            if (r4 == 0) goto L79
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto La0
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        L6f:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L83
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L92
        L79:
            X.198i r4 = LJJJI(r5)
            if (r4 == 0) goto L28
        L7f:
            r2 = r4
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            goto L28
        L83:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L79
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L92
            goto L79
        L90:
            if (r4 == 0) goto L79
        L92:
            boolean r0 = r4 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L9b
            X.198i r4 = (X.InterfaceC214902198i) r4
            if (r4 == 0) goto L79
            goto L7f
        L9b:
            androidx.fragment.app.Fragment r4 = r4.getParentFragment()
            goto L90
        La0:
            r1 = r2
            goto L6f
        La2:
            if (r5 == 0) goto L36
            boolean r3 = r5.isFinishing()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJJJJJ(androidx.fragment.app.Fragment, X.19EG):boolean");
    }

    public static boolean LJJJJL(Activity activity, Fragment fragment) {
        Object objLIZ;
        C19EG c19eg;
        ComponentCallbacks2 componentCallbacks2LJFF;
        C19EG c19eg2;
        InterfaceC651320Pgg interfaceC651320PggLIZLLL;
        if (fragment != null && (interfaceC651320PggLIZLLL = C0PHF.LIZLLL(fragment)) != null && C0PHF.LIZIZ(interfaceC651320PggLIZLLL) != null) {
            return true;
        }
        if (LJIIJJI()) {
            if (activity == null) {
                return false;
            }
            boolean z = activity instanceof C19EG;
            Object objLJIILLIIL = null;
            if (z) {
                objLIZ = C651580Ph6.LIZ(activity);
            } else {
                objLIZ = null;
            }
            if (C1210904oV.LIZ()) {
                if (fragment == null || (parentFragment = C0PHE.LIZIZ(fragment)) == null) {
                    if (z && (c19eg2 = (C19EG) activity) != null) {
                        objLJIILLIIL = SAFExtensionKt.LJIILLIIL(c19eg2);
                    }
                } else {
                    objLJIILLIIL = parentFragment;
                }
            } else {
                if (fragment != null) {
                    Context context = fragment.getContext();
                    if (context != null) {
                        componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
                    } else {
                        componentCallbacks2LJFF = null;
                    }
                    if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                        Fragment parentFragment = fragment;
                        while (!(parentFragment instanceof InterfaceC214902198i)) {
                            parentFragment = parentFragment.getParentFragment();
                            if (parentFragment != null) {
                            }
                        }
                        objLJIILLIIL = parentFragment;
                    }
                }
                if (z && (c19eg = (C19EG) activity) != null) {
                    objLJIILLIIL = SAFExtensionKt.LJIILLIIL(c19eg);
                }
            }
            if (objLIZ == null) {
                objLIZ = objLJIILLIIL;
            }
            if ((fragment instanceof C0PE2) || (objLIZ instanceof C0PE2) || (activity instanceof InterfaceC641270PDh)) {
                return true;
            }
            return false;
        }
        return activity instanceof InterfaceC641270PDh;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJJJJLI(X.C19EG r5, android.view.View r6) {
        /*
            X.0Pgg r0 = X.C0PHF.LIZJ(r6)
            r4 = 1
            if (r0 == 0) goto Le
            androidx.fragment.app.Fragment r0 = X.C0PHF.LIZIZ(r0)
            if (r0 == 0) goto Le
            return r4
        Le:
            boolean r0 = LJIIJJI()
            if (r0 == 0) goto Lc5
            r0 = 0
            if (r5 != 0) goto L18
            return r0
        L18:
            X.198i r1 = X.C651580Ph6.LIZ(r5)
            boolean r0 = X.C1210904oV.LIZ()
            r3 = 0
            if (r0 == 0) goto L42
            if (r1 == 0) goto L30
            r3 = r1
        L26:
            boolean r0 = r3 instanceof X.C0PE2
            if (r0 != 0) goto L2f
            boolean r0 = r5 instanceof X.InterfaceC641270PDh
            if (r0 != 0) goto L2f
            r4 = 0
        L2f:
            return r4
        L30:
            if (r6 == 0) goto L3a
            androidx.fragment.app.Fragment r0 = X.C0PHE.LIZ(r6)
            if (r0 == 0) goto L3a
            r3 = r0
            goto L26
        L3a:
            X.198i r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJIILLIIL(r5)
            if (r0 == 0) goto L26
            r3 = r0
            goto L26
        L42:
            if (r1 == 0) goto L46
            r3 = r1
            goto L26
        L46:
            if (r6 == 0) goto L76
            android.content.Context r0 = r6.getContext()
            X.0JEh r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJII(r0)
            if (r0 == 0) goto L5a
            X.198i r2 = r0.LIZLLL()
            if (r2 == 0) goto L5a
        L58:
            r3 = r2
            goto L26
        L5a:
            android.content.Context r0 = r6.getContext()
            android.app.Activity r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
            if (r0 == 0) goto L8b
            android.content.Context r0 = r6.getContext()
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L7e
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L8b
        L76:
            X.198i r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJIILLIIL(r5)
            if (r0 == 0) goto L26
            r3 = r0
            goto L26
        L7e:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L76
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L8b
            goto L76
        L8b:
            androidx.fragment.app.Fragment r2 = X.C946803n0.LIZ(r6)
            if (r2 == 0) goto L76
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto La6
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        L9b:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto La8
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto Lb7
            goto L76
        La6:
            r1 = r3
            goto L9b
        La8:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L76
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto Lb7
            goto L76
        Lb5:
            if (r2 == 0) goto L76
        Lb7:
            boolean r0 = r2 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto Lc0
            X.198i r2 = (X.InterfaceC214902198i) r2
            if (r2 == 0) goto L76
            goto L58
        Lc0:
            androidx.fragment.app.Fragment r2 = r2.getParentFragment()
            goto Lb5
        Lc5:
            boolean r0 = r5 instanceof X.InterfaceC641270PDh
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJJJJLI(X.19EG, android.view.View):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002a A[PHI: r1
      0x002a: PHI (r1v1 X.198i) = (r1v0 X.198i), (r1v2 X.198i), (r1v2 X.198i) binds: [B:8:0x000e, B:11:0x0015, B:13:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJJJJLL(X.InterfaceC214902198i r3, android.app.Activity r4) {
        /*
            boolean r0 = LJIIJJI()
            if (r0 == 0) goto L2c
            r2 = 0
            if (r4 != 0) goto La
            return r2
        La:
            X.198i r1 = X.C651580Ph6.LIZ(r4)
            if (r1 != 0) goto L2a
            if (r3 != 0) goto L20
            boolean r0 = r4 instanceof X.C19EG
            r1 = 0
            if (r0 == 0) goto L2a
            r0 = r4
            X.19EG r0 = (X.C19EG) r0
            if (r0 == 0) goto L2a
            X.198i r3 = com.ss.android.ugc.aweme.SAFExtensionKt.LJIILLIIL(r0)
        L20:
            boolean r0 = r3 instanceof X.C0PE2
            if (r0 != 0) goto L28
            boolean r0 = r4 instanceof X.InterfaceC641270PDh
            if (r0 == 0) goto L29
        L28:
            r2 = 1
        L29:
            return r2
        L2a:
            r3 = r1
            goto L20
        L2c:
            boolean r0 = r4 instanceof X.InterfaceC641270PDh
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJJJJLL(X.198i, android.app.Activity):boolean");
    }

    public static void LJJJJZI(C19EG c19eg, InterfaceC214902198i interfaceC214902198i) throws Throwable {
        if (LJIIJJI()) {
            Throwable th = new Throwable("Invoke activity");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("search_saf3: do not use activity to get RootFragment! ");
            sbLIZ.append(C13SZ.LIZIZ(th));
            C1AF0.LJFF(th, C2188811AlT.LIZIZ(sbLIZ));
            if (((Boolean) LJI.getValue()).booleanValue() && LJJJJLL(interfaceC214902198i, c19eg)) {
                throw th;
            }
        }
    }
}

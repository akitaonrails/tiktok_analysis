package com.ss.android.ugc.aweme;

import X.C0R1H;
import X.C13X1;
import X.C1447800nmM;
import X.C198H;
import X.C19EG;
import X.C20629915o1;
import X.C20674615vE;
import X.C21497719Bf;
import X.C2187701Ajg;
import X.C2214251BlP;
import X.C2214291BlT;
import X.C294740Bgu;
import X.C294780Bgy;
import X.C488600JEc;
import X.C488650JEh;
import X.C665300Q7s;
import X.C786410Ut5;
import X.C946803n0;
import X.InterfaceC20622815ms;
import X.InterfaceC20630715o9;
import X.InterfaceC214897198d;
import X.InterfaceC214902198i;
import X.InterfaceC2214261BlQ;
import X.InterfaceC488640JEg;
import Y.ARunnableS109S0100000_9;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class SAFExtensionKt {
    public static final Map<LifecycleOwner, C488600JEc> LIZ = Collections.synchronizedMap(new WeakHashMap());

    /* JADX WARN: Multi-variable type inference failed */
    public static final Fragment LIZJ(View view) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        InterfaceC214902198i interfaceC214902198iLIZLLL;
        C488650JEh c488650JEhLJII = LJII(view.getContext());
        if (c488650JEhLJII == null || (interfaceC214902198iLIZLLL = c488650JEhLJII.LIZLLL()) == null) {
            if (LJFF(view.getContext()) != null) {
                ComponentCallbacks2 componentCallbacks2LJFF2 = LJFF(view.getContext());
                if (C294780Bgy.LIZ()) {
                    if (!(componentCallbacks2LJFF2 instanceof InterfaceC214897198d)) {
                        return null;
                    }
                } else if (!(componentCallbacks2LJFF2 instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF2).getEnableSAF()) {
                    return null;
                }
            }
            Fragment fragmentLIZ = C946803n0.LIZ(view);
            if (fragmentLIZ == 0) {
                return null;
            }
            Context context = fragmentLIZ.getContext();
            if (context != null) {
                componentCallbacks2LJFF = LJFF(context);
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
            while (!(fragmentLIZ instanceof InterfaceC214902198i)) {
                fragmentLIZ = fragmentLIZ.getParentFragment();
                if (fragmentLIZ == 0) {
                    return null;
                }
            }
            interfaceC214902198iLIZLLL = (InterfaceC214902198i) fragmentLIZ;
            if (interfaceC214902198iLIZLLL == null) {
                return null;
            }
        }
        return (Fragment) interfaceC214902198iLIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0029 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.fragment.app.Fragment LIZLLL(androidx.fragment.app.Fragment r3) {
        /*
            android.content.Context r0 = r3.getContext()
            r2 = 0
            if (r0 == 0) goto L36
            android.app.Activity r1 = LJFF(r0)
        Lb:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L16
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L25
        L15:
            return r2
        L16:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L15
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L25
            return r2
        L23:
            if (r3 == 0) goto L15
        L25:
            boolean r0 = r3 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L31
            X.198i r3 = (X.InterfaceC214902198i) r3
            if (r3 == 0) goto L15
            r2 = r3
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            return r2
        L31:
            androidx.fragment.app.Fragment r3 = r3.getParentFragment()
            goto L23
        L36:
            r1 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.SAFExtensionKt.LIZLLL(androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final LifecycleOwner LJ(C19EG c19eg) {
        InterfaceC20622815ms interfaceC20622815ms;
        C198H c198hLIZLLL;
        C198H c198hLIZLLL2;
        Object obj;
        Object objLJIILLIIL = LJIILLIIL(c19eg);
        if (objLJIILLIIL != null) {
            return (Fragment) objLJIILLIIL;
        }
        if (C294740Bgu.LIZ() && (!C294780Bgy.LIZ() ? !(!(c19eg instanceof InterfaceC214897198d) || !((InterfaceC214897198d) c19eg).getEnableSAF()) : (c19eg instanceof InterfaceC214897198d)) && (c198hLIZLLL2 = C20629915o1.LIZLLL((InterfaceC20622815ms) c19eg)) != null) {
            Object scene = c198hLIZLLL2.getScene();
            if ((scene instanceof InterfaceC20622815ms) && (obj = (InterfaceC20622815ms) scene) != null) {
                return (Scene) obj;
            }
        }
        if (!(c19eg instanceof InterfaceC214897198d) || (interfaceC20622815ms = (InterfaceC20622815ms) c19eg) == null || (c198hLIZLLL = C20629915o1.LIZLLL(interfaceC20622815ms)) == null) {
            return null;
        }
        return c198hLIZLLL.getScene();
    }

    public static final Activity LJFF(Context context) {
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C488650JEh LJII(Context context) {
        Context baseContext;
        if (context instanceof C488650JEh) {
            return (C488650JEh) context;
        }
        if (context instanceof InterfaceC488640JEg) {
            return ((InterfaceC488640JEg) context).LIZ();
        }
        if (!(context instanceof ContextWrapper) || (baseContext = ((ContextWrapper) context).getBaseContext()) == null) {
            return null;
        }
        return LJII(baseContext);
    }

    public static final InterfaceC214902198i LJIIIIZZ(Context context) {
        C488650JEh c488650JEhLJII = LJII(context);
        if (c488650JEhLJII != null) {
            return c488650JEhLJII.LIZLLL();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if ((r1 instanceof X.InterfaceC214897198d) == false) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.InterfaceC214902198i LJIIIZ(androidx.fragment.app.Fragment r3) {
        /*
            android.content.Context r0 = r3.getContext()
            r2 = 0
            if (r0 == 0) goto L23
            android.app.Activity r1 = LJFF(r0)
        Lb:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L16
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L25
        L15:
            return r2
        L16:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L15
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L25
            return r2
        L23:
            r1 = r2
            goto Lb
        L25:
            boolean r0 = r3 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L2c
            X.198i r3 = (X.InterfaceC214902198i) r3
            return r3
        L2c:
            androidx.fragment.app.Fragment r3 = r3.getParentFragment()
            if (r3 != 0) goto L25
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.SAFExtensionKt.LJIIIZ(androidx.fragment.app.Fragment):X.198i");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final FragmentManager LJIIJ(View view) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        Object objLIZLLL;
        C488650JEh c488650JEhLJII = LJII(view.getContext());
        if (c488650JEhLJII == null || (objLIZLLL = c488650JEhLJII.LIZLLL()) == null) {
            if (LJFF(view.getContext()) != null) {
                ComponentCallbacks2 componentCallbacks2LJFF2 = LJFF(view.getContext());
                if (C294780Bgy.LIZ()) {
                    if (!(componentCallbacks2LJFF2 instanceof InterfaceC214897198d)) {
                        return null;
                    }
                } else if (!(componentCallbacks2LJFF2 instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF2).getEnableSAF()) {
                    return null;
                }
            }
            Fragment fragmentLIZ = C946803n0.LIZ(view);
            if (fragmentLIZ == 0) {
                return null;
            }
            Context context = fragmentLIZ.getContext();
            if (context != null) {
                componentCallbacks2LJFF = LJFF(context);
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
            while (!(fragmentLIZ instanceof InterfaceC214902198i)) {
                fragmentLIZ = fragmentLIZ.getParentFragment();
                if (fragmentLIZ == 0) {
                    return null;
                }
            }
            objLIZLLL = (InterfaceC214902198i) fragmentLIZ;
            if (objLIZLLL == null) {
                return null;
            }
        }
        return ((Fragment) objLIZLLL).getChildFragmentManager();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0029 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.fragment.app.FragmentManager LJIIJJI(androidx.fragment.app.Fragment r3) {
        /*
            android.content.Context r0 = r3.getContext()
            r2 = 0
            if (r0 == 0) goto L39
            android.app.Activity r1 = LJFF(r0)
        Lb:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L16
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L25
        L15:
            return r2
        L16:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L15
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L25
            return r2
        L23:
            if (r3 == 0) goto L15
        L25:
            boolean r0 = r3 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L34
            X.198i r3 = (X.InterfaceC214902198i) r3
            if (r3 == 0) goto L15
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            androidx.fragment.app.FragmentManager r2 = r3.getChildFragmentManager()
            return r2
        L34:
            androidx.fragment.app.Fragment r3 = r3.getParentFragment()
            goto L23
        L39:
            r1 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.SAFExtensionKt.LJIIJJI(androidx.fragment.app.Fragment):androidx.fragment.app.FragmentManager");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C488600JEc LJIIL(Activity activity) {
        if (activity instanceof C19EG) {
            if (C294780Bgy.LIZ()) {
                if (!(activity instanceof InterfaceC214897198d)) {
                    return null;
                }
            } else if (!(activity instanceof InterfaceC214897198d) || !((InterfaceC214897198d) activity).getEnableSAF()) {
                return null;
            }
            return LJI((LifecycleOwner) activity, (C19EG) activity);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0011, code lost:
    
        if ((r1 instanceof X.InterfaceC214897198d) == false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C488600JEc LJIILIIL(androidx.fragment.app.Fragment r4) {
        /*
            r3 = 0
            if (r4 == 0) goto L68
            X.19EG r1 = r4.getActivity()
            if (r1 == 0) goto L68
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L14
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L21
        L13:
            return r3
        L14:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L13
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L21
            return r3
        L21:
            X.01GW r0 = X.C258330AAl.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5f
            boolean r0 = r4 instanceof X.InterfaceC214902198i
            if (r0 != 0) goto L34
            return r3
        L34:
            r0 = r4
            X.198i r0 = (X.InterfaceC214902198i) r0
            com.ss.android.ugc.aweme.SAFFragmentRootScene r1 = r0.ib()
            if (r1 == 0) goto L5e
            android.app.Activity r0 = r1.mActivity
            if (r0 == 0) goto L5e
            android.content.Context r2 = r1.getSceneContext()
            if (r2 == 0) goto L5e
            boolean r0 = r2 instanceof X.C488650JEh
            if (r0 != 0) goto L4c
            return r3
        L4c:
            X.19EG r0 = r4.requireActivity()
            X.0JEc r1 = LJI(r4, r0)
            if (r1 == 0) goto L5e
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.LLILZIL = r0
            return r1
        L5e:
            return r3
        L5f:
            X.19EG r0 = r4.requireActivity()
            X.0JEc r0 = LJI(r4, r0)
            return r0
        L68:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.SAFExtensionKt.LJIILIIL(androidx.fragment.app.Fragment):X.0JEc");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC214902198i LJIILJJIL(Scene scene) {
        InterfaceC20630715o9 interfaceC20630715o9;
        if (!(scene instanceof InterfaceC20630715o9) || (interfaceC20630715o9 = (InterfaceC20630715o9) scene) == null) {
            return null;
        }
        return interfaceC20630715o9.F0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final FragmentManager LJIILL(C19EG c19eg) {
        Fragment fragment;
        boolean z = false;
        if (!C294780Bgy.LIZ() ? !(c19eg instanceof InterfaceC214897198d) || !((InterfaceC214897198d) c19eg).getEnableSAF() : !(c19eg instanceof InterfaceC214897198d)) {
            z = true;
        }
        if (z) {
            return null;
        }
        Object objLIZJ = C20629915o1.LIZJ((InterfaceC20622815ms) c19eg);
        if (!(objLIZJ instanceof Fragment) || (fragment = (Fragment) objLIZJ) == null) {
            return null;
        }
        return fragment.getChildFragmentManager();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC214902198i LJIILLIIL(C19EG c19eg) {
        if (C294780Bgy.LIZ()) {
            if (!(c19eg instanceof InterfaceC214897198d)) {
                return null;
            }
        } else if (!(c19eg instanceof InterfaceC214897198d) || !((InterfaceC214897198d) c19eg).getEnableSAF()) {
            return null;
        }
        return C20629915o1.LIZJ((InterfaceC20622815ms) c19eg);
    }

    public static final boolean LJIIZILJ(InterfaceC214902198i interfaceC214902198i) {
        SAFFragmentRootScene sAFFragmentRootSceneIb = interfaceC214902198i.ib();
        if (sAFFragmentRootSceneIb != null) {
            return sAFFragmentRootSceneIb.mViewDestroyed;
        }
        return false;
    }

    public static final boolean LJIJ(InterfaceC214902198i interfaceC214902198i) {
        NavigationScene navigationSceneLIZ;
        C21497719Bf c21497719BfLLLLLILLIL;
        if (!interfaceC214902198i.W1()) {
            return LJIIZILJ(interfaceC214902198i);
        }
        SAFFragmentRootScene sAFFragmentRootSceneIb = interfaceC214902198i.ib();
        if (sAFFragmentRootSceneIb == null || LJIIZILJ(interfaceC214902198i) || sAFFragmentRootSceneIb.mViewDestroyed || ((navigationSceneLIZ = C1447800nmM.LIZ(sAFFragmentRootSceneIb)) != null && (c21497719BfLLLLLILLIL = navigationSceneLIZ.LLLLLILLIL()) != null && c21497719BfLLLLLILLIL.LIZIZ.LIZLLL(sAFFragmentRootSceneIb) == C13X1.RELEASED)) {
            return true;
        }
        return false;
    }

    public static final void LJIJI(final InterfaceC2214261BlQ interfaceC2214261BlQ) {
        C2214291BlT.LIZ.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks(interfaceC2214261BlQ) { // from class: X.1BlP
            public final InterfaceC2214261BlQ LL;

            {
                this.LL = interfaceC2214261BlQ;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                AbstractC1387200mCc abstractC1387200mCc;
                InterfaceC2214261BlQ interfaceC2214261BlQ2 = this.LL;
                if (!C294780Bgy.LIZ() ? !(!(activity instanceof InterfaceC214897198d) || !((InterfaceC214897198d) activity).getEnableSAF()) : (activity instanceof InterfaceC214897198d)) {
                    if (((InterfaceC214897198d) activity).getUseRootFragmentForPageCallbacks()) {
                        return;
                    }
                }
                if (0 != 0) {
                    return;
                }
                C1397950mTx c1397950mTx = new C1397950mTx(activity);
                C520050KaR c520050KaR = new C520050KaR(c1397950mTx);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 == null || (abstractC1387200mCc = c520050KaR2.get()) == null) {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 == null || (abstractC1387200mCc = c520050KaR3.get()) == null) {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                                abstractC1387200mCc = c1397950mTx;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ2.LJ(abstractC1387200mCc);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                AbstractC1387200mCc abstractC1387200mCc;
                InterfaceC2214261BlQ interfaceC2214261BlQ2 = this.LL;
                if (!C294780Bgy.LIZ() ? !(!(activity instanceof InterfaceC214897198d) || !((InterfaceC214897198d) activity).getEnableSAF()) : (activity instanceof InterfaceC214897198d)) {
                    if (((InterfaceC214897198d) activity).getUseRootFragmentForPageCallbacks()) {
                        return;
                    }
                }
                if (0 != 0) {
                    return;
                }
                C1397950mTx c1397950mTx = new C1397950mTx(activity);
                C520050KaR c520050KaR = new C520050KaR(c1397950mTx);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 == null || (abstractC1387200mCc = c520050KaR2.get()) == null) {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 == null || (abstractC1387200mCc = c520050KaR3.get()) == null) {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                                abstractC1387200mCc = c1397950mTx;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ2.LIZIZ(abstractC1387200mCc);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPostDestroyed(Activity activity) {
                AbstractC1387200mCc abstractC1387200mCc;
                if (!C294780Bgy.LIZ() ? !(!(activity instanceof InterfaceC214897198d) || !((InterfaceC214897198d) activity).getEnableSAF()) : (activity instanceof InterfaceC214897198d)) {
                    if (((InterfaceC214897198d) activity).getUseRootFragmentForPageCallbacks()) {
                        return;
                    }
                }
                if (0 != 0) {
                    return;
                }
                C1397950mTx c1397950mTx = new C1397950mTx(activity);
                C520050KaR c520050KaR = new C520050KaR(c1397950mTx);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 == null || (abstractC1387200mCc = c520050KaR2.get()) == null) {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 == null || (abstractC1387200mCc = c520050KaR3.get()) == null) {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                                abstractC1387200mCc = c1397950mTx;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                C2214211BlL.LIZ(abstractC1387200mCc);
                this.LL.LJIJI(abstractC1387200mCc);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPostPaused(Activity activity) {
                AbstractC1387200mCc abstractC1387200mCc;
                InterfaceC2214261BlQ interfaceC2214261BlQ2 = this.LL;
                if (!C294780Bgy.LIZ() ? !(!(activity instanceof InterfaceC214897198d) || !((InterfaceC214897198d) activity).getEnableSAF()) : (activity instanceof InterfaceC214897198d)) {
                    if (((InterfaceC214897198d) activity).getUseRootFragmentForPageCallbacks()) {
                        return;
                    }
                }
                if (0 != 0) {
                    return;
                }
                C1397950mTx c1397950mTx = new C1397950mTx(activity);
                C520050KaR c520050KaR = new C520050KaR(c1397950mTx);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 == null || (abstractC1387200mCc = c520050KaR2.get()) == null) {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 == null || (abstractC1387200mCc = c520050KaR3.get()) == null) {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                                abstractC1387200mCc = c1397950mTx;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ2.LJIIIIZZ(abstractC1387200mCc);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPostResumed(Activity activity) {
                AbstractC1387200mCc abstractC1387200mCc;
                InterfaceC2214261BlQ interfaceC2214261BlQ2 = this.LL;
                if (!C294780Bgy.LIZ() ? !(!(activity instanceof InterfaceC214897198d) || !((InterfaceC214897198d) activity).getEnableSAF()) : (activity instanceof InterfaceC214897198d)) {
                    if (((InterfaceC214897198d) activity).getUseRootFragmentForPageCallbacks()) {
                        return;
                    }
                }
                if (0 != 0) {
                    return;
                }
                C1397950mTx c1397950mTx = new C1397950mTx(activity);
                C520050KaR c520050KaR = new C520050KaR(c1397950mTx);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 == null || (abstractC1387200mCc = c520050KaR2.get()) == null) {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 == null || (abstractC1387200mCc = c520050KaR3.get()) == null) {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                                abstractC1387200mCc = c1397950mTx;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ2.LJIILL(abstractC1387200mCc);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPostStarted(Activity activity) {
                AbstractC1387200mCc abstractC1387200mCc;
                InterfaceC2214261BlQ interfaceC2214261BlQ2 = this.LL;
                if (!C294780Bgy.LIZ() ? !(!(activity instanceof InterfaceC214897198d) || !((InterfaceC214897198d) activity).getEnableSAF()) : (activity instanceof InterfaceC214897198d)) {
                    if (((InterfaceC214897198d) activity).getUseRootFragmentForPageCallbacks()) {
                        return;
                    }
                }
                if (0 != 0) {
                    return;
                }
                C1397950mTx c1397950mTx = new C1397950mTx(activity);
                C520050KaR c520050KaR = new C520050KaR(c1397950mTx);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 == null || (abstractC1387200mCc = c520050KaR2.get()) == null) {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 == null || (abstractC1387200mCc = c520050KaR3.get()) == null) {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                                abstractC1387200mCc = c1397950mTx;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ2.LJIIIZ(abstractC1387200mCc);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPostStopped(Activity activity) {
                AbstractC1387200mCc abstractC1387200mCc;
                InterfaceC2214261BlQ interfaceC2214261BlQ2 = this.LL;
                if (!C294780Bgy.LIZ() ? !(!(activity instanceof InterfaceC214897198d) || !((InterfaceC214897198d) activity).getEnableSAF()) : (activity instanceof InterfaceC214897198d)) {
                    if (((InterfaceC214897198d) activity).getUseRootFragmentForPageCallbacks()) {
                        return;
                    }
                }
                if (0 != 0) {
                    return;
                }
                C1397950mTx c1397950mTx = new C1397950mTx(activity);
                C520050KaR c520050KaR = new C520050KaR(c1397950mTx);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 == null || (abstractC1387200mCc = c520050KaR2.get()) == null) {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 == null || (abstractC1387200mCc = c520050KaR3.get()) == null) {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                                abstractC1387200mCc = c1397950mTx;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ2.LJIJJLI(abstractC1387200mCc);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPreDestroyed(Activity activity) {
                AbstractC1387200mCc abstractC1387200mCc;
                InterfaceC2214261BlQ interfaceC2214261BlQ2 = this.LL;
                if (!C294780Bgy.LIZ() ? !(!(activity instanceof InterfaceC214897198d) || !((InterfaceC214897198d) activity).getEnableSAF()) : (activity instanceof InterfaceC214897198d)) {
                    if (((InterfaceC214897198d) activity).getUseRootFragmentForPageCallbacks()) {
                        return;
                    }
                }
                if (0 != 0) {
                    return;
                }
                C1397950mTx c1397950mTx = new C1397950mTx(activity);
                C520050KaR c520050KaR = new C520050KaR(c1397950mTx);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 == null || (abstractC1387200mCc = c520050KaR2.get()) == null) {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 == null || (abstractC1387200mCc = c520050KaR3.get()) == null) {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                                abstractC1387200mCc = c1397950mTx;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ2.LJFF(abstractC1387200mCc);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPrePaused(Activity activity) {
                AbstractC1387200mCc abstractC1387200mCc;
                InterfaceC2214261BlQ interfaceC2214261BlQ2 = this.LL;
                if (!C294780Bgy.LIZ() ? !(!(activity instanceof InterfaceC214897198d) || !((InterfaceC214897198d) activity).getEnableSAF()) : (activity instanceof InterfaceC214897198d)) {
                    if (((InterfaceC214897198d) activity).getUseRootFragmentForPageCallbacks()) {
                        return;
                    }
                }
                if (0 != 0) {
                    return;
                }
                C1397950mTx c1397950mTx = new C1397950mTx(activity);
                C520050KaR c520050KaR = new C520050KaR(c1397950mTx);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 == null || (abstractC1387200mCc = c520050KaR2.get()) == null) {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 == null || (abstractC1387200mCc = c520050KaR3.get()) == null) {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                                abstractC1387200mCc = c1397950mTx;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ2.LJIIJJI(abstractC1387200mCc);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPreResumed(Activity activity) {
                AbstractC1387200mCc abstractC1387200mCc;
                InterfaceC2214261BlQ interfaceC2214261BlQ2 = this.LL;
                if (!C294780Bgy.LIZ() ? !(!(activity instanceof InterfaceC214897198d) || !((InterfaceC214897198d) activity).getEnableSAF()) : (activity instanceof InterfaceC214897198d)) {
                    if (((InterfaceC214897198d) activity).getUseRootFragmentForPageCallbacks()) {
                        return;
                    }
                }
                if (0 != 0) {
                    return;
                }
                C1397950mTx c1397950mTx = new C1397950mTx(activity);
                C520050KaR c520050KaR = new C520050KaR(c1397950mTx);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 == null || (abstractC1387200mCc = c520050KaR2.get()) == null) {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 == null || (abstractC1387200mCc = c520050KaR3.get()) == null) {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                                abstractC1387200mCc = c1397950mTx;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ2.LJJ(abstractC1387200mCc);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPreStarted(Activity activity) {
                AbstractC1387200mCc abstractC1387200mCc;
                InterfaceC2214261BlQ interfaceC2214261BlQ2 = this.LL;
                if (!C294780Bgy.LIZ() ? !(!(activity instanceof InterfaceC214897198d) || !((InterfaceC214897198d) activity).getEnableSAF()) : (activity instanceof InterfaceC214897198d)) {
                    if (((InterfaceC214897198d) activity).getUseRootFragmentForPageCallbacks()) {
                        return;
                    }
                }
                if (0 != 0) {
                    return;
                }
                C1397950mTx c1397950mTx = new C1397950mTx(activity);
                C520050KaR c520050KaR = new C520050KaR(c1397950mTx);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 == null || (abstractC1387200mCc = c520050KaR2.get()) == null) {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 == null || (abstractC1387200mCc = c520050KaR3.get()) == null) {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                                abstractC1387200mCc = c1397950mTx;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ2.LJIJJ(abstractC1387200mCc);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPreStopped(Activity activity) {
                AbstractC1387200mCc abstractC1387200mCc;
                InterfaceC2214261BlQ interfaceC2214261BlQ2 = this.LL;
                if (!C294780Bgy.LIZ() ? !(!(activity instanceof InterfaceC214897198d) || !((InterfaceC214897198d) activity).getEnableSAF()) : (activity instanceof InterfaceC214897198d)) {
                    if (((InterfaceC214897198d) activity).getUseRootFragmentForPageCallbacks()) {
                        return;
                    }
                }
                if (0 != 0) {
                    return;
                }
                C1397950mTx c1397950mTx = new C1397950mTx(activity);
                C520050KaR c520050KaR = new C520050KaR(c1397950mTx);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 == null || (abstractC1387200mCc = c520050KaR2.get()) == null) {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 == null || (abstractC1387200mCc = c520050KaR3.get()) == null) {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                                abstractC1387200mCc = c1397950mTx;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ2.LJIL(abstractC1387200mCc);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                AbstractC1387200mCc abstractC1387200mCc;
                if (C2345409Gy.LIZ()) {
                    C2345409Gy.LIZIZ(new RunnableC2345109Gv(0, activity, this));
                    return;
                }
                InterfaceC2214261BlQ interfaceC2214261BlQ2 = this.LL;
                if (!C294780Bgy.LIZ() ? !(!(activity instanceof InterfaceC214897198d) || !((InterfaceC214897198d) activity).getEnableSAF()) : (activity instanceof InterfaceC214897198d)) {
                    if (((InterfaceC214897198d) activity).getUseRootFragmentForPageCallbacks()) {
                        return;
                    }
                }
                if (0 != 0) {
                    return;
                }
                C1397950mTx c1397950mTx = new C1397950mTx(activity);
                C520050KaR c520050KaR = new C520050KaR(c1397950mTx);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 == null || (abstractC1387200mCc = c520050KaR2.get()) == null) {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 == null || (abstractC1387200mCc = c520050KaR3.get()) == null) {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                                abstractC1387200mCc = c1397950mTx;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ2.LIZJ(abstractC1387200mCc);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
                AbstractC1387200mCc abstractC1387200mCc;
                InterfaceC2214261BlQ interfaceC2214261BlQ2 = this.LL;
                if (!C294780Bgy.LIZ() ? !(!(activity instanceof InterfaceC214897198d) || !((InterfaceC214897198d) activity).getEnableSAF()) : (activity instanceof InterfaceC214897198d)) {
                    if (((InterfaceC214897198d) activity).getUseRootFragmentForPageCallbacks()) {
                        return;
                    }
                }
                if (0 != 0) {
                    return;
                }
                C1397950mTx c1397950mTx = new C1397950mTx(activity);
                C520050KaR c520050KaR = new C520050KaR(c1397950mTx);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 == null || (abstractC1387200mCc = c520050KaR2.get()) == null) {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 == null || (abstractC1387200mCc = c520050KaR3.get()) == null) {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                                abstractC1387200mCc = c1397950mTx;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ2.LJIILJJIL(abstractC1387200mCc);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
                AbstractC1387200mCc abstractC1387200mCc;
                InterfaceC2214261BlQ interfaceC2214261BlQ2 = this.LL;
                if (!C294780Bgy.LIZ() ? !(!(activity instanceof InterfaceC214897198d) || !((InterfaceC214897198d) activity).getEnableSAF()) : (activity instanceof InterfaceC214897198d)) {
                    if (((InterfaceC214897198d) activity).getUseRootFragmentForPageCallbacks()) {
                        return;
                    }
                }
                if (0 != 0) {
                    return;
                }
                C1397950mTx c1397950mTx = new C1397950mTx(activity);
                C520050KaR c520050KaR = new C520050KaR(c1397950mTx);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 == null || (abstractC1387200mCc = c520050KaR2.get()) == null) {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 == null || (abstractC1387200mCc = c520050KaR3.get()) == null) {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                                abstractC1387200mCc = c1397950mTx;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ2.LIZLLL(abstractC1387200mCc);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                AbstractC1387200mCc abstractC1387200mCc;
                InterfaceC2214261BlQ interfaceC2214261BlQ2 = this.LL;
                if (!C294780Bgy.LIZ() ? !(!(activity instanceof InterfaceC214897198d) || !((InterfaceC214897198d) activity).getEnableSAF()) : (activity instanceof InterfaceC214897198d)) {
                    if (((InterfaceC214897198d) activity).getUseRootFragmentForPageCallbacks()) {
                        return;
                    }
                }
                if (0 != 0) {
                    return;
                }
                C1397950mTx c1397950mTx = new C1397950mTx(activity);
                C520050KaR c520050KaR = new C520050KaR(c1397950mTx);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 == null || (abstractC1387200mCc = c520050KaR2.get()) == null) {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 == null || (abstractC1387200mCc = c520050KaR3.get()) == null) {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                                abstractC1387200mCc = c1397950mTx;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ2.LJIIZILJ(abstractC1387200mCc, bundle);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPostCreated(Activity activity, Bundle bundle) {
                AbstractC1387200mCc abstractC1387200mCc;
                InterfaceC2214261BlQ interfaceC2214261BlQ2 = this.LL;
                if (!C294780Bgy.LIZ() ? !(!(activity instanceof InterfaceC214897198d) || !((InterfaceC214897198d) activity).getEnableSAF()) : (activity instanceof InterfaceC214897198d)) {
                    if (((InterfaceC214897198d) activity).getUseRootFragmentForPageCallbacks()) {
                        return;
                    }
                }
                if (0 != 0) {
                    return;
                }
                C1397950mTx c1397950mTx = new C1397950mTx(activity);
                C520050KaR c520050KaR = new C520050KaR(c1397950mTx);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 == null || (abstractC1387200mCc = c520050KaR2.get()) == null) {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 == null || (abstractC1387200mCc = c520050KaR3.get()) == null) {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                                abstractC1387200mCc = c1397950mTx;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ2.LJIILIIL(abstractC1387200mCc, bundle);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPostSaveInstanceState(Activity activity, Bundle bundle) {
                AbstractC1387200mCc abstractC1387200mCc;
                InterfaceC2214261BlQ interfaceC2214261BlQ2 = this.LL;
                if (!C294780Bgy.LIZ() ? !(!(activity instanceof InterfaceC214897198d) || !((InterfaceC214897198d) activity).getEnableSAF()) : (activity instanceof InterfaceC214897198d)) {
                    if (((InterfaceC214897198d) activity).getUseRootFragmentForPageCallbacks()) {
                        return;
                    }
                }
                if (0 != 0) {
                    return;
                }
                C1397950mTx c1397950mTx = new C1397950mTx(activity);
                C520050KaR c520050KaR = new C520050KaR(c1397950mTx);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 == null || (abstractC1387200mCc = c520050KaR2.get()) == null) {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 == null || (abstractC1387200mCc = c520050KaR3.get()) == null) {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                                abstractC1387200mCc = c1397950mTx;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ2.LJIJ(abstractC1387200mCc, bundle);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPreCreated(Activity activity, Bundle bundle) {
                AbstractC1387200mCc abstractC1387200mCc;
                InterfaceC2214261BlQ interfaceC2214261BlQ2 = this.LL;
                if (!C294780Bgy.LIZ() ? !(!(activity instanceof InterfaceC214897198d) || !((InterfaceC214897198d) activity).getEnableSAF()) : (activity instanceof InterfaceC214897198d)) {
                    if (((InterfaceC214897198d) activity).getUseRootFragmentForPageCallbacks()) {
                        return;
                    }
                }
                if (0 != 0) {
                    return;
                }
                C1397950mTx c1397950mTx = new C1397950mTx(activity);
                C520050KaR c520050KaR = new C520050KaR(c1397950mTx);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 == null || (abstractC1387200mCc = c520050KaR2.get()) == null) {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 == null || (abstractC1387200mCc = c520050KaR3.get()) == null) {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                                abstractC1387200mCc = c1397950mTx;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ2.LJIIJ(abstractC1387200mCc, bundle);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPreSaveInstanceState(Activity activity, Bundle bundle) {
                AbstractC1387200mCc abstractC1387200mCc;
                InterfaceC2214261BlQ interfaceC2214261BlQ2 = this.LL;
                if (!C294780Bgy.LIZ() ? !(!(activity instanceof InterfaceC214897198d) || !((InterfaceC214897198d) activity).getEnableSAF()) : (activity instanceof InterfaceC214897198d)) {
                    if (((InterfaceC214897198d) activity).getUseRootFragmentForPageCallbacks()) {
                        return;
                    }
                }
                if (0 != 0) {
                    return;
                }
                C1397950mTx c1397950mTx = new C1397950mTx(activity);
                C520050KaR c520050KaR = new C520050KaR(c1397950mTx);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 == null || (abstractC1387200mCc = c520050KaR2.get()) == null) {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 == null || (abstractC1387200mCc = c520050KaR3.get()) == null) {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                                abstractC1387200mCc = c1397950mTx;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ2.LJIILLIIL(abstractC1387200mCc, bundle);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                AbstractC1387200mCc abstractC1387200mCc;
                InterfaceC2214261BlQ interfaceC2214261BlQ2 = this.LL;
                if (!C294780Bgy.LIZ() ? !(!(activity instanceof InterfaceC214897198d) || !((InterfaceC214897198d) activity).getEnableSAF()) : (activity instanceof InterfaceC214897198d)) {
                    if (((InterfaceC214897198d) activity).getUseRootFragmentForPageCallbacks()) {
                        return;
                    }
                }
                if (0 != 0) {
                    return;
                }
                C1397950mTx c1397950mTx = new C1397950mTx(activity);
                C520050KaR c520050KaR = new C520050KaR(c1397950mTx);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 == null || (abstractC1387200mCc = c520050KaR2.get()) == null) {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 == null || (abstractC1387200mCc = c520050KaR3.get()) == null) {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                                abstractC1387200mCc = c1397950mTx;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ2.LJI(abstractC1387200mCc, bundle);
            }
        };
        Application application = C2214291BlT.LIZIZ;
        if (application == null) {
            application = null;
        }
        application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        C2214291BlT.LIZJ.put(interfaceC2214261BlQ, (C2214251BlP) activityLifecycleCallbacks);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC214902198i LJIJJ(Fragment fragment) {
        Context context = fragment.getContext();
        ComponentCallbacks2 componentCallbacks2LJFF = null;
        if (context != null) {
            componentCallbacks2LJFF = LJFF(context);
        }
        if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
            while (true) {
                if (fragment instanceof InterfaceC214902198i) {
                    InterfaceC214902198i interfaceC214902198i = (InterfaceC214902198i) fragment;
                    if (interfaceC214902198i != null) {
                        return interfaceC214902198i;
                    }
                } else {
                    fragment = fragment.getParentFragment();
                    if (fragment == 0) {
                        break;
                    }
                }
            }
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final LifecycleOwner LJJ(TuxTextView tuxTextView) {
        Context context;
        LifecycleOwner lifecycleOwnerLIZJ = LIZJ(tuxTextView);
        if (lifecycleOwnerLIZJ != null || ((context = tuxTextView.getContext()) != null && (lifecycleOwnerLIZJ = LJJIII(context)) != null && lifecycleOwnerLIZJ != null)) {
            return lifecycleOwnerLIZJ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final FragmentManager LJJI(C19EG c19eg) {
        FragmentManager fragmentManagerLJIILL = LJIILL(c19eg);
        if (fragmentManagerLJIILL == null) {
            return c19eg.getSupportFragmentManager();
        }
        return fragmentManagerLJIILL;
    }

    public static final LifecycleOwner LJJIFFI(C19EG c19eg) {
        LifecycleOwner lifecycleOwnerLJ = LJ(c19eg);
        if (lifecycleOwnerLJ != null) {
            return lifecycleOwnerLJ;
        }
        return c19eg;
    }

    public static final C19EG LJJIII(Context context) {
        while (context != null) {
            if (context instanceof C19EG) {
                return (C19EG) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static final void LJJIIJ(InterfaceC2214261BlQ interfaceC2214261BlQ) {
        C2214291BlT.LIZ.getClass();
        C2214251BlP c2214251BlPRemove = C2214291BlT.LIZJ.remove(interfaceC2214261BlQ);
        if (c2214251BlPRemove != null) {
            Application application = C2214291BlT.LIZIZ;
            if (application == null) {
                application = null;
            }
            application.unregisterActivityLifecycleCallbacks(c2214251BlPRemove);
        }
    }

    public static final C488600JEc LJI(LifecycleOwner lifecycleOwner, C19EG c19eg) {
        if (C0R1H.LIZJ(lifecycleOwner) == Lifecycle.State.DESTROYED) {
            return null;
        }
        Map<LifecycleOwner, C488600JEc> map = LIZ;
        C488600JEc c488600JEc = map.get(lifecycleOwner);
        if (c488600JEc == null) {
            SAFExtensionKt$getOrCreateSAFMutableContextWrapper$1$runnable$1 sAFExtensionKt$getOrCreateSAFMutableContextWrapper$1$runnable$1 = new SAFExtensionKt$getOrCreateSAFMutableContextWrapper$1$runnable$1(lifecycleOwner);
            if (C665300Q7s.LIZ()) {
                sAFExtensionKt$getOrCreateSAFMutableContextWrapper$1$runnable$1.invoke();
            } else {
                C20674615vE c20674615vE = new C20674615vE(sAFExtensionKt$getOrCreateSAFMutableContextWrapper$1$runnable$1);
                if (!Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
                    C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS109S0100000_9(c20674615vE, 25));
                } else {
                    c20674615vE.invoke();
                }
            }
            c488600JEc = new C488600JEc(c19eg);
            map.put(lifecycleOwner, c488600JEc);
        }
        return c488600JEc;
    }

    public static final void LIZ(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver viewTreeObserver, Fragment fragment) {
        fragment.getLifecycle().addObserver(new SAFExtensionKt$addOnGlobalLayoutListener$2(onGlobalLayoutListener, viewTreeObserver, fragment));
        viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
        C2187701Ajg.LIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
    }

    public static final void LIZIZ(ViewTreeObserver viewTreeObserver, LifecycleOwner lifecycleOwner, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        lifecycleOwner.getLifecycle().addObserver(new SAFExtensionKt$addOnGlobalLayoutListener$1(viewTreeObserver, onGlobalLayoutListener));
        viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
        C2187701Ajg.LIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
    
        if (r0 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.fragment.app.FragmentManager LJIJJLI(androidx.fragment.app.Fragment r2, boolean r3, X.C19EG r4) {
        /*
            java.lang.String r1 = "Required value was null."
            if (r3 == 0) goto L24
            androidx.fragment.app.FragmentManager r0 = LJIIJJI(r2)
            if (r0 != 0) goto L18
            X.19EG r0 = r2.getActivity()
            if (r0 != 0) goto L19
            if (r4 == 0) goto L1b
        L12:
            androidx.fragment.app.FragmentManager r0 = r4.getSupportFragmentManager()
            if (r0 == 0) goto L1b
        L18:
            return r0
        L19:
            r4 = r0
            goto L12
        L1b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1.toString()
            r0.<init>(r1)
            throw r0
        L24:
            androidx.fragment.app.FragmentManager r0 = LJIIJJI(r2)
            if (r0 == 0) goto L2b
            return r0
        L2b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.SAFExtensionKt.LJIJJLI(androidx.fragment.app.Fragment, boolean, X.19EG):androidx.fragment.app.FragmentManager");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.view.View LJJII(android.app.Activity r4, android.content.Context r5, int r6, X.C488600JEc r7) {
        /*
            if (r7 == 0) goto L2f
            r0 = 0
            r3 = 0
            android.view.View r2 = X.C20673215v0.LJFF(r7, r7, r6, r3, r0)
            android.content.Context r1 = r2.getContext()
            boolean r0 = r1 instanceof X.C488600JEc
            if (r0 == 0) goto L2e
            X.0JEc r1 = (X.C488600JEc) r1
            if (r1 == 0) goto L2e
            r1.setBaseContext(r4)
            boolean r0 = r5 instanceof X.C488650JEh
            if (r0 != 0) goto L25
            boolean r0 = r5 instanceof X.C488600JEc
            if (r0 == 0) goto L2c
            X.0JEc r5 = (X.C488600JEc) r5
            X.0JEh r5 = r5.LIZ()
        L25:
            if (r5 == 0) goto L2c
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r5)
        L2c:
            r1.LLILZIL = r3
        L2e:
            return r2
        L2f:
            android.view.View r2 = X.C20673215v0.LIZJ(r6, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.SAFExtensionKt.LJJII(android.app.Activity, android.content.Context, int, X.0JEc):android.view.View");
    }
}

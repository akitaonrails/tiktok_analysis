package com.ss.android.ugc.aweme.services;

import X.AbstractC1563340qmi;
import X.C07FV;
import X.C0J5E;
import X.C1835607Gw;
import X.C199Y;
import X.C19EG;
import X.C20629915o1;
import X.InterfaceC1294060jmO;
import X.InterfaceC1670800ta2;
import X.InterfaceC1711206n0;
import X.InterfaceC20622815ms;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.SAFExtensionKt;

/* JADX INFO: loaded from: classes25.dex */
public final class IMainSAFLifecycleKt {
    public static boolean enableFragmentSAFLifecycleRefactor;
    public static boolean enableMainSAFLifecycleRefactor;
    public static boolean enablePopUpLifecycleRefactor;
    public static boolean enableTopSAFLifecycleRefactor;
    public static boolean enableViewSAFLifecycleRefactor;

    public static final LifecycleOwner preCheckSAFLifecycle(C19EG c19eg) {
        return c19eg;
    }

    static {
        boolean z = true;
        enableMainSAFLifecycleRefactor = ((Number) C07FV.LIZ.getValue()).intValue() == C07FV.LIZIZ;
        enableTopSAFLifecycleRefactor = C1835607Gw.LIZ() == C1835607Gw.LIZIZ || C1835607Gw.LIZ() == C1835607Gw.LJFF;
        enableFragmentSAFLifecycleRefactor = C1835607Gw.LIZIZ();
        enableViewSAFLifecycleRefactor = C1835607Gw.LIZ() == C1835607Gw.LJ || C1835607Gw.LIZ() == C1835607Gw.LJFF;
        if (C1835607Gw.LIZ() != C1835607Gw.LIZLLL && C1835607Gw.LIZ() != C1835607Gw.LJFF) {
            z = false;
        }
        enablePopUpLifecycleRefactor = z;
    }

    public static final boolean getEnableFragmentSAFLifecycleRefactor() {
        return enableFragmentSAFLifecycleRefactor;
    }

    public static final boolean getEnableMainSAFLifecycleRefactor() {
        return enableMainSAFLifecycleRefactor;
    }

    public static final boolean getEnablePopUpLifecycleRefactor() {
        return enablePopUpLifecycleRefactor;
    }

    public static final boolean getEnableTopSAFLifecycleRefactor() {
        return enableTopSAFLifecycleRefactor;
    }

    public static final boolean getEnableViewSAFLifecycleRefactor() {
        return enableViewSAFLifecycleRefactor;
    }

    public static final Lifecycle findSAFExpLifecycle(View view) {
        LifecycleOwner lifecycleOwnerFindSAFExpLifecycleOwner = findSAFExpLifecycleOwner(view, (C19EG) null);
        if (lifecycleOwnerFindSAFExpLifecycleOwner == null) {
            return null;
        }
        return lifecycleOwnerFindSAFExpLifecycleOwner.getLifecycle();
    }

    public static final Lifecycle findTopSAFExpLifecycle(C19EG c19eg) {
        LifecycleOwner lifecycleOwnerFindTopSAFExpLifecycleOwner = findTopSAFExpLifecycleOwner(c19eg);
        if (lifecycleOwnerFindTopSAFExpLifecycleOwner != null) {
            return lifecycleOwnerFindTopSAFExpLifecycleOwner.getLifecycle();
        }
        return null;
    }

    public static final LifecycleOwner findTopSAFExpLifecycleOwner(C19EG c19eg) {
        if (enableTopSAFLifecycleRefactor) {
            return SAFExtensionKt.LJ(c19eg);
        }
        preCheckSAFLifecycle(c19eg);
        if (c19eg != null) {
            return c19eg;
        }
        return (LifecycleOwner) ((AbstractC1563340qmi) c19eg.getLifecycle()).LLILZ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Fragment getMainRootFragment(C19EG c19eg) {
        Object objLIZ;
        if (!(c19eg instanceof C199Y) || (objLIZ = C20629915o1.LIZ((InterfaceC20622815ms) c19eg)) == null || !(objLIZ instanceof C0J5E)) {
            return null;
        }
        return (Fragment) objLIZ;
    }

    public static final LifecycleOwner getMainSAFLifecycle(LifecycleOwner lifecycleOwner) {
        Object objLIZ;
        if ((lifecycleOwner instanceof C199Y) && (lifecycleOwner instanceof InterfaceC1711206n0)) {
            InterfaceC1670800ta2 interfaceC1670800ta2 = (C19EG) lifecycleOwner;
            if (!(interfaceC1670800ta2 instanceof C199Y) || (objLIZ = C20629915o1.LIZ((InterfaceC20622815ms) interfaceC1670800ta2)) == null || !(objLIZ instanceof C0J5E)) {
                return null;
            }
            return (Fragment) objLIZ;
        }
        return lifecycleOwner;
    }

    @InterfaceC1294060jmO
    public static final LifecycleOwner requireMainSAFLifecycle(LifecycleOwner lifecycleOwner) {
        return requireMainSAFLifecycle(lifecycleOwner, null, false);
    }

    public static final void setEnableFragmentSAFLifecycleRefactor(boolean z) {
        enableFragmentSAFLifecycleRefactor = z;
    }

    public static final void setEnableMainSAFLifecycleRefactor(boolean z) {
        enableMainSAFLifecycleRefactor = z;
    }

    public static final void setEnablePopUpLifecycleRefactor(boolean z) {
        enablePopUpLifecycleRefactor = z;
    }

    public static final void setEnableTopSAFLifecycleRefactor(boolean z) {
        enableTopSAFLifecycleRefactor = z;
    }

    public static final void setEnableViewSAFLifecycleRefactor(boolean z) {
        enableViewSAFLifecycleRefactor = z;
    }

    public static final Lifecycle findSAFExpLifecycle(Fragment fragment) {
        LifecycleOwner lifecycleOwnerFindSAFExpLifecycleOwner = findSAFExpLifecycleOwner(fragment, (C19EG) null);
        if (lifecycleOwnerFindSAFExpLifecycleOwner == null) {
            return null;
        }
        return lifecycleOwnerFindSAFExpLifecycleOwner.getLifecycle();
    }

    public static final LifecycleOwner findSAFExpLifecycleOwner(View view, C19EG c19eg) {
        if (enableViewSAFLifecycleRefactor) {
            return SAFExtensionKt.LIZJ(view);
        }
        if (c19eg == null && (c19eg = SAFExtensionKt.LJJIII(view.getContext())) == null) {
            return null;
        }
        preCheckSAFLifecycle(c19eg);
        return c19eg;
    }

    @InterfaceC1294060jmO
    public static final LifecycleOwner requireMainSAFLifecycle(LifecycleOwner lifecycleOwner, C19EG c19eg) {
        return requireMainSAFLifecycle(lifecycleOwner, c19eg, false);
    }

    public static final Lifecycle requireTopSAFExpLifecycle(C19EG c19eg, boolean z) {
        Lifecycle lifecycleFindTopSAFExpLifecycle;
        if (z) {
            lifecycleFindTopSAFExpLifecycle = findTopSAFExpLifecycle(c19eg);
            if (lifecycleFindTopSAFExpLifecycle == null && (lifecycleFindTopSAFExpLifecycle = c19eg.getLifecycle()) == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            lifecycleFindTopSAFExpLifecycle = findTopSAFExpLifecycle(c19eg);
            if (lifecycleFindTopSAFExpLifecycle == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return lifecycleFindTopSAFExpLifecycle;
    }

    public static final LifecycleOwner requireTopSAFExpLifecycleOwner(C19EG c19eg, boolean z) {
        LifecycleOwner lifecycleOwner;
        if (z) {
            LifecycleOwner lifecycleOwnerFindTopSAFExpLifecycleOwner = findTopSAFExpLifecycleOwner(c19eg);
            lifecycleOwner = c19eg;
            if (lifecycleOwnerFindTopSAFExpLifecycleOwner != null) {
                return lifecycleOwnerFindTopSAFExpLifecycleOwner;
            }
        } else {
            LifecycleOwner lifecycleOwnerFindTopSAFExpLifecycleOwner2 = findTopSAFExpLifecycleOwner(c19eg);
            lifecycleOwner = lifecycleOwnerFindTopSAFExpLifecycleOwner2;
            if (lifecycleOwnerFindTopSAFExpLifecycleOwner2 == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return lifecycleOwner;
    }

    public static final LifecycleOwner findSAFExpLifecycleOwner(Fragment fragment, C19EG c19eg) {
        if (enableFragmentSAFLifecycleRefactor) {
            return SAFExtensionKt.LIZLLL(fragment);
        }
        if (c19eg == null && (c19eg = fragment.getActivity()) == null) {
            return null;
        }
        preCheckSAFLifecycle(c19eg);
        return c19eg;
    }

    @InterfaceC1294060jmO
    public static final LifecycleOwner requireMainSAFLifecycle(LifecycleOwner lifecycleOwner, C19EG c19eg, boolean z) {
        Object objLIZ;
        if ((lifecycleOwner instanceof C199Y) && (lifecycleOwner instanceof InterfaceC1711206n0) && enableMainSAFLifecycleRefactor) {
            InterfaceC1670800ta2 interfaceC1670800ta2 = (C19EG) lifecycleOwner;
            Fragment fragment = null;
            if ((interfaceC1670800ta2 instanceof C199Y) && (objLIZ = C20629915o1.LIZ((InterfaceC20622815ms) interfaceC1670800ta2)) != null && (objLIZ instanceof C0J5E)) {
                fragment = (Fragment) objLIZ;
            }
            lifecycleOwner = fragment;
        }
        if (z) {
            if (lifecycleOwner == null) {
                if (c19eg == null) {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                return c19eg;
            }
            return lifecycleOwner;
        }
        if (lifecycleOwner == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        return lifecycleOwner;
    }

    public static final Lifecycle requireSAFExpLifecycle(View view, boolean z, C19EG c19eg) {
        return requireSAFExpLifecycleOwner(view, z, c19eg).getLifecycle();
    }

    public static final LifecycleOwner requireSAFExpLifecycleOwner(Fragment fragment, boolean z, C19EG c19eg) {
        Context context;
        if (z) {
            LifecycleOwner lifecycleOwnerFindSAFExpLifecycleOwner = findSAFExpLifecycleOwner(fragment, c19eg);
            if (lifecycleOwnerFindSAFExpLifecycleOwner != null || (lifecycleOwnerFindSAFExpLifecycleOwner = fragment.getActivity()) != null || ((context = fragment.getContext()) != null && (lifecycleOwnerFindSAFExpLifecycleOwner = SAFExtensionKt.LJJIII(context)) != null)) {
                return lifecycleOwnerFindSAFExpLifecycleOwner;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        LifecycleOwner lifecycleOwnerFindSAFExpLifecycleOwner2 = findSAFExpLifecycleOwner(fragment, c19eg);
        if (lifecycleOwnerFindSAFExpLifecycleOwner2 != null) {
            return lifecycleOwnerFindSAFExpLifecycleOwner2;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Lifecycle requireSAFExpLifecycle(Fragment fragment, boolean z, C19EG c19eg) {
        return requireSAFExpLifecycleOwner(fragment, z, c19eg).getLifecycle();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
    
        if (r4 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.lifecycle.LifecycleOwner requireSAFExpLifecycleOwner(android.view.View r2, boolean r3, X.C19EG r4) {
        /*
            java.lang.String r1 = "Required value was null."
            if (r3 == 0) goto L23
            androidx.lifecycle.LifecycleOwner r0 = findSAFExpLifecycleOwner(r2, r4)
            if (r0 != 0) goto L19
            if (r4 != 0) goto L16
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto L1a
            X.19EG r4 = com.ss.android.ugc.aweme.SAFExtensionKt.LJJIII(r0)
        L16:
            r0 = r4
            if (r4 == 0) goto L1a
        L19:
            return r0
        L1a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1.toString()
            r0.<init>(r1)
            throw r0
        L23:
            androidx.lifecycle.LifecycleOwner r0 = findSAFExpLifecycleOwner(r2, r4)
            if (r0 == 0) goto L2a
            return r0
        L2a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt.requireSAFExpLifecycleOwner(android.view.View, boolean, X.19EG):androidx.lifecycle.LifecycleOwner");
    }
}

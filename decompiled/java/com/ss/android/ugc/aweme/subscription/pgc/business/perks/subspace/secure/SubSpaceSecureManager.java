package com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.secure;

import X.C0K76;
import X.C0K77;
import X.C0K7G;
import X.C19EG;
import android.app.Activity;
import android.app.Dialog;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpaceSecureManager {
    public static WeakReference<Activity> LIZIZ;
    public static boolean LIZLLL;
    public static final List<WeakReference<Fragment>> LIZ = new ArrayList();
    public static final AFwS193S0000000_7 LIZJ = AFwS193S0000000_7.get$arr$(184);

    public static void LIZ(Fragment fragment) {
        Window window;
        Window window2;
        if (!C0K7G.LJFF("ttlive_sub_space_secure", true)) {
            return;
        }
        if (fragment instanceof DialogFragment) {
            Dialog dialog = ((DialogFragment) fragment).getDialog();
            if (dialog != null && (window2 = dialog.getWindow()) != null) {
                window2.setFlags(8192, 8192);
            }
        } else {
            C19EG activity = fragment.getActivity();
            if (activity != null && (window = activity.getWindow()) != null) {
                window.setFlags(8192, 8192);
            }
        }
        LIZIZ = new WeakReference<>(fragment.getActivity());
        final WeakReference weakReference = new WeakReference(fragment);
        ((ArrayList) LIZ).add(weakReference);
        if (!LIZLLL) {
            C0K76 c0k76 = C0K76.LIZ;
            AFwS193S0000000_7 aFwS193S0000000_7 = LIZJ;
            c0k76.getClass();
            try {
                C0K77 c0k77LIZ = C0K76.LIZ();
                if (c0k77LIZ != null) {
                    c0k77LIZ.LJIIL(aFwS193S0000000_7);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            LIZLLL = true;
        }
        fragment.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.secure.SubSpaceSecureManager$addFragment$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Activity activity2;
                Window window3;
                if (event == Lifecycle.Event.ON_DESTROY) {
                    ArrayList arrayList = (ArrayList) SubSpaceSecureManager.LIZ;
                    arrayList.remove(weakReference);
                    if (arrayList.isEmpty()) {
                        C0K76 c0k762 = C0K76.LIZ;
                        AFwS193S0000000_7 aFwS193S0000000_72 = SubSpaceSecureManager.LIZJ;
                        c0k762.getClass();
                        try {
                            C0K77 c0k77LIZ2 = C0K76.LIZ();
                            if (c0k77LIZ2 != null) {
                                c0k77LIZ2.LJJIFFI(aFwS193S0000000_72);
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                        SubSpaceSecureManager.LIZLLL = false;
                        WeakReference<Activity> weakReference2 = SubSpaceSecureManager.LIZIZ;
                        if (weakReference2 != null && (activity2 = weakReference2.get()) != null && (window3 = activity2.getWindow()) != null) {
                            window3.clearFlags(8192);
                        }
                    }
                }
            }
        });
    }
}

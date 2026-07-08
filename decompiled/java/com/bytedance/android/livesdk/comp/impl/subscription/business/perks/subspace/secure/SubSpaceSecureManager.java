package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.secure;

import X.C1161920gLG;
import X.C19EG;
import X.C503140JoG;
import android.app.Activity;
import android.app.Dialog;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.subscription.TTLiveSubSpaceSecureSetting;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpaceSecureManager {
    public static WeakReference<Activity> LIZIZ;
    public static boolean LIZLLL;
    public static final List<WeakReference<Fragment>> LIZ = new ArrayList();
    public static final C503140JoG LIZJ = new C503140JoG();

    public static void LIZ(Fragment fragment) {
        Window window;
        Window window2;
        if (!TTLiveSubSpaceSecureSetting.INSTANCE.enable()) {
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
            ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).v72(LIZJ);
            LIZLLL = true;
        }
        fragment.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.secure.SubSpaceSecureManager$addFragment$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Activity activity2;
                Window window3;
                if (event == Lifecycle.Event.ON_DESTROY) {
                    ArrayList arrayList = (ArrayList) SubSpaceSecureManager.LIZ;
                    arrayList.remove(weakReference);
                    if (arrayList.isEmpty()) {
                        ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).Ca0(SubSpaceSecureManager.LIZJ);
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

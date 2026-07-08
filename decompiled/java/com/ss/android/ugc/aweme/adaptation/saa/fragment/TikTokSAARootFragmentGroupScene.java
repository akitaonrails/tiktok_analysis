package com.ss.android.ugc.aweme.adaptation.saa.fragment;

import X.AbstractC214814194y;
import X.AnonymousClass1995;
import X.AnonymousClass1996;
import X.C01GW;
import X.C1447800nmM;
import X.C198R;
import X.C214937199r;
import X.C21524919Lr;
import X.C452501pT;
import Y.ARunnableS132S0100000_32;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.scene.navigation.NavigationScene;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public abstract class TikTokSAARootFragmentGroupScene extends AbstractC214814194y implements AnonymousClass1995 {
    public final LifecycleRegistry LLJJIJIL = new LifecycleRegistry(this);
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 89));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 90));
    public final OnBackPressedDispatcher LLJJJJ = new OnBackPressedDispatcher(new ARunnableS132S0100000_32(this, 24));

    @Override // X.AnonymousClass1995
    public final void onWindowFocusChanged(boolean z) {
    }

    public final C198R LLLLJI() {
        return (C198R) this.LLJJJ.getValue();
    }

    public final FragmentManager getFragmentManager() {
        return (FragmentManager) this.LLJJJIL.getValue();
    }

    @Override // com.bytedance.scene.Scene
    public void onDestroy() {
        C214937199r scope;
        super.onDestroy();
        Activity activity = this.mActivity;
        if (activity != null && !activity.isChangingConfigurations() && (scope = getScope()) != null) {
            scope.LIZIZ();
        }
        LLLLJI().LIZ.LLILZ.LJJ();
        this.LLJJIJIL.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public void onPause() {
        super.onPause();
        LLLLJI().LIZ.LLILZ.LJJIL(5);
        this.LLJJIJIL.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public void onResume() {
        super.onResume();
        LLLLJI().LIZJ();
        LLLLJI().LIZIZ();
        this.LLJJIJIL.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        LLLLJI().LIZ.LLILZ.LJJIJL();
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public void onStart() {
        super.onStart();
        LLLLJI().LIZJ();
        LLLLJI().LIZIZ();
        this.LLJJIJIL.handleLifecycleEvent(Lifecycle.Event.ON_START);
        LLLLJI().LIZ.LLILZ.LJJIJLIJ();
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public void onStop() {
        super.onStop();
        while (LLLLL(getFragmentManager(), Lifecycle.State.CREATED)) {
        }
        LLLLJI().LIZ.LLILZ.LJJIZ();
        this.LLJJIJIL.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public void onActivityCreated(Bundle bundle) {
        LLLLJI().LIZ.LLILZ.LJIIZILJ();
        super.onActivityCreated(bundle);
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
        if (navigationSceneLIZ != null) {
            navigationSceneLIZ.LLLIILIL(this, new C21524919Lr(this, 1));
        }
    }

    @Override // X.AbstractC214814194y, X.AnonymousClass1995
    public void onConfigurationChanged(Configuration configuration) {
        LLLLJI().LIZJ();
        LLLLJI().LIZ.LLILZ.LJIJI(true, configuration);
    }

    @Override // X.AbstractC214814194y, X.C19A3, com.bytedance.scene.Scene
    public void onCreate(Bundle bundle) {
        AnonymousClass1996<?> anonymousClass1996 = LLLLJI().LIZ;
        anonymousClass1996.LLILZ.LJIIIIZZ(anonymousClass1996, anonymousClass1996, null);
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("scene:support:fragments");
            AnonymousClass1996<?> anonymousClass19962 = LLLLJI().LIZ;
            if (anonymousClass19962 instanceof ViewModelStoreOwner) {
                anonymousClass19962.LLILZ.LLFFF(parcelable);
            } else {
                throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
            }
        }
        super.onCreate(bundle);
        this.LLJJIJIL.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        LLLLJI().LIZ.LLILZ.LJIJJLI();
    }

    @Override // X.AbstractC214814194y, X.C19A3, com.bytedance.scene.Scene
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        while (LLLLL(getFragmentManager(), Lifecycle.State.CREATED)) {
        }
        this.LLJJIJIL.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    public static boolean LLLLL(FragmentManager fragmentManager, Lifecycle.State state) {
        boolean zLLLLL = false;
        for (Fragment fragment : fragmentManager.LJJLIIIJL()) {
            if (fragment.getHost() != null) {
                zLLLLL |= LLLLL(fragment.getChildFragmentManager(), state);
            }
            if (fragment.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                ((LifecycleRegistry) fragment.getLifecycle()).setCurrentState(state);
                zLLLLL = true;
            }
        }
        return zLLLLL;
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LLLLJI().LIZ.LLILZ.LJJIL(2);
    }
}

package com.ss.android.ugc.aweme.ecommerce.search.searchbar.asr;

import X.C1906580ziK;
import X.C356901a3;
import X.InterfaceC674710QdJ;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchBarAsrHelper$hostLifecycleObserver$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ EcSearchBarAsrHelper LL;

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

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public EcSearchBarAsrHelper$hostLifecycleObserver$1(EcSearchBarAsrHelper ecSearchBarAsrHelper) {
        this.LL = ecSearchBarAsrHelper;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        EcSearchBarAsrHelper ecSearchBarAsrHelper = this.LL;
        ecSearchBarAsrHelper.LIZJ = null;
        Lifecycle lifecycle = ecSearchBarAsrHelper.LIZ;
        if (lifecycle != null) {
            lifecycle.removeObserver(ecSearchBarAsrHelper.LJIIIIZZ);
        }
        ecSearchBarAsrHelper.LIZ();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        EcSearchBarAsrHelper ecSearchBarAsrHelper = this.LL;
        if (ecSearchBarAsrHelper.LJFF) {
            ecSearchBarAsrHelper.LJ = null;
            ecSearchBarAsrHelper.LJFF = false;
            InterfaceC674710QdJ interfaceC674710QdJ = ecSearchBarAsrHelper.LIZJ;
            if (interfaceC674710QdJ != null) {
                interfaceC674710QdJ.t3(null);
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        this.LL.LIZIZ(false);
        if (!C1906580ziK.LJI()) {
            this.LL.LJFF = true;
        }
    }
}

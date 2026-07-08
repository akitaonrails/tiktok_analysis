package com.ss.android.ugc.profile.business.profile.ui.helper;

import X.C14EU;
import X.C356901a3;
import X.C622680Oba;
import X.C888460YtI;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileAwemeListFragmentRefreshOptHelper implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final int LL;
    public long LLILLJJLI = -1;
    public boolean LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public boolean LLILZLL;

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

    @C14EU
    public final void onBlockUser(C888460YtI c888460YtI) {
        if (this.LL == 1) {
            this.LLILZLL = true;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        C622680Oba.LIZJ(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C622680Oba.LIZLLL(this);
    }

    public ProfileAwemeListFragmentRefreshOptHelper(int i, Fragment fragment) {
        Lifecycle lifecycle;
        this.LL = i;
        if ((fragment instanceof LifecycleOwner) && fragment != null && (lifecycle = fragment.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
    }
}

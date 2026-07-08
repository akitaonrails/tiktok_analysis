package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui;

import X.C1478160oZK;
import X.C1483340ohg;
import X.C356901a3;
import X.C659880PuU;
import X.C661470Px3;
import X.InterfaceC659670Pu9;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.performance.core.config.SecondVideoPreloadConfig;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchVideoHolder$bindLifeCycleCallback$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ SearchVideoHolder LL;

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

    public SearchVideoHolder$bindLifeCycleCallback$1(SearchVideoHolder searchVideoHolder) {
        this.LL = searchVideoHolder;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C661470Px3 c661470Px3I7;
        SimVideoUrlModel simVideoUrlModelLJFF;
        if (((SecondVideoPreloadConfig) C659880PuU.LIZIZ.getValue()).enableSearchSecondVideoPrepare && (c661470Px3I7 = this.LL.i7()) != null && (simVideoUrlModelLJFF = C1483340ohg.LJFF(c661470Px3I7.getMAweme())) != null) {
            C1478160oZK.LIZ().LJJJJZ(simVideoUrlModelLJFF);
        }
        this.LL.getLifecycle().removeObserver(this);
        InterfaceC659670Pu9 interfaceC659670Pu9 = this.LL.LLLLZLL;
        if (interfaceC659670Pu9 != null) {
            interfaceC659670Pu9.onDestroy();
        }
    }
}

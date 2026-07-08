package com.ss.android.ugc.aweme.search.arch.v2.services;

import X.C1558520qew;
import X.C356901a3;
import X.InterfaceC494301wD;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.pages.result.common.research.core.vability.SearchFragmentScope;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchServiceCenterImplKt$autoBindAbility$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ LifecycleOwner LL;
    public final /* synthetic */ InterfaceC494301wD LLILLJJLI;
    public final /* synthetic */ Class<? extends InterfaceC494301wD> LLILLL;

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

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        C1558520qew.LJI(this.LL, SearchFragmentScope.class, this.LLILLJJLI, this.LLILLL, null, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) throws IllegalAccessException {
        C1558520qew.LJIIJ(this.LL, SearchFragmentScope.class, this.LLILLL, null);
    }

    public SearchServiceCenterImplKt$autoBindAbility$1(LifecycleOwner lifecycleOwner, InterfaceC494301wD interfaceC494301wD, Class<? extends InterfaceC494301wD> cls) {
        this.LL = lifecycleOwner;
        this.LLILLJJLI = interfaceC494301wD;
        this.LLILLL = cls;
    }
}

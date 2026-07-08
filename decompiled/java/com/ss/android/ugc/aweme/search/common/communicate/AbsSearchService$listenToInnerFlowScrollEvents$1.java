package com.ss.android.ugc.aweme.search.common.communicate;

import X.C0QDO;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;

/* JADX INFO: loaded from: classes11.dex */
public final class AbsSearchService$listenToInnerFlowScrollEvents$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ IViewPagerComponentAbility LL;
    public final /* synthetic */ C0QDO LLILLJJLI;

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

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.LL.Xl0(this.LLILLJJLI);
    }

    public AbsSearchService$listenToInnerFlowScrollEvents$1(IViewPagerComponentAbility iViewPagerComponentAbility, C0QDO c0qdo) {
        this.LL = iViewPagerComponentAbility;
        this.LLILLJJLI = c0qdo;
    }
}

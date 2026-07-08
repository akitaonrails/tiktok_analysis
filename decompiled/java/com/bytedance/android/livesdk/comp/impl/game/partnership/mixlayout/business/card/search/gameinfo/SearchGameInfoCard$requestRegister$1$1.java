package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.search.gameinfo;

import X.C013C;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes29.dex */
public final class SearchGameInfoCard$requestRegister$1$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public boolean LL;
    public final /* synthetic */ SearchGameInfoCard LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
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
    public final void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
        this.LL = true;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        C356901a3.LIZLLL(this, lifecycleOwner);
        if (!this.LL) {
            return;
        }
        LifecycleOwner lifecycleOwner2 = this.LLILLJJLI.LLILLL.getLifecycleOwner();
        if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        this.LLILLL.element = false;
    }

    public SearchGameInfoCard$requestRegister$1$1(SearchGameInfoCard searchGameInfoCard, C013C c013c) {
        this.LLILLJJLI = searchGameInfoCard;
        this.LLILLL = c013c;
    }
}

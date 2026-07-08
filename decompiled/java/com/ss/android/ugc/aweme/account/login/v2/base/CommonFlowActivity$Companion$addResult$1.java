package com.ss.android.ugc.aweme.account.login.v2.base;

import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/* JADX INFO: loaded from: classes14.dex */
public final class CommonFlowActivity$Companion$addResult$1 implements GenericLifecycleObserver {
    public final /* synthetic */ int LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        CommonFlowActivity.LLJIJIL.remove(this.LL);
        this.LLILLJJLI.getLifecycle().removeObserver(this);
    }

    public CommonFlowActivity$Companion$addResult$1(int i, LifecycleOwner lifecycleOwner) {
        this.LL = i;
        this.LLILLJJLI = lifecycleOwner;
    }
}

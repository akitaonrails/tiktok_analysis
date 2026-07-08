package com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.cpc;

import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public final class CPCUtilsKt$destroyHandling$1 implements GenericLifecycleObserver {
    public final /* synthetic */ Function0<Unit> LL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void dispose() {
        this.LL.invoke();
    }

    public CPCUtilsKt$destroyHandling$1(Function0<Unit> function0) {
        this.LL = function0;
    }
}

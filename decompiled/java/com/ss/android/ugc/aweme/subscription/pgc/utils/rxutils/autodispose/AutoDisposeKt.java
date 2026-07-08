package com.ss.android.ugc.aweme.subscription.pgc.utils.rxutils.autodispose;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public final class AutoDisposeKt {
    public static final void LIZ(LifecycleOwner lifecycleOwner, Function0<Unit> function0) {
        if (lifecycleOwner == null) {
            return;
        }
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            function0.invoke();
        } else {
            lifecycle.addObserver(new AutoDisposeKt$bindToDestroy$observer$1(function0));
        }
    }
}

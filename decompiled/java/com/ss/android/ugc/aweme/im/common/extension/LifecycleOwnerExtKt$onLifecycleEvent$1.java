package com.ss.android.ugc.aweme.im.common.extension;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public final class LifecycleOwnerExtKt$onLifecycleEvent$1 implements LifecycleEventObserver {
    public final /* synthetic */ Lifecycle.Event LL;
    public final /* synthetic */ Lifecycle LLILLJJLI;
    public final /* synthetic */ Function0<Object> LLILLL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == this.LL) {
            this.LLILLJJLI.removeObserver(this);
            this.LLILLL.invoke();
        }
    }

    public LifecycleOwnerExtKt$onLifecycleEvent$1(Lifecycle.Event event, Lifecycle lifecycle, Function0<Object> function0) {
        this.LL = event;
        this.LLILLJJLI = lifecycle;
        this.LLILLL = function0;
    }
}

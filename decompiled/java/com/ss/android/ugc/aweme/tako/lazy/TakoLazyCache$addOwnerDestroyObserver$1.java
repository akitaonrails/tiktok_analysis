package com.ss.android.ugc.aweme.tako.lazy;

import X.C1564830qp7;
import X.C1564850qp9;
import X.C259800zU;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes25.dex */
public final class TakoLazyCache$addOwnerDestroyObserver$1 implements LifecycleEventObserver {
    public final /* synthetic */ C1564830qp7 LL;
    public final /* synthetic */ C1564850qp9 LLILLJJLI;
    public final /* synthetic */ LifecycleOwner LLILLL;
    public final /* synthetic */ C259800zU<LifecycleEventObserver> LLILZ;

    public TakoLazyCache$addOwnerDestroyObserver$1(C1564830qp7 c1564830qp7, C1564850qp9 c1564850qp9, LifecycleOwner lifecycleOwner, C259800zU<LifecycleEventObserver> c259800zU) {
        this.LL = c1564830qp7;
        this.LLILLJJLI = c1564850qp9;
        this.LLILLL = lifecycleOwner;
        this.LLILZ = c259800zU;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        LifecycleEventObserver lifecycleEventObserver;
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.LL.LIZIZ.remove(this.LLILLJJLI);
            this.LL.LIZJ.remove(this.LLILLJJLI);
            this.LL.LIZLLL.remove(this.LLILLJJLI);
            Lifecycle lifecycle = this.LLILLL.getLifecycle();
            LifecycleEventObserver lifecycleEventObserver2 = this.LLILZ.element;
            if (lifecycleEventObserver2 == null) {
                lifecycleEventObserver = null;
            } else {
                lifecycleEventObserver = lifecycleEventObserver2;
            }
            lifecycle.removeObserver(lifecycleEventObserver);
        }
    }
}

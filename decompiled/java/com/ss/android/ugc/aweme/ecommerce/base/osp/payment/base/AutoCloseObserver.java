package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.base;

import X.AbstractC948303nF;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class AutoCloseObserver implements LifecycleEventObserver {
    public final Lifecycle LL;
    public final Closeable LLILLJJLI;

    public AutoCloseObserver(Lifecycle lifecycle, AbstractC948303nF abstractC948303nF) {
        this.LL = lifecycle;
        this.LLILLJJLI = abstractC948303nF;
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            abstractC948303nF.close();
        } else {
            lifecycle.addObserver(this);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) throws IOException {
        if (this.LL.getCurrentState().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            this.LL.removeObserver(this);
            this.LLILLJJLI.close();
        }
    }
}

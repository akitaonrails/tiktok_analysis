package com.ss.android.ugc.aweme.base;

import X.C504601xs;
import X.C504701xt;
import android.os.Looper;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: loaded from: classes.dex */
public class SafeHandler extends BPEAHandler implements GenericLifecycleObserver {
    public LifecycleOwner LL;

    public final void destroy() {
        removeCallbacksAndMessages(null);
        LifecycleOwner lifecycleOwner = this.LL;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
        if (((Boolean) C504701xt.LIZ.getValue()).booleanValue()) {
            this.LL = null;
        }
    }

    public SafeHandler(LifecycleOwner lifecycleOwner) {
        super(Looper.getMainLooper());
        this.LL = lifecycleOwner;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().addObserver(this);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (C504601xs.LIZ[event.ordinal()] == 1) {
            destroy();
        }
    }
}

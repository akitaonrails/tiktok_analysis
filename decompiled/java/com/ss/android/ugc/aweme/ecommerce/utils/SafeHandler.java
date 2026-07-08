package com.ss.android.ugc.aweme.ecommerce.utils;

import X.C03WC;
import android.os.Looper;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: loaded from: classes2.dex */
public class SafeHandler extends BPEAHandler implements GenericLifecycleObserver {
    public final LifecycleOwner LL;

    public SafeHandler(LifecycleOwner lifecycleOwner) {
        super(Looper.getMainLooper());
        this.LL = lifecycleOwner;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().addObserver(this);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (C03WC.LIZ[event.ordinal()] == 1) {
            removeCallbacksAndMessages(null);
            LifecycleOwner lifecycleOwner2 = this.LL;
            if (lifecycleOwner2 != null) {
                lifecycleOwner2.getLifecycle().removeObserver(this);
            }
        }
    }
}

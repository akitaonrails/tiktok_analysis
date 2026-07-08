package com.ss.android.ugc.aweme.shortvideo;

import X.C439730HMd;
import Y.ARunnableS123S0100000_23;
import android.os.Looper;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: loaded from: classes24.dex */
public class SafeHandler extends BPEAHandler implements GenericLifecycleObserver {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public final LifecycleOwner LL;

    public SafeHandler(LifecycleOwner lifecycleOwner) {
        super(Looper.getMainLooper());
        this.LL = lifecycleOwner;
        ARunnableS123S0100000_23 aRunnableS123S0100000_23 = new ARunnableS123S0100000_23(this, 40);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            post(aRunnableS123S0100000_23);
        } else {
            aRunnableS123S0100000_23.run();
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (C439730HMd.LIZ[event.ordinal()] == 1) {
            removeCallbacksAndMessages(null);
            ARunnableS123S0100000_23 aRunnableS123S0100000_23 = new ARunnableS123S0100000_23(this, 41);
            if (Looper.myLooper() != Looper.getMainLooper()) {
                post(aRunnableS123S0100000_23);
            } else {
                aRunnableS123S0100000_23.run();
            }
        }
    }
}

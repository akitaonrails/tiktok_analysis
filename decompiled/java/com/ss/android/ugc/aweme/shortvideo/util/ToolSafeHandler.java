package com.ss.android.ugc.aweme.shortvideo.util;

import X.C1488700oqK;
import Y.ARunnableS123S0100000_23;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;

/* JADX INFO: loaded from: classes24.dex */
public class ToolSafeHandler extends SafeHandler {
    public boolean LLILLL;

    public ToolSafeHandler(LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.SafeHandler, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (C1488700oqK.LIZ[event.ordinal()] == 1) {
            removeCallbacksAndMessages(null);
            ARunnableS123S0100000_23 aRunnableS123S0100000_23 = new ARunnableS123S0100000_23(this, 41);
            if (Looper.myLooper() != Looper.getMainLooper()) {
                post(aRunnableS123S0100000_23);
            } else {
                aRunnableS123S0100000_23.run();
            }
            this.LLILLL = true;
        }
    }
}

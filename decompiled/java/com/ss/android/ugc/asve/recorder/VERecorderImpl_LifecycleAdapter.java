package com.ss.android.ugc.asve.recorder;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;

/* JADX INFO: loaded from: classes35.dex */
public class VERecorderImpl_LifecycleAdapter implements GeneratedAdapter {
    public final VERecorderImpl LIZ;

    public VERecorderImpl_LifecycleAdapter(VERecorderImpl vERecorderImpl) {
        this.LIZ = vERecorderImpl;
    }

    @Override // androidx.lifecycle.GeneratedAdapter
    public final void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        boolean z2;
        if (methodCallsLogger != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            if (!z2 || methodCallsLogger.approveCall("onResume", 1)) {
                this.LIZ.onResume();
                return;
            }
            return;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            if (!z2 || methodCallsLogger.approveCall("release", 1)) {
                this.LIZ.release();
            }
        }
    }
}

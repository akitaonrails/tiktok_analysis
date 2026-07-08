package com.ss.android.ugc.asve.recorder.camera;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;

/* JADX INFO: loaded from: classes35.dex */
public class VECameraController_LifecycleAdapter implements GeneratedAdapter {
    public final VECameraController LIZ;

    public VECameraController_LifecycleAdapter(VECameraController vECameraController) {
        this.LIZ = vECameraController;
    }

    @Override // androidx.lifecycle.GeneratedAdapter
    public final void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        boolean z2;
        if (methodCallsLogger != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && event == Lifecycle.Event.ON_DESTROY) {
            if (!z2 || methodCallsLogger.approveCall("onDestroy", 1)) {
                this.LIZ.onDestroy();
            }
        }
    }
}

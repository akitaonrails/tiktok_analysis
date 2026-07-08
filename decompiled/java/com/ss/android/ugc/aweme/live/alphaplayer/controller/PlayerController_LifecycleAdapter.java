package com.ss.android.ugc.aweme.live.alphaplayer.controller;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;

/* JADX INFO: loaded from: classes35.dex */
public class PlayerController_LifecycleAdapter implements GeneratedAdapter {
    public final PlayerController LIZ;

    public PlayerController_LifecycleAdapter(PlayerController playerController) {
        this.LIZ = playerController;
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
        if (event == Lifecycle.Event.ON_PAUSE) {
            if (!z2 || methodCallsLogger.approveCall("onPause", 1)) {
                this.LIZ.onPause();
                return;
            }
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            if (!z2 || methodCallsLogger.approveCall("onResume", 1)) {
                this.LIZ.onResume();
                return;
            }
            return;
        }
        if (event == Lifecycle.Event.ON_STOP) {
            if (!z2 || methodCallsLogger.approveCall("onStop", 1)) {
                this.LIZ.onStop();
                return;
            }
            return;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            if (!z2 || methodCallsLogger.approveCall("onDestroy", 1)) {
                this.LIZ.onDestroy();
            }
        }
    }
}

package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C1051660dTQ;
import X.C1060260dhI;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes17.dex */
public final class LoginWithPlatform extends LoginMethod {
    public static final C1060260dhI Companion = new Object() { // from class: X.0dhI
    };

    @Override // com.ss.android.ugc.aweme.bullet.bridge.common.LoginMethod
    public boolean getEnableMultiAccountLogin() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.common.LoginMethod, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return "loginWithPlatform";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.common.LoginMethod, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public LoginWithPlatform(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
    }
}

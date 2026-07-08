package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base;

import X.C05O2;
import X.C0ZZ5;
import X.C356901a3;
import X.InterfaceC2217461Bqa;
import X.InterfaceC902990Zbd;
import android.os.Handler;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMNetworkSaasApi;

/* JADX INFO: loaded from: classes15.dex */
public final class CommonMessageListConfigKt$setNetworkObserverConfig$businessLogicConfig$1$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ SessionInfo LL;
    public final /* synthetic */ InterfaceC902990Zbd LLILLJJLI;
    public final /* synthetic */ Handler LLILLL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        SessionInfo sessionInfo = this.LL;
        InterfaceC902990Zbd interfaceC902990Zbd = this.LLILLJJLI;
        Handler handler = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C0ZZ5.LIZ;
        if (!sessionInfo.isQuickChat()) {
            IMNetworkSaasApi.LIZ.getClass();
            IMNetworkSaasApi iMNetworkSaasApiLIZ = C05O2.LIZ();
            if (iMNetworkSaasApiLIZ != null) {
                iMNetworkSaasApiLIZ.LIZJ(interfaceC902990Zbd);
            }
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        SessionInfo sessionInfo = this.LL;
        InterfaceC902990Zbd interfaceC902990Zbd = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C0ZZ5.LIZ;
        if (!sessionInfo.isQuickChat()) {
            IMNetworkSaasApi.LIZ.getClass();
            IMNetworkSaasApi iMNetworkSaasApiLIZ = C05O2.LIZ();
            if (iMNetworkSaasApiLIZ != null) {
                iMNetworkSaasApiLIZ.LIZLLL(interfaceC902990Zbd);
            }
        }
    }

    public CommonMessageListConfigKt$setNetworkObserverConfig$businessLogicConfig$1$1(SessionInfo sessionInfo, InterfaceC902990Zbd interfaceC902990Zbd, Handler handler) {
        this.LL = sessionInfo;
        this.LLILLJJLI = interfaceC902990Zbd;
        this.LLILLL = handler;
    }
}

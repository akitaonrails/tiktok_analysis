package com.ss.android.ugc.aweme.im.lightinteract.impl.analytics;

import X.C0R1H;
import X.C356901a3;
import X.C898160ZLi;
import X.C898170ZLj;
import X.InterfaceC892560Yzu;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes15.dex */
public final class LightInteractionEntranceAutoDebounceReporter implements InterfaceC892560Yzu, DefaultLifecycleObserver, GenericLifecycleObserver {
    public final C898160ZLi LL = new C898160ZLi();

    @Override // X.InterfaceC892560Yzu
    public final void LIZIZ(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.LL.LIZIZ(str, str2, str3, str4, str5, str6, str7);
    }

    @Override // X.InterfaceC892560Yzu
    public final void LIZJ(String str, Map map) {
        this.LL.LIZJ(str, map);
    }

    @Override // X.InterfaceC892560Yzu
    public final void LIZLLL(String str) {
        this.LL.LIZLLL(str);
    }

    @Override // X.InterfaceC892560Yzu
    public final void LJ(String str, String str2, String str3, String str4, String str5, String str6) {
        this.LL.LJ(str, str2, str3, str4, str5, str6);
    }

    @Override // X.InterfaceC892560Yzu
    public final void LJFF(String str, Map<String, String> map) {
        this.LL.LJFF(str, map);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
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

    public LightInteractionEntranceAutoDebounceReporter(LifecycleOwner lifecycleOwner) {
        C0R1H.LIZIZ(lifecycleOwner, this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.LL.LIZ();
        ((ConcurrentHashMap) C898170ZLj.LLILLJJLI).remove(lifecycleOwner.getLifecycle());
    }
}

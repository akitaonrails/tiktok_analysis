package com.ss.android.ugc.tiktok.tpsc.core.render.event;

import X.C01GW;
import X.C103L;
import X.C19201910Af;
import X.C19202210Ai;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class EventCallbackLifecycleObserver implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final C103L LL;
    public final C01GW<Map<String, String>> LLILLJJLI;
    public final Map<String, Object> LLILLL = new LinkedHashMap();

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

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
        C19201910Af c19201910Af = C19201910Af.LIZJ;
        String str = this.LL.LIZ;
        if (str == null) {
            str = "empty_page_tage";
        }
        this.LLILLJJLI.getValue().get("enter_from");
        c19201910Af.LIZ.LIZJ(new C19202210Ai(str, this.LLILLL));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        C19201910Af c19201910Af = C19201910Af.LIZJ;
        String str = this.LL.LIZ;
        if (str == null) {
            str = "empty_page_tage";
        }
        this.LLILLJJLI.getValue().get("enter_from");
        c19201910Af.LIZ.LJI(new C19202210Ai(str, this.LLILLL));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EventCallbackLifecycleObserver(C103L c103l, C01GW<? extends Map<String, String>> c01gw) {
        this.LL = c103l;
        this.LLILLJJLI = c01gw;
    }
}

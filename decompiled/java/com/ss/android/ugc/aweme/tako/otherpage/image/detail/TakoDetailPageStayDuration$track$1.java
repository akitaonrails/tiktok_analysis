package com.ss.android.ugc.aweme.tako.otherpage.image.detail;

import X.C1687490u0x;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import org.json.JSONException;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoDetailPageStayDuration$track$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ C1687490u0x LL;

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

    public TakoDetailPageStayDuration$track$1(C1687490u0x c1687490u0x) {
        this.LL = c1687490u0x;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) throws JSONException {
        C1687490u0x c1687490u0x = this.LL;
        if (c1687490u0x.LIZIZ > 0) {
            C1687490u0x.LIZ(c1687490u0x, c1687490u0x.LIZ, System.currentTimeMillis() - this.LL.LIZIZ);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        this.LL.LIZIZ = System.currentTimeMillis();
    }
}

package com.ss.android.ugc.aweme.ecommerce.recorder;

import X.C14CI;
import X.C1548820qPI;
import X.C356901a3;
import X.C786410Ut5;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes31.dex */
public final class EcAITeleprompterManager$inject$2 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ C14CI LL;

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

    public EcAITeleprompterManager$inject$2(C14CI c14ci) {
        this.LL = c14ci;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        C14CI c14ci = this.LL;
        c14ci.LIZIZ();
        C786410Ut5.LJJJZ(c14ci.LLILLL, c14ci.LLILLJJLI);
        C14CI.LLIZLLLIL.remove(Integer.valueOf(c14ci.LLILLJJLI.hashCode()));
        C1548820qPI.LJIIIIZZ("ec_teleprompter_loaded", c14ci);
    }
}

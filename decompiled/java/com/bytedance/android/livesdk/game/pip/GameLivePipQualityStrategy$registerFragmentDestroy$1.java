package com.bytedance.android.livesdk.game.pip;

import X.C11JF;
import X.C1338270kvh;
import X.C150R;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.Map;

/* JADX INFO: loaded from: classes32.dex */
public final class GameLivePipQualityStrategy$registerFragmentDestroy$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ C150R LL;

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

    public GameLivePipQualityStrategy$registerFragmentDestroy$1(C150R c150r) {
        this.LL = c150r;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C150R c150r = this.LL;
        long j = jCurrentTimeMillis - c150r.LJ;
        Map<String, Object> map = C1338270kvh.LIZ;
        C11JF c11jf = c150r.LJFF;
        if (c11jf != null) {
            c11jf.dispose();
        }
        if (this.LL.LIZJ) {
            C150R.LIZJ(1, j);
        }
    }
}

package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay;

import X.C1083460eIi;
import X.C11NJ;
import X.C356901a3;
import X.C482301uH;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes.dex */
public final class BoardsDisplayView$viewLifecycleObserver$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ BoardsDisplayView LL;

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

    public BoardsDisplayView$viewLifecycleObserver$1(BoardsDisplayView boardsDisplayView) {
        this.LL = boardsDisplayView;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        this.LL.getViewModel().LLILZLL.LJ();
        lifecycleOwner.getLifecycle().removeObserver(this);
        C482301uH bulletRenderer = this.LL.getBulletRenderer();
        if (bulletRenderer != null) {
            ((C11NJ) bulletRenderer.LJII.getValue()).LJ();
            bulletRenderer.LJIIIZ = null;
            DataChannel dataChannel = bulletRenderer.LIZ;
            if (dataChannel != null) {
                dataChannel.SX0(C1083460eIi.class, null);
            }
        }
    }
}

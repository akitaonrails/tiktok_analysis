package com.ss.android.ugc.gamora.editorpro.aiediting.aigc.panel.aigcresult;

import X.C1766560w4U;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.bytedance.tux.system.TuxImmersionBar;

/* JADX INFO: loaded from: classes5.dex */
public final class AIGCSheetHelper$createReportSheet$3 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ TuxActionSheet LL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public AIGCSheetHelper$createReportSheet$3(TuxActionSheet tuxActionSheet) {
        this.LL = tuxActionSheet;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        if (this.LL.getActivity() != null && this.LL.getDialog() != null) {
            TuxImmersionBar tuxImmersionBarLIZJ = C1766560w4U.LIZJ(this.LL, false);
            tuxImmersionBarLIZJ.LIZJ(false, true);
            tuxImmersionBarLIZJ.LIZLLL();
        }
    }
}

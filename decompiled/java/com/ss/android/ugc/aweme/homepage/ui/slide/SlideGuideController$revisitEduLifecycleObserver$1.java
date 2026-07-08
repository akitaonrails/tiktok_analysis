package com.ss.android.ugc.aweme.homepage.ui.slide;

import X.C1580330rE7;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SlideGuideController$revisitEduLifecycleObserver$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ SlideGuideController LL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
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

    public SlideGuideController$revisitEduLifecycleObserver$1(SlideGuideController slideGuideController) {
        this.LL = slideGuideController;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        SlideGuideController slideGuideController = this.LL;
        HandlerHook.viewRemoveCallbacks(slideGuideController.LLILLJJLI, slideGuideController.LLJILJIL);
        SlideGuideController slideGuideController2 = this.LL;
        slideGuideController2.LLILLJJLI.removeOnAttachStateChangeListener(slideGuideController2.LLJJIII);
        this.LL.LJII();
        C1580330rE7.LJFF.remove(this.LL.LLJILJILJ);
        lifecycleOwner.getLifecycle().removeObserver(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        SlideGuideController slideGuideController = this.LL;
        slideGuideController.LIZJ(new AwS568S0100000_24(slideGuideController, 570));
    }
}

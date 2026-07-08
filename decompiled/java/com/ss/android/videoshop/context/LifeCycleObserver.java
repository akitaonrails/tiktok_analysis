package com.ss.android.videoshop.context;

import X.C2188811AlT;
import X.C790900V0u;
import X.C807710VmL;
import X.EnumC804620VhM;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes34.dex */
public class LifeCycleObserver extends C807710VmL implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final VideoContext LL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.C807710VmL
    public final boolean onBackPressedWhenFullScreen(VideoContext videoContext) {
        throw null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLifeCycleOnCreate owner:");
        sbLIZ.append(lifecycleOwner.getClass().getSimpleName());
        C2188811AlT.LIZIZ(sbLIZ);
        this.LL.LJJL(new C790900V0u(401));
        throw null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLifeCycleOnDestroy owner:");
        sbLIZ.append(lifecycleOwner.getClass().getSimpleName());
        C2188811AlT.LIZIZ(sbLIZ);
        this.LL.LJJL(new C790900V0u(406));
        throw null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLifeCycleOnPause owner:");
        sbLIZ.append(lifecycleOwner.getClass().getSimpleName());
        C2188811AlT.LIZIZ(sbLIZ);
        this.LL.LJJL(new C790900V0u(404));
        throw null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLifeCycleOnResume owner:");
        sbLIZ.append(lifecycleOwner.getClass().getSimpleName());
        C2188811AlT.LIZIZ(sbLIZ);
        this.LL.LJJL(new C790900V0u(403));
        throw null;
    }

    @Override // X.C807710VmL, X.InterfaceC807720VmM
    public final void onScreenOff(VideoContext videoContext) {
        throw null;
    }

    @Override // X.C807710VmL, X.InterfaceC807720VmM
    public final void onScreenUserPresent(VideoContext videoContext) {
        throw null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLifeCycleOnStart owner:");
        sbLIZ.append(lifecycleOwner.getClass().getSimpleName());
        C2188811AlT.LIZIZ(sbLIZ);
        this.LL.LJJL(new C790900V0u(402));
        throw null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLifeCycleOnStop owner:");
        sbLIZ.append(lifecycleOwner.getClass().getSimpleName());
        C2188811AlT.LIZIZ(sbLIZ);
        this.LL.LJJL(new C790900V0u(405));
        throw null;
    }

    @Override // X.C807710VmL
    public final void onAudioFocusGain(VideoContext videoContext, boolean z) {
        throw null;
    }

    @Override // X.C807710VmL
    public final void onAudioFocusLoss(VideoContext videoContext, boolean z) {
        throw null;
    }

    @Override // X.C807710VmL
    public final void onFullScreen(boolean z, int i, boolean z2) {
        throw null;
    }

    @Override // X.C807710VmL
    public final boolean onInterceptFullScreen(boolean z, int i, boolean z2) {
        throw null;
    }

    @Override // X.C807710VmL
    public final void onNetWorkChanged(EnumC804620VhM enumC804620VhM, VideoContext videoContext, Context context, Intent intent) {
        throw null;
    }
}

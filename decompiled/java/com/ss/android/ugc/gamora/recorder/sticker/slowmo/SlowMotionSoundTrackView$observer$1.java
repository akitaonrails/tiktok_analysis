package com.ss.android.ugc.gamora.recorder.sticker.slowmo;

import X.AnonymousClass0956;
import X.C0PEM;
import X.C19457111Aj;
import X.C19457211Ak;
import X.C2296808zG;
import X.C23250099c;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AFwS273S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class SlowMotionSoundTrackView$observer$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ C19457211Ak LL;

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

    public SlowMotionSoundTrackView$observer$1(C19457211Ak c19457211Ak) {
        this.LL = c19457211Ak;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
        C19457211Ak c19457211Ak = this.LL;
        c19457211Ak.LLJJL = true;
        AnonymousClass0956 anonymousClass0956 = c19457211Ak.LLJJLIIIJLLLLLLLZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LL.LJIIJ(AFwS273S0000000_29.get$arr$(252));
        this.LL.LLJJJJLIIL = null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
        C19457211Ak c19457211Ak = this.LL;
        c19457211Ak.LLJJL = false;
        AnonymousClass0956 anonymousClass0956 = c19457211Ak.LLJJLIIIJLLLLLLLZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        c19457211Ak.LLJJLIIIJLLLLLLLZ = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C19457111Aj(c19457211Ak, null), 3);
    }
}

package com.ss.android.ugc.aweme.im.activestatus.api.analytics;

import X.C1231704rr;
import X.C2188811AlT;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;

/* JADX INFO: loaded from: classes22.dex */
public final class ActivityStatusAnalyticsCommonLifecycleOwner implements LifecycleOwner {
    public final LifecycleOwner LL;
    public boolean LLILLJJLI;
    public final LifecycleRegistry LLILLL = new LifecycleRegistry(this);
    public final C1231704rr LLILZ = new C1231704rr("ActivityStatusAnalyticsCommonLifecycleOwner", null, 6);

    public final void LIZ() {
        Lifecycle.State currentState = this.LLILLL.getCurrentState();
        Lifecycle.State state = Lifecycle.State.INITIALIZED;
        if (currentState != state || (this.LLILLJJLI && LIZIZ() != Lifecycle.State.DESTROYED)) {
            if (!this.LLILLJJLI) {
                this.LLILLL.setCurrentState(Lifecycle.State.DESTROYED);
                return;
            }
            Lifecycle.State stateLIZIZ = LIZIZ();
            if (stateLIZIZ != null && stateLIZIZ.isAtLeast(Lifecycle.State.CREATED) && this.LLILLL.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                return;
            }
            Lifecycle.State stateLIZIZ2 = LIZIZ();
            Lifecycle.State state2 = Lifecycle.State.DESTROYED;
            if (stateLIZIZ2 == state2 && this.LLILLL.getCurrentState() == state2) {
                return;
            }
            LifecycleRegistry lifecycleRegistry = this.LLILLL;
            Lifecycle.State stateLIZIZ3 = LIZIZ();
            if (stateLIZIZ3 != null) {
                state = stateLIZIZ3;
            }
            lifecycleRegistry.setCurrentState(state);
        }
    }

    public final Lifecycle.State LIZIZ() {
        Lifecycle lifecycle;
        LifecycleOwner lifecycleOwner = this.LL;
        if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            return null;
        }
        return lifecycle.getCurrentState();
    }

    public final void LIZJ() {
        this.LLILZ.getClass();
        this.LLILLJJLI = false;
        LIZ();
    }

    public final void LIZLLL() {
        this.LLILZ.getClass();
        this.LLILLJJLI = true;
        LIZ();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILLL;
    }

    public ActivityStatusAnalyticsCommonLifecycleOwner(LifecycleOwner lifecycleOwner, boolean z) {
        Lifecycle lifecycle;
        this.LL = lifecycleOwner;
        this.LLILLJJLI = z;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.activestatus.api.analytics.ActivityStatusAnalyticsCommonLifecycleOwner.1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    C1231704rr c1231704rr = ActivityStatusAnalyticsCommonLifecycleOwner.this.LLILZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onStateChanged ");
                    sbLIZ.append(event);
                    C2188811AlT.LIZIZ(sbLIZ);
                    c1231704rr.getClass();
                    ActivityStatusAnalyticsCommonLifecycleOwner.this.LIZ();
                }
            });
        }
    }
}

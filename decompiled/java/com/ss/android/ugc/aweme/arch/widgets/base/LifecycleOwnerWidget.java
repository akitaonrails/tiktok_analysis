package com.ss.android.ugc.aweme.arch.widgets.base;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;

/* JADX INFO: loaded from: classes17.dex */
public class LifecycleOwnerWidget extends Widget implements LifecycleOwner {
    public final LifecycleRegistry LLIZLLLIL = new LifecycleRegistry(this);

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onDestroy() {
        this.LLIZLLLIL.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onPause() {
        this.LLIZLLLIL.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        super.onPause();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onStop() {
        this.LLIZLLLIL.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        super.onStop();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        super.onCreate();
        this.LLIZLLLIL.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onResume() {
        super.onResume();
        this.LLIZLLLIL.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onStart() {
        super.onStart();
        this.LLIZLLLIL.handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLIZLLLIL;
    }
}

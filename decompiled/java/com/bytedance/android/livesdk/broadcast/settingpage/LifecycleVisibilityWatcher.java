package com.bytedance.android.livesdk.broadcast.settingpage;

import X.C356901a3;
import X.C781840Uli;
import X.ViewOnLayoutChangeListenerC785940UsK;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class LifecycleVisibilityWatcher implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final LifecycleOwner LL;
    public final C781840Uli LLILLJJLI;

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
    public final void onStart(LifecycleOwner lifecycleOwner) {
        C781840Uli c781840Uli = this.LLILLJJLI;
        if (!c781840Uli.LJFF && !c781840Uli.LIZ.isEmpty()) {
            c781840Uli.LJFF = true;
            c781840Uli.LIZ();
            for (View view : c781840Uli.LIZ) {
                ViewOnLayoutChangeListenerC785940UsK viewOnLayoutChangeListenerC785940UsK = new ViewOnLayoutChangeListenerC785940UsK(c781840Uli, 9);
                view.addOnLayoutChangeListener(viewOnLayoutChangeListenerC785940UsK);
                c781840Uli.LJ.put(view, viewOnLayoutChangeListenerC785940UsK);
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        C781840Uli c781840Uli = this.LLILLJJLI;
        if (c781840Uli.LJFF) {
            c781840Uli.LJFF = false;
            for (Map.Entry entry : ((LinkedHashMap) c781840Uli.LJ).entrySet()) {
                ((View) entry.getKey()).removeOnLayoutChangeListener((View.OnLayoutChangeListener) entry.getValue());
            }
            ((LinkedHashMap) c781840Uli.LJ).clear();
        }
    }

    public LifecycleVisibilityWatcher(LiveHostSettingFragmentSheet liveHostSettingFragmentSheet, C781840Uli c781840Uli) {
        this.LL = liveHostSettingFragmentSheet;
        this.LLILLJJLI = c781840Uli;
    }
}

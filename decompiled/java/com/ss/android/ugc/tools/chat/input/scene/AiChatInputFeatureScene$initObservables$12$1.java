package com.ss.android.ugc.tools.chat.input.scene;

import X.C0I7D;
import X.C21296918Vz;
import X.C356901a3;
import android.text.TextWatcher;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes30.dex */
public final class AiChatInputFeatureScene$initObservables$12$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ C21296918Vz LL;
    public final /* synthetic */ TextWatcher LLILLJJLI;

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

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C0I7D c0i7dLLLLLLJ = this.LL.LLLLLLJ();
        if (c0i7dLLLLLLJ != null) {
            c0i7dLLLLLLJ.removeTextChangedListener(this.LLILLJJLI);
        }
    }

    public AiChatInputFeatureScene$initObservables$12$1(C21296918Vz c21296918Vz, TextWatcher textWatcher) {
        this.LL = c21296918Vz;
        this.LLILLJJLI = textWatcher;
    }
}

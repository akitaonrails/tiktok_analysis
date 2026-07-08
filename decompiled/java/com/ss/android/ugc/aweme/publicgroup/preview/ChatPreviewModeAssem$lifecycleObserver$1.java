package com.ss.android.ugc.aweme.publicgroup.preview;

import X.C356901a3;
import android.os.SystemClock;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes15.dex */
public final class ChatPreviewModeAssem$lifecycleObserver$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ ChatPreviewModeAssem LL;

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

    public ChatPreviewModeAssem$lifecycleObserver$1(ChatPreviewModeAssem chatPreviewModeAssem) {
        this.LL = chatPreviewModeAssem;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        ChatPreviewModeAssem chatPreviewModeAssem = this.LL;
        if (chatPreviewModeAssem.LLILZLL > 0) {
            long j = chatPreviewModeAssem.LLIZ;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ChatPreviewModeAssem chatPreviewModeAssem2 = this.LL;
            chatPreviewModeAssem.LLIZ = j + (jElapsedRealtime - chatPreviewModeAssem2.LLILZLL);
            chatPreviewModeAssem2.LLILZLL = 0L;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        this.LL.LLILZLL = SystemClock.elapsedRealtime();
    }
}

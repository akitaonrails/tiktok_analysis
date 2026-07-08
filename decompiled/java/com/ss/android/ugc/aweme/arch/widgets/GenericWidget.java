package com.ss.android.ugc.aweme.arch.widgets;

import X.C0RD4;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;

/* JADX INFO: loaded from: classes17.dex */
public class GenericWidget extends Widget implements Observer<C0RD4> {
    @Override // androidx.lifecycle.Observer
    /* JADX INFO: renamed from: LJIILL, reason: merged with bridge method [inline-methods] */
    public void onChanged(C0RD4 c0rd4) {
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            onStart();
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else {
            if (event != Lifecycle.Event.ON_DESTROY) {
                return;
            }
            onDestroy();
        }
    }
}

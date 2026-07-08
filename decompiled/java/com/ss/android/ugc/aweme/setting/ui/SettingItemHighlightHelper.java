package com.ss.android.ugc.aweme.setting.ui;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes4.dex */
public final class SettingItemHighlightHelper implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_PAUSE) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                lifecycleOwner.getLifecycle().removeObserver(this);
                return;
            }
            return;
        }
        throw null;
    }
}

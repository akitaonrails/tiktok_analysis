package com.ss.android.ugc.aweme.capcutpromotion;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AwS430S0200000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class CapcutObserver implements LifecycleEventObserver {
    public AwS430S0200000_29 LL;
    public Lifecycle LLILLJJLI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            AwS430S0200000_29 awS430S0200000_29 = this.LL;
            if (awS430S0200000_29 != null) {
                awS430S0200000_29.invoke();
            }
            Lifecycle lifecycle = this.LLILLJJLI;
            if (lifecycle != null) {
                lifecycle.removeObserver(this);
            }
        }
    }
}

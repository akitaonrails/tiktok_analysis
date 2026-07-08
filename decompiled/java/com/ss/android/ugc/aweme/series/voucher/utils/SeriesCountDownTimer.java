package com.ss.android.ugc.aweme.series.voucher.utils;

import X.AnonymousClass0956;
import X.C1613590s5l;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.OnLifecycleEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class SeriesCountDownTimer implements GenericLifecycleObserver {
    public static final /* synthetic */ int LLILLL = 0;
    public AnonymousClass0956 LL;
    public C1613590s5l LLILLJJLI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        AnonymousClass0956 anonymousClass0956 = this.LL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LL = null;
    }

    public SeriesCountDownTimer(LifecycleRegistry lifecycleRegistry) {
        lifecycleRegistry.addObserver(this);
    }
}

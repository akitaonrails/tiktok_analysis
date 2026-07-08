package com.ss.android.ugc.aweme.feed.panel;

import X.C1578630rBN;
import X.C1590670rUn;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/* JADX INFO: loaded from: classes25.dex */
public final class DetailNodeVisibility$initNodeVisibility$1 implements GenericLifecycleObserver {
    public final /* synthetic */ Fragment LL;
    public final /* synthetic */ C1590670rUn LLILLJJLI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        C1578630rBN.LJI(3, this.LL);
        this.LLILLJJLI.LIZ = "page_feed";
    }

    public DetailNodeVisibility$initNodeVisibility$1(Fragment fragment, C1590670rUn c1590670rUn) {
        this.LL = fragment;
        this.LLILLJJLI = c1590670rUn;
    }
}

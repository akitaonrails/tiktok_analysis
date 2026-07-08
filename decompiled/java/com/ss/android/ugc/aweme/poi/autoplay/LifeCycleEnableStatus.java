package com.ss.android.ugc.aweme.poi.autoplay;

import X.AbstractC1193580hAK;
import X.C01GW;
import X.C452501pT;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class LifeCycleEnableStatus extends AbstractC1193580hAK implements GenericLifecycleObserver {
    public final C01GW LL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(272));

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        }
    }

    @Override // X.InterfaceC588530N6l
    public final MutableLiveData<Integer> LIZ() {
        return (MutableLiveData) this.LL.getValue();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        ((LiveData) this.LL.getValue()).setValue(0);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        ((LiveData) this.LL.getValue()).setValue(1);
    }
}

package com.ss.android.ugc.aweme.minis.viewmodel;

import X.C1390780mIO;
import Y.AObserverS183S0200000_21;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes22.dex */
public final class SingleLiveEvent<T> extends MutableLiveData<T> {
    public final AtomicBoolean pending = new AtomicBoolean(false);
    public static final C1390780mIO Companion = new Object() { // from class: X.0mIO
    };
    public static final int $stable = 8;

    public final void call() {
        setValue(null);
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void setValue(T t) {
        this.pending.set(true);
        super.setValue(t);
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
        hasActiveObservers();
        super.observe(lifecycleOwner, new AObserverS183S0200000_21(this, observer, 3));
    }
}

package com.ss.android.ugc.aweme.comment.viewmodel;

import Y.AObserverS183S0200000_21;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes22.dex */
public final class SingleLiveEvent<T> extends MutableLiveData<T> {
    public static final int $stable = 8;
    public final AtomicBoolean pending = new AtomicBoolean(false);

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
        super.observe(lifecycleOwner, new AObserverS183S0200000_21(this, observer, 1));
    }
}

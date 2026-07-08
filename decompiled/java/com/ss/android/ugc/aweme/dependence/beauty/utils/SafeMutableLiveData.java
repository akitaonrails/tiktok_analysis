package com.ss.android.ugc.aweme.dependence.beauty.utils;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public final class SafeMutableLiveData<T> extends MutableLiveData<T> {
    public WeakReference<LifecycleOwner> lastLifecycleOwner;

    public final void safeObserve(LifecycleOwner lifecycleOwner, Observer<T> observer) {
        LifecycleOwner lifecycleOwner2;
        WeakReference<LifecycleOwner> weakReference = this.lastLifecycleOwner;
        if (weakReference != null && (lifecycleOwner2 = weakReference.get()) != null) {
            removeObservers(lifecycleOwner2);
        }
        this.lastLifecycleOwner = new WeakReference<>(lifecycleOwner);
        observe(lifecycleOwner, observer);
    }
}
